// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            InAppNotification, x, ba, j, 
//            m, Survey, n, ab, 
//            o

class l
{

    private static final JSONArray d = new JSONArray();
    private final ab a;
    private final Context b;
    private final List c = new LinkedList();

    public l(Context context, ab ab1)
    {
        b = context;
        a = ab1;
    }

    private static int a(Display display)
    {
        if (android.os.Build.VERSION.SDK_INT < 13)
        {
            return display.getWidth();
        } else
        {
            Point point = new Point();
            display.getSize(point);
            return point.x;
        }
    }

    private static Bitmap a(InAppNotification inappnotification, Context context, ba ba1)
    {
        Object obj = inappnotification.g();
        int i = a(((WindowManager)context.getSystemService("window")).getDefaultDisplay());
        if (inappnotification.d() == x.c && i >= 720)
        {
            obj = new String[2];
            obj[0] = inappnotification.h();
            obj[1] = inappnotification.g();
            inappnotification = ((InAppNotification) (obj));
        } else
        {
            inappnotification = (new String[] {
                obj
            });
        }
        context = ba1.a(context, inappnotification);
        if (context != null)
        {
            return BitmapFactory.decodeByteArray(context, 0, context.length);
        } else
        {
            Log.i("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Failed to download images from ").append(Arrays.toString(inappnotification)).toString());
            return null;
        }
    }

    static m a(String s)
    {
        Object obj;
        m m1;
        JSONObject jsonobject;
        boolean flag;
        obj = null;
        flag = false;
        m1 = new m();
        Survey survey;
        int i;
        try
        {
            jsonobject = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new n((new StringBuilder()).append("Mixpanel endpoint returned unparsable result:\n").append(s).toString(), ((JSONException) (obj)));
        }
        if (!jsonobject.has("surveys"))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        s = jsonobject.getJSONArray("surveys");
_L1:
        if (s != null)
        {
            i = 0;
            while (i < s.length()) 
            {
                try
                {
                    survey = new Survey(s.getJSONObject(i));
                    m1.a.add(survey);
                }
                catch (JSONException jsonexception1)
                {
                    Log.e("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Received a strange response from surveys service: ").append(s.toString()).toString());
                }
                catch (j j2)
                {
                    Log.e("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Received a strange response from surveys service: ").append(s.toString()).toString());
                }
                i++;
            }
        }
        break MISSING_BLOCK_LABEL_216;
        s;
        Log.e("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Mixpanel endpoint returned non-array JSON for surveys: ").append(jsonobject).toString());
        s = null;
          goto _L1
        s = ((String) (obj));
        if (jsonobject.has("notifications"))
        {
            try
            {
                s = jsonobject.getJSONArray("notifications");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Mixpanel endpoint returned non-array JSON for notifications: ").append(jsonobject).toString());
                s = ((String) (obj));
            }
        }
        if (s != null)
        {
            int i1 = Math.min(s.length(), 2);
            int k = ((flag) ? 1 : 0);
            while (k < i1) 
            {
                try
                {
                    obj = new InAppNotification(s.getJSONObject(k));
                    m1.b.add(obj);
                }
                catch (JSONException jsonexception)
                {
                    Log.e("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Received a strange response from notifications service: ").append(s.toString()).toString(), jsonexception);
                }
                catch (j j1)
                {
                    Log.e("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Received a strange response from notifications service: ").append(s.toString()).toString(), j1);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    Log.e("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Not enough memory to show load notification from package: ").append(s.toString()).toString(), outofmemoryerror);
                }
                k++;
            }
        }
        if (jsonobject.has("event_bindings"))
        {
            try
            {
                m1.c = jsonobject.getJSONArray("event_bindings");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Mixpanel endpoint returned non-array JSON for event bindings: ").append(jsonobject).toString());
                return m1;
            }
        }
        return m1;
    }

    private m a(String s, String s1, ba ba1)
    {
        s1 = b(s, s1, ba1);
        if (ab.a)
        {
            Log.v("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Mixpanel decide server response was:\n").append(s1).toString());
        }
        s = new m();
        if (s1 != null)
        {
            s = a(s1);
        }
        for (s1 = ((m) (s)).b.iterator(); s1.hasNext();)
        {
            InAppNotification inappnotification = (InAppNotification)s1.next();
            Bitmap bitmap = a(inappnotification, b, ba1);
            if (bitmap == null)
            {
                Log.i("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Could not retrieve image for notification ").append(inappnotification.b()).append(", will not show the notification.").toString());
                s1.remove();
            } else
            {
                inappnotification.a(bitmap);
            }
        }

        return s;
    }

    static JSONArray a()
    {
        return d;
    }

    private String b(String s, String s1, ba ba1)
    {
        String s2;
        try
        {
            s2 = URLEncoder.encode(s, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Mixpanel library requires utf-8 string encoding to be available", s);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        s = URLEncoder.encode(s1, "utf-8");
_L1:
        s1 = (new StringBuilder()).append("?version=1&lib=android&token=").append(s2);
        if (s != null)
        {
            s1.append("&distinct_id=").append(s);
        }
        s1 = s1.toString();
        if (a.d())
        {
            s = new String[1];
            s[0] = (new StringBuilder()).append(a.k()).append(s1).toString();
        } else
        {
            s = new String[2];
            s[0] = (new StringBuilder()).append(a.k()).append(s1).toString();
            s[1] = (new StringBuilder()).append(a.n()).append(s1).toString();
        }
        if (ab.a)
        {
            Log.v("MixpanelAPI.DecideChecker", (new StringBuilder()).append("Querying decide server at ").append(s[0]).toString());
            Log.v("MixpanelAPI.DecideChecker", (new StringBuilder()).append("    (with fallback ").append(s[1]).append(")").toString());
        }
        s = ba1.a(b, s);
        if (s == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_267;
        s = null;
          goto _L1
        try
        {
            s = new String(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF not supported on this platform?", s);
        }
        return s;
    }

    public void a(ba ba1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            o o1 = (o)iterator.next();
            Object obj = o1.b();
            try
            {
                obj = a(o1.a(), ((String) (obj)), ba1);
                o1.a(((m) (obj)).a, ((m) (obj)).b, ((m) (obj)).c);
            }
            catch (n n1)
            {
                Log.e("MixpanelAPI.DecideChecker", n1.getMessage(), n1);
            }
        }

    }

    public void a(o o1)
    {
        c.add(o1);
    }

}

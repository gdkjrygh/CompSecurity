// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            e, Survey, InAppNotification, t, 
//            ae, h

final class g
{
    static final class a
    {

        public final List a = new ArrayList();
        public final List b = new ArrayList();

        public a()
        {
        }
    }


    private final t a;
    private final Context b;
    private final List c = new LinkedList();

    public g(Context context, t t1)
    {
        b = context;
        a = t1;
    }

    private static a a(String s)
    {
        Object obj;
        a a1;
        JSONObject jsonobject;
        boolean flag;
        obj = null;
        flag = false;
        a1 = new a();
        Survey survey;
        int i;
        try
        {
            jsonobject = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI DecideChecker", (new StringBuilder("Mixpanel endpoint returned unparsable result:\n")).append(s).toString(), ((Throwable) (obj)));
            return a1;
        }
        if (!jsonobject.has("surveys"))
        {
            break MISSING_BLOCK_LABEL_139;
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
                    a1.a.add(survey);
                }
                catch (JSONException jsonexception1)
                {
                    Log.e("MixpanelAPI DecideChecker", (new StringBuilder("Received a strange response from surveys service: ")).append(s.toString()).toString());
                }
                catch (e e2)
                {
                    Log.e("MixpanelAPI DecideChecker", (new StringBuilder("Received a strange response from surveys service: ")).append(s.toString()).toString());
                }
                i++;
            }
        }
        break MISSING_BLOCK_LABEL_204;
        s;
        Log.e("MixpanelAPI DecideChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for surveys: ")).append(jsonobject).toString());
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
                Log.e("MixpanelAPI DecideChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for notifications: ")).append(jsonobject).toString());
                s = ((String) (obj));
            }
        }
        if (s != null)
        {
            int k = Math.min(s.length(), 2);
            int j = ((flag) ? 1 : 0);
            while (s != null && j < k) 
            {
                try
                {
                    obj = new InAppNotification(s.getJSONObject(j));
                    a1.b.add(obj);
                }
                catch (JSONException jsonexception)
                {
                    Log.e("MixpanelAPI DecideChecker", (new StringBuilder("Received a strange response from notifications service: ")).append(s.toString()).toString(), jsonexception);
                }
                catch (e e1)
                {
                    Log.e("MixpanelAPI DecideChecker", (new StringBuilder("Received a strange response from notifications service: ")).append(s.toString()).toString(), e1);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    Log.e("MixpanelAPI DecideChecker", (new StringBuilder("Not enough memory to show load notification from package: ")).append(s.toString()).toString(), outofmemoryerror);
                }
                j++;
            }
        }
        return a1;
    }

    private String a(String s, String s1)
    {
        try
        {
            s = URLEncoder.encode(s, "utf-8");
            s1 = URLEncoder.encode(s1, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Mixpanel library requires utf-8 string encoding to be available", s);
        }
        s = (new StringBuilder("?version=1&lib=android&token=")).append(s).append("&distinct_id=").append(s1).toString();
        s1 = new String[2];
        s1[0] = (new StringBuilder()).append(a.h()).append(s).toString();
        s1[1] = (new StringBuilder()).append(a.k()).append(s).toString();
        if (t.a)
        {
            (new StringBuilder("Querying decide server at ")).append(s1[0]);
            (new StringBuilder("    (with fallback ")).append(s1[1]).append(")");
        }
        s = ae.a(b, s1);
        if (s == null)
        {
            return null;
        }
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

    public final void a()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            if (h1.c())
            {
                iterator.remove();
            } else
            {
                String s = a(h1.a(), h1.b());
                boolean flag = t.a;
                a a1 = new a();
                if (s != null)
                {
                    a1 = a(s);
                }
                for (Iterator iterator1 = a1.b.iterator(); iterator1.hasNext();)
                {
                    InAppNotification inappnotification = (InAppNotification)iterator1.next();
                    Context context = b;
                    Object obj = inappnotification.f();
                    Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
                    byte abyte0[];
                    int i;
                    if (android.os.Build.VERSION.SDK_INT < 13)
                    {
                        i = display.getWidth();
                    } else
                    {
                        Point point = new Point();
                        display.getSize(point);
                        i = point.x;
                    }
                    if (inappnotification.c() == InAppNotification.a.c && i >= 720)
                    {
                        obj = new String[2];
                        obj[0] = inappnotification.g();
                        obj[1] = inappnotification.f();
                    } else
                    {
                        obj = (new String[] {
                            obj
                        });
                    }
                    abyte0 = ae.a(context, ((String []) (obj)));
                    if (abyte0 != null)
                    {
                        obj = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
                    } else
                    {
                        (new StringBuilder("Failed to download images from ")).append(Arrays.toString(((Object []) (obj))));
                        obj = null;
                    }
                    if (obj == null)
                    {
                        (new StringBuilder("Could not retrieve image for notification ")).append(inappnotification.b()).append(", will not show the notification.");
                        iterator1.remove();
                    } else
                    {
                        inappnotification.a(((android.graphics.Bitmap) (obj)));
                    }
                }

                h1.a(a1.a, a1.b);
            }
        }

    }

    public final void a(h h1)
    {
        c.add(h1);
    }
}

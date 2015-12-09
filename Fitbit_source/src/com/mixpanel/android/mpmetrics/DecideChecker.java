// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.mixpanel.android.util.RemoteService;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
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
//            InAppNotification, BadDecideObjectException, Survey, g, 
//            d

class DecideChecker
{
    static class UnintelligibleMessageException extends Exception
    {

        private static final long serialVersionUID = 0xa5c6d9f49582d643L;

        public UnintelligibleMessageException(String s, JSONException jsonexception)
        {
            super(s, jsonexception);
        }
    }

    static class a
    {

        public final List a = new ArrayList();
        public final List b = new ArrayList();
        public JSONArray c;
        public JSONArray d;

        public a()
        {
            c = DecideChecker.a();
            d = DecideChecker.a();
        }
    }


    private static final JSONArray d = new JSONArray();
    private static final String e = "MixpanelAPI.DChecker";
    private final g a;
    private final Context b;
    private final List c = new LinkedList();

    public DecideChecker(Context context, g g1)
    {
        b = context;
        a = g1;
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

    private static Bitmap a(InAppNotification inappnotification, Context context, RemoteService remoteservice)
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
    {
        Object obj = inappnotification.i();
        String s = inappnotification.h();
        int i = a(((WindowManager)context.getSystemService("window")).getDefaultDisplay());
        if (inappnotification.e() == InAppNotification.Type.c && i >= 720)
        {
            obj = new String[3];
            obj[0] = inappnotification.j();
            obj[1] = inappnotification.i();
            obj[2] = inappnotification.h();
            inappnotification = ((InAppNotification) (obj));
        } else
        {
            inappnotification = (new String[] {
                obj, s
            });
        }
        context = a(remoteservice, context, ((String []) (inappnotification)));
        if (context != null)
        {
            return BitmapFactory.decodeByteArray(context, 0, context.length);
        } else
        {
            Log.i("MixpanelAPI.DChecker", (new StringBuilder()).append("Failed to download images from ").append(Arrays.toString(inappnotification)).toString());
            return null;
        }
    }

    static a a(String s)
        throws UnintelligibleMessageException
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
            throw new UnintelligibleMessageException((new StringBuilder()).append("Mixpanel endpoint returned unparsable result:\n").append(s).toString(), ((JSONException) (obj)));
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
                    a1.a.add(survey);
                }
                catch (JSONException jsonexception1)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Received a strange response from surveys service: ").append(s.toString()).toString());
                }
                catch (BadDecideObjectException baddecideobjectexception1)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Received a strange response from surveys service: ").append(s.toString()).toString());
                }
                i++;
            }
        }
        break MISSING_BLOCK_LABEL_216;
        s;
        Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Mixpanel endpoint returned non-array JSON for surveys: ").append(jsonobject).toString());
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
                Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Mixpanel endpoint returned non-array JSON for notifications: ").append(jsonobject).toString());
                s = ((String) (obj));
            }
        }
        if (s != null)
        {
            int k = Math.min(s.length(), 2);
            int j = ((flag) ? 1 : 0);
            while (j < k) 
            {
                try
                {
                    obj = new InAppNotification(s.getJSONObject(j));
                    a1.b.add(obj);
                }
                catch (JSONException jsonexception)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Received a strange response from notifications service: ").append(s.toString()).toString(), jsonexception);
                }
                catch (BadDecideObjectException baddecideobjectexception)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Received a strange response from notifications service: ").append(s.toString()).toString(), baddecideobjectexception);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Not enough memory to show load notification from package: ").append(s.toString()).toString(), outofmemoryerror);
                }
                j++;
            }
        }
        if (jsonobject.has("event_bindings"))
        {
            try
            {
                a1.c = jsonobject.getJSONArray("event_bindings");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Mixpanel endpoint returned non-array JSON for event bindings: ").append(jsonobject).toString());
            }
        }
        if (jsonobject.has("variants"))
        {
            try
            {
                a1.d = jsonobject.getJSONArray("variants");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Mixpanel endpoint returned non-array JSON for variants: ").append(jsonobject).toString());
                return a1;
            }
        }
        return a1;
    }

    private a a(String s, String s1, RemoteService remoteservice)
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException, UnintelligibleMessageException
    {
        s1 = b(s, s1, remoteservice);
        if (g.b)
        {
            Log.v("MixpanelAPI.DChecker", (new StringBuilder()).append("Mixpanel decide server response was:\n").append(s1).toString());
        }
        s = new a();
        if (s1 != null)
        {
            s = a(s1);
        }
        for (s1 = ((a) (s)).b.iterator(); s1.hasNext();)
        {
            InAppNotification inappnotification = (InAppNotification)s1.next();
            Bitmap bitmap = a(inappnotification, b, remoteservice);
            if (bitmap == null)
            {
                Log.i("MixpanelAPI.DChecker", (new StringBuilder()).append("Could not retrieve image for notification ").append(inappnotification.c()).append(", will not show the notification.").toString());
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

    private static byte[] a(RemoteService remoteservice, Context context, String as[])
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
    {
        if (remoteservice.a(context)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int i;
        int j;
        j = as.length;
        i = 0;
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = as[i];
        byte abyte0[] = remoteservice.a(context, null);
        return abyte0;
        Object obj;
        obj;
        Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Cannot interpret ").append(context).append(" as a URL.").toString(), ((Throwable) (obj)));
_L5:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        obj;
        if (g.b)
        {
            Log.v("MixpanelAPI.DChecker", (new StringBuilder()).append("Cannot get ").append(context).append(", file not found.").toString(), ((Throwable) (obj)));
        }
          goto _L5
        obj;
        if (g.b)
        {
            Log.v("MixpanelAPI.DChecker", (new StringBuilder()).append("Cannot get ").append(context).append(".").toString(), ((Throwable) (obj)));
        }
          goto _L5
        remoteservice;
        Log.e("MixpanelAPI.DChecker", (new StringBuilder()).append("Out of memory when getting to ").append(context).append(".").toString(), remoteservice);
        return null;
        if (true) goto _L1; else goto _L6
_L6:
    }

    private String b(String s, String s1, RemoteService remoteservice)
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
    {
        int i = 0;
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
            break MISSING_BLOCK_LABEL_166;
        }
        s = URLEncoder.encode(s1, "utf-8");
_L1:
        s1 = (new StringBuilder()).append("?version=1&lib=android&token=").append(s2);
        if (s != null)
        {
            s1.append("&distinct_id=").append(s);
        }
        s1 = s1.toString();
        if (a.e())
        {
            s = new String[1];
            s[0] = (new StringBuilder()).append(a.l()).append(s1).toString();
        } else
        {
            s = new String[2];
            s[0] = (new StringBuilder()).append(a.l()).append(s1).toString();
            s[1] = (new StringBuilder()).append(a.o()).append(s1).toString();
        }
        if (g.b)
        {
            Log.v("MixpanelAPI.DChecker", "Querying decide server, urls:");
            for (; i < s.length; i++)
            {
                Log.v("MixpanelAPI.DChecker", (new StringBuilder()).append("    >> ").append(s[i]).toString());
            }

        }
        break MISSING_BLOCK_LABEL_246;
        s = null;
          goto _L1
        s = a(remoteservice, b, s);
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

    public void a(d d1)
    {
        c.add(d1);
    }

    public void a(RemoteService remoteservice)
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            Object obj = d1.b();
            try
            {
                obj = a(d1.a(), ((String) (obj)), remoteservice);
                d1.a(((a) (obj)).a, ((a) (obj)).b, ((a) (obj)).c, ((a) (obj)).d);
            }
            catch (UnintelligibleMessageException unintelligiblemessageexception)
            {
                Log.e("MixpanelAPI.DChecker", unintelligiblemessageexception.getMessage(), unintelligiblemessageexception);
            }
        }

    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.util.RemoteService;
import cxd;
import cxe;
import cxi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppNotification, BadDecideObjectException, Survey

public final class DecideChecker
{

    private static final JSONArray e = new JSONArray();
    public final List a = new LinkedList();
    private final cxi b;
    private final Context c;
    private final ImageStore d;

    public DecideChecker(Context context, cxi cxi1)
    {
        c = context;
        b = cxi1;
        d = new ImageStore(context, "DecideChecker");
    }

    private Bitmap a(InAppNotification inappnotification, Context context)
    {
        boolean flag = false;
        Object obj = inappnotification.c();
        String s = inappnotification.e;
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        int i;
        int j;
        if (android.os.Build.VERSION.SDK_INT < 13)
        {
            i = context.getWidth();
        } else
        {
            Point point = new Point();
            context.getSize(point);
            i = point.x;
        }
        if (inappnotification.b() == InAppNotification.Type.c && i >= 720)
        {
            context = new String[3];
            context[0] = InAppNotification.a(inappnotification.e, "@4x");
            context[1] = inappnotification.c();
            context[2] = inappnotification.e;
            inappnotification = context;
        } else
        {
            inappnotification = (new String[] {
                obj, s
            });
        }
        j = inappnotification.length;
        i = ((flag) ? 1 : 0);
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        context = inappnotification[i];
        obj = d.a(context);
        return ((Bitmap) (obj));
        obj;
        Log.v("MixpanelAPI.DChecker", (new StringBuilder("Can't load image ")).append(context).append(" for a notification").toString(), ((Throwable) (obj)));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_102;
_L1:
        return null;
    }

    private static cxd a(String s)
    {
        Object obj;
        cxd cxd1;
        JSONObject jsonobject;
        boolean flag;
        obj = null;
        flag = false;
        cxd1 = new cxd();
        Survey survey;
        int i;
        try
        {
            jsonobject = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new UnintelligibleMessageException((new StringBuilder("Mixpanel endpoint returned unparsable result:\n")).append(s).toString(), ((JSONException) (obj)));
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
                    cxd1.a.add(survey);
                }
                catch (JSONException jsonexception1)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder("Received a strange response from surveys service: ")).append(s.toString()).toString());
                }
                catch (BadDecideObjectException baddecideobjectexception1)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder("Received a strange response from surveys service: ")).append(s.toString()).toString());
                }
                i++;
            }
        }
        break MISSING_BLOCK_LABEL_204;
        s;
        Log.e("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for surveys: ")).append(jsonobject).toString());
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
                Log.e("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for notifications: ")).append(jsonobject).toString());
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
                    cxd1.b.add(obj);
                }
                catch (JSONException jsonexception)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder("Received a strange response from notifications service: ")).append(s.toString()).toString(), jsonexception);
                }
                catch (BadDecideObjectException baddecideobjectexception)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder("Received a strange response from notifications service: ")).append(s.toString()).toString(), baddecideobjectexception);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    Log.e("MixpanelAPI.DChecker", (new StringBuilder("Not enough memory to show load notification from package: ")).append(s.toString()).toString(), outofmemoryerror);
                }
                j++;
            }
        }
        if (jsonobject.has("event_bindings"))
        {
            try
            {
                cxd1.c = jsonobject.getJSONArray("event_bindings");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for event bindings: ")).append(jsonobject).toString());
            }
        }
        if (jsonobject.has("variants"))
        {
            try
            {
                cxd1.d = jsonobject.getJSONArray("variants");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for variants: ")).append(jsonobject).toString());
                return cxd1;
            }
        }
        return cxd1;
    }

    private String a(String s, String s1, RemoteService remoteservice)
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
            break MISSING_BLOCK_LABEL_155;
        }
        s = URLEncoder.encode(s1, "utf-8");
_L1:
        s1 = (new StringBuilder("?version=1&lib=android&token=")).append(s2);
        if (s != null)
        {
            s1.append("&distinct_id=").append(s);
        }
        s1 = s1.toString();
        if (b.e)
        {
            s = new String[1];
            s[0] = (new StringBuilder()).append(b.n).append(s1).toString();
        } else
        {
            s = new String[2];
            s[0] = (new StringBuilder()).append(b.n).append(s1).toString();
            s[1] = (new StringBuilder()).append(b.o).append(s1).toString();
        }
        if (cxi.a)
        {
            Log.v("MixpanelAPI.DChecker", "Querying decide server, urls:");
            for (; i < s.length; i++)
            {
                Log.v("MixpanelAPI.DChecker", (new StringBuilder("    >> ")).append(s[i]).toString());
            }

        }
        break MISSING_BLOCK_LABEL_235;
        s = null;
          goto _L1
        s = a(remoteservice, c, ((String []) (s)));
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

    public static JSONArray a()
    {
        return e;
    }

    private static byte[] a(RemoteService remoteservice, Context context, String as[])
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
        String s;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = as[i];
        byte abyte0[] = remoteservice.a(s, null, cxi.a(context).a());
        return abyte0;
        Object obj;
        obj;
        Log.e("MixpanelAPI.DChecker", (new StringBuilder("Cannot interpret ")).append(s).append(" as a URL.").toString(), ((Throwable) (obj)));
_L5:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        obj;
        if (cxi.a)
        {
            Log.v("MixpanelAPI.DChecker", (new StringBuilder("Cannot get ")).append(s).append(", file not found.").toString(), ((Throwable) (obj)));
        }
          goto _L5
        obj;
        if (cxi.a)
        {
            Log.v("MixpanelAPI.DChecker", (new StringBuilder("Cannot get ")).append(s).append(".").toString(), ((Throwable) (obj)));
        }
          goto _L5
        remoteservice;
        Log.e("MixpanelAPI.DChecker", (new StringBuilder("Out of memory when getting to ")).append(s).append(".").toString(), remoteservice);
        return null;
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void a(RemoteService remoteservice)
    {
        Iterator iterator = a.iterator();
_L3:
        Object obj;
        cxe cxe1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cxe1 = (cxe)iterator.next();
        obj = cxe1.a();
        Object obj1;
        obj1 = a(cxe1.a, ((String) (obj)), remoteservice);
        if (cxi.a)
        {
            Log.v("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel decide server response was:\n")).append(((String) (obj1))).toString());
        }
        obj = new cxd();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        obj = a(((String) (obj1)));
        obj1 = ((cxd) (obj)).b.iterator();
_L1:
        InAppNotification inappnotification;
        Bitmap bitmap;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_216;
        }
        inappnotification = (InAppNotification)((Iterator) (obj1)).next();
        bitmap = a(inappnotification, c);
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        Log.i("MixpanelAPI.DChecker", (new StringBuilder("Could not retrieve image for notification ")).append(inappnotification.b).append(", will not show the notification.").toString());
        ((Iterator) (obj1)).remove();
          goto _L1
        inappnotification.a = bitmap;
          goto _L1
        try
        {
            cxe1.a(((cxd) (obj)).a, ((cxd) (obj)).b, ((cxd) (obj)).c, ((cxd) (obj)).d);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.DChecker", ((UnintelligibleMessageException) (obj)).getMessage(), ((Throwable) (obj)));
        }
        if (true) goto _L3; else goto _L2
_L2:
    }


    private class UnintelligibleMessageException extends Exception
    {

        private static final long serialVersionUID = 0xa5c6d9f49582d643L;

        public UnintelligibleMessageException(String s, JSONException jsonexception)
        {
            super(s, jsonexception);
        }
    }

}

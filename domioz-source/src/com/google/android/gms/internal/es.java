// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fj, hj, a, eu, 
//            fh, x, fi, aj, 
//            et

public final class es
{

    private final Object a = new Object();
    private boolean b;
    private String c;
    private boolean d;

    public es()
    {
        b = true;
        d = false;
    }

    public static int a(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            fj.e((new StringBuilder("Could not parse value:")).append(s).toString());
            return 0;
        }
        return i;
    }

    static Object a(es es1)
    {
        return es1.a;
    }

    public static String a()
    {
        Object obj;
        byte abyte0[];
        byte abyte1[];
        int i;
        obj = UUID.randomUUID();
        abyte0 = BigInteger.valueOf(((UUID) (obj)).getLeastSignificantBits()).toByteArray();
        abyte1 = BigInteger.valueOf(((UUID) (obj)).getMostSignificantBits()).toByteArray();
        obj = (new BigInteger(1, abyte0)).toString();
        i = 0;
_L2:
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        obj1 = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj1)).update(abyte0);
        ((MessageDigest) (obj1)).update(abyte1);
        byte abyte2[] = new byte[8];
        System.arraycopy(((MessageDigest) (obj1)).digest(), 0, abyte2, 0, 8);
        obj1 = (new BigInteger(1, abyte2)).toString();
        obj = obj1;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return ((String) (obj));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
          goto _L3
    }

    protected static String a(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    static String a(es es1, String s)
    {
        es1.c = s;
        return s;
    }

    public static String a(hj hj1, String s)
    {
        if (hj1 == null)
        {
            return s;
        }
        Uri uri1 = Uri.parse(s);
        Uri uri;
        boolean flag;
        if (hj1.a(uri1) && uri1.getPath().endsWith("/aclk"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        uri = uri1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        uri = hj1.b(uri1);
        hj1 = uri.toString();
        return hj1;
        hj1;
        return s;
    }

    public static String a(InputStreamReader inputstreamreader)
    {
        StringBuilder stringbuilder = new StringBuilder(8192);
        char ac[] = new char[2048];
        do
        {
            int i = inputstreamreader.read(ac);
            if (i != -1)
            {
                stringbuilder.append(ac, 0, i);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    public static Map a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = com.google.android.gms.internal.a.e().a(uri).iterator(); iterator.hasNext(); hashmap.put(s, uri.getQueryParameter(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private JSONArray a(Collection collection)
    {
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); a(jsonarray, collection.next())) { }
        return jsonarray;
    }

    private JSONObject a(Bundle bundle)
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); a(jsonobject, s, bundle.get(s)))
        {
            s = (String)iterator.next();
        }

        return jsonobject;
    }

    public static void a(Context context, String s, List list, String s1)
    {
        for (list = list.iterator(); list.hasNext(); (new fh(context, s, (String)list.next(), s1)).a()) { }
    }

    private void a(JSONArray jsonarray, Object obj)
    {
        if (obj instanceof Bundle)
        {
            jsonarray.put(a((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonarray.put(a((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            jsonarray.put(a((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            obj = ((Object) ((Object[])obj));
            JSONArray jsonarray1 = new JSONArray();
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                a(jsonarray1, obj[i]);
            }

            jsonarray.put(jsonarray1);
            return;
        } else
        {
            jsonarray.put(obj);
            return;
        }
    }

    private void a(JSONObject jsonobject, String s, Object obj)
    {
        if (obj instanceof Bundle)
        {
            jsonobject.put(s, a((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonobject.put(s, a((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            if (s == null)
            {
                s = "null";
            }
            jsonobject.put(s, a((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            jsonobject.put(s, a(((Collection) (Arrays.asList((Object[])obj)))));
            return;
        } else
        {
            jsonobject.put(s, obj);
            return;
        }
    }

    public static int[] a(Activity activity)
    {
        activity = activity.getWindow();
        if (activity != null)
        {
            activity = activity.findViewById(0x1020002);
            if (activity != null)
            {
                return (new int[] {
                    activity.getWidth(), activity.getHeight()
                });
            }
        }
        return c();
    }

    public static android.app.AlertDialog.Builder b(Context context)
    {
        return new android.app.AlertDialog.Builder(context);
    }

    private static String b()
    {
        StringBuffer stringbuffer = new StringBuffer(256);
        stringbuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (android.os.Build.VERSION.RELEASE != null)
        {
            stringbuffer.append(" ").append(android.os.Build.VERSION.RELEASE);
        }
        stringbuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null)
        {
            stringbuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null)
            {
                stringbuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringbuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringbuffer.toString();
    }

    public static int[] b(Activity activity)
    {
        int ai[] = a(activity);
        x.a();
        int i = fi.b(activity, ai[0]);
        x.a();
        return (new int[] {
            i, fi.b(activity, ai[1])
        });
    }

    public static aj c(Context context)
    {
        return new aj(context);
    }

    private static int[] c()
    {
        return (new int[] {
            0, 0
        });
    }

    public static int[] c(Activity activity)
    {
        Window window = activity.getWindow();
        if (window == null) goto _L2; else goto _L1
_L1:
        View view = window.findViewById(0x1020002);
        if (view == null) goto _L2; else goto _L3
_L3:
        int ai[];
        ai = new int[2];
        ai[0] = view.getTop();
        ai[1] = view.getBottom();
_L5:
        x.a();
        int i = fi.b(activity, ai[0]);
        x.a();
        return (new int[] {
            i, fi.b(activity, ai[1])
        });
_L2:
        ai = c();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final String a(Context context, String s)
    {
label0:
        {
            synchronized (a)
            {
                if (c == null)
                {
                    break label0;
                }
                context = c;
            }
            return context;
        }
        try
        {
            c = com.google.android.gms.internal.a.e().a(context);
        }
        catch (Exception exception) { }
        if (!TextUtils.isEmpty(c))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        x.a();
        if (fi.a())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        c = null;
        fi.a.post(new et(this, context));
_L1:
        context = c;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        a.wait();
          goto _L1
        context;
        c = b();
        fj.e((new StringBuilder("Interrupted, use default user agent: ")).append(c).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        c = a(context);
_L2:
        c = (new StringBuilder()).append(c).append(" (Mobile; ").append(s).append(")").toString();
        context = c;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        c = b();
          goto _L2
    }

    public final JSONObject a(Map map)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(jsonobject, s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new JSONException((new StringBuilder("Could not convert map to JSON: ")).append(map.getMessage()).toString());
        }
        return jsonobject;
    }

    public final void a(Context context, String s, HttpURLConnection httpurlconnection, boolean flag)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(true);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", a(context, s));
        httpurlconnection.setUseCaches(flag);
    }
}

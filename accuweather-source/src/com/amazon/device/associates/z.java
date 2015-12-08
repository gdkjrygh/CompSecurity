// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            au

class z
{

    private static z f = null;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    private z(Context context)
    {
        a = context.getPackageName();
        Object obj = context.getPackageManager();
        b = (String)((PackageManager) (obj)).getApplicationLabel(context.getApplicationInfo());
        try
        {
            context = ((PackageManager) (obj)).getPackageInfo(a, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null)
        {
            obj = ((PackageInfo) (context)).versionName;
        } else
        {
            obj = "";
        }
        d = ((String) (obj));
        if (context != null)
        {
            context = Integer.toString(((PackageInfo) (context)).versionCode);
        } else
        {
            context = "";
        }
        c = context;
        context = new JSONObject();
        try
        {
            context.put("lbl", b);
            context.put("pn", a);
            if (!c.equals(""))
            {
                context.put("v", c);
            }
            if (!d.equals(""))
            {
                context.put("vn", d);
            }
        }
        catch (JSONException jsonexception) { }
        e = context.toString();
    }

    protected static final z a(Context context)
    {
        com/amazon/device/associates/z;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new z(context);
        }
        context = f;
        com/amazon/device/associates/z;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    protected BasicNameValuePair a()
    {
        if (e != null)
        {
            return new BasicNameValuePair("pkg", au.a(e.toString()));
        } else
        {
            return null;
        }
    }

}

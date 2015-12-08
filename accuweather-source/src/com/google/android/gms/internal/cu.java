// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ev, ei, ej, et

public final class cu extends dc.a
{

    private String lp;
    private Context mContext;
    private String pd;
    private ArrayList pe;

    public cu(String s, ArrayList arraylist, Context context, String s1)
    {
        pd = s;
        pe = arraylist;
        lp = s1;
        mContext = context;
    }

    private void be()
    {
        try
        {
            mContext.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[] {
                android/content/Context, java/lang/String, java/lang/String, Boolean.TYPE
            }).invoke(null, new Object[] {
                mContext, pd, "", Boolean.valueOf(true)
            });
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            ev.D("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            ev.D("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
            return;
        }
        catch (Exception exception)
        {
            ev.c("Fail to report a conversion.", exception);
        }
    }

    protected String a(String s, HashMap hashmap)
    {
        String s1 = mContext.getPackageName();
        Object obj;
        long l1;
        long l2;
        try
        {
            obj = mContext.getPackageManager().getPackageInfo(s1, 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ev.c("Error to retrieve app version", ((Throwable) (obj)));
            obj = "";
        }
        l1 = SystemClock.elapsedRealtime();
        l2 = ei.bF().bJ();
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            s = s.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
                s2
            }), String.format("$1%s$2", new Object[] {
                hashmap.get(s2)
            }));
        }

        return s.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "sessionid"
        }), String.format("$1%s$2", new Object[] {
            ei.rN
        })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "appid"
        }), String.format("$1%s$2", new Object[] {
            s1
        })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "osversion"
        }), String.format("$1%s$2", new Object[] {
            String.valueOf(android.os.Build.VERSION.SDK_INT)
        })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "sdkversion"
        }), String.format("$1%s$2", new Object[] {
            lp
        })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "appversion"
        }), String.format("$1%s$2", new Object[] {
            obj
        })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "timestamp"
        }), String.format("$1%s$2", new Object[] {
            String.valueOf(l1 - l2)
        })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "[^@]+"
        }), String.format("$1%s$2", new Object[] {
            ""
        })).replaceAll("@@", "@");
    }

    public String getProductId()
    {
        return pd;
    }

    protected int l(int i)
    {
        if (i == 0)
        {
            return 1;
        }
        if (i == 1)
        {
            return 2;
        }
        return i != 4 ? 0 : 3;
    }

    public void recordPlayBillingResolution(int i)
    {
        if (i == 0)
        {
            be();
        }
        HashMap hashmap = new HashMap();
        hashmap.put("google_play_status", String.valueOf(i));
        hashmap.put("sku", pd);
        hashmap.put("status", String.valueOf(l(i)));
        String s;
        for (Iterator iterator = pe.iterator(); iterator.hasNext(); (new et(mContext, lp, a(s, hashmap))).start())
        {
            s = (String)iterator.next();
        }

    }

    public void recordResolution(int i)
    {
        if (i == 1)
        {
            be();
        }
        HashMap hashmap = new HashMap();
        hashmap.put("status", String.valueOf(i));
        hashmap.put("sku", pd);
        String s;
        for (Iterator iterator = pe.iterator(); iterator.hasNext(); (new et(mContext, lp, a(s, hashmap))).start())
        {
            s = (String)iterator.next();
        }

    }
}

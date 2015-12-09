// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gw;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class zzd extends com.google.android.gms.internal.en.a
{

    private Context mContext;
    private String zzBW;
    private ArrayList zzBX;
    private String zzqK;

    public zzd(String s, ArrayList arraylist, Context context, String s1)
    {
        zzBW = s;
        zzBX = arraylist;
        zzqK = s1;
        mContext = context;
    }

    public String getProductId()
    {
        return zzBW;
    }

    public void recordPlayBillingResolution(int i)
    {
        if (i == 0)
        {
            zzfh();
        }
        HashMap hashmap = new HashMap();
        hashmap.put("google_play_status", String.valueOf(i));
        hashmap.put("sku", zzBW);
        hashmap.put("status", String.valueOf(zzy(i)));
        LinkedList linkedlist = new LinkedList();
        for (Iterator iterator = zzBX.iterator(); iterator.hasNext(); linkedlist.add(zza((String)iterator.next(), hashmap))) { }
        zzp.zzbx().a(mContext, zzqK, linkedlist);
    }

    public void recordResolution(int i)
    {
        if (i == 1)
        {
            zzfh();
        }
        HashMap hashmap = new HashMap();
        hashmap.put("status", String.valueOf(i));
        hashmap.put("sku", zzBW);
        LinkedList linkedlist = new LinkedList();
        for (Iterator iterator = zzBX.iterator(); iterator.hasNext(); linkedlist.add(zza((String)iterator.next(), hashmap))) { }
        zzp.zzbx().a(mContext, zzqK, linkedlist);
    }

    protected String zza(String s, HashMap hashmap)
    {
        String s1 = mContext.getPackageName();
        Object obj;
        long l;
        long l1;
        try
        {
            obj = mContext.getPackageManager().getPackageInfo(s1, 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzd("Error to retrieve app version", ((Throwable) (obj)));
            obj = "";
        }
        l = zzp.zzbA().d().a();
        l1 = SystemClock.elapsedRealtime();
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
            zzp.zzbA().a()
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
            zzqK
        })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "appversion"
        }), String.format("$1%s$2", new Object[] {
            obj
        })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "timestamp"
        }), String.format("$1%s$2", new Object[] {
            String.valueOf(l1 - l)
        })).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[] {
            "[^@]+"
        }), String.format("$1%s$2", new Object[] {
            ""
        })).replaceAll("@@", "@");
    }

    void zzfh()
    {
        try
        {
            mContext.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[] {
                android/content/Context, java/lang/String, java/lang/String, Boolean.TYPE
            }).invoke(null, new Object[] {
                mContext, zzBW, "", Boolean.valueOf(true)
            });
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            zzb.zzaE("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            zzb.zzaE("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
            return;
        }
        catch (Exception exception)
        {
            zzb.zzd("Fail to report a conversion.", exception);
        }
    }

    protected int zzy(int i)
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
}

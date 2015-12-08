// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;

public class zzb
{

    Object a;
    private final Context b;
    private final boolean c;

    public zzb(Context context)
    {
        this(context, true);
    }

    public zzb(Context context, boolean flag)
    {
        b = context;
        c = flag;
    }

    public void destroy()
    {
        a = null;
    }

    public void zzN(IBinder ibinder)
    {
        a = b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[] {
            android/os/IBinder
        }).invoke(null, new Object[] {
            ibinder
        });
_L1:
        return;
        ibinder;
        if (c)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
            return;
        }
          goto _L1
    }

    public int zza(int i, String s, String s1)
    {
        try
        {
            Class class1 = b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            i = ((Integer)class1.getDeclaredMethod("isBillingSupported", new Class[] {
                Integer.TYPE, java/lang/String, java/lang/String
            }).invoke(class1.cast(a), new Object[] {
                Integer.valueOf(i), s, s1
            })).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (c)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", s);
            }
            return 5;
        }
        return i;
    }

    public Bundle zzb(String s, String s1, String s2)
    {
        try
        {
            Class class1 = b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            s = (Bundle)class1.getDeclaredMethod("getBuyIntent", new Class[] {
                Integer.TYPE, java/lang/String, java/lang/String, java/lang/String, java/lang/String
            }).invoke(class1.cast(a), new Object[] {
                Integer.valueOf(3), s, s1, "inapp", s2
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (c)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", s);
            }
            return null;
        }
        return s;
    }

    public int zzi(String s, String s1)
    {
        int i;
        try
        {
            Class class1 = b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            i = ((Integer)class1.getDeclaredMethod("consumePurchase", new Class[] {
                Integer.TYPE, java/lang/String, java/lang/String
            }).invoke(class1.cast(a), new Object[] {
                Integer.valueOf(3), s, s1
            })).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (c)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", s);
            }
            return 5;
        }
        return i;
    }

    public Bundle zzj(String s, String s1)
    {
        try
        {
            Class class1 = b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            s = (Bundle)class1.getDeclaredMethod("getPurchases", new Class[] {
                Integer.TYPE, java/lang/String, java/lang/String, java/lang/String
            }).invoke(class1.cast(a), new Object[] {
                Integer.valueOf(3), s, "inapp", s1
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (c)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", s);
            }
            return null;
        }
        return s;
    }
}

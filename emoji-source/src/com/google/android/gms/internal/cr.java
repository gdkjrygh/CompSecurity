// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal:
//            eu

public class cr
{

    private final Context mContext;
    private Object oV;

    public cr(Context context)
    {
        mContext = context;
    }

    public int a(String s, String s1)
    {
        int i;
        try
        {
            Class class1 = mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            i = ((Integer)class1.getDeclaredMethod("consumePurchase", new Class[] {
                Integer.TYPE, java/lang/String, java/lang/String
            }).invoke(class1.cast(oV), new Object[] {
                Integer.valueOf(3), s, s1
            })).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", s);
            return 5;
        }
        return i;
    }

    public Bundle a(String s, String s1, String s2)
    {
        try
        {
            Class class1 = mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            s = (Bundle)class1.getDeclaredMethod("getBuyIntent", new Class[] {
                Integer.TYPE, java/lang/String, java/lang/String, java/lang/String, java/lang/String
            }).invoke(class1.cast(oV), new Object[] {
                Integer.valueOf(3), s, s1, "inapp", s2
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", s);
            return null;
        }
        return s;
    }

    public Bundle b(String s, String s1)
    {
        try
        {
            Class class1 = mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            s = (Bundle)class1.getDeclaredMethod("getPurchases", new Class[] {
                Integer.TYPE, java/lang/String, java/lang/String, java/lang/String
            }).invoke(class1.cast(oV), new Object[] {
                Integer.valueOf(3), s, "inapp", s1
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", s);
            return null;
        }
        return s;
    }

    public void destroy()
    {
        oV = null;
    }

    public void o(IBinder ibinder)
    {
        try
        {
            oV = mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[] {
                android/os/IBinder
            }).invoke(null, new Object[] {
                ibinder
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            eu.D("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
        }
    }
}

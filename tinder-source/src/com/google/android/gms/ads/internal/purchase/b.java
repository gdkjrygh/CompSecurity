// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

public final class b
{

    Object a;
    final Context b;
    final boolean c;

    public b(Context context)
    {
        this(context, (byte)0);
    }

    private b(Context context, byte byte0)
    {
        b = context;
        c = true;
    }

    public final Bundle a(String s, String s1, String s2)
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
                com.google.android.gms.ads.internal.util.client.b.c("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", s);
            }
            return null;
        }
        return s;
    }
}

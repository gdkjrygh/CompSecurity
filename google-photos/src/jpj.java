// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

public final class jpj
{

    Object a;
    final Context b;
    final boolean c;

    public jpj(Context context)
    {
        this(context, true);
    }

    private jpj(Context context, boolean flag)
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
                b.b("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", s);
            }
            return null;
        }
        return s;
    }
}

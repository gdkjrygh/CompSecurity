// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk:
//            M

public class W extends M
{

    private static final String a = com/paypal/android/sdk/W.getSimpleName();

    public W()
    {
    }

    protected static Intent a(String s, String s1)
    {
        s = new Intent(s);
        s.setComponent(ComponentName.unflattenFromString(s1));
        s.setPackage("com.paypal.android.p2pmobile");
        return s;
    }

    public static boolean a(Context context, String s, String s1)
    {
        boolean flag1 = false;
        Intent intent = a(s, s1);
        context = context.getPackageManager().queryIntentActivities(intent, 0);
        boolean flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (context.size() > 0)
            {
                flag = true;
            }
        }
        if (!flag)
        {
            (new StringBuilder("PayPal wallet app will not accept intent to: [action:")).append(s).append(", class:").append(s1).append("]");
        }
        return flag;
    }

    public static boolean b(Context context, boolean flag)
    {
        return a(context, flag, "com.paypal.android.p2pmobile", "O=Paypal", "O=Paypal");
    }

}

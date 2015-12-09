// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ar;

import android.content.Context;
import android.content.pm.PackageManager;

public class a
{

    private static boolean a = false;
    private static boolean b = false;

    public static boolean a(Context context)
    {
        if (a)
        {
            return b;
        }
        if (android.os.Build.VERSION.SDK_INT > 4)
        {
            try
            {
                context = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a = true;
                b = false;
                return false;
            }
            if ("com.android.vending".equals(context) || "com.google.play".equals(context))
            {
                a = true;
                b = true;
                return true;
            }
        }
        a = true;
        b = false;
        return false;
    }

}

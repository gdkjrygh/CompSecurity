// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

// Referenced classes of package com.qihoo.antivirus.update:
//            ae, af

public class UpdatePatchInstall
{

    private static boolean a = false;

    public static int a(Context context, String s, String s1)
    {
        if (!a)
        {
            if (!ae.b(context, "patch"))
            {
                return -2;
            }
            a = true;
        }
        PackageManager packagemanager = context.getPackageManager();
        if (packagemanager == null)
        {
            return -3;
        }
        int i;
        try
        {
            context = packagemanager.getPackageInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -4;
        }
        i = patch(0, s, ((PackageInfo) (context)).applicationInfo.publicSourceDir, s1);
        if (i == 0);
        af.c(s);
        return i;
    }

    public static int a(Context context, String s, String s1, String s2)
    {
        if (a) goto _L2; else goto _L1
_L1:
        if (ae.b(context, "patch")) goto _L4; else goto _L3
_L3:
        int i = -2;
_L6:
        return i;
_L4:
        a = true;
_L2:
        int j = patch(0, s, s1, s2);
        i = j;
        if (j != 0)
        {
            return j;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static native int patch(int i, String s, String s1, String s2);

}

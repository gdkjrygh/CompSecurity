// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.support.v4.app.d;

public final class e
{

    public static int a(Context context, String s)
    {
        int i = Process.myPid();
        int j = Process.myUid();
        String s1 = context.getPackageName();
        if (context.checkPermission(s, i, j) == -1)
        {
            return -1;
        }
        String s2 = d.a(s);
        if (s2 != null)
        {
            s = s1;
            if (s1 == null)
            {
                s = context.getPackageManager().getPackagesForUid(j);
                if (s == null || s.length <= 0)
                {
                    return -1;
                }
                s = s[0];
            }
            if (d.a(context, s2, s) != 0)
            {
                return -2;
            }
        }
        return 0;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fdlimit;

import android.os.Build;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.fdlimit:
//            FdLimitNative

public class a
{

    public static final Class a = com/facebook/fdlimit/a;

    private a()
    {
    }

    public static boolean a()
    {
        boolean flag = false;
        if (com.facebook.e.a.a(Build.CPU_ABI) || com.facebook.e.a.a(Build.CPU_ABI2))
        {
            try
            {
                FdLimitNative.setFdLimit(FdLimitNative.getHardFdLimit(), FdLimitNative.getHardFdLimit());
                b.b(a, (new StringBuilder()).append("fd limit now ").append(FdLimitNative.getSoftFdLimit()).append("/").append(FdLimitNative.getHardFdLimit()).toString());
            }
            catch (Exception exception)
            {
                return false;
            }
            flag = true;
        }
        return flag;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.sdinstall;

import android.content.Context;
import android.os.StatFs;

// Referenced classes of package com.facebook.common.sdinstall:
//            SDInstallCheckerDeps

public class SDInstallChecker
{

    private final Context a;
    private final SDInstallCheckerDeps b;

    public SDInstallChecker(Context context, SDInstallCheckerDeps sdinstallcheckerdeps)
    {
        a = context;
        b = sdinstallcheckerdeps;
    }

    private boolean b()
    {
        for (int i = SDInstallCheckerDeps.a(a); (i & 0x80) != 0 || (i & 1) != 0 || (i & 0x40000) != 0;)
        {
            return false;
        }

        return true;
    }

    public final boolean a()
    {
        StatFs statfs;
        if (b())
        {
            if ((long)(statfs = SDInstallCheckerDeps.a(SDInstallCheckerDeps.a())).getAvailableBlocks() * (long)statfs.getBlockSize() <= 0x1e00000L && (long)(statfs = SDInstallCheckerDeps.a(SDInstallCheckerDeps.b())).getAvailableBlocks() * (long)statfs.getBlockSize() >= 0x6400000L)
            {
                return true;
            }
        }
        return false;
    }
}

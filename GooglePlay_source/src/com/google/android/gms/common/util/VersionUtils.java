// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import com.google.android.gms.common.app.GmsApplicationContext;

// Referenced classes of package com.google.android.gms.common.util:
//            AndroidUtils

public final class VersionUtils
{

    private static boolean isDecomposedBuildValid = false;
    private static long sBuildNumber = -1L;
    private static int sVersionCode = -1;

    public static int getVersionCode()
    {
        if (sVersionCode == -1)
        {
            sVersionCode = AndroidUtils.getCurrentVersionCode(GmsApplicationContext.getInstance());
        }
        return sVersionCode;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.internal;


// Referenced classes of package com.htc.lib2.opensense.internal:
//            SystemWrapper

public static class 
{

    public static final boolean Htc_DEBUG_flag = getHtcDebugFlag();
    private static boolean sIsDebug = false;
    private static boolean sIsSet = false;

    private static boolean getHtcDebugFlag()
    {
        if (!sIsSet)
        {
            sIsDebug = ((Boolean)SystemWrapper.access$100("com.htc.htcjavaflag.HtcBuildFlag", "Htc_DEBUG_flag", Boolean.valueOf(false))).booleanValue();
            sIsSet = true;
        }
        return sIsDebug;
    }


    public ()
    {
    }
}

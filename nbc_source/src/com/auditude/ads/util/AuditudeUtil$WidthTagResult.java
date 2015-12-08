// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;


// Referenced classes of package com.auditude.ads.util:
//            AuditudeUtil, Size

public static class 
    implements 
{

    public String getResult()
    {
        if (AuditudeUtil.AuditudePluginSize != null)
        {
            return String.valueOf(AuditudeUtil.AuditudePluginSize.width);
        } else
        {
            return "0";
        }
    }

    public ()
    {
    }
}

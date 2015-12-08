// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;


// Referenced classes of package com.auditude.ads.util:
//            AuditudeUtil

public static class t
    implements t
{

    public String getResult()
    {
        if (AuditudeUtil.access$1() != null && AuditudeUtil.access$1().length() > 0)
        {
            return AuditudeUtil.access$1();
        } else
        {
            return "[ASSETURI]";
        }
    }

    public t()
    {
    }
}

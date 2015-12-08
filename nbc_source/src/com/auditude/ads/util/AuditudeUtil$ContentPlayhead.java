// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;


// Referenced classes of package com.auditude.ads.util:
//            AuditudeUtil, StringUtil

public static class 
    implements 
{

    public String getResult()
    {
        if (AuditudeUtil.access$0() >= 0)
        {
            return StringUtil.convertToHHMMSS(Math.round(AuditudeUtil.access$0() / 1000));
        } else
        {
            return "[CONTENTPLAYHEAD]";
        }
    }

    public ()
    {
    }
}

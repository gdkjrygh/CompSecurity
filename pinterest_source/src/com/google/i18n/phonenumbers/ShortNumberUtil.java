// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.i18n.phonenumbers;

import java.util.Set;

// Referenced classes of package com.google.i18n.phonenumbers:
//            ShortNumberInfo

public class ShortNumberUtil
{

    public ShortNumberUtil()
    {
    }

    public boolean connectsToEmergencyNumber(String s, String s1)
    {
        return ShortNumberInfo.getInstance().connectsToEmergencyNumber(s, s1);
    }

    public Set getSupportedRegions()
    {
        return ShortNumberInfo.getInstance().getSupportedRegions();
    }

    public boolean isEmergencyNumber(String s, String s1)
    {
        return ShortNumberInfo.getInstance().isEmergencyNumber(s, s1);
    }
}

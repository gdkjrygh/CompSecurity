// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


// Referenced classes of package com.fitbit.data.domain.device:
//            BondInfo

public static final class  extends Enum
{

    private static final Unknown $VALUES[];
    public static final Unknown Android;
    public static final Unknown Other;
    public static final Unknown Unknown;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/data/domain/device/BondInfo$BondedDeviceType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Android = new <init>("Android", 0);
        Other = new <init>("Other", 1);
        Unknown = new <init>("Unknown", 2);
        $VALUES = (new .VALUES[] {
            Android, Other, Unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

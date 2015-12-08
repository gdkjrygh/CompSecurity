// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            RankedUser

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ACTIVE;
    public static final UNKNOWN INACTIVE;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/data/domain/RankedUser$ActiveState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ACTIVE = new <init>("ACTIVE", 0);
        INACTIVE = new <init>("INACTIVE", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            ACTIVE, INACTIVE, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

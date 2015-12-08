// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.util;


// Referenced classes of package com.kohls.mcommerce.opal.common.util:
//            StatesWithCode

public static final class  extends Enum
{

    private static final ARMED_FORCE_STATES $VALUES[];
    public static final ARMED_FORCE_STATES ARMED_FORCE_STATES;
    public static final ARMED_FORCE_STATES STATES;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kohls/mcommerce/opal/common/util/StatesWithCode$StateType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STATES = new <init>("STATES", 0);
        ARMED_FORCE_STATES = new <init>("ARMED_FORCE_STATES", 1);
        $VALUES = (new .VALUES[] {
            STATES, ARMED_FORCE_STATES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

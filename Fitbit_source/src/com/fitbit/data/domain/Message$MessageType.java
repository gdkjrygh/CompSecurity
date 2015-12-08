// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Message

public static final class  extends Enum
{

    private static final TAUNT $VALUES[];
    public static final TAUNT CHEER;
    public static final TAUNT MESSAGE;
    public static final TAUNT TAUNT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/data/domain/Message$MessageType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MESSAGE = new <init>("MESSAGE", 0);
        CHEER = new <init>("CHEER", 1);
        TAUNT = new <init>("TAUNT", 2);
        $VALUES = (new .VALUES[] {
            MESSAGE, CHEER, TAUNT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

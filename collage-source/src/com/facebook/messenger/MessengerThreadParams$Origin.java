// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messenger;


// Referenced classes of package com.facebook.messenger:
//            MessengerThreadParams

public static final class _cls9 extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN COMPOSE_FLOW;
    public static final UNKNOWN REPLY_FLOW;
    public static final UNKNOWN UNKNOWN;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/facebook/messenger/MessengerThreadParams$Origin, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        REPLY_FLOW = new <init>("REPLY_FLOW", 0);
        COMPOSE_FLOW = new <init>("COMPOSE_FLOW", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            REPLY_FLOW, COMPOSE_FLOW, UNKNOWN
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}

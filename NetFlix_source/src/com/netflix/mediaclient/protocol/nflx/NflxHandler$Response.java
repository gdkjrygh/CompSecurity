// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.protocol.nflx;


// Referenced classes of package com.netflix.mediaclient.protocol.nflx:
//            NflxHandler

public static final class  extends Enum
{

    private static final HANDLING_WITH_DELAY $VALUES[];
    public static final HANDLING_WITH_DELAY HANDLING;
    public static final HANDLING_WITH_DELAY HANDLING_WITH_DELAY;
    public static final HANDLING_WITH_DELAY NOT_HANDLING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/protocol/nflx/NflxHandler$Response, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HANDLING = new <init>("HANDLING", 0);
        NOT_HANDLING = new <init>("NOT_HANDLING", 1);
        HANDLING_WITH_DELAY = new <init>("HANDLING_WITH_DELAY", 2);
        $VALUES = (new .VALUES[] {
            HANDLING, NOT_HANDLING, HANDLING_WITH_DELAY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

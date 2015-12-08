// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.content;


// Referenced classes of package com.phunware.nbc.sochi.content:
//            ContentState

public static final class  extends Enum
{

    private static final FER $VALUES[];
    public static final FER FER;
    public static final FER FUTURE;
    public static final FER HIDDEN;
    public static final FER LIVE;
    public static final FER VOD;
    public static final FER isLive;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/phunware/nbc/sochi/content/ContentState$EventState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VOD = new <init>("VOD", 0);
        LIVE = new <init>("LIVE", 1);
        FUTURE = new <init>("FUTURE", 2);
        HIDDEN = new <init>("HIDDEN", 3);
        isLive = new <init>("isLive", 4);
        FER = new <init>("FER", 5);
        $VALUES = (new .VALUES[] {
            VOD, LIVE, FUTURE, HIDDEN, isLive, FER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

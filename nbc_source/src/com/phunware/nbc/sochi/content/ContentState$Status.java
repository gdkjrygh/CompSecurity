// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.content;


// Referenced classes of package com.phunware.nbc.sochi.content:
//            ContentState

public static final class  extends Enum
{

    private static final REPLAY $VALUES[];
    public static final REPLAY EMBARGOED;
    public static final REPLAY LIVE;
    public static final REPLAY LIVE_EMBARGOED;
    public static final REPLAY NON_SCHEDULED;
    public static final REPLAY REPLAY;
    public static final REPLAY SCHEDULED;
    public static final REPLAY SCHEDULED_EMBARGOED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/phunware/nbc/sochi/content/ContentState$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NON_SCHEDULED = new <init>("NON_SCHEDULED", 0);
        SCHEDULED = new <init>("SCHEDULED", 1);
        SCHEDULED_EMBARGOED = new <init>("SCHEDULED_EMBARGOED", 2);
        LIVE = new <init>("LIVE", 3);
        LIVE_EMBARGOED = new <init>("LIVE_EMBARGOED", 4);
        EMBARGOED = new <init>("EMBARGOED", 5);
        REPLAY = new <init>("REPLAY", 6);
        $VALUES = (new .VALUES[] {
            NON_SCHEDULED, SCHEDULED, SCHEDULED_EMBARGOED, LIVE, LIVE_EMBARGOED, EMBARGOED, REPLAY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

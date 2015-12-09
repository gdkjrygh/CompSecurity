// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;


// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            LoMoViewPagerAdapter

private static final class  extends Enum
{

    private static final CHARACTER $VALUES[];
    public static final CHARACTER BILLBOARD;
    public static final CHARACTER CHARACTER;
    public static final CHARACTER CW;
    public static final CHARACTER ERROR;
    public static final CHARACTER IQ;
    public static final CHARACTER LOADING;
    public static final CHARACTER STANDARD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/ui/lomo/LoMoViewPagerAdapter$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STANDARD = new <init>("STANDARD", 0);
        LOADING = new <init>("LOADING", 1);
        ERROR = new <init>("ERROR", 2);
        IQ = new <init>("IQ", 3);
        CW = new <init>("CW", 4);
        BILLBOARD = new <init>("BILLBOARD", 5);
        CHARACTER = new <init>("CHARACTER", 6);
        $VALUES = (new .VALUES[] {
            STANDARD, LOADING, ERROR, IQ, CW, BILLBOARD, CHARACTER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

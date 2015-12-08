// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.content;


// Referenced classes of package com.phunware.nbc.sochi.content:
//            ContentState

public static final class  extends Enum
{

    private static final TELEMUNDO $VALUES[];
    public static final TELEMUNDO GOLFLIVE;
    public static final TELEMUNDO NBCSPORTSLIVE;
    public static final TELEMUNDO TELEMUNDO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/phunware/nbc/sochi/content/ContentState$CurrentContent, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NBCSPORTSLIVE = new <init>("NBCSPORTSLIVE", 0);
        GOLFLIVE = new <init>("GOLFLIVE", 1);
        TELEMUNDO = new <init>("TELEMUNDO", 2);
        $VALUES = (new .VALUES[] {
            NBCSPORTSLIVE, GOLFLIVE, TELEMUNDO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

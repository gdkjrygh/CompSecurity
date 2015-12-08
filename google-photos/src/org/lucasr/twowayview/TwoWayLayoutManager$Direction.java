// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;


public final class _cls9 extends Enum
{

    private static final END $VALUES[];
    public static final END END;
    public static final END START;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(org/lucasr/twowayview/TwoWayLayoutManager$Direction, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        START = new <init>("START", 0);
        END = new <init>("END", 1);
        $VALUES = (new .VALUES[] {
            START, END
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}

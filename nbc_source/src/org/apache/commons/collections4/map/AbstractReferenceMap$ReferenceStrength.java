// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.map;


// Referenced classes of package org.apache.commons.collections4.map:
//            AbstractReferenceMap

public static final class value extends Enum
{

    private static final WEAK $VALUES[];
    public static final WEAK HARD;
    public static final WEAK SOFT;
    public static final WEAK WEAK;
    public final int value;

    public static value resolve(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException();

        case 0: // '\0'
            return HARD;

        case 1: // '\001'
            return SOFT;

        case 2: // '\002'
            return WEAK;
        }
    }

    public static WEAK valueOf(String s)
    {
        return (WEAK)Enum.valueOf(org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength, s);
    }

    public static WEAK[] values()
    {
        return (WEAK[])$VALUES.clone();
    }

    static 
    {
        HARD = new <init>("HARD", 0, 0);
        SOFT = new <init>("SOFT", 1, 1);
        WEAK = new <init>("WEAK", 2, 2);
        $VALUES = (new .VALUES[] {
            HARD, SOFT, WEAK
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}

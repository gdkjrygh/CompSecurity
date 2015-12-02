// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            la, lb, lc, ky

public abstract class kz extends Enum
{

    private static final kz $VALUES[];
    public static final kz INVERTED_INSERTION_INDEX;
    public static final kz NEXT_HIGHER;
    public static final kz NEXT_LOWER;

    private kz(String s, int i)
    {
        super(s, i);
    }

    kz(String s, int i, ky ky)
    {
        this(s, i);
    }

    public static kz valueOf(String s)
    {
        return (kz)Enum.valueOf(com/google/common/a/kz, s);
    }

    public static kz[] values()
    {
        return (kz[])$VALUES.clone();
    }

    abstract int resultIndex(int i);

    static 
    {
        NEXT_LOWER = new la("NEXT_LOWER", 0);
        NEXT_HIGHER = new lb("NEXT_HIGHER", 1);
        INVERTED_INSERTION_INDEX = new lc("INVERTED_INSERTION_INDEX", 2);
        $VALUES = (new kz[] {
            NEXT_LOWER, NEXT_HIGHER, INVERTED_INSERTION_INDEX
        });
    }
}

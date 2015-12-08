// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Term

public static final class value extends Enum
{

    private static final ..CONDITI_20_ $VALUES[];
    public static final ..CONDITI_20_ CONTAINS_WORDS;
    public static final ..CONDITI_20_ CONTAINS_WORD_PREFIXES;
    public static final ..CONDITI_20_ EQ;
    public static final ..CONDITI_20_ GE;
    public static final ..CONDITI_20_ GT;
    public static final ..CONDITI_20_ LE;
    public static final ..CONDITI_20_ LT;
    public static final ..CONDITI_20_ PREFIX_EQ;
    public static final ..CONDITI_20_ PREFIX_GE;
    public static final ..CONDITI_20_ PREFIX_LE;
    public static final ..CONDITI_20_ WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Term$CONDITION, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return super.$;
    }

    static 
    {
        EQ = new <init>("EQ", 0, 0);
        GT = new <init>("GT", 1, 1);
        GE = new <init>("GE", 2, 2);
        LT = new <init>("LT", 3, 3);
        LE = new <init>("LE", 4, 4);
        PREFIX_EQ = new <init>("PREFIX_EQ", 5, 5);
        PREFIX_GE = new <init>("PREFIX_GE", 6, 6);
        PREFIX_LE = new <init>("PREFIX_LE", 7, 7);
        CONTAINS_WORDS = new <init>("CONTAINS_WORDS", 8, 8);
        CONTAINS_WORD_PREFIXES = new <init>("CONTAINS_WORD_PREFIXES", 9, 9);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            EQ, GT, GE, LT, LE, PREFIX_EQ, PREFIX_GE, PREFIX_LE, CONTAINS_WORDS, CONTAINS_WORD_PREFIXES, 
            WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        N_3B_.clone aclone[] = values();
        int k = aclone.length;
        for (int i = 0; i < k; i++)
        {
            N_3B_.clone clone = aclone[i];
            intToTypeMap.$CONDITI_20_(((com) (clone)).$, clone);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;


public final class NameType extends Enum
{

    private static final NameType $VALUES[];
    public static final NameType ASHKENAZI;
    public static final NameType GENERIC;
    public static final NameType SEPHARDIC;
    private final String name;

    private NameType(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static NameType valueOf(String s)
    {
        return (NameType)Enum.valueOf(org/apache/commons/codec/language/bm/NameType, s);
    }

    public static NameType[] values()
    {
        return (NameType[])$VALUES.clone();
    }

    public String getName()
    {
        return name;
    }

    static 
    {
        ASHKENAZI = new NameType("ASHKENAZI", 0, "ash");
        GENERIC = new NameType("GENERIC", 1, "gen");
        SEPHARDIC = new NameType("SEPHARDIC", 2, "sep");
        $VALUES = (new NameType[] {
            ASHKENAZI, GENERIC, SEPHARDIC
        });
    }
}

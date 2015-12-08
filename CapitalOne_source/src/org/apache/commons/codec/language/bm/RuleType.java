// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;


public final class RuleType extends Enum
{

    private static final RuleType $VALUES[];
    public static final RuleType APPROX;
    public static final RuleType EXACT;
    public static final RuleType RULES;
    private final String name;

    private RuleType(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static RuleType valueOf(String s)
    {
        return (RuleType)Enum.valueOf(org/apache/commons/codec/language/bm/RuleType, s);
    }

    public static RuleType[] values()
    {
        return (RuleType[])$VALUES.clone();
    }

    public String getName()
    {
        return name;
    }

    static 
    {
        APPROX = new RuleType("APPROX", 0, "approx");
        EXACT = new RuleType("EXACT", 1, "exact");
        RULES = new RuleType("RULES", 2, "rules");
        $VALUES = (new RuleType[] {
            APPROX, EXACT, RULES
        });
    }
}

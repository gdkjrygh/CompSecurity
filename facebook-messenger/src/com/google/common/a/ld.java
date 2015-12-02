// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.a:
//            le, lf, lg, lh, 
//            li, ky

public abstract class ld extends Enum
{

    private static final ld $VALUES[];
    public static final ld ANY_PRESENT;
    public static final ld FIRST_AFTER;
    public static final ld FIRST_PRESENT;
    public static final ld LAST_BEFORE;
    public static final ld LAST_PRESENT;

    private ld(String s, int i)
    {
        super(s, i);
    }

    ld(String s, int i, ky ky)
    {
        this(s, i);
    }

    public static ld valueOf(String s)
    {
        return (ld)Enum.valueOf(com/google/common/a/ld, s);
    }

    public static ld[] values()
    {
        return (ld[])$VALUES.clone();
    }

    abstract int resultIndex(Comparator comparator, Object obj, List list, int i);

    static 
    {
        ANY_PRESENT = new le("ANY_PRESENT", 0);
        LAST_PRESENT = new lf("LAST_PRESENT", 1);
        FIRST_PRESENT = new lg("FIRST_PRESENT", 2);
        FIRST_AFTER = new lh("FIRST_AFTER", 3);
        LAST_BEFORE = new li("LAST_BEFORE", 4);
        $VALUES = (new ld[] {
            ANY_PRESENT, LAST_PRESENT, FIRST_PRESENT, FIRST_AFTER, LAST_BEFORE
        });
    }
}

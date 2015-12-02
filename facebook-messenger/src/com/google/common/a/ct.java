// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Equivalence;

// Referenced classes of package com.google.common.a:
//            cu, cv, cw, bk, 
//            cn, cm, dd

abstract class ct extends Enum
{

    private static final ct $VALUES[];
    public static final ct SOFT;
    public static final ct STRONG;
    public static final ct WEAK;

    private ct(String s, int i)
    {
        super(s, i);
    }

    ct(String s, int i, bk bk)
    {
        this(s, i);
    }

    public static ct valueOf(String s)
    {
        return (ct)Enum.valueOf(com/google/common/a/ct, s);
    }

    public static ct[] values()
    {
        return (ct[])$VALUES.clone();
    }

    abstract Equivalence defaultEquivalence();

    abstract dd referenceValue(cn cn, cm cm, Object obj);

    static 
    {
        STRONG = new cu("STRONG", 0);
        SOFT = new cv("SOFT", 1);
        WEAK = new cw("WEAK", 2);
        $VALUES = (new ct[] {
            STRONG, SOFT, WEAK
        });
    }
}

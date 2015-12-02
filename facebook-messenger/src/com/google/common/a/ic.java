// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            id, ie, if, ig, 
//            ih, hz

abstract class ic extends Enum
{

    private static final ic $VALUES[];
    public static final ic COLLECTED;
    public static final ic EXPIRED;
    public static final ic EXPLICIT;
    public static final ic REPLACED;
    public static final ic SIZE;

    private ic(String s, int i)
    {
        super(s, i);
    }

    ic(String s, int i, hz hz)
    {
        this(s, i);
    }

    public static ic valueOf(String s)
    {
        return (ic)Enum.valueOf(com/google/common/a/ic, s);
    }

    public static ic[] values()
    {
        return (ic[])$VALUES.clone();
    }

    abstract boolean wasEvicted();

    static 
    {
        EXPLICIT = new id("EXPLICIT", 0);
        REPLACED = new ie("REPLACED", 1);
        COLLECTED = new if("COLLECTED", 2);
        EXPIRED = new ig("EXPIRED", 3);
        SIZE = new ih("SIZE", 4);
        $VALUES = (new ic[] {
            EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE
        });
    }
}

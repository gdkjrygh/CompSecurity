// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;


// Referenced classes of package com.fasterxml.jackson.core.util:
//            BufferRecycler

public static final class size extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    protected final int size;

    public static size valueOf(String s)
    {
        return (size)Enum.valueOf(com/fasterxml/jackson/core/util/BufferRecycler$CharBufferType, s);
    }

    public static size[] values()
    {
        return (size[])e.clone();
    }

    static 
    {
        a = new <init>("TOKEN_BUFFER", 0, 2000);
        b = new <init>("CONCAT_BUFFER", 1, 2000);
        c = new <init>("TEXT_BUFFER", 2, 200);
        d = new <init>("NAME_COPY_BUFFER", 3, 200);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        size = j;
    }
}

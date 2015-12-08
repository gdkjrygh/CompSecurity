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
        return (size)Enum.valueOf(com/fasterxml/jackson/core/util/BufferRecycler$ByteBufferType, s);
    }

    public static size[] values()
    {
        return (size[])e.clone();
    }

    static 
    {
        a = new <init>("READ_IO_BUFFER", 0, 4000);
        b = new <init>("WRITE_ENCODING_BUFFER", 1, 4000);
        c = new <init>("WRITE_CONCAT_BUFFER", 2, 2000);
        d = new <init>("BASE64_CODEC_BUFFER", 3, 2000);
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

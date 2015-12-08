// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;


// Referenced classes of package com.fasterxml.jackson.core.util:
//            BufferRecycler

public static final class size extends Enum
{

    private static final BASE64_CODEC_BUFFER $VALUES[];
    public static final BASE64_CODEC_BUFFER BASE64_CODEC_BUFFER;
    public static final BASE64_CODEC_BUFFER READ_IO_BUFFER;
    public static final BASE64_CODEC_BUFFER WRITE_CONCAT_BUFFER;
    public static final BASE64_CODEC_BUFFER WRITE_ENCODING_BUFFER;
    protected final int size;

    public static size valueOf(String s)
    {
        return (size)Enum.valueOf(com/fasterxml/jackson/core/util/BufferRecycler$ByteBufferType, s);
    }

    public static size[] values()
    {
        return (size[])$VALUES.clone();
    }

    static 
    {
        READ_IO_BUFFER = new <init>("READ_IO_BUFFER", 0, 4000);
        WRITE_ENCODING_BUFFER = new <init>("WRITE_ENCODING_BUFFER", 1, 4000);
        WRITE_CONCAT_BUFFER = new <init>("WRITE_CONCAT_BUFFER", 2, 2000);
        BASE64_CODEC_BUFFER = new <init>("BASE64_CODEC_BUFFER", 3, 2000);
        $VALUES = (new .VALUES[] {
            READ_IO_BUFFER, WRITE_ENCODING_BUFFER, WRITE_CONCAT_BUFFER, BASE64_CODEC_BUFFER
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        size = j;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;


// Referenced classes of package com.fasterxml.jackson.core.util:
//            BufferRecycler

public static final class size extends Enum
{

    private static final NAME_COPY_BUFFER $VALUES[];
    public static final NAME_COPY_BUFFER CONCAT_BUFFER;
    public static final NAME_COPY_BUFFER NAME_COPY_BUFFER;
    public static final NAME_COPY_BUFFER TEXT_BUFFER;
    public static final NAME_COPY_BUFFER TOKEN_BUFFER;
    protected final int size;

    public static size valueOf(String s)
    {
        return (size)Enum.valueOf(com/fasterxml/jackson/core/util/BufferRecycler$CharBufferType, s);
    }

    public static size[] values()
    {
        return (size[])$VALUES.clone();
    }

    static 
    {
        TOKEN_BUFFER = new <init>("TOKEN_BUFFER", 0, 2000);
        CONCAT_BUFFER = new <init>("CONCAT_BUFFER", 1, 2000);
        TEXT_BUFFER = new <init>("TEXT_BUFFER", 2, 200);
        NAME_COPY_BUFFER = new <init>("NAME_COPY_BUFFER", 3, 200);
        $VALUES = (new .VALUES[] {
            TOKEN_BUFFER, CONCAT_BUFFER, TEXT_BUFFER, NAME_COPY_BUFFER
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        size = j;
    }
}

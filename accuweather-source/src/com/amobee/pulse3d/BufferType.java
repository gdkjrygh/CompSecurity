// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


final class BufferType extends Enum
{

    private static final BufferType $VALUES[];
    public static final BufferType INDEX_BUFFER;
    public static final BufferType VERTEX_BUFFER;

    private BufferType(String s, int i)
    {
        super(s, i);
    }

    public static BufferType valueOf(String s)
    {
        return (BufferType)Enum.valueOf(com/amobee/pulse3d/BufferType, s);
    }

    public static BufferType[] values()
    {
        return (BufferType[])$VALUES.clone();
    }

    static 
    {
        INDEX_BUFFER = new BufferType("INDEX_BUFFER", 0);
        VERTEX_BUFFER = new BufferType("VERTEX_BUFFER", 1);
        $VALUES = (new BufferType[] {
            INDEX_BUFFER, VERTEX_BUFFER
        });
    }
}

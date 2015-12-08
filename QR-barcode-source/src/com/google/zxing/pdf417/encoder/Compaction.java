// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.encoder;


public final class Compaction extends Enum
{

    private static final Compaction $VALUES[];
    public static final Compaction AUTO;
    public static final Compaction BYTE;
    public static final Compaction NUMERIC;
    public static final Compaction TEXT;

    private Compaction(String s, int i)
    {
        super(s, i);
    }

    public static Compaction valueOf(String s)
    {
        return (Compaction)Enum.valueOf(com/google/zxing/pdf417/encoder/Compaction, s);
    }

    public static Compaction[] values()
    {
        return (Compaction[])$VALUES.clone();
    }

    static 
    {
        AUTO = new Compaction("AUTO", 0);
        TEXT = new Compaction("TEXT", 1);
        BYTE = new Compaction("BYTE", 2);
        NUMERIC = new Compaction("NUMERIC", 3);
        $VALUES = (new Compaction[] {
            AUTO, TEXT, BYTE, NUMERIC
        });
    }
}

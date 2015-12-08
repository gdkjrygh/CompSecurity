// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist;


public final class QueueProcessingType extends Enum
{

    private static final QueueProcessingType $VALUES[];
    public static final QueueProcessingType FIFO;
    public static final QueueProcessingType LIFO;

    private QueueProcessingType(String s, int i)
    {
        super(s, i);
    }

    public static QueueProcessingType valueOf(String s)
    {
        return (QueueProcessingType)Enum.valueOf(com/nostra13/universalimageloader/core/assist/QueueProcessingType, s);
    }

    public static QueueProcessingType[] values()
    {
        return (QueueProcessingType[])$VALUES.clone();
    }

    static 
    {
        FIFO = new QueueProcessingType("FIFO", 0);
        LIFO = new QueueProcessingType("LIFO", 1);
        $VALUES = (new QueueProcessingType[] {
            FIFO, LIFO
        });
    }
}

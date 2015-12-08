// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.wire;

import java.util.Comparator;

public final class value extends Enum
{

    private static final PACKED $VALUES[];
    public static final PACKED OPTIONAL;
    public static final Comparator ORDER_BY_NAME = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (Message.Label)obj;
            obj1 = (Message.Label)obj1;
            return ((Message.Label) (obj)).name().compareTo(((Message.Label) (obj1)).name());
        }

    };
    public static final name PACKED;
    public static final name REPEATED;
    public static final name REQUIRED;
    public final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/squareup/wire/Message$Label, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public final boolean a()
    {
        return this == REPEATED || this == PACKED;
    }

    public final boolean b()
    {
        return this == PACKED;
    }

    static 
    {
        REQUIRED = new <init>("REQUIRED", 0, 32);
        OPTIONAL = new <init>("OPTIONAL", 1, 64);
        REPEATED = new <init>("REPEATED", 2, 128);
        PACKED = new <init>("PACKED", 3, 256);
        $VALUES = (new .VALUES[] {
            REQUIRED, OPTIONAL, REPEATED, PACKED
        });
    }

    private _cls1(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;


public abstract class LongSerializationPolicy extends Enum
{

    public static final LongSerializationPolicy a;
    public static final LongSerializationPolicy b;
    private static final LongSerializationPolicy c[];

    private LongSerializationPolicy(String s, int i)
    {
        super(s, i);
    }

    LongSerializationPolicy(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static LongSerializationPolicy valueOf(String s)
    {
        return (LongSerializationPolicy)Enum.valueOf(com/google/gson/LongSerializationPolicy, s);
    }

    public static LongSerializationPolicy[] values()
    {
        return (LongSerializationPolicy[])c.clone();
    }

    static 
    {
        a = new LongSerializationPolicy("DEFAULT") {

        };
        b = new LongSerializationPolicy("STRING") {

        };
        c = (new LongSerializationPolicy[] {
            a, b
        });
    }
}

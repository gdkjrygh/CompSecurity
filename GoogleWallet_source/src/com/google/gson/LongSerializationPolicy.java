// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;


public abstract class LongSerializationPolicy extends Enum
{

    private static final LongSerializationPolicy $VALUES[];
    public static final LongSerializationPolicy DEFAULT;
    public static final LongSerializationPolicy STRING;

    private LongSerializationPolicy(String s, int i)
    {
        super(s, i);
    }


    public static LongSerializationPolicy valueOf(String s)
    {
        return (LongSerializationPolicy)Enum.valueOf(com/google/gson/LongSerializationPolicy, s);
    }

    public static LongSerializationPolicy[] values()
    {
        return (LongSerializationPolicy[])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new LongSerializationPolicy("DEFAULT", 0) {

        };
        STRING = new LongSerializationPolicy("STRING", 1) {

        };
        $VALUES = (new LongSerializationPolicy[] {
            DEFAULT, STRING
        });
    }
}

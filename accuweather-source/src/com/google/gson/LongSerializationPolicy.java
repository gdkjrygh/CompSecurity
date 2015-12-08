// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;


// Referenced classes of package com.google.gson:
//            JsonElement, JsonPrimitive

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

    public abstract JsonElement serialize(Long long1);

    static 
    {
        DEFAULT = new LongSerializationPolicy("DEFAULT", 0) {

            public JsonElement serialize(Long long1)
            {
                return new JsonPrimitive(long1);
            }

        };
        STRING = new LongSerializationPolicy("STRING", 1) {

            public JsonElement serialize(Long long1)
            {
                return new JsonPrimitive(String.valueOf(long1));
            }

        };
        $VALUES = (new LongSerializationPolicy[] {
            DEFAULT, STRING
        });
    }
}

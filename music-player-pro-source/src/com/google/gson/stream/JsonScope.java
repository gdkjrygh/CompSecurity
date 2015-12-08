// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.stream;


final class JsonScope extends Enum
{

    private static final JsonScope $VALUES[];
    public static final JsonScope CLOSED;
    public static final JsonScope DANGLING_NAME;
    public static final JsonScope EMPTY_ARRAY;
    public static final JsonScope EMPTY_DOCUMENT;
    public static final JsonScope EMPTY_OBJECT;
    public static final JsonScope NONEMPTY_ARRAY;
    public static final JsonScope NONEMPTY_DOCUMENT;
    public static final JsonScope NONEMPTY_OBJECT;

    private JsonScope(String s, int i)
    {
        super(s, i);
    }

    public static JsonScope valueOf(String s)
    {
        return (JsonScope)Enum.valueOf(com/google/gson/stream/JsonScope, s);
    }

    public static JsonScope[] values()
    {
        return (JsonScope[])$VALUES.clone();
    }

    static 
    {
        EMPTY_ARRAY = new JsonScope("EMPTY_ARRAY", 0);
        NONEMPTY_ARRAY = new JsonScope("NONEMPTY_ARRAY", 1);
        EMPTY_OBJECT = new JsonScope("EMPTY_OBJECT", 2);
        DANGLING_NAME = new JsonScope("DANGLING_NAME", 3);
        NONEMPTY_OBJECT = new JsonScope("NONEMPTY_OBJECT", 4);
        EMPTY_DOCUMENT = new JsonScope("EMPTY_DOCUMENT", 5);
        NONEMPTY_DOCUMENT = new JsonScope("NONEMPTY_DOCUMENT", 6);
        CLOSED = new JsonScope("CLOSED", 7);
        $VALUES = (new JsonScope[] {
            EMPTY_ARRAY, NONEMPTY_ARRAY, EMPTY_OBJECT, DANGLING_NAME, NONEMPTY_OBJECT, EMPTY_DOCUMENT, NONEMPTY_DOCUMENT, CLOSED
        });
    }
}

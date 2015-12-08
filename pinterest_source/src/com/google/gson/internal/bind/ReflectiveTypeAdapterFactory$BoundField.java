// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

abstract class deserialized
{

    final boolean deserialized;
    final String name;
    final boolean serialized;

    abstract void read(JsonReader jsonreader, Object obj);

    abstract void write(JsonWriter jsonwriter, Object obj);

    abstract boolean writeField(Object obj);

    protected (String s, boolean flag, boolean flag1)
    {
        name = s;
        serialized = flag;
        deserialized = flag1;
    }
}

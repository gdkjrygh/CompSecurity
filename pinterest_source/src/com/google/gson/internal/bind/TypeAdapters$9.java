// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.atomic.AtomicBoolean;

final class  extends TypeAdapter
{

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final AtomicBoolean read(JsonReader jsonreader)
    {
        return new AtomicBoolean(jsonreader.nextBoolean());
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (AtomicBoolean)obj);
    }

    public final void write(JsonWriter jsonwriter, AtomicBoolean atomicboolean)
    {
        jsonwriter.value(atomicboolean.get());
    }

    ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;

final class  extends TypeAdapter
{

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final AtomicIntegerArray read(JsonReader jsonreader)
    {
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        while (jsonreader.hasNext()) 
        {
            try
            {
                arraylist.add(Integer.valueOf(jsonreader.nextInt()));
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
        }
        jsonreader.endArray();
        int j = arraylist.size();
        jsonreader = new AtomicIntegerArray(j);
        for (int i = 0; i < j; i++)
        {
            jsonreader.set(i, ((Integer)arraylist.get(i)).intValue());
        }

        return jsonreader;
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (AtomicIntegerArray)obj);
    }

    public final void write(JsonWriter jsonwriter, AtomicIntegerArray atomicintegerarray)
    {
        jsonwriter.beginArray();
        int i = 0;
        for (int j = atomicintegerarray.length(); i < j; i++)
        {
            jsonwriter.value(atomicintegerarray.get(i));
        }

        jsonwriter.endArray();
    }

    ()
    {
    }
}

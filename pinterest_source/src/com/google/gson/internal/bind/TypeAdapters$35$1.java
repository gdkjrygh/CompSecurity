// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class val.requestedType extends TypeAdapter
{

    final l.typeAdapter this$0;
    final Class val$requestedType;

    public Object read(JsonReader jsonreader)
    {
        jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
        if (jsonreader != null && !val$requestedType.isInstance(jsonreader))
        {
            throw new JsonSyntaxException((new StringBuilder("Expected a ")).append(val$requestedType.getName()).append(" but was ").append(jsonreader.getClass().getName()).toString());
        } else
        {
            return jsonreader;
        }
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        typeAdapter.write(jsonwriter, obj);
    }

    ()
    {
        this$0 = final_;
        val$requestedType = Class.this;
        super();
    }
}

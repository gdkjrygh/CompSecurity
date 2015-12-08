// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

final class val.typeAdapter
    implements TypeAdapterFactory
{

    final Class val$clazz;
    final TypeAdapter val$typeAdapter;

    public final TypeAdapter create(final Gson requestedType, TypeToken typetoken)
    {
        requestedType = typetoken.getRawType();
        class _cls1 extends TypeAdapter
        {

            final TypeAdapters._cls35 this$0;
            final Class val$requestedType;

            public Object read(JsonReader jsonreader)
            {
                jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
                if (jsonreader != null && !requestedType.isInstance(jsonreader))
                {
                    throw new JsonSyntaxException((new StringBuilder("Expected a ")).append(requestedType.getName()).append(" but was ").append(jsonreader.getClass().getName()).toString());
                } else
                {
                    return jsonreader;
                }
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                typeAdapter.write(jsonwriter, obj);
            }

            _cls1()
            {
                this$0 = TypeAdapters._cls35.this;
                requestedType = class1;
                super();
            }
        }

        if (!val$clazz.isAssignableFrom(requestedType))
        {
            return null;
        } else
        {
            return new _cls1();
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Factory[typeHierarchy=")).append(val$clazz.getName()).append(",adapter=").append(val$typeAdapter).append("]").toString();
    }

    _cls1()
    {
        val$clazz = class1;
        val$typeAdapter = typeadapter;
        super();
    }
}

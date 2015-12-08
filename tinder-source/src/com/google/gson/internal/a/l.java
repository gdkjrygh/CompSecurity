// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.b.a;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class l extends r
{

    private final e a;
    private final r b;
    private final Type c;

    l(e e1, r r1, Type type)
    {
        a = e1;
        b = r1;
        c = type;
    }

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        return b.a(jsonreader);
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        Object obj1;
        r r1;
label0:
        {
            r1 = b;
            Type type = c;
            obj1 = type;
            if (obj == null)
            {
                break label0;
            }
            if (type != java/lang/Object && !(type instanceof TypeVariable))
            {
                obj1 = type;
                if (!(type instanceof Class))
                {
                    break label0;
                }
            }
            obj1 = obj.getClass();
        }
        if (obj1 != c)
        {
            r1 = a.a(com.google.gson.b.a.a(((Type) (obj1))));
            obj1 = r1;
            if (r1 instanceof i.a)
            {
                obj1 = r1;
                if (!(b instanceof i.a))
                {
                    obj1 = b;
                }
            }
        } else
        {
            obj1 = r1;
        }
        ((r) (obj1)).a(jsonwriter, obj);
    }
}

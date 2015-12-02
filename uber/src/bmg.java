// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class bmg extends bkq
{

    private final bjw a;
    private final bkq b;
    private final Type c;

    bmg(bjw bjw1, bkq bkq1, Type type)
    {
        a = bjw1;
        b = bkq1;
        c = type;
    }

    private static Type a(Type type, Object obj)
    {
        Object obj1;
label0:
        {
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
        return ((Type) (obj1));
    }

    public final Object a(JsonReader jsonreader)
    {
        return b.a(jsonreader);
    }

    public final void a(JsonWriter jsonwriter, Object obj)
    {
        bkq bkq1 = b;
        Object obj1 = a(c, obj);
        if (obj1 != c)
        {
            obj1 = a.a(bmj.get(((Type) (obj1))));
            bkq1 = ((bkq) (obj1));
            if (obj1 instanceof bmc)
            {
                bkq1 = ((bkq) (obj1));
                if (!(b instanceof bmc))
                {
                    bkq1 = b;
                }
            }
        }
        bkq1.a(jsonwriter, obj);
    }
}

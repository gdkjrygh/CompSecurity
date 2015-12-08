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
import java.lang.reflect.Field;

// Referenced classes of package com.google.gson.internal.a:
//            i, l

final class d extends d
{

    final r a;
    final e b;
    final Field c;
    final a d;
    final boolean e;
    final i f;

    final void a(JsonReader jsonreader, Object obj)
        throws IOException, IllegalAccessException
    {
        jsonreader = ((JsonReader) (a.a(jsonreader)));
        if (jsonreader != null || !e)
        {
            c.set(obj, jsonreader);
        }
    }

    final void a(JsonWriter jsonwriter, Object obj)
        throws IOException, IllegalAccessException
    {
        obj = c.get(obj);
        (new l(b, a, d.b)).a(jsonwriter, obj);
    }

    n(i j, String s, boolean flag, boolean flag1, e e1, Field field, a a1, 
            boolean flag2)
    {
        f = j;
        b = e1;
        c = field;
        d = a1;
        e = flag2;
        super(s, flag, flag1);
        a = com.google.gson.internal.a.i.a(f, b, c, d);
    }
}

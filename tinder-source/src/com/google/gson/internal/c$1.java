// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.b.a;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal:
//            c

final class d extends r
{

    final boolean a;
    final boolean b;
    final e c;
    final a d;
    final c e;
    private r f;

    private r a()
    {
        r r1 = f;
        if (r1 != null)
        {
            return r1;
        } else
        {
            r r2 = c.a(e, d);
            f = r2;
            return r2;
        }
    }

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        if (a)
        {
            jsonreader.skipValue();
            return null;
        } else
        {
            return a().a(jsonreader);
        }
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        if (b)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            a().a(jsonwriter, obj);
            return;
        }
    }

    iter(c c1, boolean flag, boolean flag1, e e1, a a1)
    {
        e = c1;
        a = flag;
        b = flag1;
        c = e1;
        d = a1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.b.a;
import com.google.gson.internal.g;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson:
//            r, e, l, j, 
//            p, s

public final class q extends r
{
    private static final class a
        implements s
    {

        private final com.google.gson.b.a a;
        private final boolean b;
        private final Class c;
        private final p d;
        private final j e;

        public final r a(e e1, com.google.gson.b.a a1)
        {
            boolean flag;
            if (a != null)
            {
                if (a.equals(a1) || b && a.b == a1.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = c.isAssignableFrom(a1.a);
            }
            if (flag)
            {
                return new q(d, e, e1, a1, this, (byte)0);
            } else
            {
                return null;
            }
        }

        private a(Object obj, com.google.gson.b.a a1)
        {
            p p1;
            boolean flag;
            if (obj instanceof p)
            {
                p1 = (p)obj;
            } else
            {
                p1 = null;
            }
            d = p1;
            if (obj instanceof j)
            {
                obj = (j)obj;
            } else
            {
                obj = null;
            }
            e = ((j) (obj));
            if (d != null || e != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.gson.internal.a.a(flag);
            a = a1;
            b = false;
            c = null;
        }

        a(Object obj, com.google.gson.b.a a1, byte byte0)
        {
            this(obj, a1);
        }
    }


    private final p a;
    private final j b;
    private final e c;
    private final com.google.gson.b.a d;
    private final s e;
    private r f;

    private q(p p1, j j1, e e1, com.google.gson.b.a a1, s s)
    {
        a = p1;
        b = j1;
        c = e1;
        d = a1;
        e = s;
    }

    q(p p1, j j1, e e1, com.google.gson.b.a a1, s s, byte byte0)
    {
        this(p1, j1, e1, a1, s);
    }

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

    public static s a(com.google.gson.b.a a1, Object obj)
    {
        return new a(obj, a1, (byte)0);
    }

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        if (b == null)
        {
            return a().a(jsonreader);
        }
        jsonreader = g.a(jsonreader);
        if (jsonreader instanceof l)
        {
            return null;
        } else
        {
            return b.a(jsonreader, d.b);
        }
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        if (a == null)
        {
            a().a(jsonwriter, obj);
            return;
        }
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            g.a(a.a(obj), jsonwriter);
            return;
        }
    }
}

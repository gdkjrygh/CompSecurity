// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.c.b:
//            as, ar, bh, al, 
//            g, aq, aw, h, 
//            bd

public static abstract class a extends as
    implements a
{
    protected final class a
    {

        final as.d a;
        private final Iterator b;
        private java.util.Map.Entry c;
        private final boolean d;

        public final void a(h h1)
        {
            while (c != null && ((ak.f)c.getKey()).e() < 0x20000000) 
            {
                ak.f f = (ak.f)c.getKey();
                if (d && f.g() == cd.b.i && !f.o())
                {
                    if (c instanceof aw.a)
                    {
                        h1.b(f.e(), ((aw.a)c).a().c());
                    } else
                    {
                        h1.c(f.e(), (bd)c.getValue());
                    }
                } else
                {
                    ar.a(f, c.getValue(), h1);
                }
                if (b.hasNext())
                {
                    c = (java.util.Map.Entry)b.next();
                } else
                {
                    c = null;
                }
            }
        }

        private a()
        {
            a = as.d.this;
            super();
            b = as.d.a(a).g();
            if (b.hasNext())
            {
                c = (java.util.Map.Entry)b.next();
            }
            d = false;
        }

        a(byte byte0)
        {
            this();
        }
    }


    private final ar c;

    static ar a(.Entry entry)
    {
        return entry.c;
    }

    private void c(c c1)
    {
        if (c1.t() != e())
        {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        } else
        {
            return;
        }
    }

    public final Map K()
    {
        Map map = as.a(this);
        map.putAll(c.f());
        return Collections.unmodifiableMap(map);
    }

    protected final void L()
    {
        c.c();
    }

    protected final boolean M()
    {
        return c.h();
    }

    protected final a N()
    {
        return new a((byte)0);
    }

    protected final int O()
    {
        return c.i();
    }

    public boolean a()
    {
        return super.a() && c.h();
    }

    public final boolean a(c c1)
    {
        if (c1.s())
        {
            c(c1);
            return c.a(c1);
        } else
        {
            return super.a(c1);
        }
    }

    protected final boolean a(g g, c c1, aq aq, int i)
    {
        return bh.a(g, c1, aq, e(), new <init>(c), i);
    }

    public final Object b(c c1)
    {
label0:
        {
label1:
            {
                if (!c1.s())
                {
                    break label0;
                }
                c(c1);
                Object obj1 = c.b(c1);
                Object obj = obj1;
                if (obj1 == null)
                {
                    if (c1.f() != a.i)
                    {
                        break label1;
                    }
                    obj = al.a(c1.w());
                }
                return obj;
            }
            return c1.r();
        }
        return super.b(c1);
    }

    public final Map d_()
    {
        Map map = as.a(this);
        map.putAll(c.f());
        return Collections.unmodifiableMap(map);
    }

    protected a()
    {
        c = ar.a();
    }

    protected c(c c1)
    {
        super(c1);
        c = a(c1);
    }
}

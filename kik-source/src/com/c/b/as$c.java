// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.c.b:
//            as, ar, al

public static abstract class a extends a
    implements a
{

    private ar a;

    static ar a(a a1)
    {
        a1.a.c();
        return a1.a;
    }

    private void d(a a1)
    {
        if (a1.t() != e())
        {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        } else
        {
            return;
        }
    }

    private ect e(ect ect, Object obj)
    {
        if (ect.s())
        {
            d(ect);
            s();
            a.a(ect, obj);
            q();
            return this;
        } else
        {
            return (q)super.c(ect, obj);
        }
    }

    private ect f(ect ect, Object obj)
    {
        if (ect.s())
        {
            d(ect);
            s();
            a.b(ect, obj);
            q();
            return this;
        } else
        {
            return (q)super.d(ect, obj);
        }
    }

    private void s()
    {
        if (a.d())
        {
            a = a.e();
        }
    }

    public final ect a(ect ect, Object obj)
    {
        return f(ect, obj);
    }

    protected final void a(ect ect)
    {
        s();
        a.a(a(ect));
        q();
    }

    public boolean a()
    {
        return super.a() && a.h();
    }

    public final boolean a(a a1)
    {
        if (a1.s())
        {
            d(a1);
            return a.a(a1);
        } else
        {
            return super.a(a1);
        }
    }

    public final a b()
    {
        return (a)super.o();
    }

    public final ect b(ect ect, Object obj)
    {
        return e(ect, obj);
    }

    public final Object b(ect ect)
    {
label0:
        {
label1:
            {
                if (!ect.s())
                {
                    break label0;
                }
                d(ect);
                Object obj1 = a.b(ect);
                Object obj = obj1;
                if (obj1 == null)
                {
                    if (ect.f() != a.i)
                    {
                        break label1;
                    }
                    obj = al.a(ect.w());
                }
                return obj;
            }
            return ect.r();
        }
        return super.b(ect);
    }

    public final ect c(ect ect, Object obj)
    {
        return e(ect, obj);
    }

    public final ect c()
    {
        return (ect)super.o();
    }

    public Object clone()
    {
        return (ect)super.o();
    }

    public final ect d(ect ect, Object obj)
    {
        return f(ect, obj);
    }

    public final Map d_()
    {
        Map map = a(this);
        map.putAll(a.f());
        return Collections.unmodifiableMap(map);
    }

    public final volatile  o()
    {
        return ()super.o();
    }

    protected final boolean r()
    {
        return a.h();
    }

    protected ()
    {
        a = ar.b();
    }

    protected a(a a1)
    {
        super(a1);
        a = ar.b();
    }
}

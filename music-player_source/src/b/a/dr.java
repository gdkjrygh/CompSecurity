// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package b.a:
//            ft, gs, gk, dt, 
//            fz, ga, ds, gn, 
//            gq, go, fr

public class dr extends ft
{

    public static final Map a;
    private static final gs d = new gs("PropertyValue");
    private static final gk e = new gk("string_value", (byte)11, (short)1);
    private static final gk f = new gk("long_value", (byte)10, (short)2);

    public dr()
    {
    }

    protected final fr a(short word0)
    {
        return dt.b(word0);
    }

    protected final gk a(fr fr)
    {
        fr = (dt)fr;
        switch (ds.a[fr.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown field id ")).append(fr).toString());

        case 1: // '\001'
            return e;

        case 2: // '\002'
            return f;
        }
    }

    protected final gs a()
    {
        return d;
    }

    protected final Object a(gn gn1, gk gk1)
    {
label0:
        {
label1:
            {
                String s = null;
                dt dt1 = dt.a(gk1.c);
                if (dt1 != null)
                {
                    switch (ds.a[dt1.ordinal()])
                    {
                    default:
                        throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");

                    case 2: // '\002'
                        break label0;

                    case 1: // '\001'
                        break;
                    }
                    if (gk1.b != e.b)
                    {
                        break label1;
                    }
                    s = gn1.p();
                }
                return s;
            }
            gq.a(gn1, gk1.b);
            return null;
        }
        if (gk1.b == f.b)
        {
            return Long.valueOf(gn1.n());
        } else
        {
            gq.a(gn1, gk1.b);
            return null;
        }
    }

    protected final Object a(gn gn1, short word0)
    {
        dt dt1 = dt.a(word0);
        if (dt1 != null)
        {
            switch (ds.a[dt1.ordinal()])
            {
            default:
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");

            case 1: // '\001'
                return gn1.p();

            case 2: // '\002'
                return Long.valueOf(gn1.n());
            }
        } else
        {
            throw new go((new StringBuilder("Couldn't find a field with field id ")).append(word0).toString());
        }
    }

    public final void a(long l)
    {
        c = dt.b;
        b = Long.valueOf(l);
    }

    public final void a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            c = dt.a;
            b = s;
            return;
        }
    }

    protected final void c(gn gn1)
    {
        switch (ds.a[((dt)c).ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder("Cannot write union with unknown field ")).append(c).toString());

        case 1: // '\001'
            gn1.a((String)b);
            return;

        case 2: // '\002'
            gn1.a(((Long)b).longValue());
            break;
        }
    }

    protected final void d(gn gn1)
    {
        switch (ds.a[((dt)c).ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder("Cannot write union with unknown field ")).append(c).toString());

        case 1: // '\001'
            gn1.a((String)b);
            return;

        case 2: // '\002'
            gn1.a(((Long)b).longValue());
            break;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dr)
        {
            obj = (dr)obj;
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (b() == ((dr) (obj)).b())
                {
                    flag = flag1;
                    if (c().equals(((dr) (obj)).c()))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return 0;
    }

    static 
    {
        EnumMap enummap = new EnumMap(b/a/dt);
        enummap.put(dt.a, new fz("string_value", (byte)3, new ga((byte)11)));
        enummap.put(dt.b, new fz("long_value", (byte)3, new ga((byte)10)));
        a = Collections.unmodifiableMap(enummap);
        fz.a(b/a/dr, a);
    }
}

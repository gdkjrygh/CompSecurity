// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class blx extends JsonWriter
{

    private static final Writer a = new _cls1();
    private static final bkj b = new bkj("closed");
    private final List c = new ArrayList();
    private String d;
    private bkd e;

    public blx()
    {
        super(a);
        e = bkf.a;
    }

    private void a(bkd bkd1)
    {
        if (d != null)
        {
            if (!bkd1.j() || getSerializeNulls())
            {
                ((bkg)b()).a(d, bkd1);
            }
            d = null;
            return;
        }
        if (c.isEmpty())
        {
            e = bkd1;
            return;
        }
        bkd bkd2 = b();
        if (bkd2 instanceof bka)
        {
            ((bka)bkd2).a(bkd1);
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    private bkd b()
    {
        return (bkd)c.get(c.size() - 1);
    }

    public final bkd a()
    {
        if (!c.isEmpty())
        {
            throw new IllegalStateException((new StringBuilder("Expected one JSON element but was ")).append(c).toString());
        } else
        {
            return e;
        }
    }

    public final JsonWriter beginArray()
    {
        bka bka1 = new bka();
        a(bka1);
        c.add(bka1);
        return this;
    }

    public final JsonWriter beginObject()
    {
        bkg bkg1 = new bkg();
        a(bkg1);
        c.add(bkg1);
        return this;
    }

    public final void close()
    {
        if (!c.isEmpty())
        {
            throw new IOException("Incomplete document");
        } else
        {
            c.add(b);
            return;
        }
    }

    public final JsonWriter endArray()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (b() instanceof bka)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter endObject()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (b() instanceof bkg)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final void flush()
    {
    }

    public final JsonWriter name(String s)
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (b() instanceof bkg)
        {
            d = s;
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter nullValue()
    {
        a(bkf.a);
        return this;
    }

    public final JsonWriter value(double d1)
    {
        if (!isLenient() && (Double.isNaN(d1) || Double.isInfinite(d1)))
        {
            throw new IllegalArgumentException((new StringBuilder("JSON forbids NaN and infinities: ")).append(d1).toString());
        } else
        {
            a(new bkj(Double.valueOf(d1)));
            return this;
        }
    }

    public final JsonWriter value(long l)
    {
        a(new bkj(Long.valueOf(l)));
        return this;
    }

    public final JsonWriter value(Number number)
    {
        if (number == null)
        {
            return nullValue();
        }
        if (!isLenient())
        {
            double d1 = number.doubleValue();
            if (Double.isNaN(d1) || Double.isInfinite(d1))
            {
                throw new IllegalArgumentException((new StringBuilder("JSON forbids NaN and infinities: ")).append(number).toString());
            }
        }
        a(new bkj(number));
        return this;
    }

    public final JsonWriter value(String s)
    {
        if (s == null)
        {
            return nullValue();
        } else
        {
            a(new bkj(s));
            return this;
        }
    }

    public final JsonWriter value(boolean flag)
    {
        a(new bkj(Boolean.valueOf(flag)));
        return this;
    }


    /* member class not found */
    class _cls1 {}

}

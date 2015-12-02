// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class blw extends JsonReader
{

    private static final Reader a = new _cls1();
    private static final Object b = new Object();
    private final List c = new ArrayList();

    public blw(bkd bkd)
    {
        super(a);
        c.add(bkd);
    }

    private void a(JsonToken jsontoken)
    {
        if (peek() != jsontoken)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(jsontoken).append(" but was ").append(peek()).toString());
        } else
        {
            return;
        }
    }

    private Object b()
    {
        return c.get(c.size() - 1);
    }

    private Object c()
    {
        return c.remove(c.size() - 1);
    }

    public final void a()
    {
        a(JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)b()).next();
        c.add(entry.getValue());
        c.add(new bkj((String)entry.getKey()));
    }

    public final void beginArray()
    {
        a(JsonToken.BEGIN_ARRAY);
        bka bka1 = (bka)b();
        c.add(bka1.iterator());
    }

    public final void beginObject()
    {
        a(JsonToken.BEGIN_OBJECT);
        bkg bkg1 = (bkg)b();
        c.add(bkg1.o().iterator());
    }

    public final void close()
    {
        c.clear();
        c.add(b);
    }

    public final void endArray()
    {
        a(JsonToken.END_ARRAY);
        c();
        c();
    }

    public final void endObject()
    {
        a(JsonToken.END_OBJECT);
        c();
        c();
    }

    public final boolean hasNext()
    {
        JsonToken jsontoken = peek();
        return jsontoken != JsonToken.END_OBJECT && jsontoken != JsonToken.END_ARRAY;
    }

    public final boolean nextBoolean()
    {
        a(JsonToken.BOOLEAN);
        return ((bkj)c()).f();
    }

    public final double nextDouble()
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        }
        double d = ((bkj)b()).c();
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d)))
        {
            throw new NumberFormatException((new StringBuilder("JSON forbids NaN and infinities: ")).append(d).toString());
        } else
        {
            c();
            return d;
        }
    }

    public final int nextInt()
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        } else
        {
            int i = ((bkj)b()).e();
            c();
            return i;
        }
    }

    public final long nextLong()
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        } else
        {
            long l = ((bkj)b()).d();
            c();
            return l;
        }
    }

    public final String nextName()
    {
        a(JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)b()).next();
        c.add(entry.getValue());
        return (String)entry.getKey();
    }

    public final void nextNull()
    {
        a(JsonToken.NULL);
        c();
    }

    public final String nextString()
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.STRING && jsontoken != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.STRING).append(" but was ").append(jsontoken).toString());
        } else
        {
            return ((bkj)c()).b();
        }
    }

    public final JsonToken peek()
    {
        if (c.isEmpty())
        {
            return JsonToken.END_DOCUMENT;
        }
        Object obj = b();
        if (obj instanceof Iterator)
        {
            boolean flag = c.get(c.size() - 2) instanceof bkg;
            obj = (Iterator)obj;
            if (((Iterator) (obj)).hasNext())
            {
                if (flag)
                {
                    return JsonToken.NAME;
                } else
                {
                    c.add(((Iterator) (obj)).next());
                    return peek();
                }
            }
            if (flag)
            {
                return JsonToken.END_OBJECT;
            } else
            {
                return JsonToken.END_ARRAY;
            }
        }
        if (obj instanceof bkg)
        {
            return JsonToken.BEGIN_OBJECT;
        }
        if (obj instanceof bka)
        {
            return JsonToken.BEGIN_ARRAY;
        }
        if (obj instanceof bkj)
        {
            obj = (bkj)obj;
            if (((bkj) (obj)).q())
            {
                return JsonToken.STRING;
            }
            if (((bkj) (obj)).o())
            {
                return JsonToken.BOOLEAN;
            }
            if (((bkj) (obj)).p())
            {
                return JsonToken.NUMBER;
            } else
            {
                throw new AssertionError();
            }
        }
        if (obj instanceof bkf)
        {
            return JsonToken.NULL;
        }
        if (obj == b)
        {
            throw new IllegalStateException("JsonReader is closed");
        } else
        {
            throw new AssertionError();
        }
    }

    public final void skipValue()
    {
        if (peek() == JsonToken.NAME)
        {
            nextName();
            return;
        } else
        {
            c();
            return;
        }
    }

    public final String toString()
    {
        return getClass().getSimpleName();
    }


    /* member class not found */
    class _cls1 {}

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

public abstract class bkd
{

    public bkd()
    {
    }

    public Number a()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String b()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long d()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final boolean g()
    {
        return this instanceof bka;
    }

    public final boolean h()
    {
        return this instanceof bkg;
    }

    public final boolean i()
    {
        return this instanceof bkj;
    }

    public final boolean j()
    {
        return this instanceof bkf;
    }

    public final bkg k()
    {
        if (h())
        {
            return (bkg)this;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Not a JSON Object: ")).append(this).toString());
        }
    }

    public final bka l()
    {
        if (g())
        {
            return (bka)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Array.");
        }
    }

    public final bkj m()
    {
        if (i())
        {
            return (bkj)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Primitive.");
        }
    }

    Boolean n()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString()
    {
        Object obj;
        try
        {
            obj = new StringWriter();
            JsonWriter jsonwriter = new JsonWriter(((java.io.Writer) (obj)));
            jsonwriter.setLenient(true);
            bln.a(this, jsonwriter);
            obj = ((StringWriter) (obj)).toString();
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
        return ((String) (obj));
    }
}

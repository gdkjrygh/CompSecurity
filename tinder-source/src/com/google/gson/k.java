// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.g;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

// Referenced classes of package com.google.gson:
//            n

public abstract class k
{

    public k()
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

    public final n g()
    {
        if (this instanceof n)
        {
            return (n)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Primitive.");
        }
    }

    public String toString()
    {
        Object obj;
        try
        {
            obj = new StringWriter();
            JsonWriter jsonwriter = new JsonWriter(((java.io.Writer) (obj)));
            jsonwriter.setLenient(true);
            com.google.gson.internal.g.a(this, jsonwriter);
            obj = ((StringWriter) (obj)).toString();
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
        return ((String) (obj));
    }
}

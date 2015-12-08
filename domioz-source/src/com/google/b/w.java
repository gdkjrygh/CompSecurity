// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.ag;
import com.google.b.d.d;
import java.io.IOException;
import java.io.StringWriter;

// Referenced classes of package com.google.b:
//            z, t, ac

public abstract class w
{

    public w()
    {
    }

    public Number b()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String c()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double d()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long e()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int f()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean g()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final z h()
    {
        if (this instanceof z)
        {
            return (z)this;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Not a JSON Object: ")).append(this).toString());
        }
    }

    public final t i()
    {
        if (this instanceof t)
        {
            return (t)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Array.");
        }
    }

    public final ac j()
    {
        if (this instanceof ac)
        {
            return (ac)this;
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
            d d1 = new d(((java.io.Writer) (obj)));
            d1.b(true);
            ag.a(this, d1);
            obj = ((StringWriter) (obj)).toString();
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
        return ((String) (obj));
    }
}

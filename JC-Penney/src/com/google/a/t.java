// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.ag;
import com.google.a.d.d;
import java.io.IOException;
import java.io.StringWriter;

// Referenced classes of package com.google.a:
//            r, w, z, v

public abstract class t
{

    public t()
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

    public boolean h()
    {
        return this instanceof r;
    }

    public boolean i()
    {
        return this instanceof w;
    }

    public boolean j()
    {
        return this instanceof z;
    }

    public boolean k()
    {
        return this instanceof v;
    }

    public w l()
    {
        if (i())
        {
            return (w)this;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Not a JSON Object: ").append(this).toString());
        }
    }

    public r m()
    {
        if (h())
        {
            return (r)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Array.");
        }
    }

    public z n()
    {
        if (j())
        {
            return (z)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Primitive.");
        }
    }

    Boolean o()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
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

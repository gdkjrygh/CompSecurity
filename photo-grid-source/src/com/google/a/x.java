// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.u;
import com.google.a.d.f;
import java.io.IOException;
import java.io.StringWriter;

// Referenced classes of package com.google.a:
//            aa, u, ad

public abstract class x
{

    public x()
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

    public float e()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long f()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int g()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean h()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final aa i()
    {
        if (this instanceof aa)
        {
            return (aa)this;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Not a JSON Object: ")).append(this).toString());
        }
    }

    public final com.google.a.u j()
    {
        if (this instanceof com.google.a.u)
        {
            return (com.google.a.u)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Array.");
        }
    }

    public final ad k()
    {
        if (this instanceof ad)
        {
            return (ad)this;
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
            f f1 = new f(((java.io.Writer) (obj)));
            f1.b(true);
            u.a(this, f1);
            obj = ((StringWriter) (obj)).toString();
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
        return ((String) (obj));
    }
}

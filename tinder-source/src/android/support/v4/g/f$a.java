// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.g;

import java.util.Iterator;

// Referenced classes of package android.support.v4.g:
//            f

final class b
    implements Iterator
{

    final int a;
    int b;
    int c;
    boolean d;
    final f e;

    public final boolean hasNext()
    {
        return c < b;
    }

    public final Object next()
    {
        Object obj = e.a(c, a);
        c = c + 1;
        d = true;
        return obj;
    }

    public final void remove()
    {
        if (!d)
        {
            throw new IllegalStateException();
        } else
        {
            c = c - 1;
            b = b - 1;
            d = false;
            e.a(c);
            return;
        }
    }

    eption(f f1, int i)
    {
        e = f1;
        super();
        d = false;
        a = i;
        b = f1.a();
    }
}

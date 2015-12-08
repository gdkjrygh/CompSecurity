// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            ev, fa, ey

final class ex extends ev
{

    final ev b;

    ex(ev ev1, ev ev2)
    {
        b = ev1;
        super(ev2, (byte)0);
    }

    public final Appendable a(Appendable appendable, Iterator iterator)
    {
        fa.a(appendable, "appendable");
        fa.a(iterator, "parts");
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            if (obj == null)
            {
                continue;
            }
            appendable.append(b.a(obj));
            break;
        } while (true);
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = iterator.next();
            if (obj1 != null)
            {
                appendable.append(b.a);
                appendable.append(b.a(obj1));
            }
        } while (true);
        return appendable;
    }

    public final ev b(String s)
    {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    public final ey c(String s)
    {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class nit> extends dr
{

    private dr b;

    public final Appendable a(Appendable appendable, Iterator iterator)
    {
        dv.a(appendable, "appendable");
        dv.a(iterator, "parts");
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

    public final dr b(String s)
    {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    public final lang.String c(String s)
    {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }

    >(dr dr1, dr dr2)
    {
        b = dr1;
        super(dr2, (byte)0);
    }
}

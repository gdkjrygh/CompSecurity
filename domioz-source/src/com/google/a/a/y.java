// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.util.Iterator;

// Referenced classes of package com.google.a.a:
//            w, ad, aa

final class y extends w
{

    final w a;

    y(w w1, w w2)
    {
        a = w1;
        super(w2, (byte)0);
    }

    public final Appendable a(Appendable appendable, Iterator iterator)
    {
        ad.a(appendable, "appendable");
        ad.a(iterator, "parts");
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
            appendable.append(a.a(obj));
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
                appendable.append(w.a(a));
                appendable.append(a.a(obj1));
            }
        } while (true);
        return appendable;
    }

    public final w b(String s)
    {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    public final aa c(String s)
    {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}

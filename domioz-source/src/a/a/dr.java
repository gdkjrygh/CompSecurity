// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;

// Referenced classes of package a.a:
//            dp, du, ds

final class dr extends dp
{

    final dp b;

    dr(dp dp1, dp dp2)
    {
        b = dp1;
        super(dp2, (byte)0);
    }

    public final Appendable a(Appendable appendable, Iterator iterator)
    {
        du.a(appendable, "appendable");
        du.a(iterator, "parts");
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

    public final dp b(String s)
    {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    public final ds c(String s)
    {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}

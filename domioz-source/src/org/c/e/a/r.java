// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.a;

import org.c.c.a.i;
import org.c.c.q;

// Referenced classes of package org.c.e.a:
//            j, d, l

final class r
    implements j
{

    final l a;
    private final d b;

    public r(l l1, Class class1)
    {
        a = l1;
        super();
        if (class1 != null && !java/lang/Void.equals(class1))
        {
            b = new d(class1, l1.getMessageConverters());
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public final Object extractData(i k)
    {
        if (b != null)
        {
            return new q(b.extractData(k), k.getHeaders(), k.getStatusCode());
        } else
        {
            return new q(k.getHeaders(), k.getStatusCode());
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;

import org.c.d.j;

// Referenced classes of package org.c.c:
//            e, l

public final class q extends e
{

    private final l a;

    public q(Object obj, l l1)
    {
        super(obj);
        a = l1;
    }

    public q(Object obj, j j, l l1)
    {
        super(obj, j);
        a = l1;
    }

    public q(l l1)
    {
        a = l1;
    }

    public q(j j, l l1)
    {
        super(j);
        a = l1;
    }

    public final l getStatusCode()
    {
        return a;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("<");
        stringbuilder.append(a.toString());
        stringbuilder.append(' ');
        stringbuilder.append(a.getReasonPhrase());
        stringbuilder.append(',');
        Object obj = getBody();
        f f = getHeaders();
        if (obj != null)
        {
            stringbuilder.append(obj);
            if (f != null)
            {
                stringbuilder.append(',');
            }
        }
        if (f != null)
        {
            stringbuilder.append(f);
        }
        stringbuilder.append('>');
        return stringbuilder.toString();
    }
}

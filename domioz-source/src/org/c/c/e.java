// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;

import org.c.d.j;

// Referenced classes of package org.c.c:
//            f

public class e
{

    public static final e EMPTY = new e();
    private final f a;
    private final Object b;

    protected e()
    {
        this(null, null);
    }

    public e(Object obj)
    {
        this(obj, null);
    }

    public e(Object obj, j j)
    {
        b = obj;
        obj = new f();
        if (j != null)
        {
            ((f) (obj)).putAll(j);
        }
        a = f.readOnlyHttpHeaders(((f) (obj)));
    }

    public e(j j)
    {
        this(null, j);
    }

    public Object getBody()
    {
        return b;
    }

    public f getHeaders()
    {
        return a;
    }

    public boolean hasBody()
    {
        return b != null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("<");
        if (b != null)
        {
            stringbuilder.append(b);
            if (a != null)
            {
                stringbuilder.append(',');
            }
        }
        if (a != null)
        {
            stringbuilder.append(a);
        }
        stringbuilder.append('>');
        return stringbuilder.toString();
    }

}

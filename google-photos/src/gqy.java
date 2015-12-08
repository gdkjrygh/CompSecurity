// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gqy
    implements gqw
{

    private final List a = new ArrayList();
    private boolean b;
    private boolean c;

    public gqy()
    {
        c = true;
    }

    public final gqy a(olm olm1)
    {
        olm1.a(gqw, this);
        return this;
    }

    public final void a(gqx gqx1)
    {
        a.add(gqx1);
    }

    public final void a(boolean flag)
    {
        c = flag;
        if (!c)
        {
            b(false);
        }
    }

    public final boolean a()
    {
        return b;
    }

    public final void b(gqx gqx1)
    {
        a.remove(gqx1);
    }

    public final void b(boolean flag)
    {
        if (b != flag && (!flag || c))
        {
            b = flag;
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                ((gqx)iterator.next()).a(flag);
            }
        }
    }
}

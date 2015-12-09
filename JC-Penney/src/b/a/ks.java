// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package b.a:
//            kk, jt, ju, ow, 
//            ji

public abstract class ks extends kk
{

    public ks(String s, ji ji)
    {
        super(s, ji, 4);
    }

    public final int a(ju ju1)
    {
        ju1 = (jt)ju1;
        return b(ju1.d() * ju1.i_());
    }

    protected final void a_(ow ow1)
    {
        ji ji = super.a;
        int i = super.b;
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ow1.h(i))
        {
            ((ju)iterator.next()).a(ji, ow1);
        }

    }

    protected abstract void b();

    protected final void c()
    {
        ji ji = super.a;
        b();
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((ju)iterator.next()).a(ji)) { }
    }

    public final int j_()
    {
        Collection collection = a();
        int i = collection.size();
        if (i == 0)
        {
            return 0;
        } else
        {
            return ((ju)collection.iterator().next()).i_() * i;
        }
    }
}

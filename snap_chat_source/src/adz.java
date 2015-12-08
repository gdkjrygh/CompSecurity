// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

public abstract class adz extends adr
{

    public adz(acU acu)
    {
        super(acu, 4);
    }

    public final int a(adg adg1)
    {
        adg1 = (adf)adg1;
        return b(adg1.c() * adg1.ah_());
    }

    protected final void a_(aeG aeg)
    {
        acU acu = super.b;
        int i = super.c;
        for (Iterator iterator = a().iterator(); iterator.hasNext(); aeg.h(i))
        {
            ((adg)iterator.next()).a(acu, aeg);
        }

    }

    public final int ai_()
    {
        Collection collection = a();
        int i = collection.size();
        if (i == 0)
        {
            return 0;
        } else
        {
            return ((adg)collection.iterator().next()).ah_() * i;
        }
    }

    protected abstract void b();

    protected final void c()
    {
        acU acu = super.b;
        b();
        for (Iterator iterator = a().iterator(); iterator.hasNext(); ((adg)iterator.next()).a(acu)) { }
    }
}

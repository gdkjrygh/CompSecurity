// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.ViewPager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class fuc
    implements np
{

    private final List a = new ArrayList();

    public fuc()
    {
    }

    public final fuc a(ViewPager viewpager, Collection collection)
    {
        fua fua1;
        for (collection = collection.iterator(); collection.hasNext(); a.add(new fub(viewpager, fua1)))
        {
            fua1 = (fua)collection.next();
        }

        return this;
    }

    public final fuc a(np np1)
    {
        a.add(np1);
        return this;
    }

    public final void a(int i, float f, int j)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((np)iterator.next()).a(i, f, j)) { }
    }

    public final void b(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((np)iterator.next()).b(i)) { }
    }

    public final void c_(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((np)iterator.next()).c_(i)) { }
    }
}

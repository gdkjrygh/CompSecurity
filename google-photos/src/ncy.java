// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class ncy
{

    public Collection a;

    public ncy()
    {
        a = new ArrayList();
    }

    public abstract void a(int i, boolean flag);

    public final void a(ncz ncz1)
    {
        a.remove(ncz1);
    }

    public abstract boolean a(int i);

    public final void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ncz)iterator.next()).a()) { }
    }

    public void b(int i, boolean flag)
    {
        if (a(i) != flag)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ncz)iterator.next()).a(i, flag)) { }
        }
    }
}

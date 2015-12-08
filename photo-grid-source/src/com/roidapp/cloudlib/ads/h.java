// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import com.cmcm.a.a.a;
import com.cmcm.a.a.d;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
    implements d
{

    private LinkedList a;

    h()
    {
        a = new LinkedList();
    }

    public final void a()
    {
        if (a != null && !a.isEmpty())
        {
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                d d1 = (d)iterator.next();
                if (d1 != null)
                {
                    d1.a();
                }
            } while (true);
        }
    }

    public final void a(int i)
    {
        if (a != null && !a.isEmpty())
        {
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                d d1 = (d)iterator.next();
                if (d1 != null)
                {
                    d1.a(i);
                }
            } while (true);
        }
    }

    public final void a(a a1)
    {
        if (a != null && !a.isEmpty())
        {
            d d1 = (d)a.getLast();
            if (d1 != null)
            {
                d1.a(a1);
            }
        }
    }

    public final void a(d d1)
    {
        a.add(d1);
    }

    public final void b()
    {
        a.clear();
    }

    public final void b(d d1)
    {
        a.remove(d1);
    }
}

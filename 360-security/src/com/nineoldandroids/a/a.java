// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

public abstract class com.nineoldandroids.a.a
    implements Cloneable
{
    public static interface a
    {

        public abstract void a(com.nineoldandroids.a.a a1);

        public abstract void b(com.nineoldandroids.a.a a1);

        public abstract void c(com.nineoldandroids.a.a a1);

        public abstract void d(com.nineoldandroids.a.a a1);
    }


    ArrayList a;

    public com.nineoldandroids.a.a()
    {
        a = null;
    }

    public void a()
    {
    }

    public abstract void a(long l);

    public abstract void a(Interpolator interpolator);

    public void a(a a1)
    {
        if (a == null)
        {
            a = new ArrayList();
        }
        a.add(a1);
    }

    public abstract com.nineoldandroids.a.a b(long l);

    public void b()
    {
    }

    public void b(a a1)
    {
        if (a != null)
        {
            a.remove(a1);
            if (a.size() == 0)
            {
                a = null;
                return;
            }
        }
    }

    public void c()
    {
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return h();
    }

    public abstract boolean d();

    public boolean e()
    {
        return d();
    }

    public ArrayList f()
    {
        return a;
    }

    public void g()
    {
        if (a != null)
        {
            a.clear();
            a = null;
        }
    }

    public com.nineoldandroids.a.a h()
    {
        Object obj;
        ArrayList arraylist;
        int j;
        obj = (com.nineoldandroids.a.a)super.clone();
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        arraylist = a;
        obj.a = new ArrayList();
        j = arraylist.size();
        int i = 0;
        while (i < j) 
        {
            try
            {
                ((com.nineoldandroids.a.a) (obj)).a.add((a)arraylist.get(i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new AssertionError();
            }
            i++;
        }
        return ((com.nineoldandroids.a.a) (obj));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import com.bumptech.glide.g.e;
import com.bumptech.glide.g.h;
import java.util.Queue;

public class k
{
    static final class a
    {

        private static final Queue a = h.a(0);
        private int b;
        private int c;
        private Object d;

        static a a(Object obj, int i, int j)
        {
            a a2 = (a)a.poll();
            a a1 = a2;
            if (a2 == null)
            {
                a1 = new a();
            }
            a1.b(obj, i, j);
            return a1;
        }

        private void b(Object obj, int i, int j)
        {
            d = obj;
            c = i;
            b = j;
        }

        public void a()
        {
            a.offer(this);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof a)
            {
                obj = (a)obj;
                flag = flag1;
                if (c == ((a) (obj)).c)
                {
                    flag = flag1;
                    if (b == ((a) (obj)).b)
                    {
                        flag = flag1;
                        if (d.equals(((a) (obj)).d))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (b * 31 + c) * 31 + d.hashCode();
        }


        private a()
        {
        }
    }


    private final e a;

    public k()
    {
        this(250);
    }

    public k(int i)
    {
        a = new e(i) {

            final k a;

            protected void a(a a1, Object obj)
            {
                a1.a();
            }

            protected volatile void a(Object obj, Object obj1)
            {
                a((a)obj, obj1);
            }

            
            {
                a = k.this;
                super(i);
            }
        };
    }

    public Object a(Object obj, int i, int j)
    {
        obj = a.a(obj, i, j);
        Object obj1 = a.b(obj);
        ((a) (obj)).a();
        return obj1;
    }

    public void a(Object obj, int i, int j, Object obj1)
    {
        obj = a.a(obj, i, j);
        a.b(obj, obj1);
    }
}

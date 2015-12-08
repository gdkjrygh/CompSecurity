// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.x;

import java.util.Queue;
import p.ap.e;
import p.ap.h;

public class i
{
    static final class a
    {

        private static final Queue a = h.a(0);
        private int b;
        private int c;
        private Object d;

        static a a(Object obj, int j, int k)
        {
            a a2 = (a)a.poll();
            a a1 = a2;
            if (a2 == null)
            {
                a1 = new a();
            }
            a1.b(obj, j, k);
            return a1;
        }

        private void b(Object obj, int j, int k)
        {
            d = obj;
            c = j;
            b = k;
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

    public i()
    {
        this(250);
    }

    public i(int j)
    {
        a = new e(j) {

            final i a;

            protected volatile void a(Object obj, Object obj1)
            {
                a((a)obj, obj1);
            }

            protected void a(a a1, Object obj)
            {
                a1.a();
            }

            
            {
                a = i.this;
                super(k);
            }
        };
    }

    public Object a(Object obj, int j, int k)
    {
        obj = a.a(obj, j, k);
        Object obj1 = a.b(obj);
        ((a) (obj)).a();
        return obj1;
    }

    public void a(Object obj, int j, int k, Object obj1)
    {
        obj = a.a(obj, j, k);
        a.b(obj, obj1);
    }
}

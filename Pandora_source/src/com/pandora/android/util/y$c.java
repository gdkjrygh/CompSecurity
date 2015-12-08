// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

// Referenced classes of package com.pandora.android.util:
//            y

private class c
{

    final y a;
    private PriorityQueue b;
    private boolean c;

    public void a(c c1)
    {
        b.add(c1);
        for (c1 = (b)b.peek(); c1 != null && c1.a < System.currentTimeMillis() - 500L; c1 = (illis)b.peek())
        {
            c = true;
            b.remove();
        }

    }

    public boolean a()
    {
        if (c)
        {
            int j = b.size();
            Iterator iterator = b.iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((tor)iterator.next()).b)
                {
                    i++;
                }
            } while (true);
            if ((float)i / (float)j >= 0.55F)
            {
                return true;
            }
        }
        return false;
    }

    public void b()
    {
        c = false;
        b.clear();
    }

    public _cls1.a(y y1)
    {
        a = y1;
        super();
        b = new PriorityQueue(100, new Comparator(y1) {

            final y a;
            final y.c b;

            public int a(y.a a1, y.a a2)
            {
                return Long.valueOf(a1.a).compareTo(Long.valueOf(a2.a));
            }

            public int compare(Object obj, Object obj1)
            {
                return a((y.a)obj, (y.a)obj1);
            }

            
            {
                b = y.c.this;
                a = y1;
                super();
            }
        });
        c = false;
    }
}

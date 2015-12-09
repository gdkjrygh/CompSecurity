// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import com.bumptech.glide.g.h;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.b:
//            k

static final class 
{

    private static final Queue a = h.a(0);
    private int b;
    private int c;
    private Object d;

    static  a(Object obj, int i, int j)
    {
         1 = ()a.poll();
          = 1;
        if (1 == null)
        {
             = new <init>();
        }
        .b(obj, i, j);
        return ;
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
            if (c == ((c) (obj)).c)
            {
                flag = flag1;
                if (b == ((b) (obj)).b)
                {
                    flag = flag1;
                    if (d.equals(((d) (obj)).d))
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


    private ()
    {
    }
}

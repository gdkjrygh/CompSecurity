// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.x;

import java.util.Queue;
import p.ap.h;

// Referenced classes of package p.x:
//            i

static final class 
{

    private static final Queue a = h.a(0);
    private int b;
    private int c;
    private Object d;

    static g.Object a(Object obj, int j, int k)
    {
        g.Object obj1 = (g.Object)a.poll();
          = obj1;
        if (obj1 == null)
        {
             = new <init>();
        }
        .b(obj, j, k);
        return ;
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
        if (obj instanceof g.Object)
        {
            obj = ()obj;
            flag = flag1;
            if (c == ((c) (obj)).c)
            {
                flag = flag1;
                if (b == ((b) (obj)).b)
                {
                    flag = flag1;
                    if (d.equals(((g.Object) (obj)).d))
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

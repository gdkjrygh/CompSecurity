// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.v;

import java.util.concurrent.FutureTask;

// Referenced classes of package p.v:
//            a, b

static class b extends FutureTask
    implements Comparable
{

    private final int a;
    private final int b;

    public int a(able able)
    {
        int j = a - able.a;
        int i = j;
        if (j == 0)
        {
            i = b - able.b;
        }
        return i;
    }

    public int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof g.Object)
        {
            obj = ()obj;
            flag = flag1;
            if (b == ((b) (obj)).b)
            {
                flag = flag1;
                if (a == ((a) (obj)).a)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a * 31 + b;
    }

    public g.String(Runnable runnable, Object obj, int i)
    {
        super(runnable, obj);
        if (!(runnable instanceof b))
        {
            throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
        } else
        {
            a = ((b)runnable).b();
            b = i;
            return;
        }
    }
}

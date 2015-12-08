// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

final class mxy
{

    private static final int d[] = {
        0, 1, 2, 3, 4
    };
    final int a;
    int b;
    private final Map c = new HashMap();

    mxy(int i)
    {
        b = 0;
        a = i;
    }

    protected static int[] a()
    {
        return d;
    }

    protected final mxx a(mxx mxx1)
    {
        mxx1.e = a;
        return (mxx)c.put(Short.valueOf(mxx1.a), mxx1);
    }

    protected final mxx a(short word0)
    {
        return (mxx)c.get(Short.valueOf(word0));
    }

    protected final void b(short word0)
    {
        c.remove(Short.valueOf(word0));
    }

    protected final mxx[] b()
    {
        return (mxx[])c.values().toArray(new mxx[c.size()]);
    }

    protected final int c()
    {
        return c.size();
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (obj instanceof mxy)
        {
            obj = (mxy)obj;
            if (((mxy) (obj)).a == a && ((mxy) (obj)).c() == c())
            {
                obj = ((mxy) (obj)).b();
                int j = obj.length;
                for (int i = 0; i < j; i++)
                {
                    mxx mxx1 = obj[i];
                    if (!mxm.a(mxx1.a) && !mxx1.equals((mxx)c.get(Short.valueOf(mxx1.a))))
                    {
                        return false;
                    }
                }

                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return (a + 527) * 31 + c.hashCode();
    }

}

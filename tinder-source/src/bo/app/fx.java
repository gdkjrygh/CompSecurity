// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;

// Referenced classes of package bo.app:
//            fy, fl, hg, ez

abstract class fx extends fy
{

    Object a[];
    int b;

    fx()
    {
        fl.a(4, "initialCapacity");
        a = new Object[4];
        b = 0;
    }

    private void a(int i)
    {
        if (a.length < i)
        {
            Object aobj[] = a;
            int j = a.length;
            if (i < 0)
            {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int k = j + (j >> 1) + 1;
            j = k;
            if (k < i)
            {
                j = Integer.highestOneBit(i - 1) << 1;
            }
            i = j;
            if (j < 0)
            {
                i = 0x7fffffff;
            }
            a = hg.b(aobj, i);
        }
    }

    public fx a(Object obj)
    {
        ez.a(obj);
        a(b + 1);
        Object aobj[] = a;
        int i = b;
        b = i + 1;
        aobj[i] = obj;
        return this;
    }

    public fy a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            int i = b;
            a(collection.size() + i);
        }
        super.a(iterable);
        return this;
    }

    public fy b(Object obj)
    {
        return a(obj);
    }
}

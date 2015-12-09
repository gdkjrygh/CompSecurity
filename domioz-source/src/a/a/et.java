// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Collection;

// Referenced classes of package a.a:
//            eu, eh, gd, du

abstract class et extends eu
{

    Object a[];
    int b;

    et()
    {
        eh.a(4, "initialCapacity");
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
            a = gd.b(aobj, i);
        }
    }

    public et a(Object obj)
    {
        du.a(obj);
        a(b + 1);
        Object aobj[] = a;
        int i = b;
        b = i + 1;
        aobj[i] = obj;
        return this;
    }

    public eu a(Iterable iterable)
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

    public eu b(Object obj)
    {
        return a(obj);
    }
}

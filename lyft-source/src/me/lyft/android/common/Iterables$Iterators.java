// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import java.util.Iterator;

// Referenced classes of package me.lyft.android.common:
//            Preconditions

class 
{

    static int advance(Iterator iterator, int i)
    {
        int j = 0;
        Preconditions.checkNotNull(iterator);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "numberToAdvance must be nonnegative");
        for (; j < i && iterator.hasNext(); j++)
        {
            iterator.next();
        }

        return j;
    }

    static void checkNonnegative(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("position (").append(i).append(") must not be negative").toString());
        } else
        {
            return;
        }
    }

    static Object get(Iterator iterator, int i)
    {
        checkNonnegative(i);
        int j = advance(iterator, i);
        if (!iterator.hasNext())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("position (").append(i).append(") must be less than the number of elements that remained (").append(j).append(")").toString());
        } else
        {
            return iterator.next();
        }
    }

    static Object getNext(Iterator iterator, Object obj)
    {
        if (iterator.hasNext())
        {
            obj = iterator.next();
        }
        return obj;
    }

    ()
    {
    }
}

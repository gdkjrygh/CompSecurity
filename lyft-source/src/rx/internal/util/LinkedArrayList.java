// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.ArrayList;
import java.util.List;

public class LinkedArrayList
{

    final int capacityHint;
    Object head[];
    int indexInTail;
    volatile int size;
    Object tail[];

    public LinkedArrayList(int i)
    {
        capacityHint = i;
    }

    public void add(Object obj)
    {
        if (size == 0)
        {
            head = new Object[capacityHint + 1];
            tail = head;
            head[0] = obj;
            indexInTail = 1;
            size = 1;
            return;
        }
        if (indexInTail == capacityHint)
        {
            Object aobj[] = new Object[capacityHint + 1];
            aobj[0] = obj;
            tail[capacityHint] = ((Object) (aobj));
            tail = aobj;
            indexInTail = 1;
            size = size + 1;
            return;
        } else
        {
            tail[indexInTail] = obj;
            indexInTail = indexInTail + 1;
            size = size + 1;
            return;
        }
    }

    public int capacityHint()
    {
        return capacityHint;
    }

    public Object[] head()
    {
        return head;
    }

    public int indexInTail()
    {
        return indexInTail;
    }

    public int size()
    {
        return size;
    }

    public Object[] tail()
    {
        return tail;
    }

    List toList()
    {
        int i1 = capacityHint;
        int j1 = size;
        ArrayList arraylist = new ArrayList(j1 + 1);
        Object aobj[] = head();
        int j = 0;
        int i = 0;
        do
        {
            if (j >= j1)
            {
                break;
            }
            arraylist.add(aobj[i]);
            int k = j + 1;
            int l = i + 1;
            i = l;
            j = k;
            if (l == i1)
            {
                aobj = (Object[])(Object[])aobj[i1];
                i = 0;
                j = k;
            }
        } while (true);
        return arraylist;
    }

    public String toString()
    {
        return toList().toString();
    }
}

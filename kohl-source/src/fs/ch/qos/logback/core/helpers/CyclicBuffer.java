// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.helpers;

import java.util.ArrayList;
import java.util.List;

public class CyclicBuffer
{

    Object ea[];
    int first;
    int last;
    int maxSize;
    int numElems;

    public CyclicBuffer(int i)
        throws IllegalArgumentException
    {
        if (i < 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The maxSize argument (").append(i).append(") is not a positive integer.").toString());
        } else
        {
            init(i);
            return;
        }
    }

    private void init(int i)
    {
        maxSize = i;
        ea = (Object[])new Object[i];
        first = 0;
        last = 0;
        numElems = 0;
    }

    public void add(Object obj)
    {
        ea[last] = obj;
        int i = last + 1;
        last = i;
        if (i == maxSize)
        {
            last = 0;
        }
        if (numElems < maxSize)
        {
            numElems = numElems + 1;
        } else
        {
            int j = first + 1;
            first = j;
            if (j == maxSize)
            {
                first = 0;
                return;
            }
        }
    }

    public List asList()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < length(); i++)
        {
            arraylist.add(get(i));
        }

        return arraylist;
    }

    public Object get(int i)
    {
        if (i < 0 || i >= numElems)
        {
            return null;
        } else
        {
            return ea[(first + i) % maxSize];
        }
    }

    public int length()
    {
        return numElems;
    }
}

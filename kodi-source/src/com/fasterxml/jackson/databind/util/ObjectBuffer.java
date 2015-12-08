// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            LinkedNode

public final class ObjectBuffer
{

    private Object _freeBuffer[];
    private LinkedNode _head;
    private int _size;
    private LinkedNode _tail;

    public ObjectBuffer()
    {
    }

    protected final void _copyTo(Object obj, int i, Object aobj[], int j)
    {
        int k = 0;
        for (LinkedNode linkednode = _head; linkednode != null; linkednode = linkednode.next())
        {
            Object aobj1[] = (Object[])linkednode.value();
            int l = aobj1.length;
            System.arraycopy(((Object) (aobj1)), 0, obj, k, l);
            k += l;
        }

        System.arraycopy(((Object) (aobj)), 0, obj, k, j);
        j = k + j;
        if (j != i)
        {
            throw new IllegalStateException((new StringBuilder()).append("Should have gotten ").append(i).append(" entries, got ").append(j).toString());
        } else
        {
            return;
        }
    }

    protected void _reset()
    {
        if (_tail != null)
        {
            _freeBuffer = (Object[])_tail.value();
        }
        _tail = null;
        _head = null;
        _size = 0;
    }

    public Object[] appendCompletedChunk(Object aobj[])
    {
        int i;
        int j;
        LinkedNode linkednode = new LinkedNode(((Object) (aobj)), null);
        if (_head == null)
        {
            _tail = linkednode;
            _head = linkednode;
        } else
        {
            _tail.linkNext(linkednode);
            _tail = linkednode;
        }
        j = aobj.length;
        _size = _size + j;
        if (j >= 16384) goto _L2; else goto _L1
_L1:
        i = j + j;
_L4:
        return new Object[i];
_L2:
        i = j;
        if (j < 0x40000)
        {
            i = j + (j >> 2);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int bufferedSize()
    {
        return _size;
    }

    public void completeAndClearBuffer(Object aobj[], int i, List list)
    {
        for (LinkedNode linkednode = _head; linkednode != null; linkednode = linkednode.next())
        {
            Object aobj1[] = (Object[])linkednode.value();
            int j = 0;
            for (int l = aobj1.length; j < l; j++)
            {
                list.add(aobj1[j]);
            }

        }

        for (int k = 0; k < i; k++)
        {
            list.add(aobj[k]);
        }

    }

    public Object[] completeAndClearBuffer(Object aobj[], int i)
    {
        int j = i + _size;
        Object aobj1[] = new Object[j];
        _copyTo(((Object) (aobj1)), j, aobj, i);
        return aobj1;
    }

    public Object[] completeAndClearBuffer(Object aobj[], int i, Class class1)
    {
        int j = i + _size;
        class1 = ((Class) ((Object[])(Object[])Array.newInstance(class1, j)));
        _copyTo(class1, j, aobj, i);
        _reset();
        return class1;
    }

    public int initialCapacity()
    {
        if (_freeBuffer == null)
        {
            return 0;
        } else
        {
            return _freeBuffer.length;
        }
    }

    public Object[] resetAndStart()
    {
        _reset();
        if (_freeBuffer == null)
        {
            return new Object[12];
        } else
        {
            return _freeBuffer;
        }
    }
}

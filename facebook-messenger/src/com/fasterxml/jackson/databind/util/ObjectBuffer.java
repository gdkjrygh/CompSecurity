// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

public final class ObjectBuffer
{

    static final int INITIAL_CHUNK_SIZE = 12;
    static final int MAX_CHUNK_SIZE = 0x40000;
    static final int SMALL_CHUNK_SIZE = 16384;
    private Node _bufferHead;
    private Node _bufferTail;
    private int _bufferedEntryCount;
    private Object _freeBuffer[];

    public ObjectBuffer()
    {
    }

    protected final void _copyTo(Object obj, int i, Object aobj[], int j)
    {
        Node node = _bufferHead;
        int k = 0;
        for (; node != null; node = node.next())
        {
            Object aobj1[] = node.getData();
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
        if (_bufferTail != null)
        {
            _freeBuffer = _bufferTail.getData();
        }
        _bufferTail = null;
        _bufferHead = null;
        _bufferedEntryCount = 0;
    }

    public Object[] appendCompletedChunk(Object aobj[])
    {
        Node node = new Node(aobj);
        int i;
        if (_bufferHead == null)
        {
            _bufferTail = node;
            _bufferHead = node;
        } else
        {
            _bufferTail.linkNext(node);
            _bufferTail = node;
        }
        i = aobj.length;
        _bufferedEntryCount = _bufferedEntryCount + i;
        if (i < 16384)
        {
            i += i;
        } else
        {
            i += i >> 2;
        }
        return new Object[i];
    }

    public int bufferedSize()
    {
        return _bufferedEntryCount;
    }

    public void completeAndClearBuffer(Object aobj[], int i, List list)
    {
        boolean flag = false;
        Node node = _bufferHead;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (node == null)
            {
                break;
            }
            Object aobj1[] = node.getData();
            int k = aobj1.length;
            for (j = 0; j < k; j++)
            {
                list.add(aobj1[j]);
            }

            node = node.next();
        } while (true);
        for (; j < i; j++)
        {
            list.add(aobj[j]);
        }

    }

    public Object[] completeAndClearBuffer(Object aobj[], int i)
    {
        int j = _bufferedEntryCount + i;
        Object aobj1[] = new Object[j];
        _copyTo(((Object) (aobj1)), j, aobj, i);
        return aobj1;
    }

    public Object[] completeAndClearBuffer(Object aobj[], int i, Class class1)
    {
        int j = i + _bufferedEntryCount;
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

    private class Node
    {

        final Object _data[];
        Node _next;

        public Object[] getData()
        {
            return _data;
        }

        public void linkNext(Node node)
        {
            if (_next != null)
            {
                throw new IllegalStateException();
            } else
            {
                _next = node;
                return;
            }
        }

        public Node next()
        {
            return _next;
        }

        public Node(Object aobj[])
        {
            _data = aobj;
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


public abstract class PrimitiveArrayBuilder
{
    static final class Node
    {

        final Object _data;
        final int _dataLength;
        Node _next;

        public final int copyData(Object obj, int i)
        {
            System.arraycopy(_data, 0, obj, i, _dataLength);
            return _dataLength + i;
        }

        public final Object getData()
        {
            return _data;
        }

        public final void linkNext(Node node)
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

        public final Node next()
        {
            return _next;
        }

        public Node(Object obj, int i)
        {
            _data = obj;
            _dataLength = i;
        }
    }


    Node _bufferHead;
    Node _bufferTail;
    int _bufferedEntryCount;
    Object _freeBuffer;

    protected PrimitiveArrayBuilder()
    {
    }

    protected abstract Object _constructArray(int i);

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

    public final Object appendCompletedChunk(Object obj, int i)
    {
        obj = new Node(obj, i);
        if (_bufferHead == null)
        {
            _bufferTail = ((Node) (obj));
            _bufferHead = ((Node) (obj));
        } else
        {
            _bufferTail.linkNext(((Node) (obj)));
            _bufferTail = ((Node) (obj));
        }
        _bufferedEntryCount = _bufferedEntryCount + i;
        if (i < 16384)
        {
            i += i;
        } else
        {
            i = (i >> 2) + i;
        }
        return _constructArray(i);
    }

    public Object completeAndClearBuffer(Object obj, int i)
    {
        int k = i + _bufferedEntryCount;
        Object obj1 = _constructArray(k);
        Node node = _bufferHead;
        int j = 0;
        for (; node != null; node = node.next())
        {
            j = node.copyData(obj1, j);
        }

        System.arraycopy(obj, 0, obj1, j, i);
        i = j + i;
        if (i != k)
        {
            throw new IllegalStateException((new StringBuilder("Should have gotten ")).append(k).append(" entries, got ").append(i).toString());
        } else
        {
            return obj1;
        }
    }

    public Object resetAndStart()
    {
        _reset();
        if (_freeBuffer == null)
        {
            return _constructArray(12);
        } else
        {
            return _freeBuffer;
        }
    }
}

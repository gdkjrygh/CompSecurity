// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


final class _dataLength
{

    final Object _data;
    final int _dataLength;
    _next _next;

    public int copyData(Object obj, int i)
    {
        System.arraycopy(_data, 0, obj, i, _dataLength);
        return _dataLength + i;
    }

    public Object getData()
    {
        return _data;
    }

    public void linkNext(_data _pdata)
    {
        if (_next != null)
        {
            throw new IllegalStateException();
        } else
        {
            _next = _pdata;
            return;
        }
    }

    public _next next()
    {
        return _next;
    }

    public (Object obj, int i)
    {
        _data = obj;
        _dataLength = i;
    }
}

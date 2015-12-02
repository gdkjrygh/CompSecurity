// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


final class _data
{

    final Object _data[];
    _next _next;

    public Object[] getData()
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

    public (Object aobj[])
    {
        _data = aobj;
    }
}

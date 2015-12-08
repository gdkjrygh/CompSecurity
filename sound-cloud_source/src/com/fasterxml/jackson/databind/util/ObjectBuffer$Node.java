// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//            ObjectBuffer

static final class _data
{

    final Object _data[];
    _next _next;

    public final Object[] getData()
    {
        return _data;
    }

    public final void linkNext(_data _pdata)
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

    public final _next next()
    {
        return _next;
    }

    public (Object aobj[])
    {
        _data = aobj;
    }
}

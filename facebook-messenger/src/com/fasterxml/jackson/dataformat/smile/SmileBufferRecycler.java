// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.dataformat.smile;


public class SmileBufferRecycler
{

    public static final int DEFAULT_NAME_BUFFER_LENGTH = 64;
    public static final int DEFAULT_STRING_VALUE_BUFFER_LENGTH = 64;
    protected Object _seenNamesBuffer[];
    protected Object _seenStringValuesBuffer[];

    public SmileBufferRecycler()
    {
    }

    public Object[] allocSeenNamesBuffer()
    {
        Object aobj[] = _seenNamesBuffer;
        if (aobj != null)
        {
            _seenNamesBuffer = null;
        }
        return aobj;
    }

    public Object[] allocSeenStringValuesBuffer()
    {
        Object aobj[] = _seenStringValuesBuffer;
        if (aobj != null)
        {
            _seenStringValuesBuffer = null;
        }
        return aobj;
    }

    public void releaseSeenNamesBuffer(Object aobj[])
    {
        _seenNamesBuffer = aobj;
    }

    public void releaseSeenStringValuesBuffer(Object aobj[])
    {
        _seenStringValuesBuffer = aobj;
    }
}

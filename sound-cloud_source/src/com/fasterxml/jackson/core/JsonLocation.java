// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.Serializable;

public class JsonLocation
    implements Serializable
{

    public static final JsonLocation NA = new JsonLocation("N/A", -1L, -1L, -1, -1);
    final int _columnNr;
    final int _lineNr;
    final Object _sourceRef;
    final long _totalBytes;
    final long _totalChars;

    public JsonLocation(Object obj, long l, int i, int j)
    {
        this(obj, -1L, l, i, j);
    }

    public JsonLocation(Object obj, long l, long l1, int i, int j)
    {
        _sourceRef = obj;
        _totalBytes = l;
        _totalChars = l1;
        _lineNr = i;
        _columnNr = j;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof JsonLocation))
            {
                return false;
            }
            obj = (JsonLocation)obj;
            if (_sourceRef == null)
            {
                if (((JsonLocation) (obj))._sourceRef != null)
                {
                    return false;
                }
            } else
            if (!_sourceRef.equals(((JsonLocation) (obj))._sourceRef))
            {
                return false;
            }
            if (_lineNr != ((JsonLocation) (obj))._lineNr || _columnNr != ((JsonLocation) (obj))._columnNr || _totalChars != ((JsonLocation) (obj))._totalChars || getByteOffset() != ((JsonLocation) (obj)).getByteOffset())
            {
                return false;
            }
        }
        return true;
    }

    public long getByteOffset()
    {
        return _totalBytes;
    }

    public int hashCode()
    {
        int i;
        if (_sourceRef == null)
        {
            i = 1;
        } else
        {
            i = _sourceRef.hashCode();
        }
        return ((i ^ _lineNr) + _columnNr ^ (int)_totalChars) + (int)_totalBytes;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(80);
        stringbuilder.append("[Source: ");
        if (_sourceRef == null)
        {
            stringbuilder.append("UNKNOWN");
        } else
        {
            stringbuilder.append(_sourceRef.toString());
        }
        stringbuilder.append("; line: ");
        stringbuilder.append(_lineNr);
        stringbuilder.append(", column: ");
        stringbuilder.append(_columnNr);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

}

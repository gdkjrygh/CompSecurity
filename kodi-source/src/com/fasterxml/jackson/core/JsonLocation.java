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
    final transient Object _sourceRef;
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
        boolean flag2;
        boolean flag3;
        flag2 = true;
        flag3 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag3;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag3;
        if (!(obj instanceof JsonLocation)) goto _L4; else goto _L5
_L5:
        obj = (JsonLocation)obj;
        if (_sourceRef != null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        flag = flag3;
        if (((JsonLocation) (obj))._sourceRef != null) goto _L4; else goto _L6
_L6:
        boolean flag1;
        if (_lineNr == ((JsonLocation) (obj))._lineNr && _columnNr == ((JsonLocation) (obj))._columnNr && _totalChars == ((JsonLocation) (obj))._totalChars && getByteOffset() == ((JsonLocation) (obj)).getByteOffset())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        return flag1;
        if (!_sourceRef.equals(((JsonLocation) (obj))._sourceRef))
        {
            return false;
        }
          goto _L6
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

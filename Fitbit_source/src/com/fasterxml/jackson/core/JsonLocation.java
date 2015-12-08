// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.Serializable;

public class JsonLocation
    implements Serializable
{

    public static final JsonLocation a = new JsonLocation("N/A", -1L, -1L, -1, -1);
    private static final long serialVersionUID = 1L;
    final int _columnNr;
    final int _lineNr;
    final long _totalBytes;
    final long _totalChars;
    final transient Object b;

    public JsonLocation(Object obj, long l, int i, int j)
    {
        this(obj, -1L, l, i, j);
    }

    public JsonLocation(Object obj, long l, long l1, int i, int j)
    {
        b = obj;
        _totalBytes = l;
        _totalChars = l1;
        _lineNr = i;
        _columnNr = j;
    }

    public Object a()
    {
        return b;
    }

    public int b()
    {
        return _lineNr;
    }

    public int c()
    {
        return _columnNr;
    }

    public long d()
    {
        return _totalChars;
    }

    public long e()
    {
        return _totalBytes;
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
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        flag = flag3;
        if (((JsonLocation) (obj)).b != null) goto _L4; else goto _L6
_L6:
        boolean flag1;
        if (_lineNr == ((JsonLocation) (obj))._lineNr && _columnNr == ((JsonLocation) (obj))._columnNr && _totalChars == ((JsonLocation) (obj))._totalChars && e() == ((JsonLocation) (obj)).e())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        return flag1;
        if (!b.equals(((JsonLocation) (obj)).b))
        {
            return false;
        }
          goto _L6
    }

    public int hashCode()
    {
        int i;
        if (b == null)
        {
            i = 1;
        } else
        {
            i = b.hashCode();
        }
        return ((i ^ _lineNr) + _columnNr ^ (int)_totalChars) + (int)_totalBytes;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(80);
        stringbuilder.append("[Source: ");
        if (b == null)
        {
            stringbuilder.append("UNKNOWN");
        } else
        {
            stringbuilder.append(b.toString());
        }
        stringbuilder.append("; line: ");
        stringbuilder.append(_lineNr);
        stringbuilder.append(", column: ");
        stringbuilder.append(_columnNr);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

}

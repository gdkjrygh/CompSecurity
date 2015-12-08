// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//            CharsToNameCanonicalizer

static final class _length
{

    private final int _length;
    private final _length _next;
    private final String _symbol;

    public final String find(char ac[], int i, int j)
    {
        String s = _symbol;
        _length _llength = _next;
        do
        {
            if (s.length() == j)
            {
                int k = 0;
                int l;
                do
                {
                    l = k;
                    if (s.charAt(k) != ac[i + k])
                    {
                        break;
                    }
                    l = k + 1;
                    k = l;
                } while (l < j);
                if (l == j)
                {
                    return s;
                }
            }
            if (_llength != null)
            {
                s = _llength.getSymbol();
                _llength = _llength.getNext();
            } else
            {
                return null;
            }
        } while (true);
    }

    public final getNext getNext()
    {
        return _next;
    }

    public final String getSymbol()
    {
        return _symbol;
    }

    public final int length()
    {
        return _length;
    }

    public (String s,  )
    {
        _symbol = s;
        _next = ;
        int i;
        if ( == null)
        {
            i = 1;
        } else
        {
            i = ._length + 1;
        }
        _length = i;
    }
}

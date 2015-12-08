// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package com.c.a.a.b:
//            r, k

final class m extends Inflater
{

    final k a;

    m(k k)
    {
        a = k;
        super();
    }

    public final int inflate(byte abyte0[], int i, int j)
        throws DataFormatException
    {
        int l = super.inflate(abyte0, i, j);
        int k = l;
        if (l == 0)
        {
            k = l;
            if (needsDictionary())
            {
                setDictionary(r.a);
                k = super.inflate(abyte0, i, j);
            }
        }
        return k;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            j, n

final class a extends Inflater
{

    final j a;

    public final int inflate(byte abyte0[], int i, int k)
        throws DataFormatException
    {
        int i1 = super.inflate(abyte0, i, k);
        int l = i1;
        if (i1 == 0)
        {
            l = i1;
            if (needsDictionary())
            {
                setDictionary(n.a);
                l = super.inflate(abyte0, i, k);
            }
        }
        return l;
    }

    (j j1)
    {
        a = j1;
        super();
    }
}

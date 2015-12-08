// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b.a;

import java.io.FilterInputStream;
import java.io.InputStream;

// Referenced classes of package com.android.b.a:
//            e

class g extends FilterInputStream
{

    private int a;

    private g(InputStream inputstream)
    {
        super(inputstream);
        a = 0;
    }

    g(InputStream inputstream, e e)
    {
        this(inputstream);
    }

    static int a(g g1)
    {
        return g1.a;
    }

    public int read()
    {
        int i = super.read();
        if (i != -1)
        {
            a = a + 1;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = super.read(abyte0, i, j);
        if (i != -1)
        {
            a = a + i;
        }
        return i;
    }
}

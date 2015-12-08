// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.android.volley.toolbox:
//            c

private static class <init> extends FilterInputStream
{

    private int a;

    static int a(<init> <init>1)
    {
        return <init>1.a;
    }

    public int read()
        throws IOException
    {
        int i = super.read();
        if (i != -1)
        {
            a = a + 1;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        i = super.read(abyte0, i, j);
        if (i != -1)
        {
            a = a + i;
        }
        return i;
    }

    private (InputStream inputstream)
    {
        super(inputstream);
        a = 0;
    }

    a(InputStream inputstream, a a1)
    {
        this(inputstream);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            zzv

private static class <init> extends FilterInputStream
{

    private int zzaD;

    static int zza(<init> <init>1)
    {
        return <init>1.zzaD;
    }

    public int read()
        throws IOException
    {
        int i = super.read();
        if (i != -1)
        {
            zzaD = zzaD + 1;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        i = super.read(abyte0, i, j);
        if (i != -1)
        {
            zzaD = zzaD + i;
        }
        return i;
    }

    private (InputStream inputstream)
    {
        super(inputstream);
        zzaD = 0;
    }

    zzaD(InputStream inputstream, zzaD zzad)
    {
        this(inputstream);
    }
}

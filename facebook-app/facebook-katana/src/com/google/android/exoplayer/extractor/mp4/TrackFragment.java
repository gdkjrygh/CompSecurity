// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.ParsableByteArray;

final class TrackFragment
{

    public int a;
    public int b;
    public int c[];
    public int d[];
    public long e[];
    public boolean f[];
    public boolean g;
    public boolean h[];
    public int i;
    public ParsableByteArray j;
    public boolean k;

    TrackFragment()
    {
    }

    public final void a()
    {
        b = 0;
        g = false;
        k = false;
    }

    public final void a(int l)
    {
        b = l;
        if (c == null || c.length < b)
        {
            l = (l * 125) / 100;
            c = new int[l];
            d = new int[l];
            e = new long[l];
            f = new boolean[l];
            h = new boolean[l];
        }
    }

    public final void a(ExtractorInput extractorinput)
    {
        extractorinput.b(j.a, 0, i);
        j.b(0);
        k = false;
    }

    public final void a(ParsableByteArray parsablebytearray)
    {
        parsablebytearray.a(j.a, 0, i);
        j.b(0);
        k = false;
    }

    public final void b(int l)
    {
        if (j == null || j.c() < l)
        {
            j = new ParsableByteArray(l);
        }
        i = l;
        g = true;
        k = true;
    }

    public final long c(int l)
    {
        return e[l] + (long)d[l];
    }
}

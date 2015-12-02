// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp3;

import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.EOFException;
import java.nio.BufferOverflowException;

final class BufferingInput
{

    private final ParsableByteArray a;
    private final int b;
    private int c;
    private int d;
    private int e;

    public BufferingInput(int i)
    {
        b = i;
        a = new ParsableByteArray(i * 2);
    }

    private boolean c(ExtractorInput extractorinput, int i)
    {
label0:
        {
            boolean flag = true;
            if ((c + i) - e > b)
            {
                throw new BufferOverflowException();
            }
            i -= d - c;
            if (i > 0)
            {
                if (extractorinput.a(a.a, d, i, true))
                {
                    break label0;
                }
                flag = false;
            }
            return flag;
        }
        d = i + d;
        return true;
    }

    private boolean c(ExtractorInput extractorinput, byte abyte0[], int i, int j)
    {
        if (!c(extractorinput, j))
        {
            return false;
        }
        if (abyte0 != null)
        {
            System.arraycopy(a.a, c, abyte0, i, j);
        }
        c = c + j;
        return true;
    }

    public final int a(TrackOutput trackoutput, int i)
    {
        if (i == 0)
        {
            return 0;
        } else
        {
            a.b(c);
            i = Math.min(d - c, i);
            trackoutput.a(a, i);
            c = c + i;
            return i;
        }
    }

    public final ParsableByteArray a(ExtractorInput extractorinput, int i)
    {
        if (!c(extractorinput, i))
        {
            throw new EOFException();
        } else
        {
            extractorinput = new ParsableByteArray(a.a, d);
            extractorinput.b(c);
            c = c + i;
            return extractorinput;
        }
    }

    public final void a()
    {
        c = 0;
        d = 0;
        e = 0;
    }

    public final void a(ExtractorInput extractorinput, byte abyte0[], int i, int j)
    {
        if (!c(extractorinput, abyte0, i, j))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final void b()
    {
        if (c > b)
        {
            System.arraycopy(a.a, c, a.a, 0, d - c);
            d = d - c;
            c = 0;
        }
        e = c;
    }

    public final void b(ExtractorInput extractorinput, int i)
    {
        if (!c(extractorinput, null, 0, i))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final boolean b(ExtractorInput extractorinput, byte abyte0[], int i, int j)
    {
        return c(extractorinput, abyte0, i, j);
    }

    public final void c()
    {
        c = e;
    }

    public final int d()
    {
        return d - c;
    }
}

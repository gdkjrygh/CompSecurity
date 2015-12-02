// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.Ac3Util;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            ElementaryStreamReader

final class Ac3Reader extends ElementaryStreamReader
{

    private final ParsableBitArray b = new ParsableBitArray(new byte[8]);
    private final ParsableByteArray c;
    private int d;
    private int e;
    private boolean f;
    private long g;
    private MediaFormat h;
    private int i;
    private int j;
    private long k;

    public Ac3Reader(TrackOutput trackoutput)
    {
        super(trackoutput);
        c = new ParsableByteArray(b.a);
        d = 0;
    }

    private boolean a(ParsableByteArray parsablebytearray)
    {
        while (parsablebytearray.b() > 0) 
        {
            if (!f)
            {
                boolean flag;
                if (parsablebytearray.f() == 11)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                f = flag;
            } else
            {
                int l = parsablebytearray.f();
                if (l == 119)
                {
                    f = false;
                    return true;
                }
                boolean flag1;
                if (l == 11)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                f = flag1;
            }
        }
        return false;
    }

    private boolean a(ParsableByteArray parsablebytearray, byte abyte0[], int l)
    {
        int i1 = Math.min(parsablebytearray.b(), l - e);
        parsablebytearray.a(abyte0, e, i1);
        e = i1 + e;
        return e == l;
    }

    private void c()
    {
        b.a(0);
        i = Ac3Util.b(b);
        if (h == null)
        {
            b.a(0);
            h = Ac3Util.a(b);
            a.a(h);
            j = Ac3Util.a(i, h.h);
        }
        g = (int)((8000L * (long)i) / (long)j);
    }

    public final void a()
    {
        d = 0;
        e = 0;
        f = false;
    }

    public final void a(ParsableByteArray parsablebytearray, long l, boolean flag)
    {
        if (flag)
        {
            k = l;
        }
        do
        {
            if (parsablebytearray.b() <= 0)
            {
                break;
            }
            switch (d)
            {
            case 0: // '\0'
                if (a(parsablebytearray))
                {
                    d = 1;
                    c.a[0] = 11;
                    c.a[1] = 119;
                    e = 2;
                }
                break;

            case 1: // '\001'
                if (a(parsablebytearray, c.a, 8))
                {
                    c();
                    c.b(0);
                    a.a(c, 8);
                    d = 2;
                }
                break;

            case 2: // '\002'
                int i1 = Math.min(parsablebytearray.b(), i - e);
                a.a(parsablebytearray, i1);
                e = i1 + e;
                if (e == i)
                {
                    a.a(k, 1, i, 0, null);
                    k = k + g;
                    d = 0;
                }
                break;
            }
        } while (true);
    }

    public final void b()
    {
    }
}

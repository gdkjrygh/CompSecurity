// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.MpegAudioHeader;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            ElementaryStreamReader

final class MpegAudioReader extends ElementaryStreamReader
{

    private final ParsableByteArray b = new ParsableByteArray(4);
    private final MpegAudioHeader c = new MpegAudioHeader();
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private long h;
    private int i;
    private long j;

    public MpegAudioReader(TrackOutput trackoutput)
    {
        super(trackoutput);
        d = 0;
        b.a[0] = -1;
    }

    private void a(ParsableByteArray parsablebytearray)
    {
        byte abyte0[] = parsablebytearray.a;
        int k = parsablebytearray.d();
        boolean flag;
        int l;
        boolean flag1;
        for (l = parsablebytearray.c(); k < l; k++)
        {
            if ((abyte0[k] & 0xff) == 255)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (g && (abyte0[k] & 0xe0) == 224)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g = flag1;
            if (flag)
            {
                parsablebytearray.b(k + 1);
                g = false;
                b.a[1] = abyte0[k];
                e = 2;
                d = 1;
                return;
            }
        }

        parsablebytearray.b(l);
    }

    private void b(ParsableByteArray parsablebytearray)
    {
        int k = Math.min(parsablebytearray.b(), 4 - e);
        parsablebytearray.a(b.a, e, k);
        e = k + e;
        if (e < 4)
        {
            return;
        }
        b.b(0);
        if (!MpegAudioHeader.a(b.j(), c))
        {
            e = 0;
            d = 1;
            return;
        }
        i = c.c;
        if (!f)
        {
            h = (0xf4240L * (long)c.g) / (long)c.d;
            parsablebytearray = MediaFormat.b(c.b, 4096, -1L, c.e, c.d, null);
            a.a(parsablebytearray);
            f = true;
        }
        b.b(0);
        a.a(b, 4);
        d = 2;
    }

    private void c(ParsableByteArray parsablebytearray)
    {
        int k = Math.min(parsablebytearray.b(), i - e);
        a.a(parsablebytearray, k);
        e = k + e;
        if (e < i)
        {
            return;
        } else
        {
            a.a(j, 1, i, 0, null);
            j = j + h;
            e = 0;
            d = 0;
            return;
        }
    }

    public final void a()
    {
        d = 0;
        e = 0;
        g = false;
    }

    public final void a(ParsableByteArray parsablebytearray, long l, boolean flag)
    {
        if (flag)
        {
            j = l;
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
                a(parsablebytearray);
                break;

            case 1: // '\001'
                b(parsablebytearray);
                break;

            case 2: // '\002'
                c(parsablebytearray);
                break;
            }
        } while (true);
    }

    public final void b()
    {
    }
}

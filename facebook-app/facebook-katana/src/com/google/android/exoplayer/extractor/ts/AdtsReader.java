// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.CodecSpecificDataUtil;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            ElementaryStreamReader

final class AdtsReader extends ElementaryStreamReader
{

    private final ParsableBitArray b = new ParsableBitArray(new byte[7]);
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private int i;
    private long j;

    public AdtsReader(TrackOutput trackoutput)
    {
        super(trackoutput);
        c = 0;
    }

    private boolean a(ParsableByteArray parsablebytearray)
    {
        byte abyte0[] = parsablebytearray.a;
        int k = parsablebytearray.d();
        int l;
        for (l = parsablebytearray.c(); k < l; k++)
        {
            boolean flag;
            boolean flag1;
            if ((abyte0[k] & 0xff) == 255)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (e && !flag1 && (abyte0[k] & 0xf0) == 240)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e = flag1;
            if (flag)
            {
                if ((abyte0[k] & 1) == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                f = flag1;
                parsablebytearray.b(k + 1);
                e = false;
                return true;
            }
        }

        parsablebytearray.b(l);
        return false;
    }

    private boolean a(ParsableByteArray parsablebytearray, byte abyte0[], int k)
    {
        int l = Math.min(parsablebytearray.b(), k - d);
        parsablebytearray.a(abyte0, d, l);
        d = l + d;
        return d == k;
    }

    private void c()
    {
        b.a(0);
        if (!g)
        {
            int k = b.c(2);
            int l = b.c(4);
            b.b(1);
            byte abyte0[] = CodecSpecificDataUtil.a(k + 1, l, b.c(3));
            Pair pair = CodecSpecificDataUtil.a(abyte0);
            MediaFormat mediaformat = MediaFormat.b("audio/mp4a-latm", -1, ((Integer)pair.second).intValue(), ((Integer)pair.first).intValue(), Collections.singletonList(abyte0));
            h = 0x3d090000L / (long)mediaformat.h;
            a.a(mediaformat);
            g = true;
        } else
        {
            b.b(10);
        }
        b.b(4);
        i = b.c(13) - 2 - 5;
        if (f)
        {
            i = i - 2;
        }
    }

    public final void a()
    {
        c = 0;
        d = 0;
        e = false;
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
            switch (c)
            {
            case 0: // '\0'
                if (a(parsablebytearray))
                {
                    d = 0;
                    c = 1;
                }
                break;

            case 1: // '\001'
                byte byte0;
                if (f)
                {
                    byte0 = 7;
                } else
                {
                    byte0 = 5;
                }
                if (a(parsablebytearray, b.a, byte0))
                {
                    c();
                    d = 0;
                    c = 2;
                }
                break;

            case 2: // '\002'
                int k = Math.min(parsablebytearray.b(), i - d);
                a.a(parsablebytearray, k);
                d = k + d;
                if (d == i)
                {
                    a.a(j, 1, i, 0, null);
                    j = j + h;
                    d = 0;
                    c = 0;
                }
                break;
            }
        } while (true);
    }

    public final void b()
    {
    }
}

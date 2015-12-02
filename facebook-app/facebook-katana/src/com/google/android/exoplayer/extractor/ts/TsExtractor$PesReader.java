// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//            TsExtractor, ElementaryStreamReader

class d extends eader
{

    final TsExtractor a;
    private final ParsableBitArray b = new ParsableBitArray(new byte[9]);
    private final ElementaryStreamReader c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private long j;

    private void a(int k)
    {
        d = k;
        e = 0;
    }

    private boolean a(ParsableByteArray parsablebytearray, byte abyte0[], int k)
    {
        int l = Math.min(parsablebytearray.b(), k - e);
        if (l > 0)
        {
            if (abyte0 == null)
            {
                parsablebytearray.c(l);
            } else
            {
                parsablebytearray.a(abyte0, e, l);
            }
            e = l + e;
            if (e != k)
            {
                return false;
            }
        }
        return true;
    }

    private boolean b()
    {
        b.a(0);
        int k = b.c(24);
        if (k != 1)
        {
            Log.w("TsExtractor", (new StringBuilder("Unexpected start code prefix: ")).append(k).toString());
            i = -1;
            return false;
        }
        b.b(8);
        k = b.c(16);
        b.b(8);
        g = b.b();
        b.b(7);
        h = b.c(8);
        if (k == 0)
        {
            i = -1;
        } else
        {
            i = (k + 6) - 9 - h;
        }
        return true;
    }

    private void c()
    {
        b.a(0);
        j = 0L;
        if (g)
        {
            b.b(4);
            long l = b.c(3);
            b.b(1);
            long l1 = b.c(15) << 15;
            b.b(1);
            long l2 = b.c(15);
            b.b(1);
            j = a.a(l << 30 | l1 | l2);
        }
    }

    public final void a()
    {
        d = 0;
        e = 0;
        f = false;
        c.a();
    }

    public final void a(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        d;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 40
    //                   1 40
    //                   2 102
    //                   3 113;
           goto _L3 _L3 _L3 _L4 _L5
_L3:
        a(1);
_L2:
        if (parsablebytearray.b() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        switch (d)
        {
        case 0: // '\0'
            parsablebytearray.c(parsablebytearray.b());
            break;

        case 1: // '\001'
            if (a(parsablebytearray, b.a, 9))
            {
                byte byte0;
                if (b())
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 0;
                }
                a(byte0);
            }
            break;

        case 2: // '\002'
            int k = Math.min(5, h);
            if (a(parsablebytearray, b.a, k) && a(parsablebytearray, ((byte []) (null)), h))
            {
                c();
                f = false;
                a(3);
            }
            break;

        case 3: // '\003'
            int j1 = parsablebytearray.b();
            int l;
            int i1;
            long l1;
            if (i == -1)
            {
                l = 0;
            } else
            {
                l = j1 - i;
            }
            i1 = j1;
            if (l > 0)
            {
                i1 = j1 - l;
                parsablebytearray.a(parsablebytearray.d() + i1);
            }
            extractoroutput = c;
            l1 = j;
            if (!f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            extractoroutput.a(parsablebytearray, l1, flag);
            f = true;
            if (i != -1)
            {
                i = i - i1;
                if (i == 0)
                {
                    c.b();
                    a(1);
                }
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        Log.w("TsExtractor", "Unexpected start indicator reading extended header");
        continue; /* Loop/switch isn't completed */
_L5:
        if (i != -1)
        {
            Log.w("TsExtractor", (new StringBuilder("Unexpected start indicator: expected ")).append(i).append(" more bytes").toString());
        }
        if (f)
        {
            c.b();
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L6
_L6:
        return;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public (TsExtractor tsextractor, ElementaryStreamReader elementarystreamreader)
    {
        a = tsextractor;
        super((byte)0);
        c = elementarystreamreader;
        d = 0;
    }
}

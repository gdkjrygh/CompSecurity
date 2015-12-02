// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//            Atom

final class Sniffer
{

    private static final int a[] = {
        Util.e("isom"), Util.e("iso2"), Util.e("avc1"), Util.e("hvc1"), Util.e("hev1"), Util.e("mp41"), Util.e("mp42"), Util.e("3g2a"), Util.e("3g2b"), Util.e("3gr6"), 
        Util.e("3gs6"), Util.e("3ge6"), Util.e("3gg6"), Util.e("M4V "), Util.e("M4A "), Util.e("f4v "), Util.e("kddi"), Util.e("M4VP"), Util.e("qt  "), Util.e("MSNV")
    };

    private Sniffer()
    {
    }

    private static boolean a(int i)
    {
        if (i >>> 8 != Util.e("3gp")) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int ai[] = a;
        int k = ai.length;
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= k)
                {
                    break label1;
                }
                if (ai[j] == i)
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public static boolean a(ExtractorInput extractorinput)
    {
        return a(extractorinput, 4096, true);
    }

    private static boolean a(ExtractorInput extractorinput, int i, boolean flag)
    {
        ParsableByteArray parsablebytearray;
        boolean flag1;
        int l;
        boolean flag3;
        long l1;
label0:
        {
            long l3 = extractorinput.c();
            if (l3 != -1L)
            {
                l1 = l3;
                if (l3 <= (long)i)
                {
                    break label0;
                }
            }
            l1 = i;
        }
        l = (int)l1;
        parsablebytearray = new ParsableByteArray(64);
        flag1 = false;
        flag3 = false;
        i = 0;
_L12:
        boolean flag2 = flag3;
        if (i >= l) goto _L2; else goto _L1
_L1:
        extractorinput.c(parsablebytearray.a, 0, 8);
        parsablebytearray.b(0);
        long l2 = parsablebytearray.i();
        int k = parsablebytearray.j();
        int j;
        int i1;
        if (l2 == 1L)
        {
            extractorinput.c(parsablebytearray.a, 8, 8);
            l2 = parsablebytearray.k();
            j = 16;
        } else
        {
            j = 8;
        }
        if (l2 < (long)j || l2 > 0x7fffffffL)
        {
            return false;
        }
        flag2 = flag3;
        if ((long)i + l2 > (long)l) goto _L2; else goto _L3
_L3:
        i1 = (int)l2 - j;
        if (k != Atom.a) goto _L5; else goto _L4
_L4:
        if (i1 < 8)
        {
            return false;
        }
        i1 = (i1 - 8) / 4;
        extractorinput.c(parsablebytearray.a, 0, (i1 + 2) * 4);
        k = 0;
_L10:
        j = ((flag1) ? 1 : 0);
        if (k >= i1 + 2) goto _L7; else goto _L6
_L6:
        if (k == 1 || !a(parsablebytearray.j())) goto _L9; else goto _L8
_L8:
        j = 1;
_L7:
        i = (int)((long)i + l2);
        flag1 = j;
        continue; /* Loop/switch isn't completed */
_L9:
        k++;
          goto _L10
_L5:
        if (k != Atom.B)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        flag2 = true;
_L2:
        if (flag1 && flag == flag2)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_320;
        j = ((flag1) ? 1 : 0);
        if (i1 != 0)
        {
            extractorinput.b(i1);
            j = ((flag1) ? 1 : 0);
        }
          goto _L7
        return false;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public static boolean b(ExtractorInput extractorinput)
    {
        return a(extractorinput, 128, false);
    }

}

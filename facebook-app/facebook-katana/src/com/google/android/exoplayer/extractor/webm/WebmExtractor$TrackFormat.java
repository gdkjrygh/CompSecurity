// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.webm;

import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.MimeTypes;
import com.google.android.exoplayer.util.NalUnitUtil;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class <init>
{

    public String a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte f[];
    public byte g[];
    public byte h[];
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public long o;
    public TrackOutput p;

    private static Pair a(ParsableByteArray parsablebytearray)
    {
        boolean flag = false;
        ArrayList arraylist;
        int i1;
        int j1;
        int k1;
        boolean flag1;
        try
        {
            parsablebytearray.b(4);
            j1 = (parsablebytearray.f() & 3) + 1;
        }
        // Misplaced declaration of an exception variable
        catch (ParsableByteArray parsablebytearray)
        {
            throw new ParserException("Error parsing AVC codec private");
        }
        if (j1 != 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.b(flag1);
        arraylist = new ArrayList();
        k1 = parsablebytearray.f();
        i1 = 0;
_L2:
        if (i1 >= (k1 & 0x1f))
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(NalUnitUtil.a(parsablebytearray));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        k1 = parsablebytearray.f();
        i1 = ((flag) ? 1 : 0);
_L4:
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(NalUnitUtil.a(parsablebytearray));
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        parsablebytearray = Pair.create(arraylist, Integer.valueOf(j1));
        return parsablebytearray;
    }

    private static List a(byte abyte0[])
    {
_L2:
        k1 = j1 + 1;
        j1 = abyte0[j1];
        if (abyte0[k1] == 1)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        throw new ParserException("Error parsing vorbis codec private");
        abyte1 = new byte[i2];
        System.arraycopy(abyte0, k1, abyte1, 0, i2);
        k1 = i2 + k1;
        if (abyte0[k1] == 3)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        throw new ParserException("Error parsing vorbis codec private");
        i1 = i1 + j1 + k1;
        if (abyte0[i1] == 5)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        throw new ParserException("Error parsing vorbis codec private");
        byte abyte2[] = new byte[abyte0.length - i1];
        System.arraycopy(abyte0, i1, abyte2, 0, abyte0.length - i1);
        abyte0 = new ArrayList(2);
        abyte0.add(abyte1);
        abyte0.add(abyte2);
        return abyte0;
        int k1 = 0;
        if (abyte0[0] != 2)
        {
            try
            {
                throw new ParserException("Error parsing vorbis codec private");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }
        int i1 = 0;
        byte abyte1[];
        int j1;
        int i2;
        for (j1 = 1; abyte0[j1] == -1;)
        {
            j1++;
            i1 += 255;
        }

        int l1 = j1 + 1;
        i2 = i1 + abyte0[j1];
        j1 = l1;
        i1 = k1;
        while (abyte0[j1] == -1) 
        {
            i1 += 255;
            j1++;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Pair b(ParsableByteArray parsablebytearray)
    {
        int i1;
        int j1;
        int k1;
        byte abyte0[];
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        try
        {
            parsablebytearray.b(21);
            i2 = parsablebytearray.f();
            j2 = parsablebytearray.f();
            l1 = parsablebytearray.d();
        }
        // Misplaced declaration of an exception variable
        catch (ParsableByteArray parsablebytearray)
        {
            throw new ParserException("Error parsing HEVC codec private");
        }
        j1 = 0;
        i1 = 0;
_L10:
        if (j1 >= j2) goto _L2; else goto _L1
_L1:
        parsablebytearray.c(1);
        k2 = parsablebytearray.g();
        k1 = 0;
_L4:
        if (k1 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = parsablebytearray.g();
        i1 += l2 + 4;
        parsablebytearray.c(l2);
        k1++;
        if (true) goto _L4; else goto _L3
_L2:
        parsablebytearray.b(l1);
        abyte0 = new byte[i1];
        k1 = 0;
        j1 = 0;
_L11:
        if (k1 >= j2) goto _L6; else goto _L5
_L5:
        parsablebytearray.c(1);
        k2 = parsablebytearray.g();
        l1 = 0;
_L8:
        if (l1 >= k2)
        {
            continue; /* Loop/switch isn't completed */
        }
        l2 = parsablebytearray.g();
        System.arraycopy(NalUnitUtil.a, 0, abyte0, j1, NalUnitUtil.a.length);
        j1 += NalUnitUtil.a.length;
        System.arraycopy(parsablebytearray.a, parsablebytearray.d(), abyte0, j1, l2);
        j1 += l2;
        parsablebytearray.c(l2);
        l1++;
        if (true) goto _L8; else goto _L7
_L7:
        continue; /* Loop/switch isn't completed */
_L9:
        return Pair.create(parsablebytearray, Integer.valueOf((i2 & 3) + 1));
_L13:
        parsablebytearray = Collections.singletonList(abyte0);
          goto _L9
_L3:
        j1++;
          goto _L10
        k1++;
          goto _L11
_L6:
        if (i1 != 0) goto _L13; else goto _L12
_L12:
        parsablebytearray = null;
          goto _L9
    }

    public final MediaFormat a(long l1)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = a;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 12: default 120
    //                   -2095576542: 262
    //                   -2095575984: 230
    //                   -1730367663: 311
    //                   -1482641357: 362
    //                   -538363189: 246
    //                   -538363109: 278
    //                   62923557: 345
    //                   62923603: 379
    //                   82338133: 198
    //                   82338134: 214
    //                   855502857: 294
    //                   1951062397: 328;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        char c1 = '\uFFFF';
_L26:
        c1;
        JVM INSTR tableswitch 0 11: default 188
    //                   0 396
    //                   1 430
    //                   2 442
    //                   3 442
    //                   4 442
    //                   5 472
    //                   6 519
    //                   7 566
    //                   8 586
    //                   9 665
    //                   10 683
    //                   11 697;
           goto _L14 _L15 _L16 _L17 _L17 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L14:
        throw new ParserException("Unrecognized codec identifier.");
_L10:
        if (!((String) (obj1)).equals("V_VP8")) goto _L1; else goto _L25
_L25:
        c1 = '\0';
          goto _L26
_L11:
        if (!((String) (obj1)).equals("V_VP9")) goto _L1; else goto _L27
_L27:
        c1 = '\001';
          goto _L26
_L3:
        if (!((String) (obj1)).equals("V_MPEG4/ISO/SP")) goto _L1; else goto _L28
_L28:
        c1 = '\002';
          goto _L26
_L6:
        if (!((String) (obj1)).equals("V_MPEG4/ISO/ASP")) goto _L1; else goto _L29
_L29:
        c1 = '\003';
          goto _L26
_L2:
        if (!((String) (obj1)).equals("V_MPEG4/ISO/AP")) goto _L1; else goto _L30
_L30:
        c1 = '\004';
          goto _L26
_L7:
        if (!((String) (obj1)).equals("V_MPEG4/ISO/AVC")) goto _L1; else goto _L31
_L31:
        c1 = '\005';
          goto _L26
_L12:
        if (!((String) (obj1)).equals("V_MPEGH/ISO/HEVC")) goto _L1; else goto _L32
_L32:
        c1 = '\006';
          goto _L26
_L4:
        if (!((String) (obj1)).equals("A_VORBIS")) goto _L1; else goto _L33
_L33:
        c1 = '\007';
          goto _L26
_L13:
        if (!((String) (obj1)).equals("A_OPUS")) goto _L1; else goto _L34
_L34:
        c1 = '\b';
          goto _L26
_L8:
        if (!((String) (obj1)).equals("A_AAC")) goto _L1; else goto _L35
_L35:
        c1 = '\t';
          goto _L26
_L5:
        if (!((String) (obj1)).equals("A_MPEG/L3")) goto _L1; else goto _L36
_L36:
        c1 = '\n';
          goto _L26
_L9:
        if (!((String) (obj1)).equals("A_AC3")) goto _L1; else goto _L37
_L37:
        c1 = '\013';
          goto _L26
_L15:
        obj1 = null;
        obj = "video/x-vnd.on2.vp8";
        c1 = '\uFFFF';
_L39:
        if (MimeTypes.a(((String) (obj))))
        {
            return MediaFormat.b(((String) (obj)), c1, l1, l, m, ((List) (obj1)));
        }
        break; /* Loop/switch isn't completed */
_L16:
        obj1 = null;
        obj = "video/x-vnd.on2.vp9";
        c1 = '\uFFFF';
        continue; /* Loop/switch isn't completed */
_L17:
        if (h != null)
        {
            obj = Collections.singletonList(h);
        }
        obj1 = obj;
        obj = "video/mp4v-es";
        c1 = '\uFFFF';
        continue; /* Loop/switch isn't completed */
_L18:
        obj = a(new ParsableByteArray(h));
        obj1 = (List)((Pair) (obj)).first;
        k = ((Integer)((Pair) (obj)).second).intValue();
        c1 = '\uFFFF';
        obj = "video/avc";
        continue; /* Loop/switch isn't completed */
_L19:
        obj = b(new ParsableByteArray(h));
        obj1 = (List)((Pair) (obj)).first;
        k = ((Integer)((Pair) (obj)).second).intValue();
        c1 = '\uFFFF';
        obj = "video/hevc";
        continue; /* Loop/switch isn't completed */
_L20:
        obj = "audio/vorbis";
        c1 = '\u2000';
        obj1 = a(h);
        continue; /* Loop/switch isn't completed */
_L21:
        obj = "audio/opus";
        c1 = '\u1680';
        obj1 = new ArrayList(3);
        ((List) (obj1)).add(h);
        ((List) (obj1)).add(ByteBuffer.allocate(64).putLong(n).array());
        ((List) (obj1)).add(ByteBuffer.allocate(64).putLong(o).array());
        continue; /* Loop/switch isn't completed */
_L22:
        obj = "audio/mp4a-latm";
        obj1 = Collections.singletonList(h);
        c1 = '\uFFFF';
        continue; /* Loop/switch isn't completed */
_L23:
        obj1 = null;
        obj = "audio/mpeg";
        c1 = '\u1000';
        continue; /* Loop/switch isn't completed */
_L24:
        obj1 = null;
        obj = "audio/ac3";
        c1 = '\uFFFF';
        if (true) goto _L39; else goto _L38
_L38:
        if (MimeTypes.b(((String) (obj))))
        {
            return MediaFormat.a(((String) (obj)), c1, l1, i, j, ((List) (obj1)));
        } else
        {
            throw new ParserException("Unexpected MIME type.");
        }
    }

    private ()
    {
        b = -1;
        c = -1;
        d = -1;
        i = -1;
        j = -1;
        k = -1;
        l = -1;
        m = -1;
        n = -1L;
        o = -1L;
    }

    o(byte byte0)
    {
        this();
    }
}

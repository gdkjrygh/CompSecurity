// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import com.google.android.exoplayer.ParserException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class bcx
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
    public bce p;

    private bcx()
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

    bcx(byte byte0)
    {
        this();
    }

    private static Pair a(bec bec1)
    {
        boolean flag = false;
        ArrayList arraylist;
        int i1;
        int j1;
        int k1;
        boolean flag1;
        try
        {
            bec1.a(4);
            j1 = (bec1.c() & 3) + 1;
        }
        // Misplaced declaration of an exception variable
        catch (bec bec1)
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
        bds.b(flag1);
        arraylist = new ArrayList();
        k1 = bec1.c();
        i1 = 0;
_L2:
        if (i1 >= (k1 & 0x1f))
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(beb.a(bec1));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        k1 = bec1.c();
        i1 = ((flag) ? 1 : 0);
_L4:
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(beb.a(bec1));
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        bec1 = Pair.create(arraylist, Integer.valueOf(j1));
        return bec1;
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

    private static Pair b(bec bec1)
    {
        int i1;
        int j1;
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        try
        {
            bec1.a(21);
            i2 = bec1.c();
            j2 = bec1.c();
            l1 = bec1.b;
        }
        // Misplaced declaration of an exception variable
        catch (bec bec1)
        {
            throw new ParserException("Error parsing HEVC codec private");
        }
        j1 = 0;
        i1 = 0;
_L10:
        if (j1 >= j2) goto _L2; else goto _L1
_L1:
        bec1.b(1);
        k2 = bec1.d();
        k1 = 0;
_L4:
        if (k1 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = bec1.d();
        i1 += l2 + 4;
        bec1.b(l2);
        k1++;
        if (true) goto _L4; else goto _L3
_L2:
        bec1.a(l1);
        abyte0 = new byte[i1];
        j1 = 0;
        l1 = 0;
_L11:
        if (j1 >= j2) goto _L6; else goto _L5
_L5:
        bec1.b(1);
        k2 = bec1.d();
        k1 = 0;
_L8:
        if (k1 >= k2)
        {
            continue; /* Loop/switch isn't completed */
        }
        l2 = bec1.d();
        abyte1 = beb.a;
        abyte2 = beb.a;
        System.arraycopy(abyte1, 0, abyte0, l1, 4);
        abyte1 = beb.a;
        l1 += 4;
        System.arraycopy(bec1.a, bec1.b, abyte0, l1, l2);
        l1 += l2;
        bec1.b(l2);
        k1++;
        if (true) goto _L8; else goto _L7
_L7:
        continue; /* Loop/switch isn't completed */
_L9:
        return Pair.create(bec1, Integer.valueOf((i2 & 3) + 1));
_L13:
        bec1 = Collections.singletonList(abyte0);
          goto _L9
_L3:
        j1++;
          goto _L10
        j1++;
          goto _L11
_L6:
        if (i1 != 0) goto _L13; else goto _L12
_L12:
        bec1 = null;
          goto _L9
    }

    public final azi a(long l1)
    {
        Object obj;
        char c1;
        obj = a;
        c1 = '\uFFFF';
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 12: default 120
    //                   -2095576542: 254
    //                   -2095575984: 224
    //                   -1730367663: 300
    //                   -1482641357: 348
    //                   -538363189: 239
    //                   -538363109: 269
    //                   62923557: 332
    //                   62923603: 364
    //                   82338133: 194
    //                   82338134: 209
    //                   855502857: 284
    //                   1951062397: 316;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        c1;
        JVM INSTR tableswitch 0 11: default 184
    //                   0 380
    //                   1 414
    //                   2 426
    //                   3 426
    //                   4 426
    //                   5 458
    //                   6 505
    //                   7 552
    //                   8 572
    //                   9 651
    //                   10 669
    //                   11 683;
           goto _L14 _L15 _L16 _L17 _L17 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L14:
        throw new ParserException("Unrecognized codec identifier.");
_L10:
        if (((String) (obj)).equals("V_VP8"))
        {
            c1 = '\0';
        }
          goto _L1
_L11:
        if (((String) (obj)).equals("V_VP9"))
        {
            c1 = '\001';
        }
          goto _L1
_L3:
        if (((String) (obj)).equals("V_MPEG4/ISO/SP"))
        {
            c1 = '\002';
        }
          goto _L1
_L6:
        if (((String) (obj)).equals("V_MPEG4/ISO/ASP"))
        {
            c1 = '\003';
        }
          goto _L1
_L2:
        if (((String) (obj)).equals("V_MPEG4/ISO/AP"))
        {
            c1 = '\004';
        }
          goto _L1
_L7:
        if (((String) (obj)).equals("V_MPEG4/ISO/AVC"))
        {
            c1 = '\005';
        }
          goto _L1
_L12:
        if (((String) (obj)).equals("V_MPEGH/ISO/HEVC"))
        {
            c1 = '\006';
        }
          goto _L1
_L4:
        if (((String) (obj)).equals("A_VORBIS"))
        {
            c1 = '\007';
        }
          goto _L1
_L13:
        if (((String) (obj)).equals("A_OPUS"))
        {
            c1 = '\b';
        }
          goto _L1
_L8:
        if (((String) (obj)).equals("A_AAC"))
        {
            c1 = '\t';
        }
          goto _L1
_L5:
        if (((String) (obj)).equals("A_MPEG/L3"))
        {
            c1 = '\n';
        }
          goto _L1
_L9:
        if (((String) (obj)).equals("A_AC3"))
        {
            c1 = '\013';
        }
          goto _L1
_L15:
        Object obj1;
        obj1 = null;
        obj = "video/x-vnd.on2.vp8";
        c1 = '\uFFFF';
_L26:
        if (bea.b(((String) (obj))))
        {
            return azi.a(((String) (obj)), c1, l1, l, m, ((List) (obj1)));
        }
        break; /* Loop/switch isn't completed */
_L16:
        obj1 = null;
        obj = "video/x-vnd.on2.vp9";
        c1 = '\uFFFF';
        continue; /* Loop/switch isn't completed */
_L17:
        if (h == null)
        {
            obj = null;
        } else
        {
            obj = Collections.singletonList(h);
        }
        obj1 = obj;
        obj = "video/mp4v-es";
        c1 = '\uFFFF';
        continue; /* Loop/switch isn't completed */
_L18:
        obj = a(new bec(h));
        obj1 = (List)((Pair) (obj)).first;
        k = ((Integer)((Pair) (obj)).second).intValue();
        c1 = '\uFFFF';
        obj = "video/avc";
        continue; /* Loop/switch isn't completed */
_L19:
        obj = b(new bec(h));
        obj1 = (List)((Pair) (obj)).first;
        k = ((Integer)((Pair) (obj)).second).intValue();
        c1 = '\uFFFF';
        obj = "video/hevc";
        continue; /* Loop/switch isn't completed */
_L20:
        c1 = '\u2000';
        obj1 = a(h);
        obj = "audio/vorbis";
        continue; /* Loop/switch isn't completed */
_L21:
        c1 = '\u1680';
        obj1 = new ArrayList(3);
        ((List) (obj1)).add(h);
        ((List) (obj1)).add(ByteBuffer.allocate(64).putLong(n).array());
        ((List) (obj1)).add(ByteBuffer.allocate(64).putLong(o).array());
        obj = "audio/opus";
        continue; /* Loop/switch isn't completed */
_L22:
        obj1 = Collections.singletonList(h);
        obj = "audio/mp4a-latm";
        c1 = '\uFFFF';
        continue; /* Loop/switch isn't completed */
_L23:
        c1 = '\u1000';
        obj1 = null;
        obj = "audio/mpeg";
        continue; /* Loop/switch isn't completed */
_L24:
        obj1 = null;
        obj = "audio/ac3";
        c1 = '\uFFFF';
        if (true) goto _L26; else goto _L25
_L25:
        if (bea.c(((String) (obj))))
        {
            return azi.a(((String) (obj)), c1, l1, i, j, 1.0F, ((List) (obj1)));
        } else
        {
            throw new ParserException("Unexpected MIME type.");
        }
    }
}

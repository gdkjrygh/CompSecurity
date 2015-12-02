// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

public class RandSignFile
{
    private class a
    {

        public int a;
        public int b;
        public int c;
        public short d;
        public short e;
        public short f;
        public byte g[];
        public byte h[];
        public int i;
        public int j;
        public byte k[];
        final RandSignFile l;

        public int a()
        {
label0:
            {
                int i1;
                try
                {
                    a = RandSignFile.L2B_int(l.b.readInt());
                    if (a != RandSignFile.a())
                    {
                        return RandSignFile.RFERR_FILETYPE;
                    }
                    b = RandSignFile.L2B_int(l.b.readInt());
                    c = RandSignFile.L2B_int(l.b.readInt());
                    d = RandSignFile.L2B_short(l.b.readShort());
                    if (d != RandSignFile.b())
                    {
                        return RandSignFile.RFERR_NOT_SUPPORT;
                    }
                    e = RandSignFile.L2B_short(l.b.readShort());
                    if (e != 0)
                    {
                        return RandSignFile.RFERR_NOT_SUPPORT;
                    }
                    f = RandSignFile.L2B_short(l.b.readShort());
                    if (f != 65535)
                    {
                        return RandSignFile.RFERR_NOT_SUPPORT;
                    }
                    if (l.b.read(g) != 32)
                    {
                        return RandSignFile.RFERR_FILETYPE;
                    }
                    if (l.b.read(h) != 32)
                    {
                        return RandSignFile.RFERR_FILETYPE;
                    }
                    i = RandSignFile.L2B_int(l.b.readInt());
                    j = RandSignFile.L2B_int(l.b.readInt());
                    if (l.b.read(k) == 128)
                    {
                        break label0;
                    }
                    i1 = RandSignFile.RFERR_FILETYPE;
                }
                catch (IOException ioexception)
                {
                    return RandSignFile.RFERR_FILEOP;
                }
                return i1;
            }
            return RandSignFile.RFERR_OK;
        }

        private a()
        {
            l = RandSignFile.this;
            super();
            g = new byte[32];
            h = new byte[32];
            k = new byte[128];
        }

        a(a a1)
        {
            this();
        }
    }


    public static int RFERR_BADKEY = -6;
    public static int RFERR_BADSIGN = -7;
    public static int RFERR_FILEOP = -2;
    public static int RFERR_FILETYPE = -1;
    public static int RFERR_INVALID_ARGS = -4;
    public static int RFERR_NOT_SUPPORT = -3;
    public static int RFERR_OK = 0;
    public static int RFERR_UNKNOWN = -5;
    private static int e = 0x51334546;
    private static int f = 1;
    private static int g = 90;
    a a;
    RandomAccessFile b;
    private byte c[];
    private PublicKey d;

    public RandSignFile()
    {
        byte abyte0[] = new byte[162];
        abyte0[0] = 48;
        abyte0[1] = -127;
        abyte0[2] = -97;
        abyte0[3] = 48;
        abyte0[4] = 13;
        abyte0[5] = 6;
        abyte0[6] = 9;
        abyte0[7] = 42;
        abyte0[8] = -122;
        abyte0[9] = 72;
        abyte0[10] = -122;
        abyte0[11] = -9;
        abyte0[12] = 13;
        abyte0[13] = 1;
        abyte0[14] = 1;
        abyte0[15] = 1;
        abyte0[16] = 5;
        abyte0[18] = 3;
        abyte0[19] = -127;
        abyte0[20] = -115;
        abyte0[22] = 48;
        abyte0[23] = -127;
        abyte0[24] = -119;
        abyte0[25] = 2;
        abyte0[26] = -127;
        abyte0[27] = -127;
        abyte0[29] = -19;
        abyte0[30] = 76;
        abyte0[31] = -11;
        abyte0[32] = -83;
        abyte0[33] = 36;
        abyte0[34] = -110;
        abyte0[35] = -75;
        abyte0[36] = 45;
        abyte0[37] = -56;
        abyte0[38] = 36;
        abyte0[39] = 7;
        abyte0[40] = -107;
        abyte0[41] = -75;
        abyte0[42] = 66;
        abyte0[43] = -102;
        abyte0[44] = 56;
        abyte0[45] = 105;
        abyte0[46] = -72;
        abyte0[47] = -34;
        abyte0[48] = -5;
        abyte0[49] = 107;
        abyte0[50] = -107;
        abyte0[51] = -102;
        abyte0[52] = -91;
        abyte0[53] = -27;
        abyte0[54] = 116;
        abyte0[55] = 37;
        abyte0[56] = -115;
        abyte0[57] = -47;
        abyte0[58] = 45;
        abyte0[59] = -44;
        abyte0[60] = -34;
        abyte0[61] = 62;
        abyte0[62] = -56;
        abyte0[63] = -13;
        abyte0[64] = 6;
        abyte0[65] = 117;
        abyte0[66] = 18;
        abyte0[67] = -8;
        abyte0[68] = -23;
        abyte0[69] = 13;
        abyte0[70] = 55;
        abyte0[71] = -5;
        abyte0[72] = -27;
        abyte0[73] = -19;
        abyte0[74] = -50;
        abyte0[75] = 7;
        abyte0[76] = -54;
        abyte0[77] = 1;
        abyte0[78] = -61;
        abyte0[79] = -52;
        abyte0[80] = 85;
        abyte0[81] = -55;
        abyte0[82] = 97;
        abyte0[83] = -52;
        abyte0[84] = 126;
        abyte0[85] = 43;
        abyte0[86] = -23;
        abyte0[87] = 112;
        abyte0[88] = -65;
        abyte0[89] = 99;
        abyte0[90] = 85;
        abyte0[91] = -71;
        abyte0[92] = -112;
        abyte0[93] = -69;
        abyte0[94] = 94;
        abyte0[95] = -48;
        abyte0[96] = 64;
        abyte0[97] = 84;
        abyte0[98] = 41;
        abyte0[99] = 64;
        abyte0[100] = -28;
        abyte0[101] = -23;
        abyte0[102] = 59;
        abyte0[103] = 62;
        abyte0[104] = 42;
        abyte0[105] = -38;
        abyte0[106] = -73;
        abyte0[107] = -46;
        abyte0[108] = 100;
        abyte0[109] = 125;
        abyte0[110] = -114;
        abyte0[111] = -100;
        abyte0[112] = -57;
        abyte0[113] = 101;
        abyte0[114] = -76;
        abyte0[115] = -66;
        abyte0[116] = -63;
        abyte0[117] = 47;
        abyte0[118] = -123;
        abyte0[119] = 97;
        abyte0[120] = 84;
        abyte0[121] = -48;
        abyte0[122] = -91;
        abyte0[123] = -32;
        abyte0[124] = 7;
        abyte0[125] = -114;
        abyte0[126] = 16;
        abyte0[127] = 7;
        abyte0[128] = 21;
        abyte0[129] = -70;
        abyte0[130] = 67;
        abyte0[131] = -50;
        abyte0[132] = 127;
        abyte0[133] = -20;
        abyte0[134] = -36;
        abyte0[135] = -72;
        abyte0[136] = -17;
        abyte0[137] = 30;
        abyte0[138] = 104;
        abyte0[139] = -94;
        abyte0[140] = -112;
        abyte0[141] = -23;
        abyte0[142] = 66;
        abyte0[143] = -23;
        abyte0[144] = -107;
        abyte0[145] = 2;
        abyte0[146] = 53;
        abyte0[147] = -85;
        abyte0[148] = -90;
        abyte0[149] = 24;
        abyte0[150] = -111;
        abyte0[151] = -11;
        abyte0[152] = -46;
        abyte0[153] = -35;
        abyte0[154] = -115;
        abyte0[155] = 30;
        abyte0[156] = -119;
        abyte0[157] = 2;
        abyte0[158] = 3;
        abyte0[159] = 1;
        abyte0[161] = 1;
        c = abyte0;
        d = null;
        a = null;
        b = null;
    }

    public static int L2B_int(int i)
    {
        return ((i & 0xff) << 24) + ((0xff00 & i) << 8) + ((0xff0000 & i) >> 8) + (i >> 24 & 0xff);
    }

    public static short L2B_short(short word0)
    {
        return (short)((short)((word0 & 0xff) << 8) + (short)((0xff00 & word0) >> 8));
    }

    static int a()
    {
        return e;
    }

    static int b()
    {
        return f;
    }

    private int c()
    {
        Signature signature;
        PublicKey publickey;
        byte abyte0[];
        int i;
        try
        {
            signature = Signature.getInstance("SHA1WithRSA");
            publickey = d();
        }
        catch (Exception exception)
        {
            return RFERR_UNKNOWN;
        }
        if (publickey != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        return RFERR_BADKEY;
        signature.initVerify(publickey);
        abyte0 = new byte[1024];
        b.seek(0L);
        if (b.read(abyte0, 0, g) != g)
        {
            return RFERR_BADSIGN;
        }
        signature.update(abyte0, 0, g);
        b.skipBytes(a.b - g);
_L1:
        i = b.read(abyte0);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (signature.verify(a.k))
        {
            return RFERR_OK;
        }
        break MISSING_BLOCK_LABEL_135;
        signature.update(abyte0, 0, i);
          goto _L1
        int j = RFERR_BADSIGN;
        return j;
    }

    private PublicKey d()
    {
        if (d != null)
        {
            return d;
        }
        Object obj;
        try
        {
            obj = new X509EncodedKeySpec(c);
            d = KeyFactory.getInstance("RSA").generatePublic(((java.security.spec.KeySpec) (obj)));
            obj = d;
        }
        catch (Exception exception)
        {
            return null;
        }
        return ((PublicKey) (obj));
    }

    public int Close()
        throws IOException
    {
        if (b == null)
        {
            return RFERR_INVALID_ARGS;
        } else
        {
            b.close();
            b = null;
            a = null;
            d = null;
            return RFERR_OK;
        }
    }

    public int Open(String s)
    {
        int i;
        b = new RandomAccessFile(s, "r");
        a = new a(null);
        i = a.a();
        if (i != 0)
        {
            return i;
        }
        int j = c();
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        SeekToData();
        i = RFERR_OK;
        return i;
        s;
        i = RFERR_UNKNOWN;
        return i;
    }

    public int Read(byte abyte0[])
        throws IOException
    {
        if (b == null)
        {
            return -1;
        } else
        {
            return b.read(abyte0);
        }
    }

    public int SeekToData()
    {
        if (b == null || a == null)
        {
            return RFERR_FILEOP;
        }
        int i;
        try
        {
            b.seek(a.b);
            i = RFERR_OK;
        }
        catch (Exception exception)
        {
            return RFERR_UNKNOWN;
        }
        return i;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.util.encoders:
//            Encoder

public class Base64Encoder
    implements Encoder
{

    protected final byte decodingTable[] = new byte[128];
    protected final byte encodingTable[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    protected byte padding;

    public Base64Encoder()
    {
        padding = 61;
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputstream, char c, char c1, char c2, char c3)
        throws IOException
    {
        if (c2 == padding)
        {
            outputstream.write(decodingTable[c] << 2 | decodingTable[c1] >> 4);
            return 1;
        }
        if (c3 == padding)
        {
            c = decodingTable[c];
            c1 = decodingTable[c1];
            c2 = decodingTable[c2];
            outputstream.write(c << 2 | c1 >> 4);
            outputstream.write(c1 << 4 | c2 >> 2);
            return 2;
        } else
        {
            c = decodingTable[c];
            c1 = decodingTable[c1];
            c2 = decodingTable[c2];
            c3 = decodingTable[c3];
            outputstream.write(c << 2 | c1 >> 4);
            outputstream.write(c1 << 4 | c2 >> 2);
            outputstream.write(c2 << 6 | c3);
            return 3;
        }
    }

    private boolean ignore(char c)
    {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    private int nextI(String s, int i, int j)
    {
        for (; i < j && ignore(s.charAt(i)); i++) { }
        return i;
    }

    private int nextI(byte abyte0[], int i, int j)
    {
        for (; i < j && ignore((char)abyte0[i]); i++) { }
        return i;
    }

    public int decode(String s, OutputStream outputstream)
        throws IOException
    {
        int i = s.length();
        int j;
        do
        {
            if (i <= 0 || !ignore(s.charAt(i - 1)))
            {
                int l = i - 4;
                int k = nextI(s, 0, l);
                for (j = 0; k < l; j += 3)
                {
                    byte byte0 = decodingTable[s.charAt(k)];
                    int i1 = nextI(s, k + 1, l);
                    k = decodingTable[s.charAt(i1)];
                    int j1 = nextI(s, i1 + 1, l);
                    i1 = decodingTable[s.charAt(j1)];
                    j1 = nextI(s, j1 + 1, l);
                    byte byte1 = decodingTable[s.charAt(j1)];
                    outputstream.write(byte0 << 2 | k >> 4);
                    outputstream.write(k << 4 | i1 >> 2);
                    outputstream.write(i1 << 6 | byte1);
                    k = nextI(s, j1 + 1, l);
                }

                break;
            }
            i--;
        } while (true);
        return decodeLastBlock(outputstream, s.charAt(i - 4), s.charAt(i - 3), s.charAt(i - 2), s.charAt(i - 1)) + j;
    }

    public int decode(byte abyte0[], int i, int j, OutputStream outputstream)
        throws IOException
    {
        j = i + j;
        do
        {
            if (j <= i || !ignore((char)abyte0[j - 1]))
            {
                int l = j - 4;
                int k = nextI(abyte0, i, l);
                for (i = 0; k < l; i += 3)
                {
                    byte byte0 = decodingTable[abyte0[k]];
                    int i1 = nextI(abyte0, k + 1, l);
                    k = decodingTable[abyte0[i1]];
                    int j1 = nextI(abyte0, i1 + 1, l);
                    i1 = decodingTable[abyte0[j1]];
                    j1 = nextI(abyte0, j1 + 1, l);
                    byte byte1 = decodingTable[abyte0[j1]];
                    outputstream.write(byte0 << 2 | k >> 4);
                    outputstream.write(k << 4 | i1 >> 2);
                    outputstream.write(i1 << 6 | byte1);
                    k = nextI(abyte0, j1 + 1, l);
                }

                break;
            }
            j--;
        } while (true);
        return decodeLastBlock(outputstream, (char)abyte0[j - 4], (char)abyte0[j - 3], (char)abyte0[j - 2], (char)abyte0[j - 1]) + i;
    }

    public int encode(byte abyte0[], int i, int j, OutputStream outputstream)
        throws IOException
    {
        int k;
        int l;
        k = j % 3;
        l = j - k;
        for (j = i; j < i + l; j += 3)
        {
            int i1 = abyte0[j] & 0xff;
            int j1 = abyte0[j + 1] & 0xff;
            int k1 = abyte0[j + 2] & 0xff;
            outputstream.write(encodingTable[i1 >>> 2 & 0x3f]);
            outputstream.write(encodingTable[(i1 << 4 | j1 >>> 4) & 0x3f]);
            outputstream.write(encodingTable[(j1 << 2 | k1 >>> 6) & 0x3f]);
            outputstream.write(encodingTable[k1 & 0x3f]);
        }

        k;
        JVM INSTR tableswitch 0 2: default 164
    //                   0 164
    //                   1 182
    //                   2 246;
           goto _L1 _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_246;
_L4:
        j = l / 3;
        if (k == 0)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        return i + j * 4;
_L2:
        i = abyte0[i + l] & 0xff;
        outputstream.write(encodingTable[i >>> 2 & 0x3f]);
        outputstream.write(encodingTable[i << 4 & 0x3f]);
        outputstream.write(padding);
        outputstream.write(padding);
          goto _L4
        j = abyte0[i + l] & 0xff;
        i = abyte0[i + l + 1] & 0xff;
        outputstream.write(encodingTable[j >>> 2 & 0x3f]);
        outputstream.write(encodingTable[(j << 4 | i >>> 4) & 0x3f]);
        outputstream.write(encodingTable[i << 2 & 0x3f]);
        outputstream.write(padding);
          goto _L4
    }

    protected void initialiseDecodingTable()
    {
        for (int i = 0; i < encodingTable.length; i++)
        {
            decodingTable[encodingTable[i]] = (byte)i;
        }

    }
}

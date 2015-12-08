// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;


// Referenced classes of package org.bouncycastle.util.encoders:
//            Translator

public class BufferedDecoder
{

    protected byte buf[];
    protected int bufOff;
    protected Translator translator;

    public BufferedDecoder(Translator translator1, int i)
    {
        translator = translator1;
        if (i % translator1.getEncodedBlockSize() != 0)
        {
            throw new IllegalArgumentException("buffer size not multiple of input block size");
        } else
        {
            buf = new byte[i];
            bufOff = 0;
            return;
        }
    }

    public int processByte(byte byte0, byte abyte0[], int i)
    {
        int j = 0;
        byte abyte1[] = buf;
        int k = bufOff;
        bufOff = k + 1;
        abyte1[k] = byte0;
        if (bufOff == buf.length)
        {
            j = translator.decode(buf, 0, buf.length, abyte0, i);
            bufOff = 0;
        }
        return j;
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int j1 = 0;
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int k1 = buf.length - bufOff;
        int i1 = i;
        int l = j;
        if (j > k1)
        {
            System.arraycopy(abyte0, i, buf, bufOff, k1);
            j1 = 0 + translator.decode(buf, 0, buf.length, abyte1, k);
            bufOff = 0;
            j -= k1;
            i += k1;
            i1 = j - j % buf.length;
            k = translator.decode(abyte0, i, i1, abyte1, k + j1);
            l = j - i1;
            i1 = i + i1;
            j1 = k + j1;
        }
        if (l != 0)
        {
            System.arraycopy(abyte0, i1, buf, bufOff, l);
            bufOff = bufOff + l;
        }
        return j1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import kik.a.f.g;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

// Referenced classes of package kik.android.net.a:
//            h

public final class a
    implements Closeable, h
{

    private final RandomAccessFile a;
    private final PaddedBufferedBlockCipher b;
    private byte c[];
    private byte d[];
    private byte e[];
    private int f;
    private int g;
    private int h;
    private int i;

    public a(File file, String s, byte abyte0[], byte abyte1[], boolean flag)
    {
        this(new RandomAccessFile(file, s), abyte0, abyte1, flag);
    }

    private a(RandomAccessFile randomaccessfile, byte abyte0[], byte abyte1[], boolean flag)
    {
        c = new byte[4096];
        d = new byte[4096];
        e = new byte[4112];
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        a = randomaccessfile;
        b = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESEngine()), new PKCS7Padding());
        randomaccessfile = new ParametersWithIV(new KeyParameter(abyte0), abyte1);
        b.init(flag, randomaccessfile);
    }

    private int a(byte abyte0[], int j, int k)
    {
        k = Math.min(k, g);
        if (k > 0)
        {
            System.arraycopy(e, f, abyte0, j, k);
        }
        if (k < g)
        {
            System.arraycopy(e, f + k, e, 0, g - k);
        }
        g = g - k;
        f = 0;
        i = i + k;
        return k;
    }

    private void b()
    {
        b.reset();
        a.seek(0L);
        h = 0;
        i = 0;
        f = 0;
        g = 0;
    }

    public final int a(byte abyte0[], int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            i1 = a(abyte0, 0, j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new g(abyte0.getMessage());
        }
        l = i1 + 0;
        k = i1 + 0;
        j -= i1;
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((long)h == a.length())
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = Math.min(j, d.length);
        i1 = a.read(d, 0, i1);
        h = h + i1;
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        j1 = g;
        g = b.processBytes(d, 0, i1, e, f + g) + j1;
        if ((long)h == a.length())
        {
            g = g + b.doFinal(e, f + g);
        }
        i1 = a(abyte0, l, j);
        l = i1 + l;
        k += i1;
        j -= i1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_25;
_L1:
        return k;
    }

    public final long a()
    {
        return (long)b.getOutputSize((int)a.length());
    }

    public final void a(long l)
    {
        int j = (int)l;
        if (j < h)
        {
            b();
        }
        if ((long)j > a())
        {
            throw new IOException("Cannot seek beyond the end of file");
        }
        if ((long)j == a())
        {
            b();
            i = j;
        }
        while (i < j) 
        {
            int k = Math.min(j - i, c.length);
            a(c, k);
        }
    }

    public final void close()
    {
        a.close();
    }
}

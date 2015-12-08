// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            a, TlsNullCompression, TlsNullCipher, TlsUtils, 
//            TlsCipher, TlsCompression, TlsProtocolHandler

final class b
{

    private TlsProtocolHandler a;
    private InputStream b;
    private OutputStream c;
    private a d;
    private TlsCompression e;
    private TlsCompression f;
    private TlsCipher g;
    private TlsCipher h;
    private ByteArrayOutputStream i;

    b(TlsProtocolHandler tlsprotocolhandler, InputStream inputstream, OutputStream outputstream)
    {
        e = null;
        f = null;
        g = null;
        h = null;
        i = new ByteArrayOutputStream();
        a = tlsprotocolhandler;
        b = inputstream;
        c = outputstream;
        d = new a();
        e = new TlsNullCompression();
        f = e;
        g = new TlsNullCipher();
        h = g;
    }

    private static byte[] doFinal(a a1)
    {
        byte abyte0[] = new byte[a1.getDigestSize()];
        a1.doFinal(abyte0, 0);
        return abyte0;
    }

    private byte[] getBufferContents()
    {
        byte abyte0[] = i.toByteArray();
        i.reset();
        return abyte0;
    }

    final void clientCipherSpecDecided(TlsCompression tlscompression, TlsCipher tlscipher)
    {
        f = tlscompression;
        h = tlscipher;
    }

    protected final void close()
    {
        IOException ioexception = null;
        try
        {
            b.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        try
        {
            c.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        if (ioexception != null)
        {
            throw ioexception;
        } else
        {
            return;
        }
    }

    protected final byte[] decodeAndVerify(short word0, InputStream inputstream, int j)
    {
        byte abyte0[] = new byte[j];
        TlsUtils.readFully(abyte0, inputstream);
        inputstream = g.decodeCiphertext(word0, abyte0, 0, j);
        OutputStream outputstream = e.decompress(i);
        if (outputstream == i)
        {
            return inputstream;
        } else
        {
            outputstream.write(inputstream, 0, inputstream.length);
            outputstream.flush();
            return getBufferContents();
        }
    }

    protected final void flush()
    {
        c.flush();
    }

    final byte[] getCurrentHash()
    {
        return doFinal(new a(d));
    }

    public final void readData()
    {
        short word0 = TlsUtils.readUint8(b);
        TlsUtils.checkVersion(b, a);
        int j = TlsUtils.readUint16(b);
        byte abyte0[] = decodeAndVerify(word0, b, j);
        a.processData(word0, abyte0, 0, abyte0.length);
    }

    final void serverClientSpecReceived()
    {
        e = f;
        g = h;
    }

    final void updateHandshakeData(byte abyte0[], int j, int k)
    {
        d.update(abyte0, j, k);
    }

    protected final void writeMessage(short word0, byte abyte0[], int j, int k)
    {
        if (word0 == 22)
        {
            updateHandshakeData(abyte0, j, k);
        }
        byte abyte1[] = f.compress(i);
        if (abyte1 == i)
        {
            abyte0 = h.encodePlaintext(word0, abyte0, j, k);
        } else
        {
            abyte1.write(abyte0, j, k);
            abyte1.flush();
            abyte0 = getBufferContents();
            abyte0 = h.encodePlaintext(word0, abyte0, 0, abyte0.length);
        }
        abyte1 = new byte[abyte0.length + 5];
        TlsUtils.writeUint8(word0, abyte1, 0);
        TlsUtils.writeVersion(abyte1, 1);
        TlsUtils.writeUint16(abyte0.length, abyte1, 3);
        System.arraycopy(abyte0, 0, abyte1, 5, abyte0.length);
        c.write(abyte1);
        c.flush();
    }
}

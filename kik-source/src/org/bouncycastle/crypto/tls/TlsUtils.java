// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.TBSCertificateStructure;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.Streams;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsFatalAlert, TlsProtocolHandler

public class TlsUtils
{

    public TlsUtils()
    {
    }

    protected static byte[] PRF(byte abyte0[], String s, byte abyte1[], int i)
    {
        int j = 0;
        byte abyte3[] = Strings.d(s);
        int k = (abyte0.length + 1) / 2;
        s = new byte[k];
        byte abyte2[] = new byte[k];
        System.arraycopy(abyte0, 0, s, 0, k);
        System.arraycopy(abyte0, abyte0.length - k, abyte2, 0, k);
        abyte0 = concat(abyte3, abyte1);
        abyte1 = new byte[i];
        abyte3 = new byte[i];
        hmac_hash(new MD5Digest(), s, abyte0, abyte3);
        hmac_hash(new SHA1Digest(), abyte2, abyte0, abyte1);
        for (; j < i; j++)
        {
            abyte1[j] = (byte)(abyte1[j] ^ abyte3[j]);
        }

        return abyte1;
    }

    protected static void checkVersion(InputStream inputstream, TlsProtocolHandler tlsprotocolhandler)
    {
        int i = inputstream.read();
        int j = inputstream.read();
        if (i != 3 || j != 1)
        {
            throw new TlsFatalAlert((short)70);
        } else
        {
            return;
        }
    }

    protected static void checkVersion(byte abyte0[], TlsProtocolHandler tlsprotocolhandler)
    {
        if (abyte0[0] != 3 || abyte0[1] != 1)
        {
            throw new TlsFatalAlert((short)70);
        } else
        {
            return;
        }
    }

    static byte[] concat(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = new byte[abyte0.length + abyte1.length];
        System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
        System.arraycopy(abyte1, 0, abyte2, abyte0.length, abyte1.length);
        return abyte2;
    }

    private static void hmac_hash(Digest digest, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        HMac hmac = new HMac(digest);
        KeyParameter keyparameter = new KeyParameter(abyte0);
        int j = digest.getDigestSize();
        int k = ((abyte2.length + j) - 1) / j;
        abyte0 = new byte[hmac.getMacSize()];
        byte abyte3[] = new byte[hmac.getMacSize()];
        int i = 0;
        for (digest = abyte1; i < k; digest = abyte0)
        {
            hmac.init(keyparameter);
            hmac.update(digest, 0, digest.length);
            hmac.doFinal(abyte0, 0);
            hmac.init(keyparameter);
            hmac.update(abyte0, 0, abyte0.length);
            hmac.update(abyte1, 0, abyte1.length);
            hmac.doFinal(abyte3, 0);
            System.arraycopy(abyte3, 0, abyte2, j * i, Math.min(j, abyte2.length - j * i));
            i++;
        }

    }

    protected static void readFully(byte abyte0[], InputStream inputstream)
    {
        if (Streams.a(inputstream, abyte0) != abyte0.length)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    protected static byte[] readOpaque16(InputStream inputstream)
    {
        byte abyte0[] = new byte[readUint16(inputstream)];
        readFully(abyte0, inputstream);
        return abyte0;
    }

    protected static byte[] readOpaque8(InputStream inputstream)
    {
        byte abyte0[] = new byte[readUint8(inputstream)];
        readFully(abyte0, inputstream);
        return abyte0;
    }

    protected static int readUint16(InputStream inputstream)
    {
        int i = inputstream.read();
        int j = inputstream.read();
        if ((i | j) < 0)
        {
            throw new EOFException();
        } else
        {
            return i << 8 | j;
        }
    }

    protected static int readUint24(InputStream inputstream)
    {
        int i = inputstream.read();
        int j = inputstream.read();
        int k = inputstream.read();
        if ((i | j | k) < 0)
        {
            throw new EOFException();
        } else
        {
            return i << 16 | j << 8 | k;
        }
    }

    protected static long readUint32(InputStream inputstream)
    {
        int i = inputstream.read();
        int j = inputstream.read();
        int k = inputstream.read();
        int l = inputstream.read();
        if ((i | j | k | l) < 0)
        {
            throw new EOFException();
        } else
        {
            long l1 = i;
            return (long)j << 16 | l1 << 24 | (long)k << 8 | (long)l;
        }
    }

    protected static short readUint8(InputStream inputstream)
    {
        int i = inputstream.read();
        if (i == -1)
        {
            throw new EOFException();
        } else
        {
            return (short)i;
        }
    }

    static void validateKeyUsage(X509CertificateStructure x509certificatestructure, int i)
    {
        x509certificatestructure = x509certificatestructure.e().j();
        if (x509certificatestructure != null)
        {
            x509certificatestructure = x509certificatestructure.a(X509Extension.c);
            if (x509certificatestructure != null && (KeyUsage.b(x509certificatestructure).e()[0] & 0xff & i) != i)
            {
                throw new TlsFatalAlert((short)46);
            }
        }
    }

    protected static void writeGMTUnixTime(byte abyte0[], int i)
    {
        int j = (int)(System.currentTimeMillis() / 1000L);
        abyte0[i] = (byte)(j >> 24);
        abyte0[i + 1] = (byte)(j >> 16);
        abyte0[i + 2] = (byte)(j >> 8);
        abyte0[i + 3] = (byte)j;
    }

    protected static void writeOpaque16(byte abyte0[], OutputStream outputstream)
    {
        writeUint16(abyte0.length, outputstream);
        outputstream.write(abyte0);
    }

    protected static void writeOpaque24(byte abyte0[], OutputStream outputstream)
    {
        writeUint24(abyte0.length, outputstream);
        outputstream.write(abyte0);
    }

    protected static void writeOpaque8(byte abyte0[], OutputStream outputstream)
    {
        writeUint8((short)abyte0.length, outputstream);
        outputstream.write(abyte0);
    }

    protected static void writeUint16(int i, OutputStream outputstream)
    {
        outputstream.write(i >> 8);
        outputstream.write(i);
    }

    protected static void writeUint16(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)(i >> 8);
        abyte0[j + 1] = (byte)i;
    }

    protected static void writeUint16Array(int ai[], OutputStream outputstream)
    {
        for (int i = 0; i < ai.length; i++)
        {
            writeUint16(ai[i], outputstream);
        }

    }

    protected static void writeUint24(int i, OutputStream outputstream)
    {
        outputstream.write(i >> 16);
        outputstream.write(i >> 8);
        outputstream.write(i);
    }

    protected static void writeUint24(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)(i >> 16);
        abyte0[j + 1] = (byte)(i >> 8);
        abyte0[j + 2] = (byte)i;
    }

    protected static void writeUint32(long l, OutputStream outputstream)
    {
        outputstream.write((int)(l >> 24));
        outputstream.write((int)(l >> 16));
        outputstream.write((int)(l >> 8));
        outputstream.write((int)l);
    }

    protected static void writeUint32(long l, byte abyte0[], int i)
    {
        abyte0[i] = (byte)(int)(l >> 24);
        abyte0[i + 1] = (byte)(int)(l >> 16);
        abyte0[i + 2] = (byte)(int)(l >> 8);
        abyte0[i + 3] = (byte)(int)l;
    }

    protected static void writeUint64(long l, OutputStream outputstream)
    {
        outputstream.write((int)(l >> 56));
        outputstream.write((int)(l >> 48));
        outputstream.write((int)(l >> 40));
        outputstream.write((int)(l >> 32));
        outputstream.write((int)(l >> 24));
        outputstream.write((int)(l >> 16));
        outputstream.write((int)(l >> 8));
        outputstream.write((int)l);
    }

    protected static void writeUint64(long l, byte abyte0[], int i)
    {
        abyte0[i] = (byte)(int)(l >> 56);
        abyte0[i + 1] = (byte)(int)(l >> 48);
        abyte0[i + 2] = (byte)(int)(l >> 40);
        abyte0[i + 3] = (byte)(int)(l >> 32);
        abyte0[i + 4] = (byte)(int)(l >> 24);
        abyte0[i + 5] = (byte)(int)(l >> 16);
        abyte0[i + 6] = (byte)(int)(l >> 8);
        abyte0[i + 7] = (byte)(int)l;
    }

    protected static void writeUint8(short word0, OutputStream outputstream)
    {
        outputstream.write(word0);
    }

    protected static void writeUint8(short word0, byte abyte0[], int i)
    {
        abyte0[i] = (byte)word0;
    }

    protected static void writeUint8Array(short aword0[], OutputStream outputstream)
    {
        for (int i = 0; i < aword0.length; i++)
        {
            writeUint8(aword0[i], outputstream);
        }

    }

    protected static void writeVersion(OutputStream outputstream)
    {
        outputstream.write(3);
        outputstream.write(1);
    }

    protected static void writeVersion(byte abyte0[], int i)
    {
        abyte0[i] = 3;
        abyte0[i + 1] = 1;
    }
}

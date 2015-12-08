// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.EOFException;
import java.io.IOException;
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
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.Streams;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClientContext, SecurityParameters, ProtocolVersion, TlsFatalAlert

public class TlsUtils
{

    static final byte SSL3_CONST[][] = genConst();
    static final byte SSL_CLIENT[] = {
        67, 76, 78, 84
    };
    static final byte SSL_SERVER[] = {
        83, 82, 86, 82
    };

    public TlsUtils()
    {
    }

    protected static byte[] PRF(byte abyte0[], String s, byte abyte1[], int i)
    {
        int j = 0;
        byte abyte3[] = Strings.toByteArray(s);
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

    static byte[] PRF_1_2(Digest digest, byte abyte0[], String s, byte abyte1[], int i)
    {
        s = concat(Strings.toByteArray(s), abyte1);
        abyte1 = new byte[i];
        hmac_hash(digest, abyte0, s, abyte1);
        return abyte1;
    }

    static byte[] calculateKeyBlock(TlsClientContext tlsclientcontext, int i)
    {
        ProtocolVersion protocolversion = tlsclientcontext.getServerVersion();
        tlsclientcontext = tlsclientcontext.getSecurityParameters();
        byte abyte0[] = concat(((SecurityParameters) (tlsclientcontext)).serverRandom, ((SecurityParameters) (tlsclientcontext)).clientRandom);
        boolean flag;
        if (protocolversion.getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return PRF(((SecurityParameters) (tlsclientcontext)).masterSecret, "key expansion", abyte0, i);
        }
        MD5Digest md5digest = new MD5Digest();
        SHA1Digest sha1digest = new SHA1Digest();
        int l = md5digest.getDigestSize();
        byte abyte2[] = new byte[sha1digest.getDigestSize()];
        byte abyte1[] = new byte[i + l];
        int k = 0;
        for (int j = 0; k < i; j++)
        {
            byte abyte3[] = SSL3_CONST[j];
            sha1digest.update(abyte3, 0, abyte3.length);
            sha1digest.update(((SecurityParameters) (tlsclientcontext)).masterSecret, 0, ((SecurityParameters) (tlsclientcontext)).masterSecret.length);
            sha1digest.update(abyte0, 0, abyte0.length);
            sha1digest.doFinal(abyte2, 0);
            md5digest.update(((SecurityParameters) (tlsclientcontext)).masterSecret, 0, ((SecurityParameters) (tlsclientcontext)).masterSecret.length);
            md5digest.update(abyte2, 0, abyte2.length);
            md5digest.doFinal(abyte1, k);
            k += l;
        }

        tlsclientcontext = new byte[i];
        System.arraycopy(abyte1, 0, tlsclientcontext, 0, i);
        return tlsclientcontext;
    }

    static byte[] calculateMasterSecret(TlsClientContext tlsclientcontext, byte abyte0[])
    {
        byte abyte2[];
        ProtocolVersion protocolversion = tlsclientcontext.getServerVersion();
        tlsclientcontext = tlsclientcontext.getSecurityParameters();
        abyte2 = concat(((SecurityParameters) (tlsclientcontext)).clientRandom, ((SecurityParameters) (tlsclientcontext)).serverRandom);
        boolean flag;
        if (protocolversion.getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        tlsclientcontext = PRF(abyte0, "master secret", abyte2, 48);
_L4:
        return tlsclientcontext;
_L2:
        MD5Digest md5digest = new MD5Digest();
        SHA1Digest sha1digest = new SHA1Digest();
        int k = md5digest.getDigestSize();
        byte abyte3[] = new byte[sha1digest.getDigestSize()];
        byte abyte1[] = new byte[k * 3];
        int i = 0;
        int j = 0;
        do
        {
            tlsclientcontext = abyte1;
            if (i >= 3)
            {
                continue;
            }
            tlsclientcontext = SSL3_CONST[i];
            sha1digest.update(tlsclientcontext, 0, tlsclientcontext.length);
            sha1digest.update(abyte0, 0, abyte0.length);
            sha1digest.update(abyte2, 0, abyte2.length);
            sha1digest.doFinal(abyte3, 0);
            md5digest.update(abyte0, 0, abyte0.length);
            md5digest.update(abyte3, 0, abyte3.length);
            md5digest.doFinal(abyte1, j);
            j += k;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static byte[] calculateVerifyData(TlsClientContext tlsclientcontext, String s, byte abyte0[])
    {
        ProtocolVersion protocolversion = tlsclientcontext.getServerVersion();
        SecurityParameters securityparameters = tlsclientcontext.getSecurityParameters();
        boolean flag;
        if (protocolversion.getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        tlsclientcontext = abyte0;
        if (flag)
        {
            tlsclientcontext = PRF(securityparameters.masterSecret, s, abyte0, 12);
        }
        return tlsclientcontext;
    }

    static byte[] concat(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = new byte[abyte0.length + abyte1.length];
        System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
        System.arraycopy(abyte1, 0, abyte2, abyte0.length, abyte1.length);
        return abyte2;
    }

    private static byte[][] genConst()
    {
        byte abyte0[][] = new byte[10][];
        for (int i = 0; i < 10; i++)
        {
            byte abyte1[] = new byte[i + 1];
            Arrays.fill(abyte1, (byte)(i + 65));
            abyte0[i] = abyte1;
        }

        return abyte0;
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
        throws IOException
    {
        if (Streams.readFully(inputstream, abyte0) != abyte0.length)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    protected static byte[] readOpaque16(InputStream inputstream)
        throws IOException
    {
        byte abyte0[] = new byte[readUint16(inputstream)];
        readFully(abyte0, inputstream);
        return abyte0;
    }

    protected static byte[] readOpaque8(InputStream inputstream)
        throws IOException
    {
        byte abyte0[] = new byte[readUint8(inputstream)];
        readFully(abyte0, inputstream);
        return abyte0;
    }

    protected static int readUint16(InputStream inputstream)
        throws IOException
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
        throws IOException
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
        throws IOException
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
        throws IOException
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

    static ProtocolVersion readVersion(InputStream inputstream)
        throws IOException
    {
        return ProtocolVersion.get(inputstream.read(), inputstream.read());
    }

    static ProtocolVersion readVersion(byte abyte0[])
        throws IOException
    {
        return ProtocolVersion.get(abyte0[0], abyte0[1]);
    }

    static void validateKeyUsage(X509CertificateStructure x509certificatestructure, int i)
        throws IOException
    {
        x509certificatestructure = x509certificatestructure.getTBSCertificate().getExtensions();
        if (x509certificatestructure != null)
        {
            x509certificatestructure = x509certificatestructure.getExtension(X509Extension.keyUsage);
            if (x509certificatestructure != null && (KeyUsage.getInstance(x509certificatestructure).getBytes()[0] & 0xff & i) != i)
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
        throws IOException
    {
        writeUint16(abyte0.length, outputstream);
        outputstream.write(abyte0);
    }

    protected static void writeOpaque24(byte abyte0[], OutputStream outputstream)
        throws IOException
    {
        writeUint24(abyte0.length, outputstream);
        outputstream.write(abyte0);
    }

    protected static void writeOpaque8(byte abyte0[], OutputStream outputstream)
        throws IOException
    {
        writeUint8((short)abyte0.length, outputstream);
        outputstream.write(abyte0);
    }

    protected static void writeUint16(int i, OutputStream outputstream)
        throws IOException
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
        throws IOException
    {
        for (int i = 0; i < ai.length; i++)
        {
            writeUint16(ai[i], outputstream);
        }

    }

    protected static void writeUint24(int i, OutputStream outputstream)
        throws IOException
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
        throws IOException
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
        throws IOException
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
        throws IOException
    {
        outputstream.write(word0);
    }

    protected static void writeUint8(short word0, byte abyte0[], int i)
    {
        abyte0[i] = (byte)word0;
    }

    protected static void writeUint8Array(short aword0[], OutputStream outputstream)
        throws IOException
    {
        for (int i = 0; i < aword0.length; i++)
        {
            writeUint8(aword0[i], outputstream);
        }

    }

    static void writeVersion(ProtocolVersion protocolversion, OutputStream outputstream)
        throws IOException
    {
        outputstream.write(protocolversion.getMajorVersion());
        outputstream.write(protocolversion.getMinorVersion());
    }

    static void writeVersion(ProtocolVersion protocolversion, byte abyte0[], int i)
        throws IOException
    {
        abyte0[i] = (byte)protocolversion.getMajorVersion();
        abyte0[i + 1] = (byte)protocolversion.getMinorVersion();
    }

}

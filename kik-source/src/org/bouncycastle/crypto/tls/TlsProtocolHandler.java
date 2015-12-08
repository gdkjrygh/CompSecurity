// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.crypto.prng.ThreadedSeedGenerator;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            ByteQueue, b, TlsUtils, Certificate, 
//            TlsKeyExchange, TlsClient, TlsAuthentication, SecurityParameters, 
//            TlsSignerCredentials, TlsCredentials, CertificateRequest, TlsFatalAlert, 
//            LegacyTlsClient, c, k, l, 
//            CertificateVerifyer

public class TlsProtocolHandler
{

    private static final Integer a = new Integer(65281);
    private static final byte b[] = new byte[0];
    private ByteQueue c;
    private ByteQueue d;
    private ByteQueue e;
    private ByteQueue f;
    private b g;
    private SecureRandom h;
    private k i;
    private l j;
    private boolean k;
    private boolean l;
    private boolean m;
    private Hashtable n;
    private SecurityParameters o;
    private c p;
    private TlsClient q;
    private int r[];
    private short s[];
    private TlsKeyExchange t;
    private TlsAuthentication u;
    private CertificateRequest v;
    private short w;

    public TlsProtocolHandler(InputStream inputstream, OutputStream outputstream)
    {
        this(inputstream, outputstream, createSecureRandom());
    }

    public TlsProtocolHandler(InputStream inputstream, OutputStream outputstream, SecureRandom securerandom)
    {
        c = new ByteQueue();
        d = new ByteQueue();
        e = new ByteQueue();
        f = new ByteQueue();
        i = null;
        j = null;
        k = false;
        l = false;
        m = false;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = 0;
        g = new b(this, inputstream, outputstream);
        h = securerandom;
    }

    private static boolean arrayContains(int ai[], int i1)
    {
        boolean flag1 = false;
        int j1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j1 < ai.length)
                {
                    if (ai[j1] != i1)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j1++;
        } while (true);
    }

    private static boolean arrayContains(short aword0[], short word0)
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < aword0.length)
                {
                    if (aword0[i1] != word0)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    private static byte[] createRenegotiationInfo(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeOpaque8(abyte0, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    private static SecureRandom createSecureRandom()
    {
        ThreadedSeedGenerator threadedseedgenerator = new ThreadedSeedGenerator();
        SecureRandom securerandom = new SecureRandom();
        securerandom.setSeed(threadedseedgenerator.generateSeed(20, true));
        return securerandom;
    }

    private void failWithError(short word0, short word1)
    {
        if (!k)
        {
            k = true;
            if (word0 == 2)
            {
                l = true;
            }
            sendAlert(word0, word1);
            g.close();
            if (word0 == 2)
            {
                throw new IOException("Internal TLS error, this could be an attack");
            } else
            {
                return;
            }
        } else
        {
            throw new IOException("Internal TLS error, this could be an attack");
        }
    }

    private void processAlert()
    {
        do
        {
            if (e.size() < 2)
            {
                break;
            }
            byte abyte0[] = new byte[2];
            e.read(abyte0, 0, 2, 0);
            e.removeData(2);
            short word0 = abyte0[0];
            short word1 = abyte0[1];
            if (word0 == 2)
            {
                l = true;
                k = true;
                try
                {
                    g.close();
                }
                catch (Exception exception) { }
                throw new IOException("Internal TLS error, this could be an attack");
            }
            if (word1 == 0)
            {
                failWithError((short)1, (short)0);
            }
        } while (true);
    }

    private void processApplicationData()
    {
    }

    private void processChangeCipherSpec()
    {
        while (d.size() > 0) 
        {
            byte abyte0[] = new byte[1];
            d.read(abyte0, 0, 1, 0);
            d.removeData(1);
            if (abyte0[0] != 1)
            {
                failWithError((short)2, (short)10);
            }
            if (w != 10)
            {
                failWithError((short)2, (short)40);
            }
            g.serverClientSpecReceived();
            w = 11;
        }
    }

    private void processHandshake()
    {
_L2:
        boolean flag;
        if (f.size() < 4)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = new byte[4];
        f.read(abyte0, 0, 4, 0);
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
        short word0 = TlsUtils.readUint8(bytearrayinputstream);
        int i1 = TlsUtils.readUint24(bytearrayinputstream);
        if (f.size() < i1 + 4)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte1[] = new byte[i1];
        f.read(abyte1, 0, i1, 4);
        f.removeData(i1 + 4);
        switch (word0)
        {
        default:
            g.updateHandshakeData(abyte0, 0, 4);
            g.updateHandshakeData(abyte1, 0, i1);
            // fall through

        case 0: // '\0'
        case 20: // '\024'
            processHandshakeMessage(word0, abyte1);
            break;
        }
        flag = true;
_L3:
        if (!flag)
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        flag = false;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private void processHandshakeMessage(short word0, byte abyte0[])
    {
        abyte0 = new ByteArrayInputStream(abyte0);
        word0;
        JVM INSTR lookupswitch 7: default 76
    //                   0: 1257
    //                   2: 265
    //                   11: 84
    //                   12: 1002
    //                   13: 1073
    //                   14: 644
    //                   20: 170;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        failWithError((short)2, (short)10);
_L21:
        return;
_L4:
        w;
        JVM INSTR tableswitch 2 2: default 108
    //                   2 121;
           goto _L9 _L10
_L9:
        failWithError((short)2, (short)10);
_L11:
        w = 3;
        return;
_L10:
        Certificate certificate = Certificate.parse(abyte0);
        assertEmpty(abyte0);
        t.processServerCertificate(certificate);
        u = q.getAuthentication();
        u.notifyServerCertificate(certificate);
        if (true) goto _L11; else goto _L8
_L8:
        byte abyte1[];
        switch (w)
        {
        default:
            failWithError((short)2, (short)10);
            return;

        case 11: // '\013'
            abyte1 = new byte[12];
            break;
        }
        TlsUtils.readFully(abyte1, abyte0);
        assertEmpty(abyte0);
        if (!Arrays.b(TlsUtils.PRF(o.c, "server finished", g.getCurrentHash(), 12), abyte1))
        {
            failWithError((short)2, (short)40);
        }
        w = 12;
        m = true;
        return;
_L3:
        switch (w)
        {
        default:
            failWithError((short)2, (short)10);
            return;

        case 1: // '\001'
            TlsUtils.checkVersion(abyte0, this);
            break;
        }
        o.b = new byte[32];
        TlsUtils.readFully(o.b, abyte0);
        byte abyte2[] = TlsUtils.readOpaque8(abyte0);
        if (abyte2.length > 32)
        {
            failWithError((short)2, (short)47);
        }
        q.notifySessionID(abyte2);
        word0 = TlsUtils.readUint16(abyte0);
        if (!arrayContains(r, word0) || word0 == 255)
        {
            failWithError((short)2, (short)47);
        }
        q.notifySelectedCipherSuite(word0);
        short word1 = TlsUtils.readUint8(abyte0);
        if (!arrayContains(s, word1))
        {
            failWithError((short)2, (short)47);
        }
        q.notifySelectedCompressionMethod(word1);
        Hashtable hashtable = new Hashtable();
        if (abyte0.available() > 0)
        {
            Integer integer;
            byte abyte4[];
            for (ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(TlsUtils.readOpaque16(abyte0)); bytearrayinputstream.available() > 0; hashtable.put(integer, abyte4))
            {
                integer = new Integer(TlsUtils.readUint16(bytearrayinputstream));
                abyte4 = TlsUtils.readOpaque16(bytearrayinputstream);
                if (!integer.equals(a) && n.get(integer) == null)
                {
                    failWithError((short)2, (short)110);
                }
                if (hashtable.containsKey(integer))
                {
                    failWithError((short)2, (short)47);
                }
            }

        }
        assertEmpty(abyte0);
        boolean flag = hashtable.containsKey(a);
        if (flag && !Arrays.b((byte[])hashtable.get(a), createRenegotiationInfo(b)))
        {
            failWithError((short)2, (short)40);
        }
        q.notifySecureRenegotiation(flag);
        if (n != null)
        {
            q.processServerExtensions(hashtable);
        }
        t = q.getKeyExchange();
        w = 2;
        return;
_L7:
        switch (w)
        {
        default:
            failWithError((short)2, (short)40);
            return;

        case 3: // '\003'
            t.skipServerKeyExchange();
            // fall through

        case 4: // '\004'
        case 5: // '\005'
            assertEmpty(abyte0);
            break;
        }
        w = 6;
        abyte0 = null;
        ByteArrayOutputStream bytearrayoutputstream;
        if (v == null)
        {
            t.skipClientCredentials();
        } else
        {
            TlsCredentials tlscredentials = u.getClientCredentials(v);
            if (tlscredentials == null)
            {
                t.skipClientCredentials();
                abyte0 = Certificate.a;
            } else
            {
                t.processClientCredentials(tlscredentials);
                abyte0 = tlscredentials.getCertificate();
            }
            sendClientCertificate(abyte0);
            abyte0 = tlscredentials;
        }
        sendClientKeyExchange();
        w = 7;
        if (abyte0 != null && (abyte0 instanceof TlsSignerCredentials))
        {
            sendCertificateVerify(((TlsSignerCredentials)abyte0).generateCertificateSignature(g.getCurrentHash()));
            w = 8;
        }
        g.writeMessage((short)20, new byte[] {
            1
        }, 0, 1);
        w = 9;
        abyte0 = t.generatePremasterSecret();
        o.c = TlsUtils.PRF(abyte0, "master secret", TlsUtils.concat(o.a, o.b), 48);
        Arrays.a(abyte0);
        g.clientCipherSpecDecided(q.getCompression(), q.getCipher());
        abyte0 = TlsUtils.PRF(o.c, "client finished", g.getCurrentHash(), 12);
        bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)20, bytearrayoutputstream);
        TlsUtils.writeOpaque24(abyte0, bytearrayoutputstream);
        abyte0 = bytearrayoutputstream.toByteArray();
        g.writeMessage((short)22, abyte0, 0, abyte0.length);
        w = 10;
        return;
_L5:
        w;
        JVM INSTR tableswitch 2 3: default 1028
    //                   2 1041
    //                   3 1055;
           goto _L12 _L13 _L14
_L12:
        failWithError((short)2, (short)10);
_L15:
        w = 4;
        return;
_L13:
        t.skipServerCertificate();
        u = null;
_L14:
        t.processServerKeyExchange(abyte0);
        assertEmpty(abyte0);
        if (true) goto _L15; else goto _L6
_L6:
        w;
        JVM INSTR tableswitch 3 4: default 1100
    //                   3 1113
    //                   4 1122;
           goto _L16 _L17 _L18
_L16:
        failWithError((short)2, (short)10);
_L19:
        w = 5;
        return;
_L17:
        t.skipServerKeyExchange();
_L18:
        if (u == null)
        {
            failWithError((short)2, (short)40);
        }
        short word2 = TlsUtils.readUint8(abyte0);
        short aword0[] = new short[word2];
        for (word0 = 0; word0 < word2; word0++)
        {
            aword0[word0] = TlsUtils.readUint8(abyte0);
        }

        byte abyte3[] = TlsUtils.readOpaque16(abyte0);
        assertEmpty(abyte0);
        abyte0 = new Vector();
        for (ByteArrayInputStream bytearrayinputstream1 = new ByteArrayInputStream(abyte3); bytearrayinputstream1.available() > 0; abyte0.addElement(X500Name.a(ASN1Object.a(TlsUtils.readOpaque16(bytearrayinputstream1))))) { }
        v = new CertificateRequest(aword0, abyte0);
        t.validateCertificateRequest(v);
        if (true) goto _L19; else goto _L2
_L2:
        if (w == 12)
        {
            sendAlert((short)1, (short)100);
            return;
        }
        if (true) goto _L21; else goto _L20
_L20:
    }

    private void safeReadData()
    {
        try
        {
            g.readData();
            return;
        }
        catch (TlsFatalAlert tlsfatalalert)
        {
            if (!k)
            {
                failWithError((short)2, tlsfatalalert.getAlertDescription());
            }
            throw tlsfatalalert;
        }
        catch (IOException ioexception)
        {
            if (!k)
            {
                failWithError((short)2, (short)80);
            }
            throw ioexception;
        }
        catch (RuntimeException runtimeexception)
        {
            if (!k)
            {
                failWithError((short)2, (short)80);
            }
            throw runtimeexception;
        }
    }

    private void safeWriteMessage(short word0, byte abyte0[], int i1, int j1)
    {
        try
        {
            g.writeMessage(word0, abyte0, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            if (!k)
            {
                failWithError((short)2, abyte0.getAlertDescription());
            }
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            if (!k)
            {
                failWithError((short)2, (short)80);
            }
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        if (!k)
        {
            failWithError((short)2, (short)80);
        }
        throw abyte0;
    }

    private void sendAlert(short word0, short word1)
    {
        byte byte0 = (byte)word0;
        byte byte1 = (byte)word1;
        g.writeMessage((short)21, new byte[] {
            byte0, byte1
        }, 0, 2);
    }

    private void sendCertificateVerify(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)15, bytearrayoutputstream);
        TlsUtils.writeUint24(abyte0.length + 2, bytearrayoutputstream);
        TlsUtils.writeOpaque16(abyte0, bytearrayoutputstream);
        abyte0 = bytearrayoutputstream.toByteArray();
        g.writeMessage((short)22, abyte0, 0, abyte0.length);
    }

    private void sendClientCertificate(Certificate certificate)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)11, bytearrayoutputstream);
        certificate.encode(bytearrayoutputstream);
        certificate = bytearrayoutputstream.toByteArray();
        g.writeMessage((short)22, certificate, 0, certificate.length);
    }

    private void sendClientKeyExchange()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)16, bytearrayoutputstream);
        t.generateClientKeyExchange(bytearrayoutputstream);
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        g.writeMessage((short)22, abyte0, 0, abyte0.length);
    }

    private static void writeExtension(OutputStream outputstream, Integer integer, byte abyte0[])
    {
        TlsUtils.writeUint16(integer.intValue(), outputstream);
        TlsUtils.writeOpaque16(abyte0, outputstream);
    }

    protected void assertEmpty(ByteArrayInputStream bytearrayinputstream)
    {
        if (bytearrayinputstream.available() > 0)
        {
            throw new TlsFatalAlert((short)50);
        } else
        {
            return;
        }
    }

    public void close()
    {
        if (!k)
        {
            failWithError((short)1, (short)0);
        }
    }

    public void connect(CertificateVerifyer certificateverifyer)
    {
        connect(((TlsClient) (new LegacyTlsClient(certificateverifyer))));
    }

    public void connect(TlsClient tlsclient)
    {
        if (tlsclient == null)
        {
            throw new IllegalArgumentException("'tlsClient' cannot be null");
        }
        if (q != null)
        {
            throw new IllegalStateException("connect can only be called once");
        }
        o = new SecurityParameters();
        o.a = new byte[32];
        h.nextBytes(o.a);
        TlsUtils.writeGMTUnixTime(o.a, 0);
        p = new c(h, o);
        q = tlsclient;
        q.init(p);
        tlsclient = new ByteArrayOutputStream();
        TlsUtils.writeVersion(tlsclient);
        tlsclient.write(o.a);
        TlsUtils.writeUint8((short)0, tlsclient);
        r = q.getCipherSuites();
        n = q.getClientExtensions();
        boolean flag;
        int i1;
        int j1;
        if (n == null || n.get(a) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = r.length;
        i1 = j1;
        if (flag)
        {
            i1 = j1 + 1;
        }
        TlsUtils.writeUint16(i1 * 2, tlsclient);
        TlsUtils.writeUint16Array(r, tlsclient);
        if (flag)
        {
            TlsUtils.writeUint16(255, tlsclient);
        }
        s = q.getCompressionMethods();
        TlsUtils.writeUint8((short)s.length, tlsclient);
        TlsUtils.writeUint8Array(s, tlsclient);
        if (n != null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            Integer integer;
            for (Enumeration enumeration = n.keys(); enumeration.hasMoreElements(); writeExtension(bytearrayoutputstream, integer, (byte[])n.get(integer)))
            {
                integer = (Integer)enumeration.nextElement();
            }

            TlsUtils.writeOpaque16(bytearrayoutputstream.toByteArray(), tlsclient);
        }
        ByteArrayOutputStream bytearrayoutputstream1 = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)1, bytearrayoutputstream1);
        TlsUtils.writeUint24(tlsclient.size(), bytearrayoutputstream1);
        bytearrayoutputstream1.write(tlsclient.toByteArray());
        tlsclient = bytearrayoutputstream1.toByteArray();
        safeWriteMessage((short)22, tlsclient, 0, tlsclient.length);
        for (w = 1; w != 12;)
        {
            safeReadData();
        }

        i = new k(this);
        j = new l(this);
    }

    protected void flush()
    {
        g.flush();
    }

    public InputStream getInputStream()
    {
        return i;
    }

    public OutputStream getOutputStream()
    {
        return j;
    }

    protected void processData(short word0, byte abyte0[], int i1, int j1)
    {
        switch (word0)
        {
        default:
            return;

        case 20: // '\024'
            d.addData(abyte0, i1, j1);
            processChangeCipherSpec();
            return;

        case 21: // '\025'
            e.addData(abyte0, i1, j1);
            processAlert();
            return;

        case 22: // '\026'
            f.addData(abyte0, i1, j1);
            processHandshake();
            return;

        case 23: // '\027'
            break;
        }
        if (!m)
        {
            failWithError((short)2, (short)10);
        }
        c.addData(abyte0, i1, j1);
        processApplicationData();
    }

    protected int readApplicationData(byte abyte0[], int i1, int j1)
    {
        for (; c.size() == 0; safeReadData())
        {
            if (k)
            {
                if (l)
                {
                    throw new IOException("Internal TLS error, this could be an attack");
                } else
                {
                    return -1;
                }
            }
        }

        j1 = Math.min(j1, c.size());
        c.read(abyte0, i1, j1, 0);
        c.removeData(j1);
        return j1;
    }

    protected void writeData(byte abyte0[], int i1, int j1)
    {
        if (k)
        {
            if (l)
            {
                throw new IOException("Internal TLS error, this could be an attack");
            } else
            {
                throw new IOException("Sorry, connection has been closed, you cannot write more data");
            }
        }
        safeWriteMessage((short)23, b, 0, 0);
        int k1;
        do
        {
            k1 = Math.min(j1, 16384);
            safeWriteMessage((short)23, abyte0, i1, k1);
            i1 += k1;
            k1 = j1 - k1;
            j1 = k1;
        } while (k1 > 0);
    }

}

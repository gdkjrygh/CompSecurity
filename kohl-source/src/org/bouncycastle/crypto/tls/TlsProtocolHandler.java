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
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.crypto.prng.ThreadedSeedGenerator;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            ByteQueue, RecordStream, TlsUtils, Certificate, 
//            TlsKeyExchange, TlsClient, TlsAuthentication, TlsClientContextImpl, 
//            ProtocolVersion, SecurityParameters, TlsSignerCredentials, TlsCredentials, 
//            CertificateRequest, TlsFatalAlert, LegacyTlsClient, TlsInputStream, 
//            TlsOutputStream, CertificateVerifyer

public class TlsProtocolHandler
{

    private static final short CS_CERTIFICATE_REQUEST_RECEIVED = 5;
    private static final short CS_CERTIFICATE_VERIFY_SEND = 8;
    private static final short CS_CLIENT_CHANGE_CIPHER_SPEC_SEND = 9;
    private static final short CS_CLIENT_FINISHED_SEND = 10;
    private static final short CS_CLIENT_HELLO_SEND = 1;
    private static final short CS_CLIENT_KEY_EXCHANGE_SEND = 7;
    private static final short CS_DONE = 12;
    private static final short CS_SERVER_CERTIFICATE_RECEIVED = 3;
    private static final short CS_SERVER_CHANGE_CIPHER_SPEC_RECEIVED = 11;
    private static final short CS_SERVER_HELLO_DONE_RECEIVED = 6;
    private static final short CS_SERVER_HELLO_RECEIVED = 2;
    private static final short CS_SERVER_KEY_EXCHANGE_RECEIVED = 4;
    private static final Integer EXT_RenegotiationInfo = new Integer(65281);
    private static final String TLS_ERROR_MESSAGE = "Internal TLS error, this could be an attack";
    private static final byte emptybuf[] = new byte[0];
    private ByteQueue alertQueue;
    private boolean appDataReady;
    private ByteQueue applicationDataQueue;
    private TlsAuthentication authentication;
    private CertificateRequest certificateRequest;
    private ByteQueue changeCipherSpecQueue;
    private Hashtable clientExtensions;
    private boolean closed;
    private short connection_state;
    private boolean failedWithError;
    private ByteQueue handshakeQueue;
    private TlsKeyExchange keyExchange;
    private int offeredCipherSuites[];
    private short offeredCompressionMethods[];
    private SecureRandom random;
    private RecordStream rs;
    private SecurityParameters securityParameters;
    private TlsClient tlsClient;
    private TlsClientContextImpl tlsClientContext;
    private TlsInputStream tlsInputStream;
    private TlsOutputStream tlsOutputStream;

    public TlsProtocolHandler(InputStream inputstream, OutputStream outputstream)
    {
        this(inputstream, outputstream, createSecureRandom());
    }

    public TlsProtocolHandler(InputStream inputstream, OutputStream outputstream, SecureRandom securerandom)
    {
        applicationDataQueue = new ByteQueue();
        changeCipherSpecQueue = new ByteQueue();
        alertQueue = new ByteQueue();
        handshakeQueue = new ByteQueue();
        tlsInputStream = null;
        tlsOutputStream = null;
        closed = false;
        failedWithError = false;
        appDataReady = false;
        securityParameters = null;
        tlsClientContext = null;
        tlsClient = null;
        offeredCipherSuites = null;
        offeredCompressionMethods = null;
        keyExchange = null;
        authentication = null;
        certificateRequest = null;
        connection_state = 0;
        rs = new RecordStream(this, inputstream, outputstream);
        random = securerandom;
    }

    private static boolean arrayContains(int ai[], int i)
    {
        boolean flag1 = false;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < ai.length)
                {
                    if (ai[j] != i)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    private static boolean arrayContains(short aword0[], short word0)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < aword0.length)
                {
                    if (aword0[i] != word0)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private static byte[] createRenegotiationInfo(byte abyte0[])
        throws IOException
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
        throws IOException
    {
        if (!closed)
        {
            closed = true;
            if (word0 == 2)
            {
                failedWithError = true;
            }
            sendAlert(word0, word1);
            rs.close();
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
        throws IOException
    {
        do
        {
            if (alertQueue.size() < 2)
            {
                break;
            }
            byte abyte0[] = new byte[2];
            alertQueue.read(abyte0, 0, 2, 0);
            alertQueue.removeData(2);
            short word0 = abyte0[0];
            short word1 = abyte0[1];
            if (word0 == 2)
            {
                failedWithError = true;
                closed = true;
                try
                {
                    rs.close();
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
        throws IOException
    {
        while (changeCipherSpecQueue.size() > 0) 
        {
            byte abyte0[] = new byte[1];
            changeCipherSpecQueue.read(abyte0, 0, 1, 0);
            changeCipherSpecQueue.removeData(1);
            if (abyte0[0] != 1)
            {
                failWithError((short)2, (short)10);
            }
            if (connection_state != 10)
            {
                failWithError((short)2, (short)40);
            }
            rs.serverClientSpecReceived();
            connection_state = 11;
        }
    }

    private void processHandshake()
        throws IOException
    {
_L2:
        boolean flag;
        if (handshakeQueue.size() < 4)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = new byte[4];
        handshakeQueue.read(abyte0, 0, 4, 0);
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
        short word0 = TlsUtils.readUint8(bytearrayinputstream);
        int i = TlsUtils.readUint24(bytearrayinputstream);
        if (handshakeQueue.size() < i + 4)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte1[] = new byte[i];
        handshakeQueue.read(abyte1, 0, i, 4);
        handshakeQueue.removeData(i + 4);
        switch (word0)
        {
        default:
            rs.updateHandshakeData(abyte0, 0, 4);
            rs.updateHandshakeData(abyte1, 0, i);
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
        throws IOException
    {
        boolean flag;
        flag = false;
        abyte0 = new ByteArrayInputStream(abyte0);
        word0;
        JVM INSTR lookupswitch 7: default 80
    //                   0: 1389
    //                   2: 304
    //                   11: 88
    //                   12: 1134
    //                   13: 1205
    //                   14: 737
    //                   20: 174;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        failWithError((short)2, (short)10);
_L21:
        return;
_L4:
        connection_state;
        JVM INSTR tableswitch 2 2: default 112
    //                   2 125;
           goto _L9 _L10
_L9:
        failWithError((short)2, (short)10);
_L11:
        connection_state = 3;
        return;
_L10:
        Certificate certificate = Certificate.parse(abyte0);
        assertEmpty(abyte0);
        keyExchange.processServerCertificate(certificate);
        authentication = tlsClient.getAuthentication();
        authentication.notifyServerCertificate(certificate);
        if (true) goto _L11; else goto _L8
_L8:
        switch (connection_state)
        {
        default:
            failWithError((short)2, (short)10);
            return;

        case 11: // '\013'
            word0 = flag;
            break;
        }
        if (tlsClientContext.getServerVersion().getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            word0 = 1;
        }
        byte abyte1[];
        if (word0 != 0)
        {
            word0 = 12;
        } else
        {
            word0 = 36;
        }
        abyte1 = new byte[word0];
        TlsUtils.readFully(abyte1, abyte0);
        assertEmpty(abyte0);
        if (!Arrays.constantTimeAreEqual(TlsUtils.calculateVerifyData(tlsClientContext, "server finished", rs.getCurrentHash(TlsUtils.SSL_SERVER)), abyte1))
        {
            failWithError((short)2, (short)40);
        }
        connection_state = 12;
        appDataReady = true;
        return;
_L3:
        Object obj;
        switch (connection_state)
        {
        default:
            failWithError((short)2, (short)10);
            return;

        case 1: // '\001'
            obj = TlsUtils.readVersion(abyte0);
            break;
        }
        ProtocolVersion protocolversion = tlsClientContext.getClientVersion();
        if (((ProtocolVersion) (obj)).getFullVersion() > protocolversion.getFullVersion())
        {
            failWithError((short)2, (short)47);
        }
        tlsClientContext.setServerVersion(((ProtocolVersion) (obj)));
        tlsClient.notifyServerVersion(((ProtocolVersion) (obj)));
        securityParameters.serverRandom = new byte[32];
        TlsUtils.readFully(securityParameters.serverRandom, abyte0);
        byte abyte2[] = TlsUtils.readOpaque8(abyte0);
        if (abyte2.length > 32)
        {
            failWithError((short)2, (short)47);
        }
        tlsClient.notifySessionID(abyte2);
        word0 = TlsUtils.readUint16(abyte0);
        if (!arrayContains(offeredCipherSuites, word0) || word0 == 255)
        {
            failWithError((short)2, (short)47);
        }
        tlsClient.notifySelectedCipherSuite(word0);
        short word1 = TlsUtils.readUint8(abyte0);
        if (!arrayContains(offeredCompressionMethods, word1))
        {
            failWithError((short)2, (short)47);
        }
        tlsClient.notifySelectedCompressionMethod(word1);
        abyte2 = new Hashtable();
        if (abyte0.available() > 0)
        {
            Integer integer;
            byte abyte5[];
            for (ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(TlsUtils.readOpaque16(abyte0)); bytearrayinputstream.available() > 0; abyte2.put(integer, abyte5))
            {
                integer = new Integer(TlsUtils.readUint16(bytearrayinputstream));
                abyte5 = TlsUtils.readOpaque16(bytearrayinputstream);
                if (!integer.equals(EXT_RenegotiationInfo) && clientExtensions.get(integer) == null)
                {
                    failWithError((short)2, (short)110);
                }
                if (abyte2.containsKey(integer))
                {
                    failWithError((short)2, (short)47);
                }
            }

        }
        assertEmpty(abyte0);
        boolean flag1 = abyte2.containsKey(EXT_RenegotiationInfo);
        if (flag1 && !Arrays.constantTimeAreEqual((byte[])(byte[])abyte2.get(EXT_RenegotiationInfo), createRenegotiationInfo(emptybuf)))
        {
            failWithError((short)2, (short)40);
        }
        tlsClient.notifySecureRenegotiation(flag1);
        if (clientExtensions != null)
        {
            tlsClient.processServerExtensions(abyte2);
        }
        keyExchange = tlsClient.getKeyExchange();
        connection_state = 2;
        return;
_L7:
        switch (connection_state)
        {
        default:
            failWithError((short)2, (short)40);
            return;

        case 2: // '\002'
            keyExchange.skipServerCertificate();
            authentication = null;
            // fall through

        case 3: // '\003'
            keyExchange.skipServerKeyExchange();
            // fall through

        case 4: // '\004'
        case 5: // '\005'
            assertEmpty(abyte0);
            break;
        }
        connection_state = 6;
        abyte0 = null;
        byte abyte3[];
        ByteArrayOutputStream bytearrayoutputstream;
        if (certificateRequest == null)
        {
            keyExchange.skipClientCredentials();
        } else
        {
            abyte0 = authentication.getClientCredentials(certificateRequest);
            if (abyte0 == null)
            {
                keyExchange.skipClientCredentials();
                if (tlsClientContext.getServerVersion().getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
                {
                    word0 = 1;
                } else
                {
                    word0 = 0;
                }
                if (word0 != 0)
                {
                    sendClientCertificate(Certificate.EMPTY_CHAIN);
                } else
                {
                    sendAlert((short)1, (short)41);
                }
            } else
            {
                keyExchange.processClientCredentials(abyte0);
                sendClientCertificate(abyte0.getCertificate());
            }
        }
        sendClientKeyExchange();
        connection_state = 7;
        abyte3 = keyExchange.generatePremasterSecret();
        securityParameters.masterSecret = TlsUtils.calculateMasterSecret(tlsClientContext, abyte3);
        Arrays.fill(abyte3, (byte)0);
        if (abyte0 != null && (abyte0 instanceof TlsSignerCredentials))
        {
            sendCertificateVerify(((TlsSignerCredentials)abyte0).generateCertificateSignature(rs.getCurrentHash(null)));
            connection_state = 8;
        }
        abyte0 = new byte[1];
        abyte0[0] = 1;
        rs.writeMessage((short)20, abyte0, 0, abyte0.length);
        connection_state = 9;
        rs.clientCipherSpecDecided(tlsClient.getCompression(), tlsClient.getCipher());
        abyte0 = TlsUtils.calculateVerifyData(tlsClientContext, "client finished", rs.getCurrentHash(TlsUtils.SSL_CLIENT));
        bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)20, bytearrayoutputstream);
        TlsUtils.writeOpaque24(abyte0, bytearrayoutputstream);
        abyte0 = bytearrayoutputstream.toByteArray();
        rs.writeMessage((short)22, abyte0, 0, abyte0.length);
        connection_state = 10;
        return;
_L5:
        connection_state;
        JVM INSTR tableswitch 2 3: default 1160
    //                   2 1173
    //                   3 1187;
           goto _L12 _L13 _L14
_L12:
        failWithError((short)2, (short)10);
_L15:
        connection_state = 4;
        return;
_L13:
        keyExchange.skipServerCertificate();
        authentication = null;
_L14:
        keyExchange.processServerKeyExchange(abyte0);
        assertEmpty(abyte0);
        if (true) goto _L15; else goto _L6
_L6:
        connection_state;
        JVM INSTR tableswitch 3 4: default 1232
    //                   3 1245
    //                   4 1254;
           goto _L16 _L17 _L18
_L16:
        failWithError((short)2, (short)10);
_L19:
        connection_state = 5;
        return;
_L17:
        keyExchange.skipServerKeyExchange();
_L18:
        if (authentication == null)
        {
            failWithError((short)2, (short)40);
        }
        short word2 = TlsUtils.readUint8(abyte0);
        short aword0[] = new short[word2];
        for (word0 = 0; word0 < word2; word0++)
        {
            aword0[word0] = TlsUtils.readUint8(abyte0);
        }

        byte abyte4[] = TlsUtils.readOpaque16(abyte0);
        assertEmpty(abyte0);
        abyte0 = new Vector();
        for (ByteArrayInputStream bytearrayinputstream1 = new ByteArrayInputStream(abyte4); bytearrayinputstream1.available() > 0; abyte0.addElement(X500Name.getInstance(ASN1Primitive.fromByteArray(TlsUtils.readOpaque16(bytearrayinputstream1))))) { }
        certificateRequest = new CertificateRequest(aword0, abyte0);
        keyExchange.validateCertificateRequest(certificateRequest);
        if (true) goto _L19; else goto _L2
_L2:
        if (connection_state == 12)
        {
            sendAlert((short)1, (short)100);
            return;
        }
        if (true) goto _L21; else goto _L20
_L20:
    }

    private void safeReadData()
        throws IOException
    {
        try
        {
            rs.readData();
            return;
        }
        catch (TlsFatalAlert tlsfatalalert)
        {
            if (!closed)
            {
                failWithError((short)2, tlsfatalalert.getAlertDescription());
            }
            throw tlsfatalalert;
        }
        catch (IOException ioexception)
        {
            if (!closed)
            {
                failWithError((short)2, (short)80);
            }
            throw ioexception;
        }
        catch (RuntimeException runtimeexception)
        {
            if (!closed)
            {
                failWithError((short)2, (short)80);
            }
            throw runtimeexception;
        }
    }

    private void safeWriteMessage(short word0, byte abyte0[], int i, int j)
        throws IOException
    {
        try
        {
            rs.writeMessage(word0, abyte0, i, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            if (!closed)
            {
                failWithError((short)2, abyte0.getAlertDescription());
            }
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            if (!closed)
            {
                failWithError((short)2, (short)80);
            }
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        if (!closed)
        {
            failWithError((short)2, (short)80);
        }
        throw abyte0;
    }

    private void sendAlert(short word0, short word1)
        throws IOException
    {
        byte byte0 = (byte)word0;
        byte byte1 = (byte)word1;
        rs.writeMessage((short)21, new byte[] {
            byte0, byte1
        }, 0, 2);
    }

    private void sendCertificateVerify(byte abyte0[])
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)15, bytearrayoutputstream);
        TlsUtils.writeUint24(abyte0.length + 2, bytearrayoutputstream);
        TlsUtils.writeOpaque16(abyte0, bytearrayoutputstream);
        abyte0 = bytearrayoutputstream.toByteArray();
        rs.writeMessage((short)22, abyte0, 0, abyte0.length);
    }

    private void sendClientCertificate(Certificate certificate)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)11, bytearrayoutputstream);
        TlsUtils.writeUint24(0, bytearrayoutputstream);
        certificate.encode(bytearrayoutputstream);
        certificate = bytearrayoutputstream.toByteArray();
        TlsUtils.writeUint24(certificate.length - 4, certificate, 1);
        rs.writeMessage((short)22, certificate, 0, certificate.length);
    }

    private void sendClientKeyExchange()
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)16, bytearrayoutputstream);
        TlsUtils.writeUint24(0, bytearrayoutputstream);
        keyExchange.generateClientKeyExchange(bytearrayoutputstream);
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        TlsUtils.writeUint24(abyte0.length - 4, abyte0, 1);
        rs.writeMessage((short)22, abyte0, 0, abyte0.length);
    }

    private static void writeExtension(OutputStream outputstream, Integer integer, byte abyte0[])
        throws IOException
    {
        TlsUtils.writeUint16(integer.intValue(), outputstream);
        TlsUtils.writeOpaque16(abyte0, outputstream);
    }

    protected void assertEmpty(ByteArrayInputStream bytearrayinputstream)
        throws IOException
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
        throws IOException
    {
        if (!closed)
        {
            failWithError((short)1, (short)0);
        }
    }

    public void connect(CertificateVerifyer certificateverifyer)
        throws IOException
    {
        connect(((TlsClient) (new LegacyTlsClient(certificateverifyer))));
    }

    public void connect(TlsClient tlsclient)
        throws IOException
    {
        if (tlsclient == null)
        {
            throw new IllegalArgumentException("'tlsClient' cannot be null");
        }
        if (tlsClient != null)
        {
            throw new IllegalStateException("connect can only be called once");
        }
        securityParameters = new SecurityParameters();
        securityParameters.clientRandom = new byte[32];
        random.nextBytes(securityParameters.clientRandom);
        TlsUtils.writeGMTUnixTime(securityParameters.clientRandom, 0);
        tlsClientContext = new TlsClientContextImpl(random, securityParameters);
        rs.init(tlsClientContext);
        tlsClient = tlsclient;
        tlsClient.init(tlsClientContext);
        tlsclient = new ByteArrayOutputStream();
        Object obj = tlsClient.getClientVersion();
        tlsClientContext.setClientVersion(((ProtocolVersion) (obj)));
        tlsClientContext.setServerVersion(((ProtocolVersion) (obj)));
        TlsUtils.writeVersion(((ProtocolVersion) (obj)), tlsclient);
        tlsclient.write(securityParameters.clientRandom);
        TlsUtils.writeUint8((short)0, tlsclient);
        offeredCipherSuites = tlsClient.getCipherSuites();
        clientExtensions = tlsClient.getClientExtensions();
        boolean flag;
        int i;
        int j;
        if (clientExtensions == null || clientExtensions.get(EXT_RenegotiationInfo) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = offeredCipherSuites.length;
        i = j;
        if (flag)
        {
            i = j + 1;
        }
        TlsUtils.writeUint16(i * 2, tlsclient);
        TlsUtils.writeUint16Array(offeredCipherSuites, tlsclient);
        if (flag)
        {
            TlsUtils.writeUint16(255, tlsclient);
        }
        offeredCompressionMethods = tlsClient.getCompressionMethods();
        TlsUtils.writeUint8((short)offeredCompressionMethods.length, tlsclient);
        TlsUtils.writeUint8Array(offeredCompressionMethods, tlsclient);
        if (clientExtensions != null)
        {
            obj = new ByteArrayOutputStream();
            Integer integer;
            for (Enumeration enumeration = clientExtensions.keys(); enumeration.hasMoreElements(); writeExtension(((OutputStream) (obj)), integer, (byte[])(byte[])clientExtensions.get(integer)))
            {
                integer = (Integer)enumeration.nextElement();
            }

            TlsUtils.writeOpaque16(((ByteArrayOutputStream) (obj)).toByteArray(), tlsclient);
        }
        obj = new ByteArrayOutputStream();
        TlsUtils.writeUint8((short)1, ((OutputStream) (obj)));
        TlsUtils.writeUint24(tlsclient.size(), ((OutputStream) (obj)));
        ((ByteArrayOutputStream) (obj)).write(tlsclient.toByteArray());
        tlsclient = ((ByteArrayOutputStream) (obj)).toByteArray();
        safeWriteMessage((short)22, tlsclient, 0, tlsclient.length);
        for (connection_state = 1; connection_state != 12;)
        {
            safeReadData();
        }

        tlsInputStream = new TlsInputStream(this);
        tlsOutputStream = new TlsOutputStream(this);
    }

    protected void flush()
        throws IOException
    {
        rs.flush();
    }

    public InputStream getInputStream()
    {
        return tlsInputStream;
    }

    public OutputStream getOutputStream()
    {
        return tlsOutputStream;
    }

    protected void processData(short word0, byte abyte0[], int i, int j)
        throws IOException
    {
        switch (word0)
        {
        default:
            return;

        case 20: // '\024'
            changeCipherSpecQueue.addData(abyte0, i, j);
            processChangeCipherSpec();
            return;

        case 21: // '\025'
            alertQueue.addData(abyte0, i, j);
            processAlert();
            return;

        case 22: // '\026'
            handshakeQueue.addData(abyte0, i, j);
            processHandshake();
            return;

        case 23: // '\027'
            break;
        }
        if (!appDataReady)
        {
            failWithError((short)2, (short)10);
        }
        applicationDataQueue.addData(abyte0, i, j);
        processApplicationData();
    }

    protected int readApplicationData(byte abyte0[], int i, int j)
        throws IOException
    {
        for (; applicationDataQueue.size() == 0; safeReadData())
        {
            if (closed)
            {
                if (failedWithError)
                {
                    throw new IOException("Internal TLS error, this could be an attack");
                } else
                {
                    return -1;
                }
            }
        }

        j = Math.min(j, applicationDataQueue.size());
        applicationDataQueue.read(abyte0, i, j, 0);
        applicationDataQueue.removeData(j);
        return j;
    }

    protected void writeData(byte abyte0[], int i, int j)
        throws IOException
    {
        if (closed)
        {
            if (failedWithError)
            {
                throw new IOException("Internal TLS error, this could be an attack");
            } else
            {
                throw new IOException("Sorry, connection has been closed, you cannot write more data");
            }
        }
        safeWriteMessage((short)23, emptybuf, 0, 0);
        int k;
        do
        {
            k = Math.min(j, 16384);
            safeWriteMessage((short)23, abyte0, i, k);
            i += k;
            k = j - k;
            j = k;
        } while (k > 0);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClient, DefaultTlsCipherFactory, TlsSRPKeyExchange, TlsFatalAlert, 
//            TlsCipherFactory, TlsUtils, ProtocolVersion, TlsNullCompression, 
//            TlsClientContext, TlsKeyExchange, TlsCipher, TlsCompression

public abstract class SRPTlsClient
    implements TlsClient
{

    public static final Integer EXT_SRP = new Integer(12);
    protected TlsCipherFactory cipherFactory;
    protected TlsClientContext context;
    protected byte identity[];
    protected byte password[];
    protected int selectedCipherSuite;
    protected int selectedCompressionMethod;

    public SRPTlsClient(TlsCipherFactory tlscipherfactory, byte abyte0[], byte abyte1[])
    {
        cipherFactory = tlscipherfactory;
        identity = Arrays.clone(abyte0);
        password = Arrays.clone(abyte1);
    }

    public SRPTlsClient(byte abyte0[], byte abyte1[])
    {
        this(((TlsCipherFactory) (new DefaultTlsCipherFactory())), abyte0, abyte1);
    }

    protected TlsKeyExchange createSRPKeyExchange(int i)
    {
        return new TlsSRPKeyExchange(context, i, identity, password);
    }

    public TlsCipher getCipher()
        throws IOException
    {
        switch (selectedCipherSuite)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 49178: 
        case 49179: 
        case 49180: 
            return cipherFactory.createCipher(context, 7, 2);

        case 49181: 
        case 49182: 
        case 49183: 
            return cipherFactory.createCipher(context, 8, 2);

        case 49184: 
        case 49185: 
        case 49186: 
            return cipherFactory.createCipher(context, 9, 2);
        }
    }

    public int[] getCipherSuites()
    {
        return (new int[] {
            49186, 49183, 49180, 49185, 49182, 49179, 49184, 49181, 49178
        });
    }

    public Hashtable getClientExtensions()
        throws IOException
    {
        Hashtable hashtable = new Hashtable();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeOpaque8(identity, bytearrayoutputstream);
        hashtable.put(EXT_SRP, bytearrayoutputstream.toByteArray());
        return hashtable;
    }

    public ProtocolVersion getClientVersion()
    {
        return ProtocolVersion.TLSv10;
    }

    public TlsCompression getCompression()
        throws IOException
    {
        switch (selectedCompressionMethod)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 0: // '\0'
            return new TlsNullCompression();
        }
    }

    public short[] getCompressionMethods()
    {
        return (new short[] {
            0
        });
    }

    public TlsKeyExchange getKeyExchange()
        throws IOException
    {
        switch (selectedCipherSuite)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 49178: 
        case 49181: 
        case 49184: 
            return createSRPKeyExchange(21);

        case 49179: 
        case 49182: 
        case 49185: 
            return createSRPKeyExchange(23);

        case 49180: 
        case 49183: 
        case 49186: 
            return createSRPKeyExchange(22);
        }
    }

    public void init(TlsClientContext tlsclientcontext)
    {
        context = tlsclientcontext;
    }

    public void notifySecureRenegotiation(boolean flag)
        throws IOException
    {
        if (flag);
    }

    public void notifySelectedCipherSuite(int i)
    {
        selectedCipherSuite = i;
    }

    public void notifySelectedCompressionMethod(short word0)
    {
        selectedCompressionMethod = word0;
    }

    public void notifyServerVersion(ProtocolVersion protocolversion)
        throws IOException
    {
        if (!ProtocolVersion.TLSv10.equals(protocolversion))
        {
            throw new TlsFatalAlert((short)47);
        } else
        {
            return;
        }
    }

    public void notifySessionID(byte abyte0[])
    {
    }

    public void processServerExtensions(Hashtable hashtable)
    {
    }

}

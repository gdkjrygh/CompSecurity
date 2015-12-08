// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.util.Hashtable;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClient, DefaultTlsCipherFactory, o, TlsFatalAlert, 
//            TlsCipherFactory, TlsUtils, TlsNullCompression, TlsClientContext, 
//            TlsKeyExchange, TlsCipher, TlsCompression

public abstract class SRPTlsClient
    implements TlsClient
{

    public static final Integer a = new Integer(12);
    protected TlsCipherFactory b;
    protected byte c[];
    protected byte d[];
    protected TlsClientContext e;
    protected int f;
    protected int g;

    public SRPTlsClient(TlsCipherFactory tlscipherfactory, byte abyte0[], byte abyte1[])
    {
        b = tlscipherfactory;
        c = Arrays.c(abyte0);
        d = Arrays.c(abyte1);
    }

    public SRPTlsClient(byte abyte0[], byte abyte1[])
    {
        this(((TlsCipherFactory) (new DefaultTlsCipherFactory())), abyte0, abyte1);
    }

    protected TlsKeyExchange createSRPKeyExchange(int i)
    {
        return new o(e, i, c, d);
    }

    public TlsCipher getCipher()
    {
        switch (g)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 49178: 
        case 49179: 
        case 49180: 
            return b.createCipher(e, 7, 2);

        case 49181: 
        case 49182: 
        case 49183: 
            return b.createCipher(e, 8, 2);

        case 49184: 
        case 49185: 
        case 49186: 
            return b.createCipher(e, 9, 2);
        }
    }

    public int[] getCipherSuites()
    {
        return (new int[] {
            49186, 49183, 49180, 49185, 49182, 49179, 49184, 49181, 49178
        });
    }

    public Hashtable getClientExtensions()
    {
        Hashtable hashtable = new Hashtable();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        TlsUtils.writeOpaque8(c, bytearrayoutputstream);
        hashtable.put(a, bytearrayoutputstream.toByteArray());
        return hashtable;
    }

    public TlsCompression getCompression()
    {
        switch (f)
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
    {
        switch (g)
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
        e = tlsclientcontext;
    }

    public void notifySecureRenegotiation(boolean flag)
    {
    }

    public void notifySelectedCipherSuite(int i)
    {
        g = i;
    }

    public void notifySelectedCompressionMethod(short word0)
    {
        f = word0;
    }

    public void notifySessionID(byte abyte0[])
    {
    }

    public void processServerExtensions(Hashtable hashtable)
    {
    }

}

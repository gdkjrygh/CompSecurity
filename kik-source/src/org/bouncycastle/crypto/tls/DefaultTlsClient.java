// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.util.Hashtable;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClient, DefaultTlsCipherFactory, d, e, 
//            h, i, m, TlsFatalAlert, 
//            TlsCipherFactory, TlsNullCompression, TlsClientContext, TlsKeyExchange, 
//            TlsCipher, TlsCompression

public abstract class DefaultTlsClient
    implements TlsClient
{

    protected TlsCipherFactory a;
    protected TlsClientContext b;
    protected int c;
    protected int d;

    public DefaultTlsClient()
    {
        this(((TlsCipherFactory) (new DefaultTlsCipherFactory())));
    }

    public DefaultTlsClient(TlsCipherFactory tlscipherfactory)
    {
        a = tlscipherfactory;
    }

    protected TlsKeyExchange createDHEKeyExchange(int j)
    {
        return new d(b, j);
    }

    protected TlsKeyExchange createDHKeyExchange(int j)
    {
        return new e(b, j);
    }

    protected TlsKeyExchange createECDHEKeyExchange(int j)
    {
        return new h(b, j);
    }

    protected TlsKeyExchange createECDHKeyExchange(int j)
    {
        return new i(b, j);
    }

    protected TlsKeyExchange createRSAKeyExchange()
    {
        return new m(b);
    }

    public TlsCipher getCipher()
    {
        switch (c)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 10: // '\n'
        case 13: // '\r'
        case 16: // '\020'
        case 19: // '\023'
        case 22: // '\026'
        case 49155: 
        case 49160: 
        case 49165: 
        case 49170: 
            return a.createCipher(b, 7, 2);

        case 47: // '/'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 49156: 
        case 49161: 
        case 49166: 
        case 49171: 
            return a.createCipher(b, 8, 2);

        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
        case 49157: 
        case 49162: 
        case 49167: 
        case 49172: 
            return a.createCipher(b, 9, 2);
        }
    }

    public int[] getCipherSuites()
    {
        return (new int[] {
            57, 56, 51, 50, 22, 19, 53, 47, 10
        });
    }

    public Hashtable getClientExtensions()
    {
        return null;
    }

    public TlsCompression getCompression()
    {
        switch (d)
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
        switch (c)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 10: // '\n'
        case 47: // '/'
        case 53: // '5'
            return createRSAKeyExchange();

        case 13: // '\r'
        case 48: // '0'
        case 54: // '6'
            return createDHKeyExchange(7);

        case 16: // '\020'
        case 49: // '1'
        case 55: // '7'
            return createDHKeyExchange(9);

        case 19: // '\023'
        case 50: // '2'
        case 56: // '8'
            return createDHEKeyExchange(3);

        case 22: // '\026'
        case 51: // '3'
        case 57: // '9'
            return createDHEKeyExchange(5);

        case 49155: 
        case 49156: 
        case 49157: 
            return createECDHKeyExchange(16);

        case 49160: 
        case 49161: 
        case 49162: 
            return createECDHEKeyExchange(17);

        case 49165: 
        case 49166: 
        case 49167: 
            return createECDHKeyExchange(18);

        case 49170: 
        case 49171: 
        case 49172: 
            return createECDHEKeyExchange(19);
        }
    }

    public void init(TlsClientContext tlsclientcontext)
    {
        b = tlsclientcontext;
    }

    public void notifySecureRenegotiation(boolean flag)
    {
    }

    public void notifySelectedCipherSuite(int j)
    {
        c = j;
    }

    public void notifySelectedCompressionMethod(short word0)
    {
        d = word0;
    }

    public void notifySessionID(byte abyte0[])
    {
    }

    public void processServerExtensions(Hashtable hashtable)
    {
    }
}

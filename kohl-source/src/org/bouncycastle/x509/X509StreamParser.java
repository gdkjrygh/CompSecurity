// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParser;
import org.bouncycastle.x509.util.StreamParsingException;

// Referenced classes of package org.bouncycastle.x509:
//            X509StreamParserSpi, NoSuchParserException, X509Util

public class X509StreamParser
    implements StreamParser
{

    private Provider _provider;
    private X509StreamParserSpi _spi;

    private X509StreamParser(Provider provider, X509StreamParserSpi x509streamparserspi)
    {
        _provider = provider;
        _spi = x509streamparserspi;
    }

    private static X509StreamParser createParser(X509Util.Implementation implementation)
    {
        X509StreamParserSpi x509streamparserspi = (X509StreamParserSpi)implementation.getEngine();
        return new X509StreamParser(implementation.getProvider(), x509streamparserspi);
    }

    public static X509StreamParser getInstance(String s)
        throws NoSuchParserException
    {
        try
        {
            s = createParser(X509Util.getImplementation("X509StreamParser", s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoSuchParserException(s.getMessage());
        }
        return s;
    }

    public static X509StreamParser getInstance(String s, String s1)
        throws NoSuchParserException, NoSuchProviderException
    {
        return getInstance(s, X509Util.getProvider(s1));
    }

    public static X509StreamParser getInstance(String s, Provider provider)
        throws NoSuchParserException
    {
        try
        {
            s = createParser(X509Util.getImplementation("X509StreamParser", s, provider));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoSuchParserException(s.getMessage());
        }
        return s;
    }

    public Provider getProvider()
    {
        return _provider;
    }

    public void init(InputStream inputstream)
    {
        _spi.engineInit(inputstream);
    }

    public void init(byte abyte0[])
    {
        _spi.engineInit(new ByteArrayInputStream(abyte0));
    }

    public Object read()
        throws StreamParsingException
    {
        return _spi.engineRead();
    }

    public Collection readAll()
        throws StreamParsingException
    {
        return _spi.engineReadAll();
    }
}

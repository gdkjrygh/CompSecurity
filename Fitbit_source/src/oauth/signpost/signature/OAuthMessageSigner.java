// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.signature;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;
import org.apache.commons.codec.a.a;

public abstract class OAuthMessageSigner
    implements Serializable
{

    private static final long serialVersionUID = 0x3db29529c4356102L;
    private transient a a;
    private String consumerSecret;
    private String tokenSecret;

    public OAuthMessageSigner()
    {
        a = new a();
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        a = new a();
    }

    public abstract String a();

    public abstract String a(oauth.signpost.http.a a1, HttpParameters httpparameters)
        throws OAuthMessageSignerException;

    protected String a(byte abyte0[])
    {
        return new String(a.b(abyte0));
    }

    public void a(String s)
    {
        consumerSecret = s;
    }

    public String b()
    {
        return consumerSecret;
    }

    public void b(String s)
    {
        tokenSecret = s;
    }

    public String c()
    {
        return tokenSecret;
    }

    protected byte[] c(String s)
    {
        return a.a(s.getBytes());
    }
}

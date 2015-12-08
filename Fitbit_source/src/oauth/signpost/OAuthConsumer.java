// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost;

import java.io.Serializable;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.http.a;
import oauth.signpost.signature.OAuthMessageSigner;
import oauth.signpost.signature.SigningStrategy;

public interface OAuthConsumer
    extends Serializable
{

    public abstract String a();

    public abstract String a(String s)
        throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException;

    public abstract a a(a a1)
        throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException;

    public abstract void a(String s, String s1);

    public abstract void a(HttpParameters httpparameters);

    public abstract void a(OAuthMessageSigner oauthmessagesigner);

    public abstract void a(SigningStrategy signingstrategy);

    public abstract void a(boolean flag);

    public abstract String b();

    public abstract a b(Object obj)
        throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException;

    public abstract String c();

    public abstract String d();

    public abstract HttpParameters e();
}

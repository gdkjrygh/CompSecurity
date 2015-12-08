// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost;

import java.io.Serializable;
import java.util.Map;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import oauth.signpost.http.HttpParameters;

// Referenced classes of package oauth.signpost:
//            OAuthConsumer, b

public interface OAuthProvider
    extends Serializable
{

    public transient abstract String a(OAuthConsumer oauthconsumer, String s, String as[])
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException;

    public abstract HttpParameters a();

    public abstract void a(String s, String s1);

    public abstract void a(b b1);

    public abstract void a(HttpParameters httpparameters);

    public abstract void a(boolean flag);

    public transient abstract void b(OAuthConsumer oauthconsumer, String s, String as[])
        throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException;

    public abstract void b(b b1);

    public abstract boolean b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract Map f();
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.exception;


// Referenced classes of package oauth.signpost.exception:
//            OAuthException

public class OAuthNotAuthorizedException extends OAuthException
{

    private static final String ERROR = "Authorization failed (server replied with a 401). This can happen if the consumer key was not correct or the signatures did not match.";
    private String responseBody;

    public OAuthNotAuthorizedException()
    {
        super("Authorization failed (server replied with a 401). This can happen if the consumer key was not correct or the signatures did not match.");
    }

    public OAuthNotAuthorizedException(String s)
    {
        super("Authorization failed (server replied with a 401). This can happen if the consumer key was not correct or the signatures did not match.");
        responseBody = s;
    }

    public String getResponseBody()
    {
        return responseBody;
    }
}

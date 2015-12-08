// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.exception;


// Referenced classes of package oauth.signpost.exception:
//            OAuthException

public class OAuthMessageSignerException extends OAuthException
{

    public OAuthMessageSignerException(Exception exception)
    {
        super(exception);
    }

    public OAuthMessageSignerException(String s)
    {
        super(s);
    }
}

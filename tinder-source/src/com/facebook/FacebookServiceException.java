// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            FacebookException, FacebookRequestError

public class FacebookServiceException extends FacebookException
{

    private static final long serialVersionUID = 1L;
    public final FacebookRequestError a;

    public FacebookServiceException(FacebookRequestError facebookrequesterror, String s)
    {
        super(s);
        a = facebookrequesterror;
    }

    public final String toString()
    {
        return (new StringBuilder("{FacebookServiceException: httpResponseCode: ")).append(a.b).append(", facebookErrorCode: ").append(a.c).append(", facebookErrorType: ").append(a.d).append(", message: ").append(a.a()).append("}").toString();
    }
}

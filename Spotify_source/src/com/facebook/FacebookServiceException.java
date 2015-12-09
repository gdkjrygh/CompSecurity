// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            FacebookException, FacebookRequestError

public class FacebookServiceException extends FacebookException
{

    private static final long serialVersionUID = 1L;
    final FacebookRequestError error;

    public FacebookServiceException(FacebookRequestError facebookrequesterror, String s)
    {
        super(s);
        error = facebookrequesterror;
    }

    public final String toString()
    {
        return (new StringBuilder("{FacebookServiceException: httpResponseCode: ")).append(error.a).append(", facebookErrorCode: ").append(error.b).append(", facebookErrorType: ").append(error.c).append(", message: ").append(error.a()).append("}").toString();
    }
}

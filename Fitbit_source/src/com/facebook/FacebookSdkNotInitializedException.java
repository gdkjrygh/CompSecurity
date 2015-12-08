// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            FacebookException

public class FacebookSdkNotInitializedException extends FacebookException
{

    static final long serialVersionUID = 1L;

    public FacebookSdkNotInitializedException()
    {
    }

    public FacebookSdkNotInitializedException(String s)
    {
        super(s);
    }

    public FacebookSdkNotInitializedException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public FacebookSdkNotInitializedException(Throwable throwable)
    {
        super(throwable);
    }
}

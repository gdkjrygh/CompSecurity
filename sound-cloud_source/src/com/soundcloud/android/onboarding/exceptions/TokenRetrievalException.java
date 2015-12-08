// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.exceptions;


// Referenced classes of package com.soundcloud.android.onboarding.exceptions:
//            SignInException

public class TokenRetrievalException extends SignInException
{

    public TokenRetrievalException(Throwable throwable)
    {
        super("error retrieving SC API token", throwable);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.exceptions;


// Referenced classes of package com.soundcloud.android.onboarding.exceptions:
//            SignInException

public class AddAccountException extends SignInException
{

    public AddAccountException()
    {
        super("Unable to add account during sign in");
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.landing;

import me.lyft.android.persistence.ISimpleStorage;

// Referenced classes of package me.lyft.android.persistence.landing:
//            ISignUpUserRepository, SignupUser

public class SignUpUserRepository
    implements ISignUpUserRepository
{

    private static final String SIGN_UP_USER_KEY = "SIGN_UP_USER_KEY";
    private ISimpleStorage simpleStorage;

    public SignUpUserRepository(ISimpleStorage isimplestorage)
    {
        simpleStorage = isimplestorage;
    }

    public SignupUser get()
    {
        return (SignupUser)simpleStorage.getOrDefault("SIGN_UP_USER_KEY", me/lyft/android/persistence/landing/SignupUser, SignupUser.empty());
    }

    public void reset()
    {
        update(SignupUser.empty());
    }

    public void update(SignupUser signupuser)
    {
        simpleStorage.put("SIGN_UP_USER_KEY", signupuser);
    }
}

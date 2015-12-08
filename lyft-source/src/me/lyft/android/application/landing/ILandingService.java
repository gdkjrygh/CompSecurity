// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing;

import me.lyft.android.persistence.landing.SignupUser;
import rx.Observable;

public interface ILandingService
{

    public abstract void agreedTermsOfService(boolean flag);

    public abstract Observable createFacebookUser();

    public abstract Observable createUser(SignupUser signupuser);

    public abstract Observable loadUser();

    public abstract Observable refreshFacebookToken();

    public abstract Observable requestVerificationCode(String s, Boolean boolean1);

    public abstract Observable setTosAcceptedAndUpdateUser();

    public abstract Observable updateExistingUser(SignupUser signupuser);

    public abstract Observable verifyPhone(String s, String s1);
}

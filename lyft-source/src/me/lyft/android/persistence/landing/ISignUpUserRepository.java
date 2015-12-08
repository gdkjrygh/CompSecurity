// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.landing;


// Referenced classes of package me.lyft.android.persistence.landing:
//            SignupUser

public interface ISignUpUserRepository
{

    public abstract SignupUser get();

    public abstract void reset();

    public abstract void update(SignupUser signupuser);
}

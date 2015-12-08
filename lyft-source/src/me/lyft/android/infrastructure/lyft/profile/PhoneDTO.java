// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.profile;


public class PhoneDTO
{

    public final String number;
    public final Integer verificationCode;
    public final Boolean verificationNeeded;

    public PhoneDTO(String s, Integer integer, Boolean boolean1)
    {
        number = s;
        verificationCode = integer;
        verificationNeeded = boolean1;
    }

    public String getNumber()
    {
        return number;
    }

    public Boolean getVerificationNeeded()
    {
        return verificationNeeded;
    }
}

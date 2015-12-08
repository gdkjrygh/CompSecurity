// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.affiliations;


public class FollowError
{

    private static final String AGE_RESTRICTED = "DENY_AGE_RESTRICTED";
    private static final String AGE_UNKNOWN = "DENY_AGE_UNKNOWN";
    public final Integer age;
    public final String errorMessage;

    public FollowError(String s, Integer integer)
    {
        errorMessage = s;
        age = integer;
    }

    public boolean isAgeRestricted()
    {
        return "DENY_AGE_RESTRICTED".equals(errorMessage);
    }

    public boolean isAgeUnknown()
    {
        return "DENY_AGE_UNKNOWN".equals(errorMessage);
    }

    public String toString()
    {
        return (new StringBuilder("ApiError{errorMessage='")).append(errorMessage).append('\'').append(", age=").append(age).append('}').toString();
    }
}

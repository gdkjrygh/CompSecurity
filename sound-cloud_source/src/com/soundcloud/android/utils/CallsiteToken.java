// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;


public final class CallsiteToken extends Throwable
{

    private CallsiteToken()
    {
    }

    public static CallsiteToken build()
    {
        return new CallsiteToken();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.webapi;


public final class AuthorizationCredentials
{

    public String netflixId;
    public String secureNetflixId;

    public AuthorizationCredentials(String s, String s1)
    {
        netflixId = s;
        secureNetflixId = s1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient;


public interface UserCredentialRegistry
{

    public abstract String getNetflixID();

    public abstract String getNetflixIdName();

    public abstract String getSecureNetflixID();

    public abstract String getSecureNetflixIdName();

    public abstract boolean updateUserCredentials(String s, String s1);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;


public class InstagramAuthError
{

    public String errorMessage;
    public int status;

    public InstagramAuthError(int i, String s)
    {
        status = i;
        errorMessage = s;
    }
}

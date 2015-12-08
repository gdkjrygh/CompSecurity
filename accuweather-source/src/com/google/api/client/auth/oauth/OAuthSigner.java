// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth;

import java.security.GeneralSecurityException;

public interface OAuthSigner
{

    public abstract String computeSignature(String s)
        throws GeneralSecurityException;

    public abstract String getSignatureMethod();
}

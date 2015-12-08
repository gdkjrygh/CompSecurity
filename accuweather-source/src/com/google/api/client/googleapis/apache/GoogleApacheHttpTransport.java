// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.apache;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.http.apache.ApacheHttpTransport;
import java.io.IOException;
import java.security.GeneralSecurityException;

public final class GoogleApacheHttpTransport
{

    private GoogleApacheHttpTransport()
    {
    }

    public static ApacheHttpTransport newTrustedTransport()
        throws GeneralSecurityException, IOException
    {
        return (new com.google.api.client.http.apache.ApacheHttpTransport.Builder()).trustCertificates(GoogleUtils.getCertificateTrustStore()).build();
    }
}

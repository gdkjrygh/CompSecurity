// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis;

import com.google.api.client.util.SecurityUtils;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

public final class GoogleUtils
{

    public static final Integer BUGFIX_VERSION;
    public static final Integer MAJOR_VERSION;
    public static final Integer MINOR_VERSION;
    public static final String VERSION;
    static KeyStore certTrustStore;

    private GoogleUtils()
    {
    }

    public static KeyStore getCertificateTrustStore()
        throws IOException, GeneralSecurityException
    {
        com/google/api/client/googleapis/GoogleUtils;
        JVM INSTR monitorenter ;
        KeyStore keystore;
        if (certTrustStore == null)
        {
            certTrustStore = SecurityUtils.getJavaKeyStore();
            java.io.InputStream inputstream = com/google/api/client/googleapis/GoogleUtils.getResourceAsStream("google.jks");
            SecurityUtils.loadKeyStore(certTrustStore, inputstream, "notasecret");
        }
        keystore = certTrustStore;
        com/google/api/client/googleapis/GoogleUtils;
        JVM INSTR monitorexit ;
        return keystore;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        MAJOR_VERSION = Integer.valueOf(1);
        MINOR_VERSION = Integer.valueOf(19);
        BUGFIX_VERSION = Integer.valueOf(0);
        String s = String.valueOf(String.valueOf(MAJOR_VERSION));
        String s1 = String.valueOf(String.valueOf(MINOR_VERSION));
        String s2 = String.valueOf(String.valueOf(BUGFIX_VERSION));
        VERSION = (new StringBuilder(s.length() + 2 + s1.length() + s2.length())).append(s).append(".").append(s1).append(".").append(s2).toString().toString();
    }
}

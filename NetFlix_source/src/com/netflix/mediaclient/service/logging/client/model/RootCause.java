// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;


public final class RootCause extends Enum
{

    private static final RootCause $VALUES[];
    public static final RootCause clientFailure;
    public static final RootCause clientRequestBad;
    public static final RootCause dnsLookupFailure;
    public static final RootCause dnsTimeout;
    public static final RootCause http4xx;
    public static final RootCause http5xx;
    public static final RootCause networkFailure;
    public static final RootCause serverFailure;
    public static final RootCause serverResponseBad;
    public static final RootCause sslExpiredCert;
    public static final RootCause sslHandshakeFailure;
    public static final RootCause sslNoCipher;
    public static final RootCause sslUntrustedCert;
    public static final RootCause tcpConnectionRefusal;
    public static final RootCause tcpConnectionTimeout;
    public static final RootCause tcpNoRouteToHost;
    public static final RootCause unknownFailure;

    private RootCause(String s, int i)
    {
        super(s, i);
    }

    public static RootCause valueOf(String s)
    {
        return (RootCause)Enum.valueOf(com/netflix/mediaclient/service/logging/client/model/RootCause, s);
    }

    public static RootCause[] values()
    {
        return (RootCause[])$VALUES.clone();
    }

    static 
    {
        dnsTimeout = new RootCause("dnsTimeout", 0);
        dnsLookupFailure = new RootCause("dnsLookupFailure", 1);
        tcpConnectionTimeout = new RootCause("tcpConnectionTimeout", 2);
        tcpNoRouteToHost = new RootCause("tcpNoRouteToHost", 3);
        tcpConnectionRefusal = new RootCause("tcpConnectionRefusal", 4);
        sslUntrustedCert = new RootCause("sslUntrustedCert", 5);
        sslExpiredCert = new RootCause("sslExpiredCert", 6);
        sslNoCipher = new RootCause("sslNoCipher", 7);
        sslHandshakeFailure = new RootCause("sslHandshakeFailure", 8);
        networkFailure = new RootCause("networkFailure", 9);
        http4xx = new RootCause("http4xx", 10);
        http5xx = new RootCause("http5xx", 11);
        clientRequestBad = new RootCause("clientRequestBad", 12);
        clientFailure = new RootCause("clientFailure", 13);
        serverResponseBad = new RootCause("serverResponseBad", 14);
        serverFailure = new RootCause("serverFailure", 15);
        unknownFailure = new RootCause("unknownFailure", 16);
        $VALUES = (new RootCause[] {
            dnsTimeout, dnsLookupFailure, tcpConnectionTimeout, tcpNoRouteToHost, tcpConnectionRefusal, sslUntrustedCert, sslExpiredCert, sslNoCipher, sslHandshakeFailure, networkFailure, 
            http4xx, http5xx, clientRequestBad, clientFailure, serverResponseBad, serverFailure, unknownFailure
        });
    }
}

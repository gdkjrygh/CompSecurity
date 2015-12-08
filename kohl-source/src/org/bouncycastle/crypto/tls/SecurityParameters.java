// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


public class SecurityParameters
{

    byte clientRandom[];
    byte masterSecret[];
    byte serverRandom[];

    public SecurityParameters()
    {
        clientRandom = null;
        serverRandom = null;
        masterSecret = null;
    }

    public byte[] getClientRandom()
    {
        return clientRandom;
    }

    public byte[] getMasterSecret()
    {
        return masterSecret;
    }

    public byte[] getServerRandom()
    {
        return serverRandom;
    }
}

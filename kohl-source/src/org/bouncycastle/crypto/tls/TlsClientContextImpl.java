// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClientContext, ProtocolVersion, SecurityParameters

class TlsClientContextImpl
    implements TlsClientContext
{

    private ProtocolVersion clientVersion;
    private SecureRandom secureRandom;
    private SecurityParameters securityParameters;
    private ProtocolVersion serverVersion;
    private Object userObject;

    TlsClientContextImpl(SecureRandom securerandom, SecurityParameters securityparameters)
    {
        clientVersion = null;
        serverVersion = null;
        userObject = null;
        secureRandom = securerandom;
        securityParameters = securityparameters;
    }

    public ProtocolVersion getClientVersion()
    {
        return clientVersion;
    }

    public SecureRandom getSecureRandom()
    {
        return secureRandom;
    }

    public SecurityParameters getSecurityParameters()
    {
        return securityParameters;
    }

    public ProtocolVersion getServerVersion()
    {
        return serverVersion;
    }

    public Object getUserObject()
    {
        return userObject;
    }

    public void setClientVersion(ProtocolVersion protocolversion)
    {
        clientVersion = protocolversion;
    }

    public void setServerVersion(ProtocolVersion protocolversion)
    {
        serverVersion = protocolversion;
    }

    public void setUserObject(Object obj)
    {
        userObject = obj;
    }
}

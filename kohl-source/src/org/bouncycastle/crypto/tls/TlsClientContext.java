// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            ProtocolVersion, SecurityParameters

public interface TlsClientContext
{

    public abstract ProtocolVersion getClientVersion();

    public abstract SecureRandom getSecureRandom();

    public abstract SecurityParameters getSecurityParameters();

    public abstract ProtocolVersion getServerVersion();

    public abstract Object getUserObject();

    public abstract void setUserObject(Object obj);
}

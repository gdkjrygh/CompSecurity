// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClientContext, SecurityParameters

final class c
    implements TlsClientContext
{

    private SecureRandom a;
    private SecurityParameters b;
    private Object c;

    c(SecureRandom securerandom, SecurityParameters securityparameters)
    {
        c = null;
        a = securerandom;
        b = securityparameters;
    }

    public final SecureRandom getSecureRandom()
    {
        return a;
    }

    public final SecurityParameters getSecurityParameters()
    {
        return b;
    }

    public final Object getUserObject()
    {
        return c;
    }

    public final void setUserObject(Object obj)
    {
        c = obj;
    }
}

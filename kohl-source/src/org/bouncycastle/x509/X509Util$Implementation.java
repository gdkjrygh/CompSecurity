// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.security.Provider;

// Referenced classes of package org.bouncycastle.x509:
//            X509Util

static class provider
{

    Object engine;
    Provider provider;

    Object getEngine()
    {
        return engine;
    }

    Provider getProvider()
    {
        return provider;
    }

    (Object obj, Provider provider1)
    {
        engine = obj;
        provider = provider1;
    }
}

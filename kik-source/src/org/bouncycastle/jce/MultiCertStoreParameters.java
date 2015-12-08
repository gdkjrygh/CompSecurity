// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

public class MultiCertStoreParameters
    implements CertStoreParameters
{

    private Collection a;
    private boolean b;

    public final Collection a()
    {
        return a;
    }

    public final boolean b()
    {
        return b;
    }

    public Object clone()
    {
        return this;
    }
}

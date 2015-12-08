// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.PublicKey;
import org.spongycastle.asn1.x509.SubjectKeyIdentifier;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.jce.provider:
//            JDKPKCS12KeyStore

private final class a
{

    byte a[];
    final JDKPKCS12KeyStore b;

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof a))
        {
            return false;
        } else
        {
            obj = (a)obj;
            return Arrays.a(a, ((a) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return Arrays.a(a);
    }

    (JDKPKCS12KeyStore jdkpkcs12keystore, PublicKey publickey)
    {
        b = jdkpkcs12keystore;
        super();
        a = JDKPKCS12KeyStore.a(publickey).c();
    }

    a(JDKPKCS12KeyStore jdkpkcs12keystore, byte abyte0[])
    {
        b = jdkpkcs12keystore;
        super();
        a = abyte0;
    }
}

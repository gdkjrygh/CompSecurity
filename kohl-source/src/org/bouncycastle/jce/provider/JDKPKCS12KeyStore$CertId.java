// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.PublicKey;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKPKCS12KeyStore

private class id
{

    byte id[];
    final JDKPKCS12KeyStore this$0;

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof id))
        {
            return false;
        } else
        {
            obj = (id)obj;
            return Arrays.areEqual(id, ((id) (obj)).id);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(id);
    }

    (PublicKey publickey)
    {
        this$0 = JDKPKCS12KeyStore.this;
        super();
        id = JDKPKCS12KeyStore.access$100(JDKPKCS12KeyStore.this, publickey).getKeyIdentifier();
    }

    dentifier(byte abyte0[])
    {
        this$0 = JDKPKCS12KeyStore.this;
        super();
        id = abyte0;
    }
}

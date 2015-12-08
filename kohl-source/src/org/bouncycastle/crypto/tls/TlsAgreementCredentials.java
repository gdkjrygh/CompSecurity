// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCredentials

public interface TlsAgreementCredentials
    extends TlsCredentials
{

    public abstract byte[] generateAgreement(AsymmetricKeyParameter asymmetrickeyparameter)
        throws IOException;
}

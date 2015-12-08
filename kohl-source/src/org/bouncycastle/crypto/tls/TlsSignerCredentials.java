// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCredentials

public interface TlsSignerCredentials
    extends TlsCredentials
{

    public abstract byte[] generateCertificateSignature(byte abyte0[])
        throws IOException;
}

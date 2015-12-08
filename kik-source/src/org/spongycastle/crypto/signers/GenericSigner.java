// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.signers;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;

public class GenericSigner
    implements Signer
{

    private final Digest a;

    public final void a(byte byte0)
    {
        a.a(byte0);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }
}

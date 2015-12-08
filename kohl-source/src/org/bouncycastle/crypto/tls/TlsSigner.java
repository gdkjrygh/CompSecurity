// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

interface TlsSigner
{

    public abstract byte[] calculateRawSignature(SecureRandom securerandom, AsymmetricKeyParameter asymmetrickeyparameter, byte abyte0[])
        throws CryptoException;

    public abstract Signer createVerifyer(AsymmetricKeyParameter asymmetrickeyparameter);

    public abstract boolean isValidPublicKey(AsymmetricKeyParameter asymmetrickeyparameter);
}

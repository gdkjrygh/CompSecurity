// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import com.google.android.apps.wallet.encryption.JsonLiteralKeyczarReader;
import com.google.android.apps.wallet.globalresources.GlobalResourceManager;
import org.keyczar.DefaultKeyType;
import org.keyczar.Encrypter;
import org.keyczar.SignedSessionEncrypter;
import org.keyczar.Signer;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.KeyczarException;

class WobEncrypter
{
    static final class EncryptedData
    {

        public byte bytes[];
        public String sessionMaterial;

        EncryptedData()
        {
        }
    }


    private GlobalResourceManager globalResourceManager;

    public WobEncrypter(GlobalResourceManager globalresourcemanager)
    {
        globalResourceManager = globalresourcemanager;
    }

    public final EncryptedData encrypt(byte abyte0[])
        throws KeyczarException
    {
        Object obj = globalResourceManager.blockingGet().wobEncryptionKey;
        if (obj == null || ((com.google.wallet.proto.NanoWalletEntities.KeyczarSignedSessionKeyPair) (obj)).encryptionKey == null || ((com.google.wallet.proto.NanoWalletEntities.KeyczarSignedSessionKeyPair) (obj)).signingKey == null)
        {
            throw new KeyczarException("Wob encryption keys missing from global resources.");
        } else
        {
            EncryptedData encrypteddata = new EncryptedData();
            obj = new SignedSessionEncrypter(new Encrypter(new JsonLiteralKeyczarReader(KeyPurpose.ENCRYPT, DefaultKeyType.RSA_PUB, ((com.google.wallet.proto.NanoWalletEntities.KeyczarSignedSessionKeyPair) (obj)).encryptionKey)), new Signer(new JsonLiteralKeyczarReader(KeyPurpose.SIGN_AND_VERIFY, DefaultKeyType.DSA_PRIV, ((com.google.wallet.proto.NanoWalletEntities.KeyczarSignedSessionKeyPair) (obj)).signingKey)));
            encrypteddata.sessionMaterial = ((SignedSessionEncrypter) (obj)).newSession();
            encrypteddata.bytes = ((SignedSessionEncrypter) (obj)).encrypt(abyte0);
            return encrypteddata;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import com.google.android.apps.wallet.encryption.api.PinEncryptionPrewarmer;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            KeyczarBillingKeysEncryptionService, EncryptionService, KeyczarPrewarmerImpl, KeyczarTorinoKeysEncryptionService, 
//            CryptorService

public class EncryptionModule
{

    public EncryptionModule()
    {
    }

    static EncryptionService getBillingEncryptionService(KeyczarBillingKeysEncryptionService keyczarbillingkeysencryptionservice)
    {
        return keyczarbillingkeysencryptionservice;
    }

    static PinEncryptionPrewarmer getEncryptionPrewarmer(KeyczarPrewarmerImpl keyczarprewarmerimpl)
    {
        return keyczarprewarmerimpl;
    }

    static CryptorService getTorinoEncryptionService(KeyczarTorinoKeysEncryptionService keyczartorinokeysencryptionservice)
    {
        return keyczartorinokeysencryptionservice;
    }
}

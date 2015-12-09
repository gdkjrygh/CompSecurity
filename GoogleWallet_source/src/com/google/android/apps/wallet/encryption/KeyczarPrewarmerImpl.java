// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import com.google.android.apps.wallet.encryption.api.PinEncryptionPrewarmer;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            KeyczarBillingKeysEncryptionService

public class KeyczarPrewarmerImpl
    implements PinEncryptionPrewarmer
{

    private final KeyczarBillingKeysEncryptionService encryptionService;
    private final Executor executor;

    public KeyczarPrewarmerImpl(KeyczarBillingKeysEncryptionService keyczarbillingkeysencryptionservice, Executor executor1)
    {
        encryptionService = keyczarbillingkeysencryptionservice;
        executor = executor1;
    }

    public final void prewarm()
    {
        executor.execute(new Runnable() {

            final KeyczarPrewarmerImpl this$0;

            public final void run()
            {
                encryptionService.newSession();
            }

            
            {
                this$0 = KeyczarPrewarmerImpl.this;
                super();
            }
        });
    }

}

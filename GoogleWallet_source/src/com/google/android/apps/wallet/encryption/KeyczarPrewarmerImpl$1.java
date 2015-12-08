// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;


// Referenced classes of package com.google.android.apps.wallet.encryption:
//            KeyczarPrewarmerImpl, KeyczarBillingKeysEncryptionService

final class this._cls0
    implements Runnable
{

    final KeyczarPrewarmerImpl this$0;

    public final void run()
    {
        KeyczarPrewarmerImpl.access$000(KeyczarPrewarmerImpl.this).newSession();
    }

    ptionService()
    {
        this$0 = KeyczarPrewarmerImpl.this;
        super();
    }
}

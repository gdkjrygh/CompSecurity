// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.bankaccount.api.BankAccountClient;
import com.google.android.apps.wallet.encryption.EncryptionService;
import com.google.android.apps.wallet.money.CurrencyUtil;
import java.util.Locale;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            AddBankAccountActivity

final class val.routingNumber
    implements Callable
{

    final AddBankAccountActivity this$0;
    final String val$accountHolderName;
    final String val$accountNumber;
    final int val$accountType;
    final String val$routingNumber;

    private com.google.wallet.proto.api.ankAccountResponse call()
        throws Exception
    {
        String s;
        com.google.wallet.proto.api.ankAccountRequest.EncryptedAccountData encryptedaccountdata;
        Object obj;
        if (val$accountNumber.length() < 4)
        {
            s = val$accountNumber;
        } else
        {
            s = val$accountNumber.substring(val$accountNumber.length() - 4);
        }
        obj = encryptionService.newSession();
        encryptedaccountdata = new com.google.wallet.proto.api.ankAccountRequest.EncryptedAccountData();
        encryptedaccountdata.encryptedAccountNumber = (String)((com.google.android.apps.wallet.encryption.ionSession) (obj)).encrypt(val$accountNumber);
        encryptedaccountdata.billingPublicKeyEncryptedSessionMaterial = (String)((com.google.android.apps.wallet.encryption.ionSession) (obj)).getSessionMaterial();
        obj = new com.google.wallet.proto.api.ankAccountRequest();
        obj.encryptedAccountData = encryptedaccountdata;
        obj.accountType = Integer.valueOf(val$accountType);
        obj.accountHolderName = val$accountHolderName;
        obj.accountNumberTrailingDigits = s;
        obj.bankCode = val$routingNumber;
        obj.regionCode = CurrencyUtil.getLegalAddressLocale().getCountry();
        return bankAccountClient.addBankAccount(((com.google.wallet.proto.api.ankAccountRequest) (obj)));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    nse()
    {
        this$0 = final_addbankaccountactivity;
        val$accountNumber = s;
        val$accountType = i;
        val$accountHolderName = s1;
        val$routingNumber = String.this;
        super();
    }
}

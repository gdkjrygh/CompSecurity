// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.encryption.EncryptionService;
import com.google.android.apps.wallet.kyc.api.KycClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycFullSsnActivity

final class val.ssn
    implements Callable
{

    final KycFullSsnActivity this$0;
    final String val$ssn;

    private com.google.wallet.proto.api.ullSsnResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.ullSsnRequest ullssnrequest = new com.google.wallet.proto.api.ullSsnRequest();
        com.google.android.apps.wallet.encryption.ryptionSession ryptionsession = encryptionService.newSession();
        com.google.wallet.proto.ntEncryptedData ntencrypteddata = new com.google.wallet.proto.ntEncryptedData();
        ntencrypteddata.sessionMaterial = (String)ryptionsession.getSessionMaterial();
        ntencrypteddata.payload = (String)ryptionsession.encrypt(val$ssn);
        ullssnrequest.fullSsn = ntencrypteddata;
        return kycClient.submitFullSsn(ullssnrequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    esponse()
    {
        this$0 = final_kycfullssnactivity;
        val$ssn = String.this;
        super();
    }
}

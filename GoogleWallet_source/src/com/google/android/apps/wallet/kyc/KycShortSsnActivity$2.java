// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.content.Intent;
import com.google.android.apps.wallet.encryption.EncryptionService;
import com.google.android.apps.wallet.kyc.api.KycClient;
import com.google.protobuf.nano.MessageNano;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycShortSsnActivity

final class val.ssn
    implements Callable
{

    final KycShortSsnActivity this$0;
    final String val$ssn;

    private com.google.wallet.proto.api.rificationDocumentResponse call()
        throws Exception
    {
        byte abyte0[] = getIntent().getByteArrayExtra("CLIENT_ENCRYPTED_DATA");
        com.google.wallet.proto.tEncryptedData tencrypteddata = (com.google.wallet.proto.tEncryptedData)MessageNano.mergeFrom(new com.google.wallet.proto.tEncryptedData(), abyte0);
        Object obj = encryptionService.newSession();
        com.google.wallet.proto.tEncryptedData tencrypteddata1 = new com.google.wallet.proto.tEncryptedData();
        tencrypteddata1.sessionMaterial = (String)((com.google.android.apps.wallet.encryption.yptionSession) (obj)).getSessionMaterial();
        tencrypteddata1.payload = (String)((com.google.android.apps.wallet.encryption.yptionSession) (obj)).encrypt(val$ssn);
        obj = new com.google.wallet.proto.api.rificationDocumentRequest();
        obj.identityDocument = tencrypteddata;
        obj.ssnLastFour = tencrypteddata1;
        obj.mimeType = "image/jpeg";
        return kycClient.submitVerificationDocument(((com.google.wallet.proto.api.rificationDocumentRequest) (obj)));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ionDocumentResponse()
    {
        this$0 = final_kycshortssnactivity;
        val$ssn = String.this;
        super();
    }
}

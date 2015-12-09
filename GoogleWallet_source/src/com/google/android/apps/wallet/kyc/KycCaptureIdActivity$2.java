// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.rpc.CrossbarEesClientService;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycCaptureIdActivity

final class this._cls0
    implements Callable
{

    final KycCaptureIdActivity this$0;

    private com.google.wallet.proto.EncryptedData call()
        throws Exception
    {
        return crossbarEesClientService.encrypt(KycCaptureIdActivity.access$100(KycCaptureIdActivity.this)).encryptedFile;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ta()
    {
        this$0 = KycCaptureIdActivity.this;
        super();
    }
}

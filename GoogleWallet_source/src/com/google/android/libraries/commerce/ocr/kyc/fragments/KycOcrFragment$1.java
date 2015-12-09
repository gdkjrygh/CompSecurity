// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.fragments;

import com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResultHandler;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.fragments:
//            KycOcrFragment, ImageCaptureFragment, KycOcrBundleModule, KycOcrResultImpl

final class this._cls0
    implements Runnable
{

    final KycOcrFragment this$0;

    public final void run()
    {
label0:
        {
            if (isResumed())
            {
                com.google.android.libraries.commerce.ocr.kyc.pub. ;
                if (KycOcrFragment.access$000(KycOcrFragment.this).getSide() == com.google.android.libraries.commerce.ocr.kyc.pub..FRONT)
                {
                     = com.google.android.libraries.commerce.ocr.kyc.pub..BACK;
                } else
                {
                     = com.google.android.libraries.commerce.ocr.kyc.pub..FRONT;
                }
                if (!KycOcrBundleModule.captureBothSides(getArguments()) || KycOcrFragment.access$100(KycOcrFragment.this).getSideImage() != null)
                {
                    break label0;
                }
                KycOcrFragment.access$000(KycOcrFragment.this).setSide();
                KycOcrFragment.access$000(KycOcrFragment.this).resumeFromPause();
            }
            return;
        }
        KycOcrFragment.access$200(KycOcrFragment.this).onRecognized(KycOcrFragment.access$100(KycOcrFragment.this));
    }

    e()
    {
        this$0 = KycOcrFragment.this;
        super();
    }
}

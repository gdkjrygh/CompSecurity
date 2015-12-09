// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.view.animation.Interpolator;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.ui:
//            KycOcrPreviewOverlayView

final class this._cls0
    implements Interpolator
{

    final KycOcrPreviewOverlayView this$0;

    public final float getInterpolation(float f)
    {
        return 1.0F - f;
    }

    ()
    {
        this$0 = KycOcrPreviewOverlayView.this;
        super();
    }
}

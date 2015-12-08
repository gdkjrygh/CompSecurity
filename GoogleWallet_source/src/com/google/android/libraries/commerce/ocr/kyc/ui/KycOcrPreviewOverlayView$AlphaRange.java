// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.animation.ObjectAnimator;
import android.view.View;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.ui:
//            KycOcrPreviewOverlayView

static final class end
{

    private final float end;
    private final float start;

    final ObjectAnimator animate(View view)
    {
        return ObjectAnimator.ofFloat(view, "alpha", new float[] {
            start, end
        });
    }

    final end reverse()
    {
        return new <init>(end, start);
    }

    (float f, float f1)
    {
        start = f;
        end = f1;
    }
}

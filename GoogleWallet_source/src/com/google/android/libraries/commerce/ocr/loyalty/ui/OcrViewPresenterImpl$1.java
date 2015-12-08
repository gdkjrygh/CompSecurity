// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.graphics.Point;
import android.graphics.Rect;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            OcrViewPresenterImpl

final class this._cls0
    implements com.google.android.libraries.commerce.ocr.ui.viewLayoutFinalizedCallback
{

    final OcrViewPresenterImpl this$0;

    public final void onFinalized(Rect rect, Point point)
    {
        onPreviewLayoutFinalized(rect, point);
    }

    utFinalizedCallback()
    {
        this$0 = OcrViewPresenterImpl.this;
        super();
    }
}

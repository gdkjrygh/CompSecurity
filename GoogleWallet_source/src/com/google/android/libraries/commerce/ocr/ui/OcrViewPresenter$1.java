// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;


// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            OcrViewPresenter

final class this._cls0
    implements com.google.android.libraries.commerce.ocr.capture.ishCallback
{

    final OcrViewPresenter this$0;

    public final void onFinish()
    {
        onPreviewReady();
    }

    OnFinishCallback()
    {
        this$0 = OcrViewPresenter.this;
        super();
    }
}

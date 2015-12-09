// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.widget.Toast;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            OcrViewImpl

final class val.resourceId
    implements Runnable
{

    final OcrViewImpl this$0;
    final int val$resourceId;

    public final void run()
    {
        Toast.makeText(OcrViewImpl.access$000(OcrViewImpl.this), val$resourceId, 1).show();
    }

    ()
    {
        this$0 = final_ocrviewimpl;
        val$resourceId = I.this;
        super();
    }
}

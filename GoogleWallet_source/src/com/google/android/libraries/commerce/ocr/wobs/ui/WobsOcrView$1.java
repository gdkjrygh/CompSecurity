// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import android.widget.Toast;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.ui:
//            WobsOcrView

final class val.resourceId
    implements Runnable
{

    final WobsOcrView this$0;
    final int val$resourceId;

    public final void run()
    {
        Toast.makeText(WobsOcrView.access$000(WobsOcrView.this), val$resourceId, 1).show();
    }

    ()
    {
        this$0 = final_wobsocrview;
        val$resourceId = I.this;
        super();
    }
}

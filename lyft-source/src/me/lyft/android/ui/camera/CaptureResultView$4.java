// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureResultView

class SaveListener
    implements android.view.
{

    final CaptureResultView this$0;
    final SaveListener val$onSaveListener;

    public void onClick(View view)
    {
        val$onSaveListener.onSave();
    }

    SaveListener()
    {
        this$0 = final_captureresultview;
        val$onSaveListener = SaveListener.this;
        super();
    }
}

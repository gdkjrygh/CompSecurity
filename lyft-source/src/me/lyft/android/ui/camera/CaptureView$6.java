// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.ui.dialogs.DialogResult;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureView

class this._cls0
    implements Action1
{

    final CaptureView this$0;

    public volatile void call(Object obj)
    {
        call((DialogResult)obj);
    }

    public void call(DialogResult dialogresult)
    {
        captureImageSession.cancel();
    }

    aptureImageSession()
    {
        this$0 = CaptureView.this;
        super();
    }
}

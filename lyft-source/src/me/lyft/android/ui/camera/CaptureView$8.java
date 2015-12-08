// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureView

class this._cls0
    implements android.view.stener
{

    final CaptureView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getActionMasked() == 0 && CaptureView.access$500(CaptureView.this) && (CaptureView.access$600(CaptureView.this) == 0 || CaptureView.access$600(CaptureView.this) == 3))
        {
            CaptureView.access$700(CaptureView.this);
            CaptureView.access$602(CaptureView.this, 1);
        }
        return false;
    }

    ()
    {
        this$0 = CaptureView.this;
        super();
    }
}

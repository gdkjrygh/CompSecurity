// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureView

class this._cls0
    implements Action1
{

    final CaptureView this$0;

    public void call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            CaptureView.access$300(CaptureView.this);
            return;
        } else
        {
            CaptureView.access$400(CaptureView.this);
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = CaptureView.this;
        super();
    }
}

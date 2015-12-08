// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.camera;

import java.io.File;
import me.lyft.android.common.AppFlow;
import me.lyft.android.rx.SimpleSubscriber;

// Referenced classes of package me.lyft.android.infrastructure.camera:
//            CaptureImageSession

class this._cls0 extends SimpleSubscriber
{

    final CaptureImageSession this$0;

    public void onError(Throwable throwable)
    {
        CaptureImageSession.access$100(CaptureImageSession.this).resetTo(CaptureImageSession.access$000(CaptureImageSession.this));
    }

    public void onNext(File file)
    {
        CaptureImageSession.access$100(CaptureImageSession.this).resetTo(CaptureImageSession.access$000(CaptureImageSession.this));
    }

    public volatile void onNext(Object obj)
    {
        onNext((File)obj);
    }

    A()
    {
        this$0 = CaptureImageSession.this;
        super();
    }
}

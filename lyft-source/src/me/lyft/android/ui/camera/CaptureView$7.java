// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import java.io.FileOutputStream;
import me.lyft.android.common.Closeables;
import me.lyft.android.utils.FileUtils;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureView

class val.data
    implements rx.ubscribe
{

    final CaptureView this$0;
    final byte val$data[];

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        FileOutputStream fileoutputstream = null;
        FileOutputStream fileoutputstream1;
        java.io.File file;
        file = FileUtils.getTemporaryFile(getContext(), "camera_capture.jpg");
        fileoutputstream1 = new FileOutputStream(file);
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write(val$data);
        fileoutputstream = fileoutputstream1;
        subscriber.onNext(file);
        fileoutputstream = fileoutputstream1;
        subscriber.onCompleted();
        Closeables.closeQuietly(fileoutputstream1);
        return;
        Throwable throwable;
        throwable;
        fileoutputstream1 = null;
_L4:
        fileoutputstream = fileoutputstream1;
        subscriber.onError(throwable);
        Closeables.closeQuietly(fileoutputstream1);
        return;
        subscriber;
_L2:
        Closeables.closeQuietly(fileoutputstream);
        throw subscriber;
        subscriber;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = final_captureview;
        val$data = _5B_B.this;
        super();
    }
}

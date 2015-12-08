// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import android.hardware.Camera;
import java.io.File;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.rx.NextOrErrorAction0;
import me.lyft.android.rx.SecureObserver;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureView

class this._cls0
    implements android.hardware.allback
{

    final CaptureView this$0;

    public void onPictureTaken(byte abyte0[], Camera camera)
    {
        CaptureView.access$1200(CaptureView.this, abyte0).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).doOnEach(new NextOrErrorAction0() {

            final CaptureView._cls10 this$1;

            public void call()
            {
                startPreview();
                CaptureView.access$1002(this$0, false);
                CaptureView.access$1100(this$0, true);
            }

            
            {
                this$1 = CaptureView._cls10.this;
                super();
            }
        }).subscribe(new SecureObserver() {

            final CaptureView._cls10 this$1;

            public void onSafeError(Throwable throwable)
            {
                super.onSafeError(throwable);
                CaptureView.access$900(this$0);
            }

            public void onSafeNext(File file)
            {
                super.onSafeNext(file);
                captureImageSession.onImageCaptured(file);
            }

            public volatile void onSafeNext(Object obj)
            {
                onSafeNext((File)obj);
            }

            
            {
                this$1 = CaptureView._cls10.this;
                super();
            }
        });
    }

    it>()
    {
        this$0 = CaptureView.this;
        super();
    }
}

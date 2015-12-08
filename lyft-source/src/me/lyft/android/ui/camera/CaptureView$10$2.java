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

class > extends NextOrErrorAction0
{

    final is._cls0 this$1;

    public void call()
    {
        startPreview();
        CaptureView.access$1002(_fld0, false);
        CaptureView.access$1100(_fld0, true);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/camera/CaptureView$10

/* anonymous class */
    class CaptureView._cls10
        implements android.hardware.Camera.PictureCallback
    {

        final CaptureView this$0;

        public void onPictureTaken(byte abyte0[], Camera camera)
        {
            CaptureView.access$1200(CaptureView.this, abyte0).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).doOnEach(new CaptureView._cls10._cls2()).subscribe(new CaptureView._cls10._cls1());
        }

            
            {
                this$0 = CaptureView.this;
                super();
            }

        // Unreferenced inner class me/lyft/android/ui/camera/CaptureView$10$1

/* anonymous class */
        class CaptureView._cls10._cls1 extends SecureObserver
        {

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
        }

    }

}

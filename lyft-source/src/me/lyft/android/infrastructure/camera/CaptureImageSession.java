// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.camera;

import com.lyft.scoop.Screen;
import java.io.File;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;
import me.lyft.android.utils.Files;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.infrastructure.camera:
//            ICaptureImage, ICaptureImageSession

public class CaptureImageSession
    implements ICaptureImage, ICaptureImageSession
{

    public static final String TEMPORARY_PROFILE_PHOTO_NAME = "profile_photo.jpg";
    private final AppFlow appFlow;
    private Screen captureScreen;
    private File capturedImage;
    private File outputFile;
    private Screen previewScreen;
    private Screen returnScreen;
    private File tmpFile;

    public CaptureImageSession(AppFlow appflow)
    {
        appFlow = appflow;
    }

    private static Observable copyFileToFile(final File from, final File to)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final File val$from;
            final File val$to;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                try
                {
                    long l = System.currentTimeMillis();
                    Files.copy(from, to);
                    subscriber.onNext(to);
                    subscriber.onCompleted();
                    L.i("time to copy: %dms", new Object[] {
                        Long.valueOf(System.currentTimeMillis() - l)
                    });
                    return;
                }
                catch (Throwable throwable)
                {
                    subscriber.onError(throwable);
                }
            }

            
            {
                from = file;
                to = file1;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }

    private void goToPreviewScreen()
    {
        appFlow.goTo(previewScreen);
    }

    private File popCaptureResult()
    {
        File file = outputFile;
        outputFile = null;
        return file;
    }

    public void cancel()
    {
        appFlow.goBack();
    }

    public void capturePhoto(Screen screen, Screen screen1, Screen screen2, File file)
    {
        captureScreen = screen;
        returnScreen = screen1;
        tmpFile = file;
        previewScreen = screen2;
        appFlow.goTo(screen);
    }

    public void capturePhoto(Screen screen, Screen screen1, File file)
    {
        capturePhoto(screen, screen1, null, file);
    }

    public File getImage()
    {
        return capturedImage;
    }

    public Observable observeCaptureResult()
    {
        if (popCaptureResult() != null)
        {
            return Unit.just();
        } else
        {
            return Observable.empty();
        }
    }

    public void onGalleryResult(Screen screen, File file, File file1, Screen screen1)
    {
        returnScreen = screen;
        previewScreen = screen1;
        capturedImage = file1;
        if (screen1 == null)
        {
            outputFile = file;
            savePicture();
            return;
        } else
        {
            goToPreviewScreen();
            return;
        }
    }

    public void onImageCaptured(File file)
    {
        capturedImage = file;
        if (previewScreen == null)
        {
            outputFile = tmpFile;
            savePicture();
            return;
        } else
        {
            goToPreviewScreen();
            return;
        }
    }

    public void retakePicture()
    {
        appFlow.goBack();
    }

    public void saveCroppedPicture(File file)
    {
        outputFile = file;
        appFlow.resetTo(returnScreen);
    }

    public void savePicture()
    {
        copyFileToFile(capturedImage, (File)Objects.firstNonNull(outputFile, tmpFile)).subscribe(new SimpleSubscriber() {

            final CaptureImageSession this$0;

            public void onError(Throwable throwable)
            {
                appFlow.resetTo(returnScreen);
            }

            public void onNext(File file)
            {
                appFlow.resetTo(returnScreen);
            }

            public volatile void onNext(Object obj)
            {
                onNext((File)obj);
            }

            
            {
                this$0 = CaptureImageSession.this;
                super();
            }
        });
    }


}

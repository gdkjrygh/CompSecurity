// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.gallery;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.lyft.scoop.Screen;
import java.io.File;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;
import me.lyft.android.utils.FileUtils;
import me.lyft.android.utils.Files;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.infrastructure.gallery:
//            IGalleryService

public class GalleryService extends ActivityService
    implements IGalleryService
{

    private PublishSubject activityResultSubject;
    private ICaptureImageSession captureImageSession;

    public GalleryService(ICaptureImageSession icaptureimagesession)
    {
        activityResultSubject = PublishSubject.create();
        captureImageSession = icaptureimagesession;
    }

    private Observable copyGalleryPhotoToFile(final Context context, final Uri galleryPictureUri, final File file)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final GalleryService this$0;
            final Context val$context;
            final File val$file;
            final Uri val$galleryPictureUri;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                try
                {
                    Files.copy(context.getContentResolver().openInputStream(galleryPictureUri), file);
                    subscriber.onNext(Unit.create());
                    subscriber.onCompleted();
                    return;
                }
                catch (Throwable throwable)
                {
                    subscriber.onError(throwable);
                }
            }

            
            {
                this$0 = GalleryService.this;
                context = context1;
                galleryPictureUri = uri;
                file = file1;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }

    private void openGallery()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent = Intent.createChooser(intent, getCurrentActivity().getString(0x7f0700b1));
        getCurrentActivity().startActivityForResult(intent, 10);
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
    {
        super.onActivityResult(activity, activityresult);
        activityResultSubject.onNext(activityresult);
    }

    public void pickFileFromGallery(final Context tmpFile, final Screen returnScreen, final Screen previewScreen, final File outFile)
    {
        tmpFile = FileUtils.getTemporaryFile(tmpFile, "camera_capture.jpg");
        activityResultSubject.doOnSubscribe(new Action0() {

            final GalleryService this$0;

            public void call()
            {
                openGallery();
            }

            
            {
                this$0 = GalleryService.this;
                super();
            }
        }).first(new Func1() {

            final GalleryService this$0;

            public Boolean call(ActivityResult activityresult)
            {
                boolean flag;
                if (activityresult.getRequestCode() == 10)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((ActivityResult)obj);
            }

            
            {
                this$0 = GalleryService.this;
                super();
            }
        }).flatMap(new Func1() {

            final GalleryService this$0;
            final File val$tmpFile;

            public volatile Object call(Object obj)
            {
                return call((ActivityResult)obj);
            }

            public Observable call(ActivityResult activityresult)
            {
                if (activityresult.getResultCode() == -1)
                {
                    activityresult = activityresult.getIntent().getData();
                    return copyGalleryPhotoToFile(getCurrentActivity(), activityresult, tmpFile);
                } else
                {
                    return Observable.empty();
                }
            }

            
            {
                this$0 = GalleryService.this;
                tmpFile = file;
                super();
            }
        }).subscribe(new SimpleSubscriber() {

            final GalleryService this$0;
            final File val$outFile;
            final Screen val$previewScreen;
            final Screen val$returnScreen;
            final File val$tmpFile;

            public void onError(Throwable throwable)
            {
                L.e(throwable.getMessage(), new Object[] {
                    throwable
                });
            }

            public volatile void onNext(Object obj)
            {
                onNext((Unit)obj);
            }

            public void onNext(Unit unit)
            {
                captureImageSession.onGalleryResult(returnScreen, outFile, tmpFile, previewScreen);
            }

            
            {
                this$0 = GalleryService.this;
                returnScreen = screen;
                outFile = file;
                tmpFile = file1;
                previewScreen = screen1;
                super();
            }
        });
    }




}

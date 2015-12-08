// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.imagecrop;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import me.lyft.android.managers.ImageLoader;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.infrastructure.imagecrop:
//            CropViewportTransformation

public class ImageCropper
{

    Context context;
    private ImageLoader imageLoader;

    public ImageCropper(Context context1, ImageLoader imageloader)
    {
        context = context1;
        imageLoader = imageloader;
    }

    public Observable createBitmap(final File image)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final ImageCropper this$0;
            final File val$image;
            final DisplayMetrics val$metrics;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                try
                {
                    subscriber.onNext(imageLoader.load(image).skipMemoryCache().transform(new CropViewportTransformation(metrics.widthPixels, metrics.heightPixels)).get());
                    subscriber.onCompleted();
                    return;
                }
                catch (Throwable throwable)
                {
                    subscriber.onError(throwable);
                }
            }

            
            {
                this$0 = ImageCropper.this;
                image = file;
                metrics = displaymetrics;
                super();
            }
        }).subscribeOn(Schedulers.newThread());
    }

}

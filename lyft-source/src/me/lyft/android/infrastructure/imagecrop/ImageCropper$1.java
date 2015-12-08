// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.imagecrop;

import android.util.DisplayMetrics;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import me.lyft.android.managers.ImageLoader;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.imagecrop:
//            ImageCropper, CropViewportTransformation

class val.metrics
    implements rx.bscribe
{

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
            subscriber.onNext(ImageCropper.access$000(ImageCropper.this).load(val$image).skipMemoryCache().transform(new CropViewportTransformation(val$metrics.widthPixels, val$metrics.heightPixels)).get());
            subscriber.onCompleted();
            return;
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
        }
    }

    nsformation()
    {
        this$0 = final_imagecropper;
        val$image = file;
        val$metrics = DisplayMetrics.this;
        super();
    }
}

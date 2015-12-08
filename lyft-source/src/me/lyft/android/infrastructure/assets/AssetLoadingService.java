// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.assets;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.managers.ImageLoader;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.infrastructure.assets:
//            IAssetLoadingService, AssetsPath

public class AssetLoadingService
    implements IAssetLoadingService
{

    final Context context;
    final DensityTransformation densityTransformation;
    final IDevice device;
    final ImageLoader imageLoader;
    final HashMap markerBitmapCache = new HashMap();

    public AssetLoadingService(Context context1, IDevice idevice, ImageLoader imageloader)
    {
        device = idevice;
        imageLoader = imageloader;
        context = context1;
        densityTransformation = new DensityTransformation(idevice.getDensityDpi());
    }

    private File getAssetFile(String s)
    {
        return new File(getAssetsFolderPath(), s);
    }

    private String getAssetsFolderPath()
    {
        return AssetsPath.get(context);
    }

    private Bitmap loadMarkerBitmapSync(String s)
    {
        if (markerBitmapCache.containsKey(s))
        {
            return (Bitmap)markerBitmapCache.get(s);
        }
        File file = getAssetFile(s);
        if (file.isFile() && file.exists())
        {
            Bitmap bitmap = loadImage(s).get();
            markerBitmapCache.put(s, bitmap);
            return bitmap;
        } else
        {
            throw new FileNotFoundException((new StringBuilder()).append("Failed to find asset with such name ").append(s).toString());
        }
    }

    public RequestCreator loadImage(String s)
    {
        return loadImageWithoutDensityTransformation(s).transform(densityTransformation);
    }

    public RequestCreator loadImageWithoutDensityTransformation(String s)
    {
        s = getAssetFile(s);
        return imageLoader.load(s);
    }

    public Observable loadMarkerBitmap(final String fileName)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final AssetLoadingService this$0;
            final String val$fileName;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                try
                {
                    subscriber.onNext(loadMarkerBitmapSync(fileName));
                    subscriber.onCompleted();
                    return;
                }
                catch (Exception exception)
                {
                    subscriber.onError(exception);
                }
            }

            
            {
                this$0 = AssetLoadingService.this;
                fileName = s;
                super();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }


    private class DensityTransformation
        implements Transformation
    {

        final double scaleRation;
        final int screenDensity;

        public String key()
        {
            return "square()";
        }

        public Bitmap transform(Bitmap bitmap)
        {
            int i = bitmap.getWidth();
            int j = bitmap.getHeight();
            Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap, (int)(scaleRation * (double)i), (int)(scaleRation * (double)j), false);
            if (bitmap1 != bitmap)
            {
                bitmap.recycle();
            }
            return bitmap1;
        }

        public DensityTransformation(int i)
        {
            screenDensity = i;
            scaleRation = (1.0D * (double)i) / 480D;
        }
    }

}

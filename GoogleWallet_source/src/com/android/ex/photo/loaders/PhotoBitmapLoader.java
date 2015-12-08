// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.loaders;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.content.AsyncTaskLoader;
import com.android.ex.photo.PhotoViewController;
import com.android.ex.photo.util.ImageUtils;

// Referenced classes of package com.android.ex.photo.loaders:
//            PhotoBitmapLoaderInterface

public final class PhotoBitmapLoader extends AsyncTaskLoader
    implements PhotoBitmapLoaderInterface
{

    private Bitmap mBitmap;
    private String mPhotoUri;

    public PhotoBitmapLoader(Context context, String s)
    {
        super(context);
        mPhotoUri = s;
    }

    private void deliverResult(PhotoBitmapLoaderInterface.BitmapResult bitmapresult)
    {
        Bitmap bitmap;
        if (bitmapresult != null)
        {
            bitmap = bitmapresult.bitmap;
        } else
        {
            bitmap = null;
        }
        if (isReset())
        {
            if (bitmap != null)
            {
                onReleaseResources(bitmap);
            }
        } else
        {
            Bitmap bitmap1 = mBitmap;
            mBitmap = bitmap;
            if (isStarted())
            {
                super.deliverResult(bitmapresult);
            }
            if (bitmap1 != null && bitmap1 != bitmap && !bitmap1.isRecycled())
            {
                onReleaseResources(bitmap1);
                return;
            }
        }
    }

    private PhotoBitmapLoaderInterface.BitmapResult loadInBackground()
    {
        PhotoBitmapLoaderInterface.BitmapResult bitmapresult = new PhotoBitmapLoaderInterface.BitmapResult();
        Object obj1 = getContext();
        Object obj = bitmapresult;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = bitmapresult;
        if (mPhotoUri == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = ((Context) (obj1)).getContentResolver();
        try
        {
            obj1 = ImageUtils.createLocalBitmap(((android.content.ContentResolver) (obj)), Uri.parse(mPhotoUri), PhotoViewController.sMaxPhotoSize);
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            bitmapresult.status = 1;
            return bitmapresult;
        }
        obj = obj1;
        bitmapresult = ((PhotoBitmapLoaderInterface.BitmapResult) (obj1));
        if (((PhotoBitmapLoaderInterface.BitmapResult) (obj1)).bitmap == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        bitmapresult = ((PhotoBitmapLoaderInterface.BitmapResult) (obj1));
        ((PhotoBitmapLoaderInterface.BitmapResult) (obj1)).bitmap.setDensity(160);
        obj = obj1;
        return ((PhotoBitmapLoaderInterface.BitmapResult) (obj));
    }

    private void onCanceled(PhotoBitmapLoaderInterface.BitmapResult bitmapresult)
    {
        super.onCanceled(bitmapresult);
        if (bitmapresult != null)
        {
            onReleaseResources(bitmapresult.bitmap);
        }
    }

    private static void onReleaseResources(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    public final volatile void deliverResult(Object obj)
    {
        deliverResult((PhotoBitmapLoaderInterface.BitmapResult)obj);
    }

    public final volatile Object loadInBackground()
    {
        return loadInBackground();
    }

    public final volatile void onCanceled(Object obj)
    {
        onCanceled((PhotoBitmapLoaderInterface.BitmapResult)obj);
    }

    protected final void onReset()
    {
        super.onReset();
        onStopLoading();
        if (mBitmap != null)
        {
            onReleaseResources(mBitmap);
            mBitmap = null;
        }
    }

    protected final void onStartLoading()
    {
        if (mBitmap != null)
        {
            PhotoBitmapLoaderInterface.BitmapResult bitmapresult = new PhotoBitmapLoaderInterface.BitmapResult();
            bitmapresult.status = 0;
            bitmapresult.bitmap = mBitmap;
            deliverResult(bitmapresult);
        }
        if (takeContentChanged() || mBitmap == null)
        {
            forceLoad();
        }
    }

    protected final void onStopLoading()
    {
        cancelLoad();
    }

    public final void setPhotoUri(String s)
    {
        mPhotoUri = s;
    }
}

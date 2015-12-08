// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, ImageRequest

private final class mImageRequest
    implements Runnable
{

    private final ImageRequest mImageRequest;
    final ImageManager this$0;

    public final void run()
    {
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        Object obj = (ache)ImageManager.access$000(ImageManager.this).get(mImageRequest);
        if (obj != null)
        {
            ImageManager.access$000(ImageManager.this).remove(mImageRequest);
            ImageRequest imagerequest = mImageRequest;
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            ((mImageRequest) (obj)).geRequestList.remove(imagerequest);
        }
        Object obj3 = mImageRequest.mImageData;
        if (((mImageRequest) (obj3)).mImageRequest == null)
        {
            mImageRequest.loadNoDataPlaceholder(ImageManager.access$100(ImageManager.this), ImageManager.access$200(ImageManager.this), true);
            return;
        }
        obj = ImageManager.access$300(ImageManager.this, ((this._cls0) (obj3)));
        if (obj != null)
        {
            mImageRequest.onImageLoaded(ImageManager.access$100(ImageManager.this), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        obj = (Long)ImageManager.access$400(ImageManager.this).get(((this._cls0) (obj3))._fld0);
        if (obj != null)
        {
            if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
            {
                mImageRequest.loadNoDataPlaceholder(ImageManager.access$100(ImageManager.this), ImageManager.access$200(ImageManager.this), true);
                return;
            }
            ImageManager.access$400(ImageManager.this).remove(((this._cls0) (obj3))._fld0);
        }
        obj = mImageRequest;
        ImageManager.access$100(ImageManager.this);
        ImageManager.access$200(ImageManager.this);
        if (((ImageRequest) (obj)).mUseLoadingPlaceholder)
        {
            ((ImageRequest) (obj)).loadImage(null, false, true, false);
        }
        Object obj1 = (lder)ImageManager.access$500(ImageManager.this).get(((this._cls0) (obj3))._fld0);
        obj = obj1;
        if (obj1 == null)
        {
            obj = new t>(ImageManager.this, ((this._cls0) (obj3))._fld0);
            ImageManager.access$500(ImageManager.this).put(((this._cls0) (obj3))._fld0, obj);
        }
        obj1 = mImageRequest;
        Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
        ((mImageRequest) (obj)).geRequestList.add(obj1);
        if (!(mImageRequest instanceof st))
        {
            ImageManager.access$000(ImageManager.this).put(mImageRequest, obj);
        }
        synchronized (ImageManager.access$600())
        {
            if (!ImageManager.access$700().contains(((mImageRequest) (obj3)).mImageRequest))
            {
                ImageManager.access$700().add(((mImageRequest) (obj3)).mImageRequest);
                obj3 = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
                ((Intent) (obj3)).putExtra("com.google.android.gms.extras.uri", ((mImageRequest) (obj)).);
                ((Intent) (obj3)).putExtra("com.google.android.gms.extras.resultReceiver", ((android.os.Parcelable) (obj)));
                ((Intent) (obj3)).putExtra("com.google.android.gms.extras.priority", 3);
                ImageManager.access$100((() (obj))._fld0).sendBroadcast(((Intent) (obj3)));
            }
        }
        return;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public st(ImageRequest imagerequest)
    {
        this$0 = ImageManager.this;
        super();
        mImageRequest = imagerequest;
    }
}

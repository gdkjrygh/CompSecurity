// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.images.ImageUtils;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            BlurringPlayerArtworkLoader, ViewVisibilityProvider

private class viewVisibilityProvider extends DefaultSubscriber
{

    private final WeakReference imageOverlayRef;
    final BlurringPlayerArtworkLoader this$0;
    private final ViewVisibilityProvider viewVisibilityProvider;

    public void onNext(Bitmap bitmap)
    {
        ImageView imageview;
label0:
        {
            imageview = (ImageView)imageOverlayRef.get();
            if (imageview != null)
            {
                if (viewVisibilityProvider == null || !viewVisibilityProvider.isCurrentlyVisible(imageview))
                {
                    break label0;
                }
                bitmap = ImageUtils.createTransitionDrawable(null, new BitmapDrawable(bitmap));
                imageview.setImageDrawable(bitmap);
                bitmap.startTransition(200);
            }
            return;
        }
        if (viewVisibilityProvider == null)
        {
            ErrorUtils.handleSilentException(new IllegalStateException("View Visibility Provider null in Blurring artwork loader"));
        }
        imageview.setImageBitmap(bitmap);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Bitmap)obj);
    }

    public (ImageView imageview, ViewVisibilityProvider viewvisibilityprovider)
    {
        this$0 = BlurringPlayerArtworkLoader.this;
        super();
        imageOverlayRef = new WeakReference(imageview);
        viewVisibilityProvider = viewvisibilityprovider;
    }
}

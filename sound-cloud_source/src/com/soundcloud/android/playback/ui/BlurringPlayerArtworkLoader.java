// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.images.ImageUtils;
import java.lang.ref.WeakReference;
import rx.R;
import rx.Y;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerArtworkLoader, ViewVisibilityProvider

public class BlurringPlayerArtworkLoader extends PlayerArtworkLoader
{
    private class BlurredOverlaySubscriber extends DefaultSubscriber
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

        public BlurredOverlaySubscriber(ImageView imageview, ViewVisibilityProvider viewvisibilityprovider)
        {
            this$0 = BlurringPlayerArtworkLoader.this;
            super();
            imageOverlayRef = new WeakReference(imageview);
            viewVisibilityProvider = viewvisibilityprovider;
        }
    }


    private Y blurSubscription;
    private final R graphicsScheduler;
    private final R observeOnScheduler;

    public BlurringPlayerArtworkLoader(ImageOperations imageoperations, Resources resources, R r)
    {
        this(imageoperations, resources, r, a.a());
    }

    public BlurringPlayerArtworkLoader(ImageOperations imageoperations, Resources resources, R r, R r1)
    {
        super(imageoperations, resources);
        blurSubscription = RxUtils.invalidSubscription();
        graphicsScheduler = r;
        observeOnScheduler = r1;
    }

    public void loadArtwork(Urn urn, ImageView imageview, ImageView imageview1, boolean flag, ViewVisibilityProvider viewvisibilityprovider)
    {
        super.loadArtwork(urn, imageview, imageview1, flag, viewvisibilityprovider);
        blurSubscription.unsubscribe();
        blurSubscription = imageOperations.blurredPlayerArtwork(resources, urn, graphicsScheduler, observeOnScheduler).subscribe(new BlurredOverlaySubscriber(imageview1, viewvisibilityprovider));
    }
}

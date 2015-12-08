// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.b.a.a.a.b.b;
import com.b.a.a.b.a;
import com.b.a.b.a.e;
import com.b.a.b.a.h;
import com.b.a.b.d;
import com.b.a.b.e.c;
import com.b.a.c.f;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiUrlBuilder;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.utils.cache.Cache;
import com.soundcloud.android.utils.images.ImageUtils;
import com.soundcloud.java.strings.Strings;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rx.R;

// Referenced classes of package com.soundcloud.android.image:
//            PlaceholderGenerator, ApiImageSize, ImageListenerUILAdapter, ImageOptionsFactory, 
//            CircularPlaceholderGenerator, ImageProcessor, ImageListener, OneShotTransitionDrawable

public class ImageOperations
{
    static class FallbackImageListener
        implements com.b.a.b.f.a
    {

        private final ImageListenerUILAdapter listenerAdapter;
        private final Set notFoundUris;

        private void animatePlaceholder(View view)
        {
            if ((view instanceof ImageView) && (((ImageView)view).getDrawable() instanceof OneShotTransitionDrawable))
            {
                ((OneShotTransitionDrawable)((ImageView)view).getDrawable()).startTransition(200);
            }
        }

        public void onLoadingCancelled(String s, View view)
        {
            if (listenerAdapter != null)
            {
                listenerAdapter.onLoadingCancelled(s, view);
            }
        }

        public void onLoadingComplete(String s, View view, Bitmap bitmap)
        {
            if (bitmap == null)
            {
                animatePlaceholder(view);
            }
            if (listenerAdapter != null)
            {
                listenerAdapter.onLoadingComplete(s, view, bitmap);
            }
        }

        public void onLoadingFailed(String s, View view, com.b.a.b.a.b b1)
        {
            if (b1.a instanceof FileNotFoundException)
            {
                notFoundUris.add(s);
            }
            animatePlaceholder(view);
            if (listenerAdapter != null)
            {
                listenerAdapter.onLoadingFailed(s, view, b1);
            }
        }

        public void onLoadingStarted(String s, View view)
        {
            if (listenerAdapter != null)
            {
                listenerAdapter.onLoadingStarted(s, view);
            }
        }

        public FallbackImageListener(ImageListener imagelistener, Set set)
        {
            notFoundUris = set;
            if (imagelistener != null)
            {
                imagelistener = new ImageListenerUILAdapter(imagelistener);
            } else
            {
                imagelistener = null;
            }
            listenerAdapter = imagelistener;
        }

        public FallbackImageListener(Set set)
        {
            this(null, set);
        }
    }


    private static final int LOW_MEM_DEVICE_THRESHOLD = 0x3200000;
    private static final Pattern PATTERN = Pattern.compile("^https?://(.+)");
    private static final String PLACEHOLDER_KEY_BASE = "%s_%s_%s";
    private static final String URL_BASE = "http://%s";
    private final FallbackBitmapLoadingAdapter.Factory adapterFactory;
    private final BitmapLoadingAdapter.Factory bitmapAdapterFactory;
    private final rx.b.f blurBitmap;
    private final Cache blurredImageCache;
    private final CircularPlaceholderGenerator circularPlaceholderGenerator;
    private final com.b.a.a.a.b.a fileNameGenerator;
    private final d imageLoader;
    private ImageProcessor imageProcessor;
    private final FallbackImageListener notFoundListener;
    private final Set notFoundUris;
    private final Cache placeholderCache;
    private final PlaceholderGenerator placeholderGenerator;
    private final ApiUrlBuilder urlBuilder;

    ImageOperations(d d1, ApiUrlBuilder apiurlbuilder, PlaceholderGenerator placeholdergenerator, CircularPlaceholderGenerator circularplaceholdergenerator, FallbackBitmapLoadingAdapter.Factory factory, BitmapLoadingAdapter.Factory factory1, ImageProcessor imageprocessor, 
            Cache cache, Cache cache1, com.b.a.a.a.b.a a1)
    {
        notFoundUris = new HashSet();
        blurBitmap = new _cls1();
        notFoundListener = new FallbackImageListener(notFoundUris);
        imageLoader = d1;
        urlBuilder = apiurlbuilder;
        placeholderGenerator = placeholdergenerator;
        circularPlaceholderGenerator = circularplaceholdergenerator;
        placeholderCache = cache;
        blurredImageCache = cache1;
        adapterFactory = factory;
        bitmapAdapterFactory = factory1;
        imageProcessor = imageprocessor;
        fileNameGenerator = a1;
    }

    public ImageOperations(ApiUrlBuilder apiurlbuilder, PlaceholderGenerator placeholdergenerator, CircularPlaceholderGenerator circularplaceholdergenerator, FallbackBitmapLoadingAdapter.Factory factory, BitmapLoadingAdapter.Factory factory1, ImageProcessor imageprocessor)
    {
        this(d.a(), apiurlbuilder, placeholdergenerator, circularplaceholdergenerator, factory, factory1, imageprocessor, Cache.withSoftValues(50), Cache.withSoftValues(10), ((com.b.a.a.a.b.a) (new b())));
    }

    private String adjustUrl(String s)
    {
        String s1 = s;
        if (Strings.isNotBlank(s))
        {
            Matcher matcher = PATTERN.matcher(s);
            s1 = s;
            if (matcher.find())
            {
                s1 = s;
                if (matcher.groupCount() == 1)
                {
                    s1 = String.format("http://%s", new Object[] {
                        matcher.group(1)
                    });
                }
            }
        }
        return s1;
    }

    private rx.b blurBitmap(final Bitmap original)
    {
        return rx.b.create(new _cls6());
    }

    private String buildUrlIfNotPreviouslyMissing(Urn urn, ApiImageSize apiimagesize)
    {
        apiimagesize = getImageUrl(urn, apiimagesize);
        urn = apiimagesize;
        if (notFoundUris.contains(apiimagesize))
        {
            urn = null;
        }
        return urn;
    }

    private rx.b.b cacheBlurredBitmap(final Urn resourceUrn)
    {
        return new _cls5();
    }

    private Bitmap createFallbackBitmap(Urn urn, ApiImageSize apiimagesize)
    {
        return ImageUtils.toBitmap(placeholderGenerator.generateDrawable(urn.toString()), apiimagesize.width, apiimagesize.height);
    }

    private TransitionDrawable getCircularPlaceholderDrawable(final Urn urn, int i, int j)
    {
        String s = String.format("%s_%s_%s", new Object[] {
            urn, String.valueOf(i), String.valueOf(j)
        });
        return (TransitionDrawable)placeholderCache.get(s, new _cls8());
    }

    private String getImageUrl(Urn urn, ApiImageSize apiimagesize)
    {
        return urlBuilder.from(ApiEndpoints.IMAGES, new Object[] {
            urn, apiimagesize.sizeSpec
        }).build();
    }

    private Drawable getPlaceholderDrawable(Urn urn, com.b.a.b.e.b b1)
    {
        return getPlaceholderDrawable(urn, b1.a(), b1.b());
    }

    private TransitionDrawable getPlaceholderDrawable(final Urn urn, int i, int j)
    {
        String s = String.format("%s_%s_%s", new Object[] {
            urn, String.valueOf(i), String.valueOf(j)
        });
        return (TransitionDrawable)placeholderCache.get(s, new _cls7());
    }

    private void load(Uri uri, ImageListener imagelistener)
    {
        imageLoader.a(uri.toString(), null, new ImageListenerUILAdapter(imagelistener));
    }

    private void load(Urn urn, ApiImageSize apiimagesize, int i, int j, ImageListener imagelistener)
    {
        c c1 = new c(new e(i, j), h.b);
        imageLoader.b(buildUrlIfNotPreviouslyMissing(urn, apiimagesize), c1, null, new ImageListenerUILAdapter(imagelistener));
    }

    private void load(Urn urn, ApiImageSize apiimagesize, ImageListener imagelistener)
    {
        imageLoader.a(buildUrlIfNotPreviouslyMissing(urn, apiimagesize), null, new ImageListenerUILAdapter(imagelistener));
    }

    public rx.b adImage(final Uri uri)
    {
        return rx.b.create(new _cls2());
    }

    public rx.b artwork(final Urn resourceUrn, final ApiImageSize apiImageSize)
    {
        return rx.b.create(new _cls3());
    }

    public rx.b artwork(final Urn resourceUrn, final ApiImageSize apiImageSize, final int targetWidth, final int targetHeight)
    {
        return rx.b.create(new _cls4());
    }

    public rx.b blurredPlayerArtwork(Resources resources, Urn urn, R r, R r1)
    {
        Bitmap bitmap = (Bitmap)blurredImageCache.get(urn);
        if (bitmap != null)
        {
            return rx.b.just(bitmap);
        }
        bitmap = getCachedListItemBitmap(resources, urn);
        if (bitmap == null)
        {
            return artwork(urn, ApiImageSize.getListItemImageSize(resources)).map(blurBitmap).subscribeOn(r).observeOn(r1).doOnNext(cacheBlurredBitmap(urn));
        } else
        {
            return blurBitmap(bitmap).subscribeOn(r).observeOn(r1).doOnNext(cacheBlurredBitmap(urn));
        }
    }

    public void clearDiskCache()
    {
        d d1 = imageLoader;
        d1.b();
        d1.b.o.a();
    }

    public android.widget.AbsListView.OnScrollListener createScrollPauseListener(boolean flag, boolean flag1)
    {
        return new com.b.a.b.f.c(imageLoader, flag, flag1);
    }

    public android.widget.AbsListView.OnScrollListener createScrollPauseListener(boolean flag, boolean flag1, android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        return new com.b.a.b.f.c(imageLoader, flag, flag1, onscrolllistener);
    }

    public Bitmap decodeResource(Resources resources, int i)
    {
        try
        {
            resources = BitmapFactory.decodeResource(resources, i);
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            resources.printStackTrace();
            return null;
        }
        return resources;
    }

    public void display(Urn urn, ApiImageSize apiimagesize, ImageView imageview)
    {
        imageview = new com.b.a.b.e.b(imageview);
        imageLoader.a(buildUrlIfNotPreviouslyMissing(urn, apiimagesize), imageview, ImageOptionsFactory.cache(), notFoundListener);
    }

    public void display(String s, ImageView imageview)
    {
        imageLoader.b(adjustUrl(s), new com.b.a.b.e.b(imageview), null, null);
    }

    public void displayCircular(String s, ImageView imageview)
    {
        imageLoader.b(adjustUrl(s), new com.b.a.b.e.b(imageview), ImageOptionsFactory.placeholderCircular(imageview.getResources().getDrawable(0x7f020098)), null);
    }

    public void displayCircularInAdapterView(Urn urn, ApiImageSize apiimagesize, ImageView imageview)
    {
        imageview = new com.b.a.b.e.b(imageview);
        TransitionDrawable transitiondrawable = getCircularPlaceholderDrawable(urn, imageview.a(), imageview.b());
        imageLoader.a(buildUrlIfNotPreviouslyMissing(urn, apiimagesize), imageview, ImageOptionsFactory.adapterViewCircular(transitiondrawable, apiimagesize), notFoundListener);
    }

    public void displayCircularWithPlaceholder(Urn urn, ApiImageSize apiimagesize, ImageView imageview)
    {
        imageview = new com.b.a.b.e.b(imageview);
        imageLoader.a(buildUrlIfNotPreviouslyMissing(urn, apiimagesize), imageview, ImageOptionsFactory.placeholderCircular(getCircularPlaceholderDrawable(urn, imageview.a(), imageview.b())), notFoundListener);
    }

    public void displayInAdapterView(Urn urn, ApiImageSize apiimagesize, ImageView imageview)
    {
        imageview = new com.b.a.b.e.b(imageview);
        imageLoader.a(buildUrlIfNotPreviouslyMissing(urn, apiimagesize), imageview, ImageOptionsFactory.adapterView(getPlaceholderDrawable(urn, imageview), apiimagesize), notFoundListener);
    }

    public void displayInFullDialogView(Urn urn, ApiImageSize apiimagesize, ImageView imageview, ImageListener imagelistener)
    {
        imageLoader.a(buildUrlIfNotPreviouslyMissing(urn, apiimagesize), new com.b.a.b.e.b(imageview), ImageOptionsFactory.fullImageDialog(), new ImageListenerUILAdapter(imagelistener));
    }

    public void displayInPlayer(Urn urn, ApiImageSize apiimagesize, ImageView imageview, Bitmap bitmap, boolean flag)
    {
        com.b.a.b.e.b b1 = new com.b.a.b.e.b(imageview);
        if (bitmap != null)
        {
            imageview = new BitmapDrawable(bitmap);
        } else
        {
            imageview = getPlaceholderDrawable(urn, b1);
        }
        imageLoader.a(buildUrlIfNotPreviouslyMissing(urn, apiimagesize), b1, ImageOptionsFactory.player(imageview, flag), notFoundListener);
    }

    public void displayLeaveBehind(Uri uri, ImageView imageview, ImageListener imagelistener)
    {
        imageview = new com.b.a.b.e.b(imageview);
        imageLoader.a(uri.toString(), imageview, ImageOptionsFactory.playerLeaveBehind(), new ImageListenerUILAdapter(imagelistener));
    }

    public void displayWithPlaceholder(Urn urn, ApiImageSize apiimagesize, ImageView imageview)
    {
        imageview = new com.b.a.b.e.b(imageview);
        imageLoader.a(buildUrlIfNotPreviouslyMissing(urn, apiimagesize), imageview, ImageOptionsFactory.placeholder(getPlaceholderDrawable(urn, imageview)), notFoundListener);
    }

    public Bitmap getCachedBitmap(Urn urn, ApiImageSize apiimagesize)
    {
        return getCachedBitmap(urn, apiimagesize, apiimagesize.width, apiimagesize.height);
    }

    public Bitmap getCachedBitmap(Urn urn, ApiImageSize apiimagesize, int i, int j)
    {
        urn = getImageUrl(urn, apiimagesize);
        if (notFoundUris.contains(urn))
        {
            return null;
        } else
        {
            urn = com.b.a.c.d.a(urn, new e(i, j));
            apiimagesize = imageLoader;
            apiimagesize.b();
            return (Bitmap)((d) (apiimagesize)).b.n.a(urn);
        }
    }

    public Bitmap getCachedListItemBitmap(Resources resources, Urn urn)
    {
        return getCachedBitmap(urn, ApiImageSize.getListItemImageSize(resources), resources.getDimensionPixelSize(0x7f0b00be), resources.getDimensionPixelSize(0x7f0b00be));
    }

    public String getUrlForLargestImage(Resources resources, Urn urn)
    {
        return buildUrlIfNotPreviouslyMissing(urn, ApiImageSize.getFullImageSize(resources));
    }

    public void initialise(Context context, ApplicationProperties applicationproperties)
    {
        com.b.a.b.e.a a1 = new com.b.a.b.e.a(context.getApplicationContext());
        if (applicationproperties.useVerboseLogging())
        {
            a1.t = true;
        }
        a1.s = ImageOptionsFactory.cache();
        context = fileNameGenerator;
        if (a1.o != null)
        {
            com.b.a.c.c.c("diskCache() and diskCacheFileNameGenerator() calls overlap each other", new Object[0]);
        }
        a1.p = context;
        long l = Runtime.getRuntime().maxMemory();
        if (l < 0x3200000L)
        {
            int i = (int)(l / 16L);
            if (i <= 0)
            {
                throw new IllegalArgumentException("memoryCacheSize must be a positive number");
            }
            if (a1.n != null)
            {
                com.b.a.c.c.c("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
            }
            a1.k = i;
        }
        d d1 = imageLoader;
        if (a1.c == null)
        {
            a1.c = com.b.a.b.a.a(a1.g, a1.h, a1.j);
        } else
        {
            a1.e = true;
        }
        if (a1.d == null)
        {
            a1.d = com.b.a.b.a.a(a1.g, a1.h, a1.j);
        } else
        {
            a1.f = true;
        }
        if (a1.o == null)
        {
            if (a1.p == null)
            {
                a1.p = new b();
            }
            Object obj = a1.b;
            com.b.a.a.a.b.a a2 = a1.p;
            long l1 = a1.l;
            int j = a1.m;
            context = f.a(((Context) (obj)), false);
            applicationproperties = new File(context, "uil-images");
            if (applicationproperties.exists() || applicationproperties.mkdir())
            {
                context = applicationproperties;
            }
            if (l1 > 0L || j > 0)
            {
                applicationproperties = f.a(((Context) (obj)), true);
                obj = new File(applicationproperties, "uil-images");
                int k;
                if (((File) (obj)).exists() || ((File) (obj)).mkdir())
                {
                    applicationproperties = ((ApplicationProperties) (obj));
                }
                applicationproperties = new com.b.a.a.a.a.a.d(applicationproperties, a2, l1, j);
                applicationproperties.c = context;
                context = applicationproperties;
            } else
            {
                context = new com.b.a.a.a.a.b(f.a(((Context) (obj)), true), context, a2);
            }
            a1.o = context;
        }
        if (a1.n == null)
        {
            k = a1.k;
            j = k;
            if (k == 0)
            {
                j = (int)(Runtime.getRuntime().maxMemory() / 8L);
            }
            a1.n = new com.b.a.a.b.a.b(j);
        }
        if (a1.i)
        {
            a1.n = new com.b.a.a.b.a.a(a1.n, new com.b.a.c.e());
        }
        if (a1.q == null)
        {
            a1.q = new com.b.a.b.d.a(a1.b);
        }
        if (a1.r == null)
        {
            a1.r = new com.b.a.b.b.a(a1.t);
        }
        if (a1.s == null)
        {
            a1.s = (new com.b.a.b.c.a()).b();
        }
        d1.a(new com.b.a.b.e(a1, (byte)0));
    }

    void pause()
    {
        imageLoader.d();
    }

    public void precacheTrackArtwork(Urn urn, ApiImageSize apiimagesize)
    {
        urn = buildUrlIfNotPreviouslyMissing(urn, apiimagesize);
        imageLoader.a(urn, ImageOptionsFactory.prefetch(), null);
    }

    void resume()
    {
        imageLoader.d();
    }












    private class _cls1
        implements rx.b.f
    {

        final ImageOperations this$0;

        public Bitmap call(Bitmap bitmap)
        {
            return imageProcessor.blurBitmap(bitmap);
        }

        public volatile Object call(Object obj)
        {
            return call((Bitmap)obj);
        }

        _cls1()
        {
            this$0 = ImageOperations.this;
            super();
        }
    }


    private class _cls6
        implements rx.b.f
    {

        final ImageOperations this$0;
        final Bitmap val$original;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x.onNext(imageProcessor.blurBitmap(original));
            x.onCompleted();
        }

        _cls6()
        {
            this$0 = ImageOperations.this;
            original = bitmap;
            super();
        }
    }


    private class _cls5
        implements rx.b.b
    {

        final ImageOperations this$0;
        final Urn val$resourceUrn;

        public void call(Bitmap bitmap)
        {
            blurredImageCache.put(resourceUrn, bitmap);
        }

        public volatile void call(Object obj)
        {
            call((Bitmap)obj);
        }

        _cls5()
        {
            this$0 = ImageOperations.this;
            resourceUrn = urn;
            super();
        }
    }


    private class _cls8
        implements com.soundcloud.android.utils.cache.Cache.ValueProvider
    {

        final ImageOperations this$0;
        final Urn val$urn;

        public TransitionDrawable get(String s)
        {
            return circularPlaceholderGenerator.generateTransitionDrawable(urn.toString());
        }

        public volatile Object get(Object obj)
            throws Exception
        {
            return get((String)obj);
        }

        _cls8()
        {
            this$0 = ImageOperations.this;
            urn = urn1;
            super();
        }
    }


    private class _cls7
        implements com.soundcloud.android.utils.cache.Cache.ValueProvider
    {

        final ImageOperations this$0;
        final Urn val$urn;

        public TransitionDrawable get(String s)
        {
            return placeholderGenerator.generateTransitionDrawable(urn.toString());
        }

        public volatile Object get(Object obj)
            throws Exception
        {
            return get((String)obj);
        }

        _cls7()
        {
            this$0 = ImageOperations.this;
            urn = urn1;
            super();
        }
    }


    private class _cls2
        implements rx.b.f
    {

        final ImageOperations this$0;
        final Uri val$uri;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            load(uri, bitmapAdapterFactory.create(x));
        }

        _cls2()
        {
            this$0 = ImageOperations.this;
            uri = uri1;
            super();
        }
    }


    private class _cls3
        implements rx.b.f
    {

        final ImageOperations this$0;
        final ApiImageSize val$apiImageSize;
        final Urn val$resourceUrn;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            Bitmap bitmap = createFallbackBitmap(resourceUrn, apiImageSize);
            load(resourceUrn, apiImageSize, adapterFactory.create(x, bitmap));
        }

        _cls3()
        {
            this$0 = ImageOperations.this;
            resourceUrn = urn;
            apiImageSize = apiimagesize;
            super();
        }
    }


    private class _cls4
        implements rx.b.f
    {

        final ImageOperations this$0;
        final ApiImageSize val$apiImageSize;
        final Urn val$resourceUrn;
        final int val$targetHeight;
        final int val$targetWidth;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            Bitmap bitmap = ImageUtils.toBitmap(placeholderGenerator.generateDrawable(resourceUrn.toString()), targetWidth, targetHeight);
            load(resourceUrn, apiImageSize, targetWidth, targetHeight, adapterFactory.create(x, bitmap));
        }

        _cls4()
        {
            this$0 = ImageOperations.this;
            resourceUrn = urn;
            targetWidth = i;
            targetHeight = j;
            apiImageSize = apiimagesize;
            super();
        }
    }

}

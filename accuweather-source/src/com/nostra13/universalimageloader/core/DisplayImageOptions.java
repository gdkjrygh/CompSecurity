// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;

// Referenced classes of package com.nostra13.universalimageloader.core:
//            DefaultConfigurationFactory

public final class DisplayImageOptions
{
    public static class Builder
    {

        private boolean cacheInMemory;
        private boolean cacheOnDisc;
        private boolean considerExifParams;
        private android.graphics.BitmapFactory.Options decodingOptions;
        private int delayBeforeLoading;
        private BitmapDisplayer displayer;
        private Object extraForDownloader;
        private Handler handler;
        private Drawable imageForEmptyUri;
        private Drawable imageOnFail;
        private Drawable imageOnLoading;
        private int imageResForEmptyUri;
        private int imageResOnFail;
        private int imageResOnLoading;
        private ImageScaleType imageScaleType;
        private boolean isSyncLoading;
        private BitmapProcessor postProcessor;
        private BitmapProcessor preProcessor;
        private boolean resetViewBeforeLoading;

        public Builder bitmapConfig(android.graphics.Bitmap.Config config)
        {
            if (config == null)
            {
                throw new IllegalArgumentException("bitmapConfig can't be null");
            } else
            {
                decodingOptions.inPreferredConfig = config;
                return this;
            }
        }

        public DisplayImageOptions build()
        {
            return new DisplayImageOptions(this);
        }

        public Builder cacheInMemory()
        {
            cacheInMemory = true;
            return this;
        }

        public Builder cacheInMemory(boolean flag)
        {
            cacheInMemory = flag;
            return this;
        }

        public Builder cacheOnDisc()
        {
            cacheOnDisc = true;
            return this;
        }

        public Builder cacheOnDisc(boolean flag)
        {
            cacheOnDisc = flag;
            return this;
        }

        public Builder cloneFrom(DisplayImageOptions displayimageoptions)
        {
            imageResOnLoading = displayimageoptions.imageResOnLoading;
            imageResForEmptyUri = displayimageoptions.imageResForEmptyUri;
            imageResOnFail = displayimageoptions.imageResOnFail;
            imageOnLoading = displayimageoptions.imageOnLoading;
            imageForEmptyUri = displayimageoptions.imageForEmptyUri;
            imageOnFail = displayimageoptions.imageOnFail;
            resetViewBeforeLoading = displayimageoptions.resetViewBeforeLoading;
            cacheInMemory = displayimageoptions.cacheInMemory;
            cacheOnDisc = displayimageoptions.cacheOnDisc;
            imageScaleType = displayimageoptions.imageScaleType;
            decodingOptions = displayimageoptions.decodingOptions;
            delayBeforeLoading = displayimageoptions.delayBeforeLoading;
            considerExifParams = displayimageoptions.considerExifParams;
            extraForDownloader = displayimageoptions.extraForDownloader;
            preProcessor = displayimageoptions.preProcessor;
            postProcessor = displayimageoptions.postProcessor;
            displayer = displayimageoptions.displayer;
            handler = displayimageoptions.handler;
            isSyncLoading = displayimageoptions.isSyncLoading;
            return this;
        }

        public Builder considerExifParams(boolean flag)
        {
            considerExifParams = flag;
            return this;
        }

        public Builder decodingOptions(android.graphics.BitmapFactory.Options options)
        {
            if (options == null)
            {
                throw new IllegalArgumentException("decodingOptions can't be null");
            } else
            {
                decodingOptions = options;
                return this;
            }
        }

        public Builder delayBeforeLoading(int i)
        {
            delayBeforeLoading = i;
            return this;
        }

        public Builder displayer(BitmapDisplayer bitmapdisplayer)
        {
            if (bitmapdisplayer == null)
            {
                throw new IllegalArgumentException("displayer can't be null");
            } else
            {
                displayer = bitmapdisplayer;
                return this;
            }
        }

        public Builder extraForDownloader(Object obj)
        {
            extraForDownloader = obj;
            return this;
        }

        public Builder handler(Handler handler1)
        {
            handler = handler1;
            return this;
        }

        public Builder imageScaleType(ImageScaleType imagescaletype)
        {
            imageScaleType = imagescaletype;
            return this;
        }

        public Builder postProcessor(BitmapProcessor bitmapprocessor)
        {
            postProcessor = bitmapprocessor;
            return this;
        }

        public Builder preProcessor(BitmapProcessor bitmapprocessor)
        {
            preProcessor = bitmapprocessor;
            return this;
        }

        public Builder resetViewBeforeLoading()
        {
            resetViewBeforeLoading = true;
            return this;
        }

        public Builder resetViewBeforeLoading(boolean flag)
        {
            resetViewBeforeLoading = flag;
            return this;
        }

        public Builder showImageForEmptyUri(int i)
        {
            imageResForEmptyUri = i;
            return this;
        }

        public Builder showImageForEmptyUri(Drawable drawable)
        {
            imageForEmptyUri = drawable;
            return this;
        }

        public Builder showImageOnFail(int i)
        {
            imageResOnFail = i;
            return this;
        }

        public Builder showImageOnFail(Drawable drawable)
        {
            imageOnFail = drawable;
            return this;
        }

        public Builder showImageOnLoading(int i)
        {
            imageResOnLoading = i;
            return this;
        }

        public Builder showImageOnLoading(Drawable drawable)
        {
            imageOnLoading = drawable;
            return this;
        }

        public Builder showStubImage(int i)
        {
            imageResOnLoading = i;
            return this;
        }

        Builder syncLoading(boolean flag)
        {
            isSyncLoading = flag;
            return this;
        }




















        public Builder()
        {
            imageResOnLoading = 0;
            imageResForEmptyUri = 0;
            imageResOnFail = 0;
            imageOnLoading = null;
            imageForEmptyUri = null;
            imageOnFail = null;
            resetViewBeforeLoading = false;
            cacheInMemory = false;
            cacheOnDisc = false;
            imageScaleType = ImageScaleType.IN_SAMPLE_POWER_OF_2;
            decodingOptions = new android.graphics.BitmapFactory.Options();
            delayBeforeLoading = 0;
            considerExifParams = false;
            extraForDownloader = null;
            preProcessor = null;
            postProcessor = null;
            displayer = DefaultConfigurationFactory.createBitmapDisplayer();
            handler = null;
            isSyncLoading = false;
            decodingOptions.inPurgeable = true;
            decodingOptions.inInputShareable = true;
        }
    }


    private final boolean cacheInMemory;
    private final boolean cacheOnDisc;
    private final boolean considerExifParams;
    private final android.graphics.BitmapFactory.Options decodingOptions;
    private final int delayBeforeLoading;
    private final BitmapDisplayer displayer;
    private final Object extraForDownloader;
    private final Handler handler;
    private final Drawable imageForEmptyUri;
    private final Drawable imageOnFail;
    private final Drawable imageOnLoading;
    private final int imageResForEmptyUri;
    private final int imageResOnFail;
    private final int imageResOnLoading;
    private final ImageScaleType imageScaleType;
    private final boolean isSyncLoading;
    private final BitmapProcessor postProcessor;
    private final BitmapProcessor preProcessor;
    private final boolean resetViewBeforeLoading;

    private DisplayImageOptions(Builder builder)
    {
        imageResOnLoading = builder.imageResOnLoading;
        imageResForEmptyUri = builder.imageResForEmptyUri;
        imageResOnFail = builder.imageResOnFail;
        imageOnLoading = builder.imageOnLoading;
        imageForEmptyUri = builder.imageForEmptyUri;
        imageOnFail = builder.imageOnFail;
        resetViewBeforeLoading = builder.resetViewBeforeLoading;
        cacheInMemory = builder.cacheInMemory;
        cacheOnDisc = builder.cacheOnDisc;
        imageScaleType = builder.imageScaleType;
        decodingOptions = builder.decodingOptions;
        delayBeforeLoading = builder.delayBeforeLoading;
        considerExifParams = builder.considerExifParams;
        extraForDownloader = builder.extraForDownloader;
        preProcessor = builder.preProcessor;
        postProcessor = builder.postProcessor;
        displayer = builder.displayer;
        handler = builder.handler;
        isSyncLoading = builder.isSyncLoading;
    }


    public static DisplayImageOptions createSimple()
    {
        return (new Builder()).build();
    }

    public android.graphics.BitmapFactory.Options getDecodingOptions()
    {
        return decodingOptions;
    }

    public int getDelayBeforeLoading()
    {
        return delayBeforeLoading;
    }

    public BitmapDisplayer getDisplayer()
    {
        return displayer;
    }

    public Object getExtraForDownloader()
    {
        return extraForDownloader;
    }

    public Handler getHandler()
    {
        if (isSyncLoading)
        {
            return null;
        }
        if (handler == null)
        {
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                throw new IllegalStateException("ImageLoader.displayImage(...) must be invoked from the main thread or from Looper thread");
            } else
            {
                return new Handler();
            }
        } else
        {
            return handler;
        }
    }

    public Drawable getImageForEmptyUri(Resources resources)
    {
        if (imageResForEmptyUri != 0)
        {
            return resources.getDrawable(imageResForEmptyUri);
        } else
        {
            return imageForEmptyUri;
        }
    }

    public Drawable getImageOnFail(Resources resources)
    {
        if (imageResOnFail != 0)
        {
            return resources.getDrawable(imageResOnFail);
        } else
        {
            return imageOnFail;
        }
    }

    public Drawable getImageOnLoading(Resources resources)
    {
        if (imageResOnLoading != 0)
        {
            return resources.getDrawable(imageResOnLoading);
        } else
        {
            return imageOnLoading;
        }
    }

    public ImageScaleType getImageScaleType()
    {
        return imageScaleType;
    }

    public BitmapProcessor getPostProcessor()
    {
        return postProcessor;
    }

    public BitmapProcessor getPreProcessor()
    {
        return preProcessor;
    }

    public boolean isCacheInMemory()
    {
        return cacheInMemory;
    }

    public boolean isCacheOnDisc()
    {
        return cacheOnDisc;
    }

    public boolean isConsiderExifParams()
    {
        return considerExifParams;
    }

    public boolean isResetViewBeforeLoading()
    {
        return resetViewBeforeLoading;
    }

    boolean isSyncLoading()
    {
        return isSyncLoading;
    }

    public boolean shouldDelayBeforeLoading()
    {
        return delayBeforeLoading > 0;
    }

    public boolean shouldPostProcess()
    {
        return postProcessor != null;
    }

    public boolean shouldPreProcess()
    {
        return preProcessor != null;
    }

    public boolean shouldShowImageForEmptyUri()
    {
        return imageForEmptyUri != null || imageResForEmptyUri != 0;
    }

    public boolean shouldShowImageOnFail()
    {
        return imageOnFail != null || imageResOnFail != 0;
    }

    public boolean shouldShowImageOnLoading()
    {
        return imageOnLoading != null || imageResOnLoading != 0;
    }



















}

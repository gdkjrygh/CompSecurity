// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import java.io.File;

// Referenced classes of package com.accuweather.android.utilities:
//            Utilities, Logger

public class BackgroundImages
{
    public static interface IBackgroundImageListener
    {

        public abstract void onAllImagesLoaded();

        public abstract void onImageLoadError(Exception exception);

        public abstract void onSingleImageLoaded(long l, long l1);
    }


    public static final String ACCUWX_BACKGROUND_IMAGES_FOLDER_NAME = "accuwx_background_images";
    private static final String ACCUWX_HALF_BACKGROUND_IMAGES_FOLDER_NAME = "halfs";
    private static final String HDPI = "hdpi";
    private static final String IMAGE_BASE_URL = "http://vortex.accuweather.com/icons/";
    private static final String MDPI = "mdpi";
    private static final String XHDPI = "xhdpi";
    private static Context mContext;
    private static BackgroundImages mInstance;
    private String mBackgroundFormat;
    private String mResolutionAppendment;
    private String mScreenSizeAppendment;

    private BackgroundImages(Context context)
    {
        mContext = context;
        DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
        int j = displaymetrics.densityDpi;
        int i;
        if (displaymetrics.widthPixels > displaymetrics.heightPixels)
        {
            i = displaymetrics.heightPixels;
        } else
        {
            i = displaymetrics.widthPixels;
        }
        if (j <= 160)
        {
            mResolutionAppendment = "mdpi";
        } else
        if (j <= 240)
        {
            if (!Utilities.isScreenSizeLargeOrGreater(context))
            {
                if (i <= 480)
                {
                    mResolutionAppendment = "hdpi";
                } else
                {
                    mResolutionAppendment = "xhdpi";
                }
            } else
            {
                mResolutionAppendment = "hdpi";
            }
        } else
        {
            mResolutionAppendment = "xhdpi";
        }
        if (Utilities.isScreenSizeLargeOrGreater(context))
        {
            mScreenSizeAppendment = "large-";
        } else
        {
            mScreenSizeAppendment = "";
        }
        mBackgroundFormat = ".png";
    }

    private boolean doesDirectoryContainImages()
    {
        return (new File(getBackgroundDirectory(), (new StringBuilder()).append("background_01").append(mBackgroundFormat).toString())).exists() && (new File(getBackgroundDirectory(), (new StringBuilder()).append("background_25").append(mBackgroundFormat).toString())).exists();
    }

    private boolean doesHalfBackgroundDirectoryContainImages()
    {
        return (new File(getHalfBackgroundDirectory(), "background_01_half.png")).exists() && (new File(getHalfBackgroundDirectory(), "background_24_half.png")).exists();
    }

    private boolean doesHalfBackgroundDirectoryExist()
    {
        return (new File(getBackgroundDirectory())).exists();
    }

    private boolean doesRootDirectoryExist()
    {
        return (new File(getBackgroundDirectory())).exists();
    }

    private Bitmap getBackgroundImage(File file)
    {
        if (Utilities.isGingerbreadOrEarlier())
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = 2;
            return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } else
        {
            return BitmapFactory.decodeFile(file.getAbsolutePath());
        }
    }

    private File getBackgroundImageFile(String s)
    {
        return new File(mContext.getFilesDir(), (new StringBuilder()).append("accuwx_background_images/").append(String.format((new StringBuilder()).append("background_%s").append(mBackgroundFormat).toString(), new Object[] {
            s
        })).toString());
    }

    private Bitmap getDefaultBackgroundBitmap()
    {
        return BitmapFactory.decodeResource(mContext.getResources(), com.accuweather.android.R.drawable.default_background);
    }

    private String getHalfBackgroundDirectory()
    {
        return (new StringBuilder()).append(getBackgroundDirectory()).append("/").append("halfs").toString();
    }

    private File getHalfBackgroundImageFile(String s)
    {
        return new File(getBackgroundDirectory(), (new StringBuilder()).append("halfs/").append(String.format("background_%s_half.png", new Object[] {
            s
        })).toString());
    }

    public static BackgroundImages getInstance(Context context)
    {
        com/accuweather/android/utilities/BackgroundImages;
        JVM INSTR monitorenter ;
        if (mInstance == null)
        {
            mInstance = new BackgroundImages(context);
            mContext = context;
        }
        context = mInstance;
        com/accuweather/android/utilities/BackgroundImages;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private String padIconCode(String s)
    {
        String s1 = s;
        if (s.length() == 1)
        {
            s1 = (new StringBuilder()).append("0").append(s).toString();
        }
        return s1;
    }

    public boolean backgroundImagesAreLocal()
    {
        return false;
    }

    public String getBackgroundDirectory()
    {
        return (new StringBuilder()).append(mContext.getFilesDir()).append("/").append("accuwx_background_images").toString();
    }

    public Bitmap getBackgroundImageFromCode(String s)
    {
        if (s == null)
        {
            return getDefaultBackgroundBitmap();
        } else
        {
            return getBackgroundImage(getBackgroundImageFile(padIconCode(s)));
        }
    }

    public Bitmap getHalfBackgroundImageFromCode(String s)
    {
        if (s == null)
        {
            return getDefaultBackgroundBitmap();
        } else
        {
            return getBackgroundImage(getHalfBackgroundImageFile(padIconCode(s)));
        }
    }

    public String getImageZipUrl()
    {
        String s = (new StringBuilder()).append(mScreenSizeAppendment).append(mResolutionAppendment).toString();
        return (new StringBuilder()).append("http://vortex.accuweather.com/icons/").append(s).append("/").append(s).append(".zip").toString();
    }

    public boolean isLoaded()
    {
        boolean flag = true & doesRootDirectoryExist() & doesHalfBackgroundDirectoryExist() & doesDirectoryContainImages() & doesHalfBackgroundDirectoryContainImages();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("Does root exist ").append(flag).toString());
            Logger.i(getClass().getName(), (new StringBuilder()).append("Does half background directory exist ").append(flag).toString());
            Logger.i(getClass().getName(), (new StringBuilder()).append("Does directory contain images ").append(flag).toString());
            Logger.i(getClass().getName(), (new StringBuilder()).append("Does half background directory contain images ").append(flag).toString());
        }
        if (backgroundImagesAreLocal())
        {
            flag = true;
        }
        return flag;
    }
}

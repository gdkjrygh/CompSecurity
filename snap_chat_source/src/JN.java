// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.snapchat.android.Timber;

public final class JN
{

    private static final String TAG = "BitmapDecoder";
    private JW mBitmapOptionsProvider;
    private final Jy mBitmapPool;
    private final ContentResolver mContentResolver;
    private final DisplayMetrics mDisplayMetrics;
    private ln mMemoryAnalytics;
    private final Resources mResources;

    public JN(DisplayMetrics displaymetrics, ContentResolver contentresolver, Resources resources, Jy jy)
    {
        this(displaymetrics, contentresolver, resources, jy, new JW(), new ln());
    }

    private JN(DisplayMetrics displaymetrics, ContentResolver contentresolver, Resources resources, Jy jy, JW jw, ln ln1)
    {
        mDisplayMetrics = displaymetrics;
        mContentResolver = contentresolver;
        mResources = resources;
        mBitmapPool = jy;
        mBitmapOptionsProvider = jw;
        mMemoryAnalytics = ln1;
    }

    public final Jw a(JP jp, int i, int j, boolean flag)
    {
        Object obj;
        Object obj1;
        int k;
label0:
        {
            jp.a(mContentResolver, mResources);
            if (i > 0)
            {
                k = i;
                i = j;
                if (j > 0)
                {
                    break label0;
                }
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            jp.a(options);
            if (options.outHeight <= 0 || options.outWidth <= 0)
            {
                Timber.e("BitmapDecoder", "Measured invalid Bitmap size %d x %d", new Object[] {
                    Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight)
                });
                return new Jw(false);
            }
            k = options.outWidth;
            i = options.outHeight;
        }
        boolean flag1;
        if (k <= 0 || i <= 0)
        {
            Timber.c("BitmapDecoder", "Invalid measurements! Can't use a Bitmap from the pool. :(", new Object[0]);
            obj = new android.graphics.BitmapFactory.Options();
            obj.inJustDecodeBounds = false;
            obj.inMutable = true;
            obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        } else
        {
            obj1 = JW.a(mDisplayMetrics, k, i);
            obj = obj1;
            if (mBitmapPool != null)
            {
                obj1.inBitmap = mBitmapPool.a(((android.graphics.BitmapFactory.Options) (obj1)), flag);
                obj = obj1;
            }
        }
        if (((android.graphics.BitmapFactory.Options) (obj)).inBitmap != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj1 = jp.a(((android.graphics.BitmapFactory.Options) (obj)));
        if (((JQ) (obj1)).bitmap == null)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        obj1 = new Jw(((JQ) (obj1)).bitmap, flag1);
        return ((Jw) (obj1));
        try
        {
            obj1 = new Jw(((JQ) (obj1)).hadDecryptionError);
        }
        // Misplaced declaration of an exception variable
        catch (JP jp)
        {
            ln.a(jp);
            return new Jw(true);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Bitmap bitmap = ((android.graphics.BitmapFactory.Options) (obj)).inBitmap;
            Timber.a("BitmapDecoder", illegalargumentexception);
            Timber.e("BitmapDecoder", "input width: %d height: %d exactDimensions: %b", new Object[] {
                Integer.valueOf(k), Integer.valueOf(i), Boolean.valueOf(flag)
            });
            j = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
            int l = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
            if (((android.graphics.BitmapFactory.Options) (obj)).inPreferredConfig == null)
            {
                obj = "null";
            } else
            {
                obj = ((android.graphics.BitmapFactory.Options) (obj)).inPreferredConfig.name();
            }
            Timber.e("BitmapDecoder", "options width: %d height: %d config: %s", new Object[] {
                Integer.valueOf(j), Integer.valueOf(l), obj
            });
            if (bitmap != null)
            {
                j = bitmap.getWidth();
                int i1 = bitmap.getHeight();
                flag = bitmap.isMutable();
                boolean flag2 = bitmap.isRecycled();
                if (bitmap.getConfig() == null)
                {
                    obj = "null";
                } else
                {
                    obj = bitmap.getConfig().name();
                }
                Timber.e("BitmapDecoder", "reused bitmap width: %d height: %d mutable: %b, recycled: %b config: %s", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(i1), Boolean.valueOf(flag), Boolean.valueOf(flag2), obj
                });
            }
            obj = JW.a(mDisplayMetrics, k, i);
            obj.inBitmap = null;
            jp = jp.a(((android.graphics.BitmapFactory.Options) (obj)));
            if (((JQ) (jp)).bitmap != null)
            {
                return new Jw(((JQ) (jp)).bitmap, false);
            } else
            {
                return new Jw(((JQ) (jp)).hadDecryptionError);
            }
        }
        return ((Jw) (obj1));
    }
}

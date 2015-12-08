// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.BitmapCounter;
import com.facebook.imagepipeline.memory.BitmapCounterProvider;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.Bitmaps;

// Referenced classes of package com.facebook.imagepipeline.platform:
//            PlatformDecoder

abstract class DalvikPurgeableDecoder
    implements PlatformDecoder
{

    protected static final byte a[] = {
        -1, -39
    };
    private final BitmapCounter b = BitmapCounterProvider.a();

    DalvikPurgeableDecoder()
    {
    }

    private static android.graphics.BitmapFactory.Options a(int i, android.graphics.Bitmap.Config config)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            options.inMutable = true;
        }
        return options;
    }

    protected static boolean a(CloseableReference closeablereference, int i)
    {
        closeablereference = (PooledByteBuffer)closeablereference.a();
        return i >= 2 && closeablereference.a(i - 2) == -1 && closeablereference.a(i - 1) == -39;
    }

    abstract Bitmap a(CloseableReference closeablereference, int i, android.graphics.BitmapFactory.Options options);

    abstract Bitmap a(CloseableReference closeablereference, android.graphics.BitmapFactory.Options options);

    public CloseableReference a(Bitmap bitmap)
    {
        try
        {
            Bitmaps.a(bitmap);
        }
        catch (Exception exception)
        {
            bitmap.recycle();
            throw Throwables.b(exception);
        }
        if (!b.a(bitmap))
        {
            bitmap.recycle();
            throw new TooManyBitmapsException();
        } else
        {
            return CloseableReference.a(bitmap, b.a());
        }
    }

    public CloseableReference a(EncodedImage encodedimage, android.graphics.Bitmap.Config config)
    {
        config = a(encodedimage.g(), config);
        encodedimage = encodedimage.a();
        Preconditions.a(encodedimage);
        config = a(a(((CloseableReference) (encodedimage)), ((android.graphics.BitmapFactory.Options) (config))));
        CloseableReference.c(encodedimage);
        return config;
        config;
        CloseableReference.c(encodedimage);
        throw config;
    }

    public CloseableReference a(EncodedImage encodedimage, android.graphics.Bitmap.Config config, int i)
    {
        config = a(encodedimage.g(), config);
        encodedimage = encodedimage.a();
        Preconditions.a(encodedimage);
        config = a(a(((CloseableReference) (encodedimage)), i, ((android.graphics.BitmapFactory.Options) (config))));
        CloseableReference.c(encodedimage);
        return config;
        config;
        CloseableReference.c(encodedimage);
        throw config;
    }

}

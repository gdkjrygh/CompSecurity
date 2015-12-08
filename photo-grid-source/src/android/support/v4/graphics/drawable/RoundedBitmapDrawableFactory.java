// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.InputStream;

// Referenced classes of package android.support.v4.graphics.drawable:
//            RoundedBitmapDrawable21, RoundedBitmapDrawable

public class RoundedBitmapDrawableFactory
{

    private static final String TAG = "RoundedBitmapDrawableFactory";

    public RoundedBitmapDrawableFactory()
    {
    }

    public static RoundedBitmapDrawable create(Resources resources, Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return new RoundedBitmapDrawable21(resources, bitmap);
        } else
        {
            return new DefaultRoundedBitmapDrawable(resources, bitmap);
        }
    }

    public static RoundedBitmapDrawable create(Resources resources, InputStream inputstream)
    {
        resources = create(resources, BitmapFactory.decodeStream(inputstream));
        if (resources.getBitmap() == null)
        {
            Log.w("RoundedBitmapDrawableFactory", (new StringBuilder("BitmapDrawable cannot decode ")).append(inputstream).toString());
        }
        return resources;
    }

    public static RoundedBitmapDrawable create(Resources resources, String s)
    {
        resources = create(resources, BitmapFactory.decodeFile(s));
        if (resources.getBitmap() == null)
        {
            Log.w("RoundedBitmapDrawableFactory", (new StringBuilder("BitmapDrawable cannot decode ")).append(s).toString());
        }
        return resources;
    }

    private class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable
    {

        void gravityCompatApply(int i, int j, int k, Rect rect, Rect rect1)
        {
            GravityCompat.apply(i, j, k, rect, rect1, 0);
        }

        public boolean hasMipMap()
        {
            return mBitmap != null && BitmapCompat.hasMipMap(mBitmap);
        }

        public void setMipMap(boolean flag)
        {
            if (mBitmap != null)
            {
                BitmapCompat.setHasMipMap(mBitmap, flag);
                invalidateSelf();
            }
        }

        DefaultRoundedBitmapDrawable(Resources resources, Bitmap bitmap)
        {
            super(resources, bitmap);
        }
    }

}

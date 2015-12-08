// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import ajo;
import ajq;
import ajr;
import aju;
import ajw;
import akz;
import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.IOException;

public class ImageRegionSource extends ahn
{

    private ahv mCurrImageFrame;
    private String mCurrImagePath;
    private RectF mCurrImageRectF;
    private String mImagePath;
    private aif mImageType;
    private int mMaxHeight;
    private int mMaxWidth;
    private RectF mRectF;
    private ajq mRectListener;
    private BitmapRegionDecoder mRegionDecoder;

    public ImageRegionSource(ajr ajr, String s)
    {
        super(ajr, s);
        mMaxWidth = 2048;
        mMaxHeight = 2048;
        mImagePath = null;
        mImageType = null;
        mRegionDecoder = null;
        mRectF = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
        mCurrImageFrame = null;
        mCurrImagePath = null;
        mCurrImageRectF = new RectF();
        mRectListener = new akz(this);
    }

    public static RectF a(ImageRegionSource imageregionsource)
    {
        return imageregionsource.mRectF;
    }

    public final ajw b()
    {
        mImageType = aif.a(301, 8);
        return (new ajw()).a("imagePath", 2, aif.a(java/lang/String)).a("rect", 1, aif.a(android/graphics/RectF)).a("maxWidth", 1, aif.a(Integer.TYPE)).a("maxHeight", 1, aif.a(Integer.TYPE)).b("image", 2, mImageType).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("maxWidth"))
        {
            ajo1.a("mMaxWidth");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("maxHeight"))
            {
                ajo1.a("mMaxHeight");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("imagePath"))
            {
                ajo1.a("mImagePath");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("rect"))
            {
                ajo1.a(mRectListener);
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void e()
    {
        int i;
        if (mRegionDecoder == null || !mImagePath.equals(mCurrImagePath))
        {
            if (mRegionDecoder != null)
            {
                mRegionDecoder.recycle();
            }
            String s;
            try
            {
                mRegionDecoder = BitmapRegionDecoder.newInstance(mImagePath, false);
            }
            catch (IOException ioexception)
            {
                String s1 = String.valueOf(mImagePath);
                if (s1.length() != 0)
                {
                    s1 = "Failed setting up BitmapRegionDecoder for ".concat(s1);
                } else
                {
                    s1 = new String("Failed setting up BitmapRegionDecoder for ");
                }
                throw new RuntimeException(s1);
            }
            mCurrImagePath = mImagePath;
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 || !mRectF.equals(mCurrImageRectF))
        {
            if (mRectF.width() <= 0.0F || mRectF.height() <= 0.0F)
            {
                s = String.valueOf(mRectF);
                throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 25)).append("invalid input rectangle: ").append(s).toString());
            }
            i = mRegionDecoder.getHeight();
            int l = mRegionDecoder.getWidth();
            int j = (int)Math.floor(mRectF.left * (float)l);
            int k = (int)Math.floor(mRectF.top * (float)i);
            float f = mRectF.right;
            l = (int)Math.floor((float)l * f);
            f = mRectF.bottom;
            Object obj = new Rect(j, k, l, (int)Math.floor((float)i * f));
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            i = ((Rect) (obj)).height();
            j = ((Rect) (obj)).width();
            double d = Math.ceil(Math.max((double)i / (double)mMaxHeight, (double)j / (double)mMaxWidth));
            if (d <= 1.0D)
            {
                i = 1;
            } else
            {
                i = (int)Math.pow(2D, Math.ceil(Math.log(d) / Math.log(2D)));
            }
            options.inSampleSize = i;
            obj = mRegionDecoder.decodeRegion(((Rect) (obj)), options);
            i = ((Bitmap) (obj)).getWidth();
            j = ((Bitmap) (obj)).getHeight();
            if (mCurrImageFrame != null)
            {
                mCurrImageFrame.i();
            }
            mCurrImageFrame = ahs.a(mImageType, new int[] {
                i, j
            }).h();
            mCurrImageFrame.a(((Bitmap) (obj)));
            mCurrImageRectF.set(mRectF);
        }
        b("image").a(mCurrImageFrame);
    }

    protected final void g()
    {
        if (mRegionDecoder != null)
        {
            mRegionDecoder.recycle();
        }
        if (mCurrImageFrame != null)
        {
            mCurrImageFrame.i();
        }
    }
}

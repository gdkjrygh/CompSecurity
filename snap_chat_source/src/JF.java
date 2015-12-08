// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public final class JF
{
    public static final class a
    {

        byte mBytes[];
        JY mCache;
        String mCacheKey;
        public KK mEncryptionAlgorithm;
        public Bundle mExtras;
        public int mHeight;
        public ImageView mImageView;
        Bitmap mPlaceholderBitmap;
        public String mRequestId;
        public boolean mRequireExactDimensions;
        public Integer mResId;
        boolean mShouldScale;
        String mUri;
        public int mWidth;

        public final a a(String s)
        {
            mUri = s;
            mRequestId = s;
            return this;
        }

        public final a a(String s, JY jy, String s1)
        {
            a(s, jy, s1, null);
            return this;
        }

        public final a a(String s, JY jy, String s1, KK kk)
        {
            mRequestId = s;
            mCache = jy;
            mCacheKey = s1;
            mEncryptionAlgorithm = kk;
            return this;
        }

        public final a a(String s, byte abyte0[])
        {
            mBytes = abyte0;
            mRequestId = s;
            return this;
        }

        public final JF a()
        {
            if (mRequestId == null)
            {
                throw new IllegalArgumentException("Cannot build AsyncLoadBitmapRequest with null request ID.");
            }
            int i;
            int j;
            if (mResId != null)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            i = j;
            if (mBytes != null)
            {
                i = j + 1;
            }
            j = i;
            if (mUri != null)
            {
                j = i + 1;
            }
            i = j;
            if (mCache != null)
            {
                i = j + 1;
            }
            if (i != 1)
            {
                throw new IllegalArgumentException("Must have exactly one Bitmap source for request!");
            } else
            {
                return new JF(this, (byte)0);
            }
        }

        public a()
        {
            mHeight = -1;
            mWidth = -1;
            mShouldScale = false;
            mRequireExactDimensions = true;
            mResId = null;
            mBytes = null;
            mUri = null;
        }
    }


    public JP mBitmapSource;
    private final Bundle mExtras;
    public final int mHeight;
    public final ImageView mImageView;
    final Bitmap mPlaceholderBitmap;
    public final String mRequestId;
    public final boolean mRequireExactDimensions;
    private final boolean mShouldScale;
    public final int mWidth;

    private JF(a a1)
    {
        mImageView = a1.mImageView;
        mPlaceholderBitmap = a1.mPlaceholderBitmap;
        mHeight = a1.mHeight;
        mWidth = a1.mWidth;
        mShouldScale = a1.mShouldScale;
        mRequireExactDimensions = a1.mRequireExactDimensions;
        mExtras = a1.mExtras;
        mRequestId = a1.mRequestId;
        if (a1.mResId != null)
        {
            mBitmapSource = new JV(a1.mResId.intValue());
            return;
        }
        if (a1.mBytes != null)
        {
            mBitmapSource = new JR(a1.mBytes);
            return;
        }
        if (a1.mUri != null)
        {
            if (a1.mEncryptionAlgorithm == null)
            {
                mBitmapSource = new JX(a1.mUri);
                return;
            } else
            {
                mBitmapSource = new JT(a1.mUri, a1.mEncryptionAlgorithm);
                return;
            }
        }
        if (a1.mCache != null)
        {
            mBitmapSource = new JS(a1.mCache, a1.mCacheKey, a1.mEncryptionAlgorithm);
            return;
        } else
        {
            throw new IllegalArgumentException("No valid bitmap source was specified.");
        }
    }

    JF(a a1, byte byte0)
    {
        this(a1);
    }
}

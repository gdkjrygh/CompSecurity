// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public static final class mUri
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

    public final lang.String a(String s)
    {
        mUri = s;
        mRequestId = s;
        return this;
    }

    public final lang.String a(String s, JY jy, String s1)
    {
        a(s, jy, s1, null);
        return this;
    }

    public final lang.String a(String s, JY jy, String s1, KK kk)
    {
        mRequestId = s;
        mCache = jy;
        mCacheKey = s1;
        mEncryptionAlgorithm = kk;
        return this;
    }

    public final lang.String a(String s, byte abyte0[])
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

    public >()
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

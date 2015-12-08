// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.HashSet;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            UrlImageViewHelper, LruBitmapCache, DrawableCache

private static class Brains.mRefCounter extends BitmapDrawable
{
    private static class Brains
    {

        boolean mHeadshot;
        int mRefCounter;

        private Brains()
        {
        }

        Brains(UrlImageViewHelper._cls1 _pcls1)
        {
            this();
        }
    }


    Brains mBrains;
    String mUrl;

    public Brains clone(Resources resources)
    {
        return new <init>(mUrl, resources, getBitmap(), mBrains);
    }

    protected void finalize()
        throws Throwable
    {
        super.finalize();
        Brains brains = mBrains;
        brains.mRefCounter = brains.mRefCounter - 1;
        if (mBrains.mRefCounter == 0)
        {
            if (!mBrains.mHeadshot)
            {
                UrlImageViewHelper.access$700().put(mUrl, getBitmap());
            }
            UrlImageViewHelper.access$600().remove(getBitmap());
            UrlImageViewHelper.access$200().remove(mUrl);
            UrlImageViewHelper.clog((new StringBuilder()).append("Zombie GC event ").append(mUrl).toString(), new Object[0]);
        }
    }

    public void headshot()
    {
        UrlImageViewHelper.clog((new StringBuilder()).append("BOOM! Headshot: ").append(mUrl).toString(), new Object[0]);
        mBrains.mHeadshot = true;
        UrlImageViewHelper.access$200().remove(mUrl);
        UrlImageViewHelper.access$600().remove(getBitmap());
    }

    public Brains(String s, Resources resources, Bitmap bitmap)
    {
        this(s, resources, bitmap, new Brains(null));
    }

    private Brains(String s, Resources resources, Bitmap bitmap, Brains brains)
    {
        super(resources, bitmap);
        mUrl = s;
        mBrains = brains;
        UrlImageViewHelper.access$600().add(bitmap);
        UrlImageViewHelper.access$700().remove(s);
        UrlImageViewHelper.access$200().put(s, this);
        s = mBrains;
        s.mRefCounter = ((Brains) (s)).mRefCounter + 1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public abstract class BQ
    implements BT
{

    alF mClientCacheExpiration;
    public transient List mComponents;
    public String mConfigPath;
    public transient String mFilesPath;
    String mHintId;
    public String mIconLink;
    public transient boolean mIsLoading;
    public boolean mIsSponsored;
    public String mLensCode;
    public String mLensId;
    public String mLensLink;
    public int mOrder;
    public int mPriority;
    public SG mSponsoredSlugPosAndText;

    protected BQ()
    {
        mIsLoading = false;
    }

    public BQ(Rg rg)
    {
        mIsLoading = false;
        Ru ru = rg.o();
        mLensId = rg.a();
        mLensCode = ru.a();
        mIconLink = ru.c();
        mHintId = ru.e();
        mLensLink = ru.d();
        mConfigPath = ru.b();
        mClientCacheExpiration = rg.h();
        mIsSponsored = IJ.a(rg.j());
        mSponsoredSlugPosAndText = rg.k();
        if (mClientCacheExpiration == null)
        {
            Long long1 = rg.i();
            int i;
            if (this instanceof BS)
            {
                i = 4320;
            } else
            {
                i = 10080;
            }
            if (long1 != null)
            {
                i = long1.intValue();
            }
            mClientCacheExpiration = (new alF()).b(i);
        }
        mPriority = IJ.a(rg.d());
    }

    public final String a()
    {
        return mLensId;
    }

    public final String b()
    {
        return mLensCode;
    }

    public final List c()
    {
        return mComponents;
    }

    public final String d()
    {
        return mHintId;
    }

    public final String e()
    {
        return mFilesPath;
    }

    public final boolean f()
    {
        return mIsLoading;
    }

    public final boolean g()
    {
        return mComponents != null && mFilesPath != null;
    }
}

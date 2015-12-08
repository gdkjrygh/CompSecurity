// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.feedback:
//            FeedbackOptions

public static final class mFileTeleporters
{

    private Bitmap afS;
    private String mAccountInUse;
    private String mCategoryTag;
    private String mDescription;
    private boolean mExcludePii;
    private ArrayList mFileTeleporters;
    private String mPrimaryThemeColor;
    private Bundle mPsdBundle;

    public final mFileTeleporters addPsdBundle(Bundle bundle)
    {
        if (bundle != null)
        {
            mPsdBundle.putAll(bundle);
        }
        return this;
    }

    public final FeedbackOptions build()
    {
        return FeedbackOptions.a(FeedbackOptions.a(FeedbackOptions.d(FeedbackOptions.c(FeedbackOptions.a(FeedbackOptions.b(FeedbackOptions.a(FeedbackOptions.a(new FeedbackOptions(null), afS), mAccountInUse), mDescription), mPsdBundle), mPrimaryThemeColor), mCategoryTag), mFileTeleporters), mExcludePii);
    }

    public final mExcludePii setAccountInUse(String s)
    {
        mAccountInUse = s;
        return this;
    }

    public final mAccountInUse setCategoryTag(String s)
    {
        mCategoryTag = s;
        return this;
    }

    public final mCategoryTag setDescription(String s)
    {
        mDescription = s;
        return this;
    }

    public ()
    {
        mPsdBundle = new Bundle();
        mFileTeleporters = new ArrayList();
    }
}

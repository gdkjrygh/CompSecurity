// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.Context;
import com.google.android.libraries.bind.data.Data;

// Referenced classes of package com.google.android.play.onboard:
//            OnboardTutorialPage, OnboardPageInfo

public static final class mData
{

    protected final Context mContext;
    protected Data mData;
    protected final int mPageCount = 3;
    protected final int mPageIndex;

    public final Data build()
    {
        if (mData.get(0x7f0d0055) == null)
        {
            mData.put(0x7f0d0055, (new StringBuilder("tutorial")).append(mPageIndex).toString());
        }
        if (mData.get(0x7f0d0056) == null)
        {
            mData.put(0x7f0d0056, new utorialPageInfo(mContext.getApplicationContext(), mPageIndex, 3));
        }
        return mData;
    }

    public final mData setBackgroundColor(int i)
    {
        mData.put(0x7f0d0059, Integer.valueOf(i));
        return this;
    }

    public final mData setBodyText(int i)
    {
        String s = mContext.getString(i);
        mData.put(0x7f0d005a, s);
        return this;
    }

    public final mData setIconDrawableId(int i)
    {
        mData.put(0x7f0d005b, Integer.valueOf(i));
        return this;
    }

    public final mData setPageInfo(OnboardPageInfo onboardpageinfo)
    {
        mData.put(0x7f0d0056, onboardpageinfo);
        return this;
    }

    public final mData setTitleText(int i)
    {
        String s = mContext.getString(i);
        mData.put(0x7f0d005c, s);
        return this;
    }

    public utorialPageInfo(Context context, int i)
    {
        mData = new Data();
        mContext = context;
        mPageIndex = i;
        mData.put(0x7f0d0003, Integer.valueOf(0x7f040126));
    }
}

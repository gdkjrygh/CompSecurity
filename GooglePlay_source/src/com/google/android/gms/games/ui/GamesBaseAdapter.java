// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.widget.BaseAdapter;

// Referenced classes of package com.google.android.gms.games.ui:
//            FlingListener

public abstract class GamesBaseAdapter extends BaseAdapter
    implements FlingListener
{

    boolean mShouldLoadImages;

    public GamesBaseAdapter()
    {
        mShouldLoadImages = true;
    }

    public final void enableImageLoading(boolean flag, boolean flag1)
    {
        if (mShouldLoadImages != flag)
        {
            mShouldLoadImages = flag;
            if (flag1)
            {
                notifyDataSetChanged();
            }
        }
    }

    public final void onFlingBegin()
    {
        enableImageLoading(false, false);
    }

    public final void onFlingEnd()
    {
        enableImageLoading(true, true);
    }
}

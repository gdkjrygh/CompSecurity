// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.Freezable;

// Referenced classes of package com.google.android.gms.games.ui:
//            DatabufferRecyclerAdapter, GamesRecyclerAdapter

public static abstract class nit> extends nit>
{

    private Object mData;

    public final Object getData()
    {
        if (mData instanceof Freezable)
        {
            if (((Freezable)mData).isDataValid())
            {
                return mData;
            } else
            {
                return null;
            }
        } else
        {
            return mData;
        }
    }

    public final DataBuffer getDataBuffer()
    {
        return ((DatabufferRecyclerAdapter)mAdapter).mDataBuffer;
    }

    public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        super.pulateViews(gamesrecycleradapter, i);
        mData = obj;
    }

    public final void repopulateViews()
    {
        populateViews(mAdapter, getLocalPosition(), getData());
    }

    public (View view)
    {
        super(view);
    }
}

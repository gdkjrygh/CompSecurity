// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public final class TransientDataHolder
{

    public DataHolder.Builder mData;
    public String mNextToken;
    public String mPrevToken;

    public TransientDataHolder(String as[])
    {
        this(as, null, null, null);
    }

    public TransientDataHolder(String as[], String s, String s1, String s2)
    {
        mPrevToken = s1;
        mNextToken = s2;
        if (s != null)
        {
            mData = DataHolder.builder(as, s);
            return;
        } else
        {
            mData = DataHolder.builder(as);
            return;
        }
    }

    public final void addRow(ContentValues contentvalues)
    {
        mData.withRow(contentvalues);
    }

    public final DataHolder build(int i)
    {
        return build(i, new Bundle(), -1);
    }

    public final DataHolder build(int i, Bundle bundle, int j)
    {
        bundle.putString("next_page_token", mNextToken);
        bundle.putString("prev_page_token", mPrevToken);
        return new DataHolder(mData, i, bundle, j, (byte)0);
    }

    public final int getCount()
    {
        return mData.mRows.size();
    }

    public final void sortData(String s)
    {
        mData.sort(s);
    }

    public final void sortDataDescending(String s)
    {
        DataHolder.Builder builder = mData;
        if (!builder.isSortedOnColumn(s))
        {
            builder.sort(s);
            Collections.reverse(builder.mRows);
        }
    }
}

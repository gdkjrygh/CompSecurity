// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import android.widget.ListAdapter;
import android.widget.SectionIndexer;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            HeadedListAdapter

static final class  extends HeadedListAdapter
    implements SectionIndexer
{

    private SectionIndexer mSectionIndexer;

    public final int getPositionForSection(int i)
    {
        if (i == 0)
        {
            return 0;
        }
        int j;
        if (mHeaderAdapter.mHeaderAdapter())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i = mSectionIndexer.getPositionForSection(i);
        if (i >= mAdapter.getCount())
        {
            if (mFooterAdapter.mFooterAdapter())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            return mAdapter.getCount() + j + i;
        } else
        {
            return i + j;
        }
    }

    public final int getSectionForPosition(int i)
    {
        int j;
        if (mHeaderAdapter.mHeaderAdapter())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i <= j)
        {
            return 0;
        } else
        {
            return mSectionIndexer.getSectionForPosition(i - j);
        }
    }

    public final Object[] getSections()
    {
        return mSectionIndexer.getSections();
    }

    public final void setAdapter(ListAdapter listadapter)
    {
        Preconditions.checkArgument(listadapter instanceof SectionIndexer, "adapter must implement SectionIndexer");
        mSectionIndexer = (SectionIndexer)listadapter;
        super.setAdapter(listadapter);
    }

    protected ()
    {
    }
}

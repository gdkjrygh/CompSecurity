// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.emilsjolander.components.stickylistheaders;

import android.content.Context;
import android.widget.SectionIndexer;

// Referenced classes of package com.emilsjolander.components.stickylistheaders:
//            AdapterWrapper, StickyListHeadersAdapter

final class SectionIndexerAdapterWrapper extends AdapterWrapper
    implements SectionIndexer
{

    private SectionIndexer mSectionIndexerDelegate;

    SectionIndexerAdapterWrapper(Context context, StickyListHeadersAdapter stickylistheadersadapter)
    {
        super(context, stickylistheadersadapter);
        mSectionIndexerDelegate = (SectionIndexer)stickylistheadersadapter;
    }

    public final int getPositionForSection(int i)
    {
        return mSectionIndexerDelegate.getPositionForSection(i);
    }

    public final int getSectionForPosition(int i)
    {
        return mSectionIndexerDelegate.getSectionForPosition(i);
    }

    public final Object[] getSections()
    {
        return mSectionIndexerDelegate.getSections();
    }
}

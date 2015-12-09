// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.widget.SectionIndexer;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            AdapterWrapper, StickyListHeadersAdapter

class SectionIndexerAdapterWrapper extends AdapterWrapper
    implements SectionIndexer
{

    final SectionIndexer mSectionIndexerDelegate;

    SectionIndexerAdapterWrapper(Context context, StickyListHeadersAdapter stickylistheadersadapter)
    {
        super(context, stickylistheadersadapter);
        mSectionIndexerDelegate = (SectionIndexer)stickylistheadersadapter;
    }

    public int getPositionForSection(int i)
    {
        return mSectionIndexerDelegate.getPositionForSection(i);
    }

    public int getSectionForPosition(int i)
    {
        return mSectionIndexerDelegate.getSectionForPosition(i);
    }

    public Object[] getSections()
    {
        return mSectionIndexerDelegate.getSections();
    }
}

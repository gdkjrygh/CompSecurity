// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.support.v7.widget.RecyclerView;
import com.skype.android.app.data.OnUserEventListener;

// Referenced classes of package com.skype.android.app.search:
//            SearchWidget, ContactSearchResultAdapter

final class this._cls0
    implements OnUserEventListener
{

    final SearchWidget this$0;

    public final volatile void onItemChecked(android.support.v7.widget.._cls4 _pcls4, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.mViewHolder)_pcls4, obj, flag);
    }

    public final void onItemChecked(com.skype.android.app.data.mViewHolder mviewholder, Object obj, boolean flag)
    {
    }

    public final volatile void onItemClick(android.support.v7.widget.._cls4 _pcls4, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.mViewHolder)_pcls4, i, obj);
    }

    public final void onItemClick(com.skype.android.app.data.mViewHolder mviewholder, int i, Object obj)
    {
        SearchWidget.access$1200(SearchWidget.this).setMode(pter.Mode.MODE_SINGLE);
        SearchWidget.access$700(SearchWidget.this).setAdapter(SearchWidget.access$1200(SearchWidget.this));
    }

    public final volatile boolean onItemLongClick(android.support.v7.widget.._cls4 _pcls4, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.mViewHolder)_pcls4, i, obj);
    }

    public final boolean onItemLongClick(com.skype.android.app.data.mViewHolder mviewholder, int i, Object obj)
    {
        return false;
    }

    iewHolder()
    {
        this$0 = SearchWidget.this;
        super();
    }
}

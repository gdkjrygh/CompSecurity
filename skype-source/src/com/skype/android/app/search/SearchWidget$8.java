// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.support.v4.app.FragmentActivity;
import com.skype.android.app.data.OnUserEventListener;

// Referenced classes of package com.skype.android.app.search:
//            SearchWidget, AgentInfo, AgentSyncWaiter

final class this._cls0
    implements OnUserEventListener
{

    final SearchWidget this$0;

    public final volatile void onItemChecked(android.support.v7.widget.._cls8 _pcls8, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.mViewHolder)_pcls8, (AgentInfo)obj, flag);
    }

    public final void onItemChecked(com.skype.android.app.data.mViewHolder mviewholder, AgentInfo agentinfo, boolean flag)
    {
    }

    public final volatile void onItemClick(android.support.v7.widget.._cls8 _pcls8, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.mViewHolder)_pcls8, i, (AgentInfo)obj);
    }

    public final void onItemClick(com.skype.android.app.data.mViewHolder mviewholder, int i, AgentInfo agentinfo)
    {
        SearchWidget.access$400(SearchWidget.this).addAgentAndWaitWithSpinner((FragmentActivity)SearchWidget.access$300(SearchWidget.this), agentinfo);
    }

    public final volatile boolean onItemLongClick(android.support.v7.widget.._cls8 _pcls8, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.mViewHolder)_pcls8, i, (AgentInfo)obj);
    }

    public final boolean onItemLongClick(com.skype.android.app.data.mViewHolder mviewholder, int i, AgentInfo agentinfo)
    {
        return false;
    }

    iewHolder()
    {
        this$0 = SearchWidget.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.app.search:
//            SuggestedAgentsAdapter, AgentInfo

final class  extends com.skype.android.app.data.er
{

    final SuggestedAgentsAdapter this$0;
    final Activity val$activity;

    protected final int getItemId(AgentInfo agentinfo)
    {
        return agentinfo.hashCode();
    }

    protected final volatile int getItemId(Object obj)
    {
        return getItemId((AgentInfo)obj);
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(val$activity).inflate(0x7f030063, viewgroup, false);
    }

    protected final com.skype.android.app.data.r onCreateViewHolder(View view)
    {
        return new <init>(SuggestedAgentsAdapter.this, view);
    }

    ()
    {
        this$0 = final_suggestedagentsadapter;
        val$activity = Activity.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.app.recents:
//            RecentAdapter, Recent

public class itemLayoutId extends com.skype.android.app.data.er
{

    final int itemLayoutId;
    final RecentAdapter this$0;

    protected int getItemId(Object obj)
    {
        return ((Recent)obj).getConversationObjectId();
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(itemLayoutId, viewgroup, false);
    }

    protected volatile com.skype.android.app.data.er onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    protected onCreateViewHolder onCreateViewHolder(View view)
    {
        return new init>(RecentAdapter.this, RecentAdapter.access$200(RecentAdapter.this), view, imageCache, contactUtil, groupAvatarUtil, defaultAvatars, map, lib);
    }

    public (int i)
    {
        this$0 = RecentAdapter.this;
        super();
        itemLayoutId = i;
    }
}

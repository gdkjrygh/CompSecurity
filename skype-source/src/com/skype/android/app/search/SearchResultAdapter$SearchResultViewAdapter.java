// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultAdapter

public abstract class itemLayoutId extends com.skype.android.app.data.r
{

    final int itemLayoutId;
    final SearchResultAdapter this$0;

    protected View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(itemLayoutId, viewgroup, false);
    }

    public (int i)
    {
        this$0 = SearchResultAdapter.this;
        super();
        itemLayoutId = i;
    }
}

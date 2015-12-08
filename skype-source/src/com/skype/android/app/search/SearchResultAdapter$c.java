// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultAdapter

private final class <init> extends com.skype.android.app.data.apter
{

    final SearchResultAdapter this$0;

    protected final int getItemId(Object obj)
    {
        return 0;
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300f7, viewgroup, false);
    }

    protected final volatile com.skype.android.app.data.lder onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    protected final onCreateViewHolder onCreateViewHolder(View view)
    {
        return new <init>(SearchResultAdapter.this, view);
    }

    private er()
    {
        this$0 = SearchResultAdapter.this;
        super();
    }

    ter(ter ter)
    {
        this();
    }
}

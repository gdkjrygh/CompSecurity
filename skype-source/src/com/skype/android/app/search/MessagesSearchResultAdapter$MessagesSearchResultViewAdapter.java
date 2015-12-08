// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.view.View;

// Referenced classes of package com.skype.android.app.search:
//            MessagesSearchResultAdapter, MessageItem

public class this._cls0 extends this._cls0
{

    final MessagesSearchResultAdapter this$0;

    protected int getItemId(Object obj)
    {
        return ((MessageItem)obj).getMessageObjectId();
    }

    protected volatile com.skype.android.app.data.r onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    protected onCreateViewHolder onCreateViewHolder(View view)
    {
        return new it>(MessagesSearchResultAdapter.this, view);
    }

    public (int i)
    {
        this$0 = MessagesSearchResultAdapter.this;
        super(MessagesSearchResultAdapter.this, i);
    }
}

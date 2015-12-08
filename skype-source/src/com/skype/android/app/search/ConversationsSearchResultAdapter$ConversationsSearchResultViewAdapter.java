// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.view.View;
import com.skype.android.app.recents.Recent;

// Referenced classes of package com.skype.android.app.search:
//            ConversationsSearchResultAdapter

public class this._cls0 extends this._cls0
{

    final ConversationsSearchResultAdapter this$0;

    protected int getItemId(Object obj)
    {
        return ((Recent)obj).getConversationObjectId();
    }

    protected volatile com.skype.android.app.data.r onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    protected onCreateViewHolder onCreateViewHolder(View view)
    {
        return new t>(ConversationsSearchResultAdapter.this, view);
    }

    public (int i)
    {
        this$0 = ConversationsSearchResultAdapter.this;
        super(ConversationsSearchResultAdapter.this, i);
    }
}

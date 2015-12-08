// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import android.view.View;

// Referenced classes of package com.skype.android.app.favorites:
//            FavoriteGridListAdapter, Favorite

final class er extends com.skype.android.widget.ewAdapter
{

    final FavoriteGridListAdapter this$0;

    protected final int getItemId(Favorite favorite)
    {
        return favorite.getConversationObjectId();
    }

    protected final volatile int getItemId(Object obj)
    {
        return getItemId((Favorite)obj);
    }

    protected final volatile com.skype.android.app.data. onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    protected final com.skype.android.widget.ewHolder onCreateViewHolder(View view)
    {
        return new <init>(FavoriteGridListAdapter.this, view);
    }

    r()
    {
        this$0 = FavoriteGridListAdapter.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import android.view.View;
import com.skype.android.util.ConversationUtil;
import com.skype.android.widget.GridListAdapterViewBuilder;

// Referenced classes of package com.skype.android.app.favorites:
//            FavoriteGridListAdapter, Favorite

final class r extends com.skype.android.widget.ewHolder
{

    final FavoriteGridListAdapter this$0;

    protected final void onSetData(Favorite favorite)
    {
        if (favorite.isDialog())
        {
            FavoriteGridListAdapter.access$100(FavoriteGridListAdapter.this).a(this, FavoriteGridListAdapter.access$000(FavoriteGridListAdapter.this).a(favorite.getIdentity()));
            return;
        } else
        {
            FavoriteGridListAdapter.access$200(FavoriteGridListAdapter.this).a(this, favorite);
            return;
        }
    }

    protected final volatile void onSetData(Object obj)
    {
        onSetData((Favorite)obj);
    }

    public r(View view)
    {
        this$0 = FavoriteGridListAdapter.this;
        super(view);
    }
}

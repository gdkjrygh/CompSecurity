// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import android.app.Activity;
import android.view.View;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.widget.GridListAdapter;
import com.skype.android.widget.GridListAdapterViewBuilder;

// Referenced classes of package com.skype.android.app.favorites:
//            Favorite

public class FavoriteGridListAdapter extends GridListAdapter
{
    final class a extends com.skype.android.widget.GridListAdapter.GridItemViewHolder
    {

        final FavoriteGridListAdapter this$0;

        protected final void onSetData(Favorite favorite)
        {
            if (favorite.isDialog())
            {
                
// JavaClassFileOutputException: get_constant: invalid tag

        protected final volatile void onSetData(Object obj)
        {
            onSetData((Favorite)obj);
        }

        public a(View view)
        {
            this$0 = FavoriteGridListAdapter.this;
            super(view);
        }
    }


    public FavoriteGridListAdapter(Activity activity, ContactUtil contactutil, ImageCache imagecache, ConversationUtil conversationutil, GridListAdapterViewBuilder gridlistadapterviewbuilder)
    {
        GridListAdapter(activity, contactutil, imagecache, conversationutil, gridlistadapterviewbuilder);
        setItemViewAdapter(0, new com.skype.android.widget.GridListAdapter.GridItemViewAdapter() {

            final FavoriteGridListAdapter this$0;

            protected final int getItemId(Favorite favorite)
            {
                return favorite.getConversationObjectId();
            }

            protected final volatile int getItemId(Object obj)
            {
                return getItemId((Favorite)obj);
            }

            protected final volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
            {
                return onCreateViewHolder(view);
            }

            protected final com.skype.android.widget.GridListAdapter.GridItemViewHolder onCreateViewHolder(View view)
            {
                return new a(view);
            }

            
            {
                this$0 = FavoriteGridListAdapter.this;
                super();
            }
        });
    }



}

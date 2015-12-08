// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.view.View;
import com.soundcloud.android.presentation.PagingRecyclerItemAdapter;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            UserItemRenderer

public class UserRecyclerItemAdapter extends PagingRecyclerItemAdapter
{
    public static class UserViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public UserViewHolder(View view)
        {
            super(view);
        }
    }


    public UserRecyclerItemAdapter(UserItemRenderer useritemrenderer)
    {
        super(useritemrenderer);
    }

    protected volatile android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view)
    {
        return createViewHolder(view);
    }

    protected UserViewHolder createViewHolder(View view)
    {
        return new UserViewHolder(view);
    }

    public int getBasicItemViewType(int i)
    {
        return 0;
    }
}

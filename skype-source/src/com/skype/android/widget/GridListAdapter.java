// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.android.app.data.DataAdapter;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.widget.recycler.OnSpanCountListener;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.widget:
//            GridListAdapterViewBuilder, SkypeAvatarView, SymbolView

public abstract class GridListAdapter extends DataAdapter
    implements OnSpanCountListener
{
    protected static abstract class GridItemViewAdapter extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        protected View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030067, viewgroup, false);
        }

        protected GridItemViewAdapter()
        {
        }
    }

    public static abstract class GridItemViewHolder extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        public SkypeAvatarView avatar;
        public Future bitmapFuture;
        public TextView displayName;
        public View displayNameContainer;
        public SymbolView presenceIcon;

        public void onViewRecycled()
        {
            super.onViewRecycled();
            if (bitmapFuture != null)
            {
                bitmapFuture.cancel(true);
            }
        }

        public GridItemViewHolder(View view)
        {
            super(view);
            avatar = (SkypeAvatarView)view.findViewById(0x7f100326);
            displayName = (TextView)view.findViewById(0x7f100327);
            displayNameContainer = view.findViewById(0x7f100328);
            presenceIcon = (SymbolView)view.findViewById(0x7f100329);
        }
    }


    protected ContactUtil contactUtil;
    protected ConversationUtil conversationUtil;
    protected ImageCache imageCache;
    protected GridListAdapterViewBuilder viewBuilder;

    public GridListAdapter(Activity activity, ContactUtil contactutil, ImageCache imagecache, ConversationUtil conversationutil, GridListAdapterViewBuilder gridlistadapterviewbuilder)
    {
        contactUtil = contactutil;
        imageCache = imagecache;
        conversationUtil = conversationutil;
        viewBuilder = gridlistadapterviewbuilder;
    }

    public void onSpanCount(int i)
    {
        viewBuilder.a(i);
    }

    public void setMaxItemsPerRow(int i)
    {
        viewBuilder.a(i);
    }
}

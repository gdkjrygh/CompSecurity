// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.strings.Joiner;
import com.soundcloud.java.strings.Strings;
import java.util.List;

public class PlaylistGridRenderer
    implements CellRenderer
{
    static class ItemViewHolder
    {

        public ImageView imageView;
        public TextView tagList;
        public TextView title;
        public TextView trackCount;
        public TextView username;

        ItemViewHolder()
        {
        }
    }


    private final ImageOperations imageOperations;

    public PlaylistGridRenderer(ImageOperations imageoperations)
    {
        imageOperations = imageoperations;
    }

    private String formatTags(List list)
    {
        if (list.size() >= 2)
        {
            return Strings.joinOn(", ").join(Lists.transform(list.subList(0, 2), new _cls1()));
        }
        if (list.size() == 1)
        {
            return (new StringBuilder("#")).append((String)list.get(0)).toString();
        } else
        {
            return "";
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        ItemViewHolder itemviewholder = (ItemViewHolder)view.getTag();
        list = (PlaylistItem)list.get(i);
        itemviewholder.username.setText(list.getCreatorName());
        itemviewholder.title.setText(list.getTitle());
        String s = view.getResources().getQuantityString(0x7f09001c, list.getTrackCount(), new Object[] {
            Integer.valueOf(list.getTrackCount())
        });
        itemviewholder.trackCount.setText(s);
        itemviewholder.tagList.setText(formatTags(list.getTags()));
        view = ApiImageSize.getFullImageSize(view.getResources());
        imageOperations.displayInAdapterView(list.getEntityUrn(), view, itemviewholder.imageView);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = View.inflate(viewgroup.getContext(), 0x7f030054, null);
        ItemViewHolder itemviewholder = new ItemViewHolder();
        itemviewholder.imageView = (ImageView)viewgroup.findViewById(0x7f0f006f);
        itemviewholder.username = (TextView)viewgroup.findViewById(0x7f0f0151);
        itemviewholder.title = (TextView)viewgroup.findViewById(0x7f0f0073);
        itemviewholder.tagList = (TextView)viewgroup.findViewById(0x7f0f00eb);
        itemviewholder.trackCount = (TextView)viewgroup.findViewById(0x7f0f0152);
        viewgroup.setTag(itemviewholder);
        return viewgroup;
    }

    private class _cls1
        implements Function
    {

        final PlaylistGridRenderer this$0;

        public volatile Object apply(Object obj)
        {
            return apply((String)obj);
        }

        public String apply(String s)
        {
            return (new StringBuilder("#")).append(s).toString();
        }

        _cls1()
        {
            this$0 = PlaylistGridRenderer.this;
            super();
        }
    }

}

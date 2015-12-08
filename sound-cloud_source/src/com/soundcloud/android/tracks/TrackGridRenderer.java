// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.util.CondensedNumberFormatter;
import java.util.List;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItem

public class TrackGridRenderer
    implements CellRenderer
{
    static class ItemViewHolder
    {

        public TextView genre;
        public ImageView imageView;
        public TextView playcount;
        public TextView title;
        public TextView username;

        ItemViewHolder()
        {
        }
    }


    private final ImageOperations imageOperations;
    private final CondensedNumberFormatter numberFormatter;

    TrackGridRenderer(ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter)
    {
        imageOperations = imageoperations;
        numberFormatter = condensednumberformatter;
    }

    public void bindItemView(int i, View view, List list)
    {
        ItemViewHolder itemviewholder = (ItemViewHolder)view.getTag();
        list = (TrackItem)list.get(i);
        itemviewholder.username.setText(list.getCreatorName());
        itemviewholder.title.setText(list.getTitle());
        if (TextUtils.isEmpty(list.getGenre()))
        {
            itemviewholder.genre.setVisibility(8);
        } else
        {
            itemviewholder.genre.setText((new StringBuilder("#")).append(list.getGenre()).toString());
            itemviewholder.genre.setVisibility(0);
        }
        itemviewholder.playcount.setText(numberFormatter.format(list.getPlayCount()));
        view = ApiImageSize.getFullImageSize(view.getResources());
        imageOperations.displayInAdapterView(list.getEntityUrn(), view, itemviewholder.imageView);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = View.inflate(viewgroup.getContext(), 0x7f030068, null);
        ItemViewHolder itemviewholder = new ItemViewHolder();
        itemviewholder.imageView = (ImageView)viewgroup.findViewById(0x7f0f006f);
        itemviewholder.username = (TextView)viewgroup.findViewById(0x7f0f0151);
        itemviewholder.title = (TextView)viewgroup.findViewById(0x7f0f0073);
        itemviewholder.genre = (TextView)viewgroup.findViewById(0x7f0f00eb);
        itemviewholder.playcount = (TextView)viewgroup.findViewById(0x7f0f0152);
        viewgroup.setTag(itemviewholder);
        itemviewholder.playcount.setCompoundDrawablesWithIntrinsicBounds(0x7f020242, 0, 0, 0);
        return viewgroup;
    }
}

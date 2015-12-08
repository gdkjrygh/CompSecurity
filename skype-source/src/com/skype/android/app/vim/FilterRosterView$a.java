// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.skype.android.app.vim:
//            FilterRosterView, VideoEffect

private final class setVideoFilters extends android.support.v7.widget.setVideoFilters
{

    private VideoEffect enabledFilters[];
    final FilterRosterView this$0;

    private void setVideoFilters(String as[])
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(0, VideoEffect.NORMAL);
        HashMap hashmap = new HashMap();
        VideoEffect avideoeffect[] = VideoEffect.values();
        int k = avideoeffect.length;
        for (int i = 0; i < k; i++)
        {
            VideoEffect videoeffect1 = avideoeffect[i];
            hashmap.put(videoeffect1.name(), videoeffect1);
        }

        k = as.length;
        for (int j = 0; j < k; j++)
        {
            VideoEffect videoeffect = (VideoEffect)hashmap.get(as[j].toUpperCase());
            if (videoeffect != null)
            {
                arraylist.add(videoeffect);
            }
        }

        enabledFilters = (VideoEffect[])arraylist.toArray(new VideoEffect[arraylist.size()]);
    }

    public final int getItemCount()
    {
        return enabledFilters.length;
    }

    public final volatile void onBindViewHolder(android.support.v7.widget.enabledFilters enabledfilters, int i)
    {
        onBindViewHolder((onBindViewHolder)enabledfilters, i);
    }

    public final void onBindViewHolder(onBindViewHolder onbindviewholder, int i)
    {
        VideoEffect videoeffect = enabledFilters[i];
        onbindviewholder.preview.setBackgroundResource(videoeffect.getPreviewDrawableId());
        onbindviewholder.preview.setTag(videoeffect);
        onbindviewholder.preview.setOnClickListener(new android.view.View.OnClickListener() {

            final FilterRosterView.a this$1;

            public final void onClick(View view)
            {
                FilterRosterView.access$102(this$0, (VideoEffect)view.getTag());
                if (FilterRosterView.access$200(this$0) != null)
                {
                    FilterRosterView.access$200(this$0).onFilterSelected(FilterRosterView.access$100(this$0));
                }
                notifyDataSetChanged();
                FilterRosterView.access$000(this$0, 5000L);
            }

            
            {
                this$1 = FilterRosterView.a.this;
                super();
            }
        });
        onbindviewholder = onbindviewholder.preview;
        boolean flag;
        if (FilterRosterView.access$100(FilterRosterView.this) == videoeffect)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        onbindviewholder.setSelected(flag);
    }

    public final volatile android.support.v7.widget.this._cls0 onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public final onCreateViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        viewgroup = LayoutInflater.from(getContext()).inflate(0x7f03008f, viewgroup, false);
        return new <init>(FilterRosterView.this, viewgroup);
    }

    public _cls1.this._cls1(String as[])
    {
        this$0 = FilterRosterView.this;
        super();
        setVideoFilters(as);
    }
}

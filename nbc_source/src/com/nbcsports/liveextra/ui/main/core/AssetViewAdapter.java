// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.collections4.CollectionUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModel, HeaderViewHolder, DefaultViewHolder, DefaultItemView

public class AssetViewAdapter extends android.support.v7.widget.RecyclerView.Adapter
    implements StickyRecyclerHeadersAdapter
{

    private final LayoutInflater inflater;
    private Locale locale;
    private final com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageInfo;
    private final boolean relativeDateHeader;
    List viewModels;

    public AssetViewAdapter(Context context, com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageinfo, boolean flag)
    {
        viewModels = new ArrayList();
        pageInfo = pageinfo;
        relativeDateHeader = flag;
        inflater = LayoutInflater.from(context);
        locale = context.getResources().getConfiguration().locale;
    }

    public void add(Asset asset)
    {
        viewModels.add(new AssetViewModel(asset));
        notifyDataSetChanged();
    }

    public int findFirstPositionForDate(DateTime datetime)
    {
        if (datetime != null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= viewModels.size())
                {
                    break label1;
                }
                j = i;
                if (((AssetViewModel)viewModels.get(i)).asset().getAiringDate().equals(datetime.withZone(DateTimeZone.getDefault())))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return 0;
    }

    public long getHeaderId(int i)
    {
        if (!CollectionUtils.isEmpty(viewModels)) goto _L2; else goto _L1
_L1:
        AssetViewModel assetviewmodel;
        return 0L;
_L2:
        if ((assetviewmodel = (AssetViewModel)viewModels.get(i)).isLive()) goto _L1; else goto _L3
_L3:
        long l = assetviewmodel.asset().getAiringDate().getMillis();
        return l;
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        return 0L;
    }

    public int getItemCount()
    {
        return viewModels.size();
    }

    public volatile void onBindHeaderViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindHeaderViewHolder((HeaderViewHolder)viewholder, i);
    }

    public void onBindHeaderViewHolder(HeaderViewHolder headerviewholder, int i)
    {
        if (viewModels == null || viewModels.isEmpty())
        {
            return;
        }
        int j = i;
        if (i == -1)
        {
            j = 0;
        }
        headerviewholder.bind((AssetViewModel)viewModels.get(j), locale);
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((DefaultViewHolder)viewholder, i);
    }

    public void onBindViewHolder(DefaultViewHolder defaultviewholder, int i)
    {
        defaultviewholder.bind((AssetViewModel)viewModels.get(i));
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewgroup)
    {
        return onCreateHeaderViewHolder(viewgroup);
    }

    public HeaderViewHolder onCreateHeaderViewHolder(ViewGroup viewgroup)
    {
        return new HeaderViewHolder(inflater.inflate(0x7f04004d, viewgroup, false), relativeDateHeader);
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public DefaultViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new DefaultViewHolder((DefaultItemView)inflater.inflate(0x7f040022, viewgroup, false), pageInfo);
    }

    public void remove(Asset asset)
    {
        asset = new AssetViewModel(asset);
        int i = viewModels.indexOf(asset);
        viewModels.remove(i);
        notifyDataSetChanged();
    }

    public void update(List list)
    {
        viewModels.clear();
        viewModels.addAll(list);
        notifyDataSetChanged();
    }
}

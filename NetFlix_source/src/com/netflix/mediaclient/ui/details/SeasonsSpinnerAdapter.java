// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            SeasonsSpinner

public class SeasonsSpinnerAdapter extends BaseAdapter
{

    private static final String TAG = "SeasonsSpinnerAdapter";
    private final Context context;
    private final LayoutInflater inflater;
    private int itemBgDrawableId;
    private final List seasons = new ArrayList();

    public SeasonsSpinnerAdapter(NetflixActivity netflixactivity)
    {
        context = netflixactivity;
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        int i;
        if (netflixactivity.isForKids())
        {
            i = 0x7f0200f0;
        } else
        {
            i = 0x7f02015e;
        }
        itemBgDrawableId = i;
    }

    public int getCount()
    {
        return seasons.size();
    }

    public SeasonDetails getItem(int i)
    {
        if (i < 0 || i >= getCount())
        {
            Log.w("SeasonsSpinnerAdapter", (new StringBuilder()).append("Position requested (").append(i).append(") is outside of count: ").append(getCount()).toString());
            return null;
        } else
        {
            return (SeasonDetails)seasons.get(i);
        }
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getSeasonIndexBySeasonNumber(int i)
    {
        for (int j = 0; j < getCount(); j++)
        {
            if (i == getItem(j).getSeasonNumber())
            {
                Log.v("SeasonsSpinnerAdapter", (new StringBuilder()).append("Found season index: ").append(j).toString());
                return j;
            }
        }

        return -1;
    }

    public int getSeasonNumberForPosition(int i)
    {
        return getItem(i).getSeasonNumber();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = (TextView)view;
        view = ((View) (obj));
        if (obj == null)
        {
            view = (TextView)inflater.inflate(0x7f03007b, null, false);
        }
        obj = getItem(i);
        view.setTag(Integer.valueOf(((SeasonDetails) (obj)).getSeasonNumber()));
        view.setText(((SeasonDetails) (obj)).getSeasonNumberTitle(context));
        if (viewgroup instanceof SeasonsSpinner)
        {
            i = 0x7f090030;
        } else
        {
            i = itemBgDrawableId;
        }
        view.setBackgroundResource(i);
        return view;
    }

    public void updateSeasonData(List list)
    {
        seasons.clear();
        seasons.addAll(list);
        notifyDataSetChanged();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SportGridTabletFragment

class mContext extends BaseAdapter
{

    private final Context mContext;
    final SportGridTabletFragment this$0;

    public int getCount()
    {
        return SportGridTabletFragment.access$000(SportGridTabletFragment.this).size();
    }

    public Object getItem(int i)
    {
        return (Sport)SportGridTabletFragment.access$000(SportGridTabletFragment.this).get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = view;
        if (view == null)
        {
            obj = getActivity().getLayoutInflater();
            view = new nit>();
            obj = ((LayoutInflater) (obj)).inflate(0x7f040046, viewgroup, false);
            view.ageView = (ImageView)((View) (obj)).findViewById(0x7f0f0101);
            view.tView = (TextView)((View) (obj)).findViewById(0x7f0f0102);
            ((View) (obj)).setTag(view);
        } else
        {
            view = (tView)((View) (obj)).getTag();
        }
        viewgroup = (Sport)getItem(i);
        ((getItem) (view)).tView.setText(viewgroup.getName());
        viewgroup = viewgroup.getCoverImage(mContext.getResources().getDisplayMetrics(), config);
        picasso.load(viewgroup).into(((mContext) (view)).ageView);
        return ((View) (obj));
    }

    public (Context context)
    {
        this$0 = SportGridTabletFragment.this;
        super();
        mContext = context;
        SportGridTabletFragment.access$002(SportGridTabletFragment.this, config.getSports());
    }
}

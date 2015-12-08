// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.List;

public class SportGridTabletFragment extends DialogFragment
{
    class ImageAdapter extends BaseAdapter
    {

        private final Context mContext;
        final SportGridTabletFragment this$0;

        public int getCount()
        {
            return mSportsList.size();
        }

        public Object getItem(int i)
        {
            return (Sport)mSportsList.get(i);
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
                view = new ViewHolder();
                obj = ((LayoutInflater) (obj)).inflate(0x7f040046, viewgroup, false);
                view.imageView = (ImageView)((View) (obj)).findViewById(0x7f0f0101);
                view.txtView = (TextView)((View) (obj)).findViewById(0x7f0f0102);
                ((View) (obj)).setTag(view);
            } else
            {
                view = (ViewHolder)((View) (obj)).getTag();
            }
            viewgroup = (Sport)getItem(i);
            ((ViewHolder) (view)).txtView.setText(viewgroup.getName());
            viewgroup = viewgroup.getCoverImage(mContext.getResources().getDisplayMetrics(), config);
            picasso.load(viewgroup).into(((ViewHolder) (view)).imageView);
            return ((View) (obj));
        }

        public ImageAdapter(Context context)
        {
            this$0 = SportGridTabletFragment.this;
            super();
            mContext = context;
            mSportsList = config.getSports();
        }
    }

    static class ViewHolder
    {

        ImageView imageView;
        TextView txtView;

        ViewHolder()
        {
        }
    }


    private SportFilterListFragment.Callback callback;
    Configuration config;
    private View mParentView;
    private List mSportsList;
    Picasso picasso;

    public SportGridTabletFragment()
    {
        mSportsList = null;
        callback = new SportFilterListFragment.Callback() {

            final SportGridTabletFragment this$0;

            public void onSportSelected(Sport sport)
            {
            }

            
            {
                this$0 = SportGridTabletFragment.this;
                super();
            }
        };
    }

    public static SportGridTabletFragment getInstance()
    {
        return new SportGridTabletFragment();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        MainNavigationContentActivity mainnavigationcontentactivity = (MainNavigationContentActivity)activity;
        MainNavigationContentActivity.component().inject(this);
        mSportsList = config.getSports();
        callback = (SportFilterListFragment.Callback)activity;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mParentView = layoutinflater.inflate(0x7f040045, viewgroup, false);
        layoutinflater = (GridView)mParentView.findViewById(0x7f0f0100);
        layoutinflater.setAdapter(new ImageAdapter(getActivity()));
        layoutinflater.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SportGridTabletFragment this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                callback.onSportSelected((Sport)mSportsList.get(i));
                dismiss();
            }

            
            {
                this$0 = SportGridTabletFragment.this;
                super();
            }
        });
        getDialog().requestWindowFeature(1);
        getDialog().setCanceledOnTouchOutside(true);
        mParentView.setBackgroundColor(getResources().getColor(0x106000c));
        return mParentView;
    }



/*
    static List access$002(SportGridTabletFragment sportgridtabletfragment, List list)
    {
        sportgridtabletfragment.mSportsList = list;
        return list;
    }

*/

}

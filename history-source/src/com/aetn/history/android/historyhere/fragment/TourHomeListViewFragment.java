// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.HttpRequestManager;
import com.aetn.history.android.historyhere.model.LocationManager;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.utils.ConnectionManager;
import com.aetn.history.android.historyhere.utils.UIUtils;
import com.aetn.history.android.historyhere.utils.Utils;
import com.android.volley.toolbox.NetworkImageView;
import java.util.ArrayList;
import java.util.Iterator;

public class TourHomeListViewFragment extends ListFragment
{
    private class TourHomeListAdapter extends ArrayAdapter
    {

        private final Drawable lightGreyMask;
        private final Drawable mediumGreyMask;
        private ArrayList poiArrayList;
        private int textViewResourceId;
        final TourHomeListViewFragment this$0;
        private final Drawable whiteMask;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            int j = getItemViewType(i);
            Utils.logger("TourHomeListViewFragment", (new StringBuilder()).append("viewType:").append(j).toString());
            Location location = LocationManager.getInstance(getActivity()).getUsersLocation();
            View view1 = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(textViewResourceId, viewgroup, false);
            ViewHolder viewholder = new ViewHolder();
            viewholder.title = (TextView)view1.findViewById(0x7f0a0041);
            viewholder.city = (TextView)view1.findViewById(0x7f0a00d5);
            viewholder.mileage = (TextView)view1.findViewById(0x7f0a006a);
            viewholder.icon = (NetworkImageView)view1.findViewById(0x7f0a0040);
            viewholder.iconMask = (ImageView)view1.findViewById(0x7f0a0098);
            viewholder.defaultIcon = (ImageView)view1.findViewById(0x7f0a0068);
            viewholder.iconHolder = (ViewGroup)view1.findViewById(0x7f0a00e9);
            viewholder.bg = (ViewGroup)view1.findViewById(0x7f0a0059);
            viewholder.sponsorImage = (NetworkImageView)view1.findViewById(0x7f0a00c3);
            view1.setTag(viewholder);
            final POIDetail o = (POIDetail)poiArrayList.get(i);
            viewholder.sponsorImage.setVisibility(8);
            view = (HistoryHereApplication)getActivity().getApplication();
            view = HistoryHereApplication.getConfiguration().tourSponsorData;
            j = 0;
            viewgroup = "";
            Iterator iterator = view.iterator();
            do
            {
                view = viewgroup;
                i = j;
                if (!iterator.hasNext())
                {
                    break;
                }
                view = (com.aetn.history.android.historyhere.model.Configuration.TourSponsorData)iterator.next();
                Utils.logger("TourHomeListViewFragment", (new StringBuilder()).append("getView(): data.id:").append(((com.aetn.history.android.historyhere.model.Configuration.TourSponsorData) (view)).id).toString());
                Utils.logger("TourHomeListViewFragment", (new StringBuilder()).append("getView(): o.getId():").append(o.getId()).toString());
                if (!((com.aetn.history.android.historyhere.model.Configuration.TourSponsorData) (view)).id.equalsIgnoreCase(o.getId()))
                {
                    continue;
                }
                view = ((com.aetn.history.android.historyhere.model.Configuration.TourSponsorData) (view)).listImageURL;
                i = 1;
                break;
            } while (true);
            boolean flag = UIUtils.isSmallScreen(getActivity());
            if (i == 1)
            {
                viewholder.sponsorImage.setImageUrl(view, HttpRequestManager.getInstance(mContext).getImageLoader());
                viewholder.sponsorImage.setVisibility(0);
                viewholder.bg.setBackgroundColor(getActivity().getResources().getColor(0x7f090039));
                viewholder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f02013d));
                view = (android.widget.FrameLayout.LayoutParams)viewholder.icon.getLayoutParams();
                int k = 120;
                if (flag)
                {
                    k = 100;
                }
                k = UIUtils.getDeviceIndependentPixels(getActivity(), k);
                view.width = k;
                view.height = k;
                view.leftMargin = 0;
                viewholder.icon.setLayoutParams(view);
                viewholder.iconMask.setLayoutParams(view);
                viewholder.defaultIcon.setLayoutParams(view);
            } else
            {
                Utils.logger("TourHomeListViewFragment", "getView(): the item is not so set the color to white");
                viewholder.bg.setBackgroundColor(getActivity().getResources().getColor(0x7f090037));
                viewholder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f02013b));
                view = (android.widget.FrameLayout.LayoutParams)viewholder.icon.getLayoutParams();
                byte byte0 = 15;
                if (flag)
                {
                    byte0 = 5;
                }
                int l = UIUtils.getDeviceIndependentPixels(getActivity(), 90);
                view.width = l;
                view.height = l;
                view.leftMargin = UIUtils.getDeviceIndependentPixels(getActivity(), byte0);
                viewholder.icon.setLayoutParams(view);
                viewholder.iconMask.setLayoutParams(view);
                viewholder.defaultIcon.setLayoutParams(view);
            }
            if (o != null)
            {
                viewholder.id = o.getId();
                if (viewholder.title != null)
                {
                    viewholder.title.setText(o.getTitle());
                }
                if (viewholder.mileage != null)
                {
                    if (location != null)
                    {
                        double d = (double)Math.round(10D * Utils.getDistanceBetweenLocations(location.getLatitude(), location.getLongitude(), o.getLatitude(), o.getLongitude(), "M")) / 10D;
                        if (d > 20D)
                        {
                            d = Math.round(d);
                            view = (new StringBuilder()).append((int)d).append(" miles").toString();
                        } else
                        {
                            view = (new StringBuilder()).append(d).append(" miles").toString();
                        }
                        viewholder.mileage.setText(view);
                        viewholder.mileage.setVisibility(0);
                    } else
                    {
                        viewholder.mileage.setVisibility(8);
                    }
                    if (o.getId().isEmpty())
                    {
                        viewholder.mileage.setVisibility(8);
                    }
                }
                if (viewholder.city != null)
                {
                    if (!o.getCityStateString().isEmpty())
                    {
                        viewholder.city.setText(o.getCityStateString());
                        viewholder.city.setVisibility(0);
                    } else
                    {
                        viewholder.city.setVisibility(8);
                    }
                }
                if (!o.getImage().isEmpty())
                {
                    viewholder.icon.setVisibility(0);
                    viewholder.icon.setImageUrl(o.getImage(), HttpRequestManager.getInstance(getActivity()).getImageLoader());
                }
                Utils.logger("TourHomeListViewFragment", (new StringBuilder()).append("the image for this is :*").append(o.getImage()).append("*").toString());
            }
            view1.setClickable(true);
            if (!o.getId().isEmpty())
            {
                viewholder.iconHolder.setVisibility(0);
                view1.setBackgroundResource(0x1080065);
                if (i != 0)
                {
                    view1.setOnClickListener(viewholder. new android.view.View.OnClickListener() {

                        final TourHomeListAdapter this$1;
                        final ViewHolder val$holder;
                        final POIDetail val$o;

                        public void onClick(View view)
                        {
                            ((MainNavigationActivity)getActivity()).showTourDetail(o);
                            holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f02013b));
                            holder.bg.setBackgroundColor(getActivity().getResources().getColor(0x7f09003a));
                            (new Handler()).postDelayed(new Runnable() {

                                final TourHomeListAdapter._cls1 this$2;

                                public void run()
                                {
                                    holder.bg.setBackgroundColor(getActivity().getResources().getColor(0x7f090039));
                                    holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f02013d));
                                }

            
            {
                this$2 = TourHomeListAdapter._cls1.this;
                super();
            }
                            }, 50L);
                        }

            
            {
                this$1 = final_tourhomelistadapter;
                o = poidetail;
                holder = ViewHolder.this;
                super();
            }
                    });
                    return view1;
                } else
                {
                    view1.setOnClickListener(viewholder. new android.view.View.OnClickListener() {

                        final TourHomeListAdapter this$1;
                        final ViewHolder val$holder;
                        final POIDetail val$o;

                        public void onClick(View view)
                        {
                            ((MainNavigationActivity)getActivity()).showTourDetail(o);
                            holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f02013c));
                            holder.bg.setBackgroundColor(getActivity().getResources().getColor(0x7f090038));
                            (new Handler()).postDelayed(new Runnable() {

                                final TourHomeListAdapter._cls2 this$2;

                                public void run()
                                {
                                    holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f02013b));
                                    holder.bg.setBackgroundColor(getActivity().getResources().getColor(0x7f090037));
                                }

            
            {
                this$2 = TourHomeListAdapter._cls2.this;
                super();
            }
                            }, 50L);
                        }

            
            {
                this$1 = final_tourhomelistadapter;
                o = poidetail;
                holder = ViewHolder.this;
                super();
            }
                    });
                    return view1;
                }
            } else
            {
                viewholder.iconHolder.setVisibility(4);
                return view1;
            }
        }

        public TourHomeListAdapter(Context context, int i, ArrayList arraylist)
        {
            this$0 = TourHomeListViewFragment.this;
            super(context, i, arraylist);
            whiteMask = getActivity().getResources().getDrawable(0x7f02013d);
            lightGreyMask = getActivity().getResources().getDrawable(0x7f02013b);
            mediumGreyMask = getActivity().getResources().getDrawable(0x7f02013c);
            poiArrayList = arraylist;
            textViewResourceId = i;
        }
    }

    class ViewHolder
    {

        ViewGroup bg;
        TextView city;
        ImageView defaultIcon;
        NetworkImageView icon;
        ViewGroup iconHolder;
        ImageView iconMask;
        String id;
        TextView mileage;
        NetworkImageView sponsorImage;
        final TourHomeListViewFragment this$0;
        TextView title;

        ViewHolder()
        {
            this$0 = TourHomeListViewFragment.this;
            super();
        }
    }


    private static final String TAG = "TourHomeListViewFragment";
    private HistoryHereApplication app;
    private Context mContext;
    private View menuButton;
    private TourHomeListAdapter tourHomeListAdapter;
    private ArrayList tourList;

    public TourHomeListViewFragment()
    {
    }

    private void hideLoading()
    {
        app.hideMessageBox();
    }

    private boolean isFavorite(String s)
    {
        new StringBuilder(s);
        return false;
    }

    private void setData()
    {
        tourHomeListAdapter = new TourHomeListAdapter(mContext, 0x7f030057, tourList);
        setListAdapter(tourHomeListAdapter);
    }

    private void setListeners()
    {
        Utils.logger("TourHomeListViewFragment", "setListeners");
        menuButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TourHomeListViewFragment this$0;

            public void onClick(View view)
            {
                ((MainNavigationActivity)getActivity()).showMenu();
            }

            
            {
                this$0 = TourHomeListViewFragment.this;
                super();
            }
        });
    }

    public void loadCurrentData()
    {
        tourList = PoiManager.getInstance(getActivity()).getAllToursListWithPaddingRow();
        if (tourList.isEmpty())
        {
            Utils.logger("TourHomeListViewFragment", "loadCurrentData() NEED TO TRY TO LOAD AGAIN");
            if (!ConnectionManager.isNetworkAvailable(getActivity()))
            {
                ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003a));
                getActivity().getSupportFragmentManager().popBackStack();
                Utils.logger("TourHomeListViewFragment", "Fragment click - no network connection");
                return;
            } else
            {
                PoiManager.getInstance(getActivity()).setOnAllToursDataLoadedListener(new com.aetn.history.android.historyhere.model.PoiManager.AllToursDataLoadedListener() {

                    final TourHomeListViewFragment this$0;

                    public void onDataLoadFailed()
                    {
                        Utils.logger("TourHomeListViewFragment", "onPoiDetailLoadFailed");
                        ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003b));
                        getActivity().getSupportFragmentManager().popBackStack();
                    }

                    public void onDataLoaded(ArrayList arraylist)
                    {
                        tourList = arraylist;
                        Utils.logger("TourHomeListViewFragment", "loadCurrentData() now loaded");
                        if (tourList == null)
                        {
                            tourList = new ArrayList();
                        }
                        tourList.add(new POIDetail());
                        setData();
                    }

            
            {
                this$0 = TourHomeListViewFragment.this;
                super();
            }
                });
                PoiManager.getInstance(getActivity()).loadAllToursList();
                return;
            }
        } else
        {
            Utils.logger("TourHomeListViewFragment", "loadCurrentData() already loaded");
            setData();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030055, viewgroup, false);
        menuButton = layoutinflater.findViewById(0x7f0a008f);
        return layoutinflater;
    }

    public void onResume()
    {
        Utils.logger("TourHomeListViewFragment", "onResume()");
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        Utils.logger("TourHomeListViewFragment", "onViewCreated");
        app = (HistoryHereApplication)getActivity().getApplication();
        mContext = getActivity();
        setListeners();
        loadCurrentData();
    }

    public void resetData()
    {
        Utils.logger("TourHomeListViewFragment", "resetData() called");
        tourHomeListAdapter.notifyDataSetChanged();
    }



/*
    static ArrayList access$002(TourHomeListViewFragment tourhomelistviewfragment, ArrayList arraylist)
    {
        tourhomelistviewfragment.tourList = arraylist;
        return arraylist;
    }

*/


}

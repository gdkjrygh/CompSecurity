// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.HttpRequestManager;
import com.aetn.history.android.historyhere.model.POI;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.model.PreferenceManager;
import com.aetn.history.android.historyhere.utils.UIUtils;
import com.aetn.history.android.historyhere.utils.Utils;
import com.aetn.history.android.historyhere.view.SuggestActivity;
import com.android.volley.toolbox.NetworkImageView;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

public class ListViewFragment extends ListFragment
{
    private class POIListAdapter extends ArrayAdapter
    {

        private ArrayList poiArrayList;
        private int textViewResourceId;
        final ListViewFragment this$0;

        public View getView(int i, View view, final ViewGroup holder)
        {
            view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(textViewResourceId, holder, false);
            holder = new ViewHolder();
            holder.root = (ViewGroup)view.findViewById(0x7f0a0097);
            holder.title = (TextView)view.findViewById(0x7f0a0041);
            holder.short_description = (TextView)view.findViewById(0x7f0a007a);
            holder.icon = (NetworkImageView)view.findViewById(0x7f0a0040);
            holder.iconHolder = (FrameLayout)view.findViewById(0x7f0a0067);
            holder.position = i;
            holder.iconMask = (ImageView)view.findViewById(0x7f0a0098);
            ((ViewHolder) (holder)).iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f0200e9));
            view.setTag(holder);
            POIDetail poidetail = (POIDetail)poiArrayList.get(i);
            if (poidetail != null)
            {
                holder.id = poidetail.getId();
                if (((ViewHolder) (holder)).title != null)
                {
                    ((ViewHolder) (holder)).title.setText(poidetail.getTitle());
                }
                if (((ViewHolder) (holder)).short_description != null)
                {
                    if (!poidetail.getShortDescription().isEmpty())
                    {
                        ((ViewHolder) (holder)).short_description.setText(poidetail.getShortDescription());
                    } else
                    {
                        ((ViewHolder) (holder)).short_description.setText(poidetail.getDescription());
                    }
                }
                if (((ViewHolder) (holder)).icon != null)
                {
                    Utils.logger(TAG, (new StringBuilder()).append("POIListAdapter:o.getImage():").append(poidetail.getImage()).toString());
                    if (((ViewHolder) (holder)).id.isEmpty())
                    {
                        ((ViewHolder) (holder)).iconHolder.setVisibility(8);
                    } else
                    {
                        ((ViewHolder) (holder)).iconHolder.setVisibility(0);
                    }
                    Utils.logger(TAG, (new StringBuilder()).append("IMAGE:make the request: ").append(poidetail.getImage()).toString());
                    if (!poidetail.getImage().isEmpty())
                    {
                        ((ViewHolder) (holder)).icon.setImageUrl(poidetail.getImage(), HttpRequestManager.getInstance(getActivity()).getImageLoader());
                    } else
                    {
                        ((ViewHolder) (holder)).icon.setBackgroundResource(0x7f0200e8);
                    }
                }
            }
            view.setClickable(true);
            view.setOnClickListener(poidetail. new android.view.View.OnClickListener() {

                final POIListAdapter this$1;
                final ViewHolder val$holder;
                final POIDetail val$poi;

                public void onClick(View view)
                {
                    Utils.logger(TAG, "setOnTouchListener: make dark");
                    holder.root.setBackgroundColor(getActivity().getResources().getColor(0x7f090015));
                    holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f020089));
                    ((MainNavigationActivity)getActivity()).showListDetail(poi);
                    int ai[] = new int[2];
                    view.getLocationOnScreen(ai);
                    int i = ai[1];
                    Utils.logger(TAG, (new StringBuilder()).append("position of item from top: ").append(getTopPositionOfView(view)).toString());
                    Utils.logger(TAG, (new StringBuilder()).append("height of item from top: ").append(view.getHeight()).toString());
                    (new Handler()).postDelayed(new Runnable() {

                        final POIListAdapter._cls1 this$2;

                        public void run()
                        {
                            holder.root.setBackgroundColor(getActivity().getResources().getColor(0x7f090014));
                            holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f0200e9));
                        }

            
            {
                this$2 = POIListAdapter._cls1.this;
                super();
            }
                    }, 50L);
                }

            
            {
                this$1 = final_poilistadapter;
                holder = viewholder;
                poi = POIDetail.this;
                super();
            }
            });
            return view;
        }

        public POIListAdapter(Context context, int i, ArrayList arraylist)
        {
            this$0 = ListViewFragment.this;
            super(context, i, arraylist);
            poiArrayList = arraylist;
            textViewResourceId = i;
            Utils.logger(TAG, (new StringBuilder()).append("POIList.size():").append(arraylist.size()).toString());
        }
    }

    class ViewHolder
    {

        NetworkImageView icon;
        FrameLayout iconHolder;
        ImageView iconMask;
        String id;
        int position;
        ViewGroup root;
        TextView short_description;
        final ListViewFragment this$0;
        TextView title;

        ViewHolder()
        {
            this$0 = ListViewFragment.this;
            super();
        }
    }


    private final String TAG = getClass().getSimpleName();
    private HistoryHereApplication app;
    private Context mContext;
    com.aetn.history.android.historyhere.model.PreferenceManager.OnFavoritesChangedListener mFavoritesChangedListener;
    private int mHeightOfListRow;
    private ListView mListView;
    private MainNavigationActivity mNav;
    private ViewGroup mRightMenu;
    private ViewGroup mTourHeader;
    private View mapButton;
    private View menuButton;
    private ArrayList poiList;
    private POIListAdapter poiListAdapter;
    private View searchButton;
    private View suggestButton;

    public ListViewFragment()
    {
        mFavoritesChangedListener = new com.aetn.history.android.historyhere.model.PreferenceManager.OnFavoritesChangedListener() {

            final ListViewFragment this$0;

            public void onFavoritesChanged()
            {
                Utils.logger(TAG, "onFavoritesChanged");
                if (!PreferenceManager.hasFavorites(getActivity()))
                {
                    mNav.hidePlacesList();
                    return;
                } else
                {
                    loadCurrentData();
                    return;
                }
            }

            
            {
                this$0 = ListViewFragment.this;
                super();
            }
        };
    }

    private int getTopPositionOfView(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        return ai[1];
    }

    private void setListeners()
    {
        Utils.logger(TAG, "setListeners");
        mapButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ListViewFragment this$0;

            public void onClick(View view)
            {
                mNav.hidePlacesList();
            }

            
            {
                this$0 = ListViewFragment.this;
                super();
            }
        });
        menuButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ListViewFragment this$0;

            public void onClick(View view)
            {
                mNav.showMenu();
            }

            
            {
                this$0 = ListViewFragment.this;
                super();
            }
        });
        searchButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ListViewFragment this$0;

            public void onClick(View view)
            {
                mNav.showMap();
                mNav.getMapFragment().showSearch();
            }

            
            {
                this$0 = ListViewFragment.this;
                super();
            }
        });
        suggestButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ListViewFragment this$0;

            public void onClick(View view)
            {
                view = new Intent(getActivity(), com/aetn/history/android/historyhere/view/SuggestActivity);
                view.putExtra("called_from", "map");
                getActivity().startActivity(view);
            }

            
            {
                this$0 = ListViewFragment.this;
                super();
            }
        });
    }

    public void loadCurrentData()
    {
        Utils.logger(TAG, "loadCurrentData");
        MainNavigationActivity mainnavigationactivity;
        if (MainNavigationActivity.isMapTypePlaces())
        {
            poiList = PoiManager.getInstance(getActivity()).getCurrentPOIListWithExtraRow();
        } else
        if (MainNavigationActivity.isMapTypeFavorites())
        {
            if (PreferenceManager.hasFavorites(getActivity()))
            {
                poiList = PoiManager.getInstance(getActivity()).getCurrentFavoritesListFromDB(getActivity());
            } else
            {
                poiList = PoiManager.getInstance(getActivity()).getCurrentPOIListWithExtraRow();
            }
        } else
        {
            poiList = PoiManager.getInstance(getActivity()).getCurrentTourListWithExtraRow();
            POIDetail poidetail = PoiManager.getInstance(getActivity()).getCurrentTourDetailPOI();
            ((TextView)mTourHeader.findViewById(0x7f0a00e5)).setText(poidetail.getTitle());
            ((TextView)mTourHeader.findViewById(0x7f0a00e6)).setText(poidetail.getCityStateString());
        }
        if (poiList == null)
        {
            poiList = new ArrayList();
        }
        poiListAdapter = new POIListAdapter(mContext, 0x7f030038, poiList);
        setListAdapter(poiListAdapter);
        mainnavigationactivity = mNav;
        if (!MainNavigationActivity.isMapTypePlaces())
        {
            mRightMenu.setVisibility(8);
        }
        if (MainNavigationActivity.isMapTypeTours())
        {
            mTourHeader.setVisibility(0);
            return;
        } else
        {
            mTourHeader.setVisibility(8);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03003a, viewgroup, false);
        Utils.logger(TAG, "onCreateView");
        mapButton = layoutinflater.findViewById(0x7f0a008c);
        menuButton = layoutinflater.findViewById(0x7f0a008f);
        searchButton = layoutinflater.findViewById(0x7f0a0077);
        suggestButton = layoutinflater.findViewById(0x7f0a0090);
        mTourHeader = (ViewGroup)layoutinflater.findViewById(0x7f0a00a0);
        mRightMenu = (ViewGroup)layoutinflater.findViewById(0x7f0a0086);
        mListView = (ListView)layoutinflater.findViewById(0x102000a);
        PreferenceManager.setPreferencesChangedListener(mFavoritesChangedListener);
        mHeightOfListRow = UIUtils.getDeviceIndependentPixels(getActivity(), 114);
        return layoutinflater;
    }

    public void onDestroy()
    {
        Utils.logger(TAG, "onDestroy()");
        PreferenceManager.removePreferencesChangedListener(mFavoritesChangedListener);
        super.onDestroy();
    }

    public void onPause()
    {
        Utils.logger(TAG, "onPause()");
        super.onPause();
    }

    public void onResume()
    {
        Utils.logger(TAG, "onResume()");
        super.onResume();
        loadCurrentData();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        Utils.logger(TAG, "onViewCreated");
        app = (HistoryHereApplication)getActivity().getApplication();
        mNav = (MainNavigationActivity)getActivity();
        mContext = getActivity();
        setListeners();
        Utils.logger(TAG, (new StringBuilder()).append("mListView:top:").append(getTopPositionOfView(mListView)).toString());
    }



}

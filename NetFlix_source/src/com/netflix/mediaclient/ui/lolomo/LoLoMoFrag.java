// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.LoadingStatus;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.GenreList;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.kids.lolomo.KidsLomoDetailAdapter;
import com.netflix.mediaclient.ui.kids.lolomo.SkidmarkLoLoMoAdapter;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;
import java.util.HashMap;
import java.util.Map;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            KidsGenreEntryHeader, GenreLoLoMoAdapter, LoLoMoAdapter, LoLoMoFocusHandler

public class LoLoMoFrag extends NetflixFrag
    implements ManagerStatusListener
{
    public static interface ILoLoMoAdapter
        extends ManagerStatusListener, LoadingStatus, ListAdapter, StickyListHeadersAdapter
    {

        public abstract void onDestroyView();

        public abstract void onPause();

        public abstract void onResume();

        public abstract void refreshData();
    }


    private static final String EXTRA_GENRE_ID = "genre_id";
    private static final String EXTRA_GENRE_PARCEL = "genre_parcel";
    private static final String EXTRA_IS_GENRE_LIST = "is_genre_list";
    private static final String TAG = "LoLoMoFrag";
    private ILoLoMoAdapter adapter;
    private LoLoMoFocusHandler focusHandler;
    private GenreList genre;
    private String genreId;
    private boolean isGenreList;
    private View kidsEntryHeader;
    private final com.netflix.mediaclient.android.widget.ErrorWrapper.Callback leCallback = new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

        final LoLoMoFrag this$0;

        public void onRetryRequested()
        {
            refresh();
        }

            
            {
                this$0 = LoLoMoFrag.this;
                super();
            }
    };
    private LoadingAndErrorWrapper leWrapper;
    protected StickyListHeadersListView listView;
    private ServiceManager manager;
    private final android.widget.AbsListView.RecyclerListener recycleListener = new android.widget.AbsListView.RecyclerListener() {

        final LoLoMoFrag this$0;

        public void onMovedToScrapHeap(View view)
        {
            view = (BaseLoLoMoAdapter.RowHolder)view.getTag();
            if (view == null)
            {
                return;
            } else
            {
                Log.v("LoLoMoFrag", "View moved to scrap heap - invalidating request");
                view.invalidateRequestId();
                return;
            }
        }

            
            {
                this$0 = LoLoMoFrag.this;
                super();
            }
    };
    private final Map stateMap = new HashMap();
    private ViewRecycler viewRecycler;

    public LoLoMoFrag()
    {
    }

    private void addKidsEntryHeaderIfNecessary(StickyListHeadersListView stickylistheaderslistview)
    {
        if (getActivity() instanceof HomeActivity)
        {
            HomeActivity homeactivity = (HomeActivity)getActivity();
            Log.v("LoLoMoFrag", String.format("isForKids: %s, isKidsGenre: %s, shouldShowKidsEntryInGenreLomo: %s", new Object[] {
                Boolean.valueOf(homeactivity.isForKids()), Boolean.valueOf(homeactivity.isKidsGenre()), Boolean.valueOf(KidsUtils.shouldShowKidsEntryInGenreLomo(homeactivity))
            }));
            if (!homeactivity.isForKids() && homeactivity.isKidsGenre() && KidsUtils.shouldShowKidsEntryInGenreLomo(homeactivity))
            {
                Log.v("LoLoMoFrag", "Adding Kids entry header to genre list view");
                kidsEntryHeader = new KidsGenreEntryHeader(getActivity());
                kidsEntryHeader.setVisibility(4);
                stickylistheaderslistview.addHeaderView(kidsEntryHeader);
            }
        }
    }

    public static LoLoMoFrag create(String s, GenreList genrelist)
    {
        LoLoMoFrag lolomofrag = new LoLoMoFrag();
        Bundle bundle = new Bundle();
        bundle.putString("genre_id", s);
        boolean flag;
        if (!"lolomo".equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("is_genre_list", flag);
        if (genrelist != null)
        {
            bundle.putParcelable("genre_parcel", genrelist);
        }
        lolomofrag.setArguments(bundle);
        return lolomofrag;
    }

    private void handleInitIfReady()
    {
        if (getActivity() == null)
        {
            Log.d("LoLoMoFrag", "Activity is null - can't continue init");
            return;
        }
        if (manager == null || !manager.isReady())
        {
            Log.d("LoLoMoFrag", "Manager not available - can't continue init");
            return;
        }
        addKidsEntryHeaderIfNecessary(listView);
        if (adapter != null && focusHandler != null)
        {
            adapter.unregisterDataSetObserver(focusHandler);
        }
        adapter = createAdapter();
        if (focusHandler != null)
        {
            adapter.registerDataSetObserver(focusHandler);
        }
        listView.setAdapter(adapter);
        adapter.onManagerReady(manager, 0);
    }

    protected ILoLoMoAdapter createAdapter()
    {
        if (getNetflixActivity() == null)
        {
            Log.w("LoLoMoFrag", "createAdapter(): activity is null - should not happen");
        } else
        if (getNetflixActivity().isForKids())
        {
            if (isGenreList)
            {
                KidsUtils.addListViewSpacerIfNoHeaders(listView);
                return new KidsLomoDetailAdapter(this, genre);
            }
            if (KidsUtils.isKidsWithUpDownScrolling(getNetflixActivity()))
            {
                return new SkidmarkLoLoMoAdapter(this);
            }
        }
        if (isGenreList)
        {
            return new GenreLoLoMoAdapter(this, genreId);
        } else
        {
            return new LoLoMoAdapter(this);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (focusHandler == null)
        {
            return false;
        } else
        {
            return focusHandler.dispatchKeyEvent(keyevent);
        }
    }

    public Map getStateMap()
    {
        return stateMap;
    }

    public ViewRecycler getViewRecycler()
    {
        return viewRecycler;
    }

    public void hideLoadingAndErrorViews()
    {
        Log.v("LoLoMoFrag", "Hiding loading and error views");
        leWrapper.hide(false);
        AnimationUtils.showViewIfHidden(listView, true);
        AnimationUtils.showViewIfHidden(kidsEntryHeader, true);
    }

    public boolean isLoadingData()
    {
        if (adapter == null)
        {
            Log.v("NflxLoading", "No adapter yet - not loading data");
            return false;
        } else
        {
            boolean flag = adapter.isLoadingData();
            Log.v("NflxLoading", (new StringBuilder()).append("Class: ").append(getClass().getSimpleName()).append(", loading: ").append(flag).toString());
            return flag;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        Log.v("LoLoMoFrag", (new StringBuilder()).append("Frag attached to activity: ").append(activity).toString());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        genreId = getArguments().getString("genre_id");
        genre = (GenreList)getArguments().getParcelable("genre_parcel");
        isGenreList = getArguments().getBoolean("is_genre_list");
        viewRecycler = ((com.netflix.mediaclient.android.widget.ViewRecycler.ViewRecyclerProvider)getActivity()).getViewRecycler();
        if (bundle != null)
        {
            Log.v("LoLoMoFrag", "Clearing all frag state");
            stateMap.clear();
        }
        handleInitIfReady();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Log.v("LoLoMoFrag", "Creating frag view");
        layoutinflater = layoutinflater.inflate(0x7f030044, null);
        listView = (StickyListHeadersListView)layoutinflater.findViewById(0x102000a);
        listView.setDivider(null);
        listView.setFocusable(false);
        listView.setRecyclerListener(recycleListener);
        KidsUtils.configureListViewForKids(getNetflixActivity(), listView);
        if (!getNetflixActivity().shouldApplyPaddingToSlidingPanel())
        {
            ViewUtils.addActionBarPaddingView(listView);
        }
        leWrapper = new LoadingAndErrorWrapper(layoutinflater, leCallback);
        return layoutinflater;
    }

    public void onDataLoadSuccess()
    {
    }

    public void onDestroyView()
    {
        Log.v("LoLoMoFrag", "onDestroyView");
        if (adapter != null)
        {
            adapter.onDestroyView();
        }
        super.onDestroyView();
    }

    public void onDetach()
    {
        super.onDetach();
        Log.v("LoLoMoFrag", "Frag detached from activity");
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        Log.v("LoLoMoFrag", "onManagerReady");
        manager = servicemanager;
        if (i != 0)
        {
            Log.w("LoLoMoFrag", "Manager status code not okay");
            return;
        } else
        {
            handleInitIfReady();
            return;
        }
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
    }

    public void onPause()
    {
        super.onPause();
        if (adapter != null)
        {
            adapter.onPause();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (adapter != null)
        {
            adapter.onResume();
        }
    }

    public void refresh()
    {
        showLoadingView();
        adapter.refreshData();
    }

    public void setLoadingStatusCallback(com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback loadingstatuscallback)
    {
        if (adapter != null)
        {
            adapter.setLoadingStatusCallback(loadingstatuscallback);
        }
    }

    public void showErrorView()
    {
        Log.v("LoLoMoFrag", "Showing error view");
        AnimationUtils.hideView(listView, true);
        if (kidsEntryHeader != null)
        {
            kidsEntryHeader.setVisibility(4);
        }
        leWrapper.showErrorView(true);
    }

    public void showLoadingView()
    {
        Log.v("LoLoMoFrag", "Showing loading view");
        AnimationUtils.hideView(listView, true);
        if (kidsEntryHeader != null)
        {
            kidsEntryHeader.setVisibility(4);
        }
        leWrapper.showLoadingView(true);
    }
}

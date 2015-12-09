// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsDetailsViewGroup, KidsCharacterDetailsAdapter

public class KidsCharacterDetailsFrag extends NetflixFrag
{
    private class FetchCharacterDetailsCallback extends LoggingManagerCallback
    {

        private final Boolean isRefresh;
        private final long requestId;
        final KidsCharacterDetailsFrag this$0;

        public void onKidsCharacterDetailsFetched(KidsCharacterDetails kidscharacterdetails, Boolean boolean1, int i)
        {
            super.onKidsCharacterDetailsFetched(kidscharacterdetails, boolean1, i);
            if (isRefresh.booleanValue() && !boolean1.booleanValue())
            {
                Log.v("KidsCharacterDetailsFrag", "refreshCase data not changed - nothing to do");
                return;
            }
            long l = KidsCharacterDetailsFrag.this.requestId;
            if (isRefresh.booleanValue())
            {
                l = refreshRequestId;
            }
            if (requestId != l)
            {
                Log.v("KidsCharacterDetailsFrag", "Ignoring stale callback");
                return;
            }
            if (i != 0)
            {
                Log.w("KidsCharacterDetailsFrag", "Invalid status code");
                showErrorView();
                return;
            }
            if (kidscharacterdetails == null)
            {
                Log.v("KidsCharacterDetailsFrag", "No details in response");
                showErrorView();
                return;
            }
            if (isRefresh.booleanValue())
            {
                detailsViewGroup.updateDetails(kidscharacterdetails);
                return;
            } else
            {
                updateCharacterDetails(kidscharacterdetails);
                return;
            }
        }

        public FetchCharacterDetailsCallback(long l, Boolean boolean1)
        {
            this$0 = KidsCharacterDetailsFrag.this;
            super("KidsCharacterDetailsFrag");
            requestId = l;
            isRefresh = boolean1;
        }
    }


    private static final String EXTRA_CHARACTER_ID = "extra_character_id";
    private static final Boolean REFRESH_FETCH = Boolean.valueOf(true);
    private static final String TAG = "KidsCharacterDetailsFrag";
    private KidsCharacterDetailsAdapter adapter;
    private String charId;
    private View content;
    private KidsDetailsViewGroup detailsViewGroup;
    private boolean isLoading;
    private LoadingAndErrorWrapper leWrapper;
    private StickyListHeadersListView listView;
    private ServiceManager manager;
    private long refreshRequestId;
    private long requestId;

    public KidsCharacterDetailsFrag()
    {
    }

    private void completeInitIfPossible()
    {
        if (getActivity() == null)
        {
            Log.v("KidsCharacterDetailsFrag", "Can't complete init yet - activity is null");
            return;
        }
        if (manager == null)
        {
            Log.v("KidsCharacterDetailsFrag", "Can't complete init yet - manager is null");
            return;
        }
        if (content == null)
        {
            Log.v("KidsCharacterDetailsFrag", "Can't complete init yet - details view is null");
            return;
        }
        if (charId == null)
        {
            Log.v("KidsCharacterDetailsFrag", "Can't complete init yet - charId is null");
            return;
        } else
        {
            Log.v("KidsCharacterDetailsFrag", "All clear - completing init process...");
            fetchCharacterDetails();
            return;
        }
    }

    public static Fragment create(String s)
    {
        KidsCharacterDetailsFrag kidscharacterdetailsfrag = new KidsCharacterDetailsFrag();
        Bundle bundle = new Bundle();
        bundle.putString("extra_character_id", s);
        kidscharacterdetailsfrag.setArguments(bundle);
        return kidscharacterdetailsfrag;
    }

    private void fetchCharacterDetails()
    {
        boolean flag = true;
        if (manager == null)
        {
            Log.w("KidsCharacterDetailsFrag", "Manager is null - can't get character details");
            return;
        }
        showLoadingView();
        isLoading = true;
        requestId = System.nanoTime();
        Log.v("KidsCharacterDetailsFrag", (new StringBuilder()).append("Fetching data for character ID: ").append(charId).toString());
        ServiceManager servicemanager = manager;
        String s = charId;
        long l = requestId;
        if (REFRESH_FETCH.booleanValue())
        {
            flag = false;
        }
        servicemanager.fetchKidsCharacterDetails(s, new FetchCharacterDetailsCallback(l, Boolean.valueOf(flag)));
    }

    private void refreshCharacterDetails()
    {
        if (manager == null)
        {
            Log.w("KidsCharacterDetailsFrag", "Manager is null - can't refresh character details");
            return;
        } else
        {
            refreshRequestId = System.nanoTime();
            Log.d("TAG", String.format("refresh watchNext for character id: %s, refreshRequestId: %d", new Object[] {
                charId, Long.valueOf(refreshRequestId)
            }));
            manager.fetchKidsCharacterDetails(charId, new FetchCharacterDetailsCallback(refreshRequestId, REFRESH_FETCH));
            return;
        }
    }

    private void showErrorView()
    {
        leWrapper.showErrorView(true);
        AnimationUtils.hideView(listView, true);
    }

    private void showLoadingView()
    {
        leWrapper.showLoadingView(true);
        AnimationUtils.hideView(listView, true);
    }

    private void showStandardViews()
    {
        leWrapper.hide(true);
        AnimationUtils.showView(listView, true);
    }

    private void updateCharacterDetails(KidsCharacterDetails kidscharacterdetails)
    {
        Log.v("KidsCharacterDetailsFrag", (new StringBuilder()).append("Updating character details: ").append(kidscharacterdetails.getTitle()).toString());
        detailsViewGroup.updateDetails(kidscharacterdetails);
        adapter = new KidsCharacterDetailsAdapter(this, kidscharacterdetails);
        listView.setAdapter(adapter);
        showStandardViews();
    }

    public boolean isLoadingData()
    {
        return isLoading;
    }

    public void onActivityCreated(Bundle bundle)
    {
        Log.v("KidsCharacterDetailsFrag", "onActivityCreated");
        super.onActivityCreated(bundle);
        completeInitIfPossible();
    }

    public void onCreate(Bundle bundle)
    {
        charId = getArguments().getString("extra_character_id");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        content = layoutinflater.inflate(0x7f030044, null);
        listView = (StickyListHeadersListView)content.findViewById(0x102000a);
        listView.setAreHeadersSticky(false);
        KidsUtils.configureListViewForKids(getNetflixActivity(), listView);
        detailsViewGroup = new KidsDetailsViewGroup(getActivity());
        listView.addHeaderView(detailsViewGroup, null, false);
        leWrapper = new LoadingAndErrorWrapper(content, new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

            final KidsCharacterDetailsFrag this$0;

            public void onRetryRequested()
            {
                showLoadingView();
                fetchCharacterDetails();
            }

            
            {
                this$0 = KidsCharacterDetailsFrag.this;
                super();
            }
        });
        return content;
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        Log.v("KidsCharacterDetailsFrag", "onManagerReady");
        super.onManagerReady(servicemanager, i);
        manager = servicemanager;
        completeInitIfPossible();
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        super.onManagerUnavailable(servicemanager, i);
        manager = null;
    }

    public void onResume()
    {
        super.onResume();
        refreshCharacterDetails();
    }








}

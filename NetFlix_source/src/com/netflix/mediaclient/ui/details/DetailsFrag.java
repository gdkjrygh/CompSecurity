// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.util.gfx.AnimationUtils;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            VideoDetailsViewGroup, DetailsActivity

public abstract class DetailsFrag extends NetflixFrag
    implements com.netflix.mediaclient.android.widget.ErrorWrapper.Callback
{

    private static final String TAG = "DetailsFrag";
    private com.netflix.mediaclient.servicemgr.AddToListData.StateListener addToListWrapper;
    private VideoDetailsViewGroup detailsViewGroup;
    private final com.netflix.mediaclient.android.widget.ErrorWrapper.Callback errorCallback = new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

        final DetailsFrag this$0;

        public void onRetryRequested()
        {
            ((com.netflix.mediaclient.android.widget.ErrorWrapper.Callback)getActivity()).onRetryRequested();
        }

            
            {
                this$0 = DetailsFrag.this;
                super();
            }
    };
    private LoadingAndErrorWrapper leWrapper;
    private ServiceManager manager;
    private View primaryView;

    public DetailsFrag()
    {
    }

    protected abstract VideoDetailsViewGroup.DetailsStringProvider getDetailsStringProvider(VideoDetails videodetails);

    protected ServiceManager getServiceManager()
    {
        return manager;
    }

    protected abstract String getVideoId();

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Log.v("DetailsFrag", "Creating new frag view...");
        layoutinflater = layoutinflater.inflate(0x7f030082, null, false);
        detailsViewGroup = (VideoDetailsViewGroup)layoutinflater.findViewById(0x7f0701a0);
        leWrapper = new LoadingAndErrorWrapper(layoutinflater, errorCallback);
        primaryView = layoutinflater.findViewById(0x7f07019f);
        primaryView.setVerticalScrollBarEnabled(false);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (manager != null && addToListWrapper != null)
        {
            manager.unregisterAddToMyListListener(getVideoId(), addToListWrapper);
        }
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        super.onManagerReady(servicemanager, i);
        manager = servicemanager;
        android.widget.TextView textview = detailsViewGroup.getAddToMyListButton();
        if (servicemanager != null && getActivity() != null && textview != null)
        {
            addToListWrapper = servicemanager.createAddToMyListWrapper((DetailsActivity)getActivity(), textview);
            servicemanager.registerAddToMyListListener(getVideoId(), addToListWrapper);
        }
    }

    public void onResume()
    {
        super.onResume();
        detailsViewGroup.refreshImagesIfNecessary();
    }

    public void onRetryRequested()
    {
        showLoadingView();
        reloadData();
    }

    protected abstract void reloadData();

    protected void showDetailsView(VideoDetails videodetails)
    {
        leWrapper.hide(true);
        AnimationUtils.showView(primaryView, true);
        ((DetailsActivity)getActivity()).updateMenus(videodetails);
        detailsViewGroup.updateDetails(videodetails, getDetailsStringProvider(videodetails));
    }

    protected void showErrorView()
    {
        leWrapper.showErrorView(true);
        AnimationUtils.hideView(primaryView, true);
    }

    protected void showLoadingView()
    {
        leWrapper.showLoadingView(true);
        AnimationUtils.hideView(primaryView, true);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.ui.core.BaseFragment;
import com.nbcsports.liveextra.ui.main.favorites.FavoritesListPresenter;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import timber.log.Timber;

public class FavoritesFragment extends BaseFragment
    implements com.nbcsports.liveextra.ui.main.core.ContentListPresenter.Listener
{

    private boolean isLive;
    private View mFragmentFavoritesLayout;
    FavoritesListPresenter presenter;
    private RadioButton rbLive;
    private RadioButton rbVOD;
    TrackingHelper trackingHelper;

    public FavoritesFragment()
    {
        isLive = true;
    }

    public static FavoritesFragment getInstance()
    {
        return new FavoritesFragment();
    }

    private void showLive()
    {
        isLive = true;
        presenter.setIsLive(isLive);
        rbLive.setChecked(true);
        rbLive.setTextColor(0xff00ffff);
        rbVOD.setChecked(false);
        rbVOD.setTextColor(-1);
    }

    private void showVOD()
    {
        isLive = false;
        presenter.setIsLive(isLive);
        rbLive.setChecked(false);
        rbLive.setTextColor(-1);
        rbVOD.setChecked(true);
        rbVOD.setTextColor(0xff00ffff);
    }

    public com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo getPageInfo()
    {
        return new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Favorites:Extra", "Favorites", null, null);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }

    public void onContentListLoading()
    {
        showProgress();
    }

    public void onContentListReceived(boolean flag)
    {
        hideProgress();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        MainNavigationContentActivity.component().inject(this);
        if (bundle != null)
        {
            isLive = bundle.getBoolean("isLive");
        }
        setHasOptionsMenu(true);
        presenter.setListener(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentFavoritesLayout = layoutinflater.inflate(0x7f040037, viewgroup, false);
        ButterKnife.bind(this, mFragmentFavoritesLayout);
        rbLive = (RadioButton)mFragmentFavoritesLayout.findViewById(0x7f0f00d7);
        rbVOD = (RadioButton)mFragmentFavoritesLayout.findViewById(0x7f0f00d8);
        rbVOD.setChecked(true);
        if (rbLive != null)
        {
            rbLive.setOnClickListener(new android.view.View.OnClickListener() {

                final FavoritesFragment this$0;

                public void onClick(View view)
                {
                    try
                    {
                        showLive();
                        view = new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Favorites:Live", "Favorites", "Live&Upcoming", null);
                        trackingHelper.trackPageEvent(view);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        Timber.d(view.toString(), new Object[0]);
                    }
                }

            
            {
                this$0 = FavoritesFragment.this;
                super();
            }
            });
        }
        if (rbVOD != null)
        {
            rbVOD.setOnClickListener(new android.view.View.OnClickListener() {

                final FavoritesFragment this$0;

                public void onClick(View view)
                {
                    showVOD();
                    try
                    {
                        view = new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Favorites:Extra", "Favorites", "Featured", null);
                        trackingHelper.trackPageEvent(view);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        Timber.d(view.toString(), new Object[0]);
                    }
                }

            
            {
                this$0 = FavoritesFragment.this;
                super();
            }
            });
        }
        return mFragmentFavoritesLayout;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        hideProgress();
        ButterKnife.unbind(this);
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu.clear();
        super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        super.onResume();
        if (isLive)
        {
            showLive();
            return;
        } else
        {
            showVOD();
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLive", isLive);
    }

    public void onViewStateRestored(Bundle bundle)
    {
        super.onViewStateRestored(bundle);
        if (bundle != null)
        {
            isLive = bundle.getBoolean("isLive");
        }
    }


}

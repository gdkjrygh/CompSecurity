// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.HttpRequestManager;
import com.aetn.history.android.historyhere.model.LocationManager;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.PoiDbManager;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.model.PreferenceManager;
import com.aetn.history.android.historyhere.utils.Utils;
import com.android.volley.toolbox.NetworkImageView;
import java.util.HashMap;
import java.util.Map;

public class MenuFragment extends Fragment
{

    private static final String TAG = "MenuFragment";
    public boolean hasNotSelectedPlaces;
    private Button mBtnFavorites;
    private Button mBtnMore;
    private Button mBtnPlaces;
    private Button mBtnSurpriseMe;
    private Button mBtnTourOK;
    private Button mBtnTours;
    private ViewGroup mFavoritesIntro;
    private ViewGroup mMenu;
    private MainNavigationActivity mNav;
    private ViewGroup mSplashView;
    private NetworkImageView mSponsorImage;
    private ViewGroup mSponsorView;
    private ViewGroup mTourIntro;
    private View mView;

    public MenuFragment()
    {
        hasNotSelectedPlaces = false;
    }

    private void animateSplashOut()
    {
        Utils.logger("MenuFragment", (new StringBuilder()).append("animateSplashOut1").append(getActivity()).toString());
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f04000b);
        Utils.logger("MenuFragment", (new StringBuilder()).append("animateSplashOut2").append(animation).toString());
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MenuFragment this$0;

            public void onAnimationEnd(Animation animation1)
            {
                mSplashView.setVisibility(8);
                animation1 = (HistoryHereApplication)getActivity().getApplication();
                if (HistoryHereApplication.getConfiguration().sponsorImageURL != null)
                {
                    animateSponsorImageIn();
                    return;
                }
                try
                {
                    initMenu();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Animation animation1)
                {
                    animation1.printStackTrace();
                }
                return;
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mSplashView.startAnimation(animation);
    }

    private void animateSponsorImageIn()
    {
        mSponsorImage.setVisibility(0);
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f04000a);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MenuFragment this$0;
            final int val$sponsorDuration;

            public void onAnimationEnd(Animation animation1)
            {
                try
                {
                    mSponsorView.setVisibility(0);
                    (new Handler()).postDelayed(new Runnable() {

                        final _cls14 this$1;

                        public void run()
                        {
                            animateSponsorImageOut();
                        }

            
            {
                this$1 = _cls14.this;
                super();
            }
                    }, sponsorDuration);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Animation animation1)
                {
                    animation1.printStackTrace();
                }
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = MenuFragment.this;
                sponsorDuration = i;
                super();
            }
        });
        mSponsorView.startAnimation(animation);
    }

    private void animateSponsorImageOut()
    {
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f04000b);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MenuFragment this$0;

            public void onAnimationEnd(Animation animation1)
            {
                try
                {
                    hideSponsorImage();
                    initMenu();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Animation animation1)
                {
                    animation1.printStackTrace();
                }
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mSponsorView.startAnimation(animation);
    }

    private void closeTourIntro()
    {
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f040009);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MenuFragment this$0;

            public void onAnimationEnd(Animation animation1)
            {
                mTourIntro.setVisibility(8);
                mBtnPlaces.setAlpha(1.0F);
                mBtnFavorites.setAlpha(1.0F);
                mBtnMore.setAlpha(1.0F);
                mBtnTours.setBackgroundDrawable(getActivity().getResources().getDrawable(0x7f020102));
                setListeners();
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mTourIntro.startAnimation(animation);
    }

    private void getRandomPoi()
    {
        MainNavigationActivity.setMapTypePlaces();
        POIDetail poidetail = PoiDbManager.getInstance(getActivity()).getRandomPoi();
        Utils.logger("MenuFragment", (new StringBuilder()).append("getRandomPoi(): title:").append(poidetail.getTitle()).toString());
        ((MainNavigationActivity)getActivity()).showSurpriseMePoi(poidetail);
    }

    private void hideFavoritesIntro()
    {
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f040009);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MenuFragment this$0;

            public void onAnimationEnd(Animation animation1)
            {
                mBtnPlaces.setAlpha(1.0F);
                mBtnFavorites.setAlpha(1.0F);
                mBtnMore.setAlpha(1.0F);
                mBtnTours.setAlpha(1.0F);
                mBtnSurpriseMe.setVisibility(0);
                mFavoritesIntro.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mFavoritesIntro.startAnimation(animation);
    }

    private void hideSponsorImage()
    {
        mSponsorView.setVisibility(4);
    }

    private void initMenu()
    {
        showMenu();
        if (!PreferenceManager.hasShownTourIntro(getActivity()))
        {
            mTourIntro = (ViewGroup)mView.findViewById(0x7f0a007b);
            mBtnTourOK = (Button)mView.findViewById(0x7f0a00e8);
            mBtnTourOK.setOnClickListener(new android.view.View.OnClickListener() {

                final MenuFragment this$0;

                public void onClick(View view)
                {
                    closeTourIntro();
                }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
            });
            openTourIntro();
            PreferenceManager.setHasShownTourIntro(getActivity());
        } else
        {
            setListeners();
        }
        if (!((MainNavigationActivity)getActivity()).handleUpdateIfRequired())
        {
            ((MainNavigationActivity)getActivity()).handleDeeplink();
        }
        if (LocationManager.getInstance(getActivity()).getUsersLocation() == null)
        {
            Utils.logger("MenuFragment", "the location services must be off!!!");
            ((MainNavigationActivity)getActivity()).showInitialLocationServicesDialog();
            return;
        } else
        {
            Utils.logger("MenuFragment", "the location services must be ON!!!");
            return;
        }
    }

    private void openTourIntro()
    {
        mBtnPlaces.setAlpha(0.3F);
        mBtnFavorites.setAlpha(0.3F);
        mBtnMore.setAlpha(0.3F);
        mBtnTours.setBackgroundDrawable(getActivity().getResources().getDrawable(0x7f0200d1));
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f040007);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MenuFragment this$0;

            public void onAnimationEnd(Animation animation1)
            {
                mTourIntro.setVisibility(0);
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mTourIntro.startAnimation(animation);
    }

    private void setListeners()
    {
        mBtnPlaces.setOnClickListener(new android.view.View.OnClickListener() {

            final MenuFragment this$0;

            public void onClick(View view)
            {
                MainNavigationActivity.setMapTypePlaces();
                if (mNav.mMapInited)
                {
                    if (LocationManager.getInstance(getActivity()).isUsersLocationKnown() && LocationManager.getInstance(getActivity()).isUserInUs() && hasNotSelectedPlaces)
                    {
                        mNav.initMapToUsersLocation(LocationManager.getInstance(getActivity()).getUsersLocation());
                    } else
                    {
                        mNav.showMap();
                    }
                } else
                if (!LocationManager.getInstance(getActivity()).isUsersLocationKnown())
                {
                    mNav.showInitLocationServicesOrSearchDialog();
                } else
                if (!LocationManager.getInstance(getActivity()).isUserInUs())
                {
                    mNav.showMap();
                    mNav.showNotInUSDialog();
                } else
                {
                    mNav.initMapToUsersLocation(LocationManager.getInstance(getActivity()).getUsersLocation());
                }
                hasNotSelectedPlaces = false;
                view = new HashMap();
                view.put("Button Tapped", "Places");
                mNav.tagLocalyticsEvent("Home Screen Button Taps", view);
                mNav.localyticsTagTourViewedEvent();
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mBtnTours.setOnClickListener(new android.view.View.OnClickListener() {

            final MenuFragment this$0;

            public void onClick(View view)
            {
                MainNavigationActivity.setMapTypeTours();
                mNav.showTourHomeList();
                hasNotSelectedPlaces = true;
                view = new HashMap();
                view.put("Button Tapped", "Tours");
                mNav.tagLocalyticsEvent("Home Screen Button Taps", view);
                mNav.localyticsTagTourViewedEvent();
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mBtnFavorites.setOnClickListener(new android.view.View.OnClickListener() {

            final MenuFragment this$0;

            public void onClick(View view)
            {
                if (PreferenceManager.hasFavorites(getActivity()))
                {
                    PoiManager.getInstance(getActivity()).getCurrentFavoritesListFromDB(getActivity());
                    ((MainNavigationActivity)getActivity()).showFavorites();
                } else
                {
                    showFavoritesIntro();
                }
                hasNotSelectedPlaces = true;
                view = new HashMap();
                view.put("Button Tapped", "Favorites");
                mNav.tagLocalyticsEvent("Home Screen Button Taps", view);
                mNav.localyticsTagTourViewedEvent();
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mBtnMore.setOnClickListener(new android.view.View.OnClickListener() {

            final MenuFragment this$0;

            public void onClick(View view)
            {
                ((MainNavigationActivity)getActivity()).showMore();
                view = new HashMap();
                view.put("Button Tapped", "More");
                mNav.tagLocalyticsEvent("Home Screen Button Taps", view);
                mNav.localyticsTagTourViewedEvent();
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mBtnSurpriseMe.setOnClickListener(new android.view.View.OnClickListener() {

            final MenuFragment this$0;

            public void onClick(View view)
            {
                getRandomPoi();
                hasNotSelectedPlaces = true;
                view = new HashMap();
                view.put("Button Tapped", "Surprise Me");
                mNav.tagLocalyticsEvent("Home Screen Button Taps", view);
                mNav.localyticsTagTourViewedEvent();
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
    }

    private void showFavoritesIntro()
    {
        mBtnPlaces.setAlpha(0.3F);
        mBtnFavorites.setAlpha(0.3F);
        mBtnMore.setAlpha(0.3F);
        mBtnTours.setAlpha(0.3F);
        mBtnSurpriseMe.setVisibility(4);
        ((Button)mFavoritesIntro.findViewById(0x7f0a007c)).setOnClickListener(new android.view.View.OnClickListener() {

            final MenuFragment this$0;

            public void onClick(View view)
            {
                hideFavoritesIntro();
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f040007);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MenuFragment this$0;

            public void onAnimationEnd(Animation animation1)
            {
                mFavoritesIntro.setVisibility(0);
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        mFavoritesIntro.startAnimation(animation);
    }

    private void showMenu()
    {
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f04000a);
        mMenu.startAnimation(animation);
        mMenu.setVisibility(0);
    }

    private void tagLocalyticsEvent(String s, Map map)
    {
        Utils.logger("MenuFragment", (new StringBuilder()).append("tagLocalyticsEvent():").append(s).toString());
    }

    public void init()
    {
        Utils.logger("MenuFragment", "init()");
        Object obj = HistoryHereApplication.getConfiguration();
        if (obj != null)
        {
            Utils.logger("MenuFragment", "config was not null");
            obj = ((Configuration) (obj)).sponsorImageURL;
            mSponsorImage.setImageUrl(((String) (obj)), HttpRequestManager.getInstance(getActivity()).getImageLoader());
            (new Handler()).postDelayed(new Runnable() {

                final MenuFragment this$0;

                public void run()
                {
                    animateSplashOut();
                }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
            }, 4000L);
            return;
        } else
        {
            Utils.logger("MenuFragment", "config was null");
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030042, viewgroup, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mView = view;
        mBtnPlaces = (Button)view.findViewById(0x7f0a00ba);
        mBtnTours = (Button)view.findViewById(0x7f0a00bb);
        mBtnFavorites = (Button)view.findViewById(0x7f0a00bd);
        mBtnMore = (Button)view.findViewById(0x7f0a00bf);
        mBtnSurpriseMe = (Button)view.findViewById(0x7f0a00be);
        mSponsorImage = (NetworkImageView)view.findViewById(0x7f0a00c3);
        mMenu = (ViewGroup)view.findViewById(0x7f0a00b8);
        mSplashView = (ViewGroup)view.findViewById(0x7f0a00c1);
        mSponsorView = (ViewGroup)view.findViewById(0x7f0a00c2);
        mFavoritesIntro = (ViewGroup)mView.findViewById(0x7f0a00c0);
        mNav = (MainNavigationActivity)getActivity();
    }




















}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.TextView;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.adapters.DetailPagerAdapter;
import com.aetn.history.android.historyhere.dialogs.GenericDialogFragment;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.HttpRequestManager;
import com.aetn.history.android.historyhere.model.LocationManager;
import com.aetn.history.android.historyhere.model.POI;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.utils.UIUtils;
import com.aetn.history.android.historyhere.utils.Utils;
import com.aetn.history.android.historyhere.view.SuggestActivity;
import com.aetn.history.android.historyhere.widgets.CustomViewPager;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment, MapOverlayDetailFragment

public class MapOverlayFragment extends Fragment
{
    public class HideAnim extends Animation
    {

        int index;
        int startHeight;
        int targetHeight;
        final MapOverlayFragment this$0;
        View view;

        protected void applyTransformation(float f, Transformation transformation)
        {
            index = index + 1;
            int i = startHeight;
            int j = (int)((float)startHeight * f);
            int k = mDetailViewPagerClosedHeight;
            view.getLayoutParams().height = (i - j) + k;
            view.requestLayout();
        }

        public void initialize(int i, int j, int k, int l)
        {
            super.initialize(i, j, k, l);
        }

        public boolean willChangeBounds()
        {
            return true;
        }

        public HideAnim(View view1, int i, int j)
        {
            this$0 = MapOverlayFragment.this;
            super();
            index = 0;
            view = view1;
            targetHeight = j;
            startHeight = i;
        }
    }

    public class ShowAnim extends Animation
    {

        int targetHeight;
        float targetY;
        final MapOverlayFragment this$0;
        View view;

        protected void applyTransformation(float f, Transformation transformation)
        {
            int i = (int)((float)targetHeight * f) + mDetailViewPagerClosedHeight;
            Utils.logger(TAG, (new StringBuilder()).append("interpolatedTime | ShowAnim: ").append(f).append("|").append(i).toString());
            view.getLayoutParams().height = i;
            view.requestLayout();
        }

        public void initialize(int i, int j, int k, int l)
        {
            super.initialize(i, j, k, l);
        }

        public boolean willChangeBounds()
        {
            return true;
        }

        public ShowAnim(View view1, int i)
        {
            this$0 = MapOverlayFragment.this;
            super();
            view = view1;
            targetHeight = i;
        }
    }


    private final String TAG = getClass().getSimpleName();
    private boolean isDetailOpen;
    private boolean isMapViewSatellite;
    private boolean mAnimationInited;
    private ArrayList mCurrentPOIList;
    private ViewGroup mDetailPager;
    private DetailPagerAdapter mDetailPagerAdapter;
    private boolean mDetailSwiperShown;
    private CustomViewPager mDetailViewPager;
    private int mDetailViewPagerClosedHeight;
    private int mDetailViewPagerOpenHeight;
    private boolean mFromExternallySelectedAction;
    public boolean mIsDetailVisible;
    private View mListBtn;
    private boolean mMapSettingsOpen;
    private View mMenuBtn;
    private ViewGroup mMenuLayout;
    private MainNavigationActivity mNav;
    private ArrayList mNewPOIList;
    private ImageView mNextPoiIcon;
    private ImageView mPreviousPoiIcon;
    private ImageView mPullTab;
    private View mRelocateBtn;
    private ViewGroup mRightMenu;
    private View mSatelliteBtn;
    private View mSettingsBtn;
    private ViewGroup mSettingsMenu;
    private boolean mShowAllMapSettingsButtons;
    private View mShowSearchBtn;
    private NetworkImageView mSponsorImage;
    private View mSuggestBtn;
    private POIDetail mTargetedPOI;
    private MapOverlayFragment mThis;
    private View mThisView;
    private ViewGroup mTourHeader;
    private boolean mUnclusteredMapMarkersChanged;
    private int mViewportHeight;
    private boolean mWaitToReloadAdapter;

    public MapOverlayFragment()
    {
        mFromExternallySelectedAction = false;
        mMapSettingsOpen = false;
        mShowAllMapSettingsButtons = false;
        isMapViewSatellite = false;
        mUnclusteredMapMarkersChanged = false;
        mWaitToReloadAdapter = false;
        mDetailViewPagerClosedHeight = 0;
        mDetailViewPagerOpenHeight = 0;
        mAnimationInited = false;
        mIsDetailVisible = false;
        isDetailOpen = false;
        mDetailSwiperShown = false;
    }

    private void checkRelocationButton()
    {
        Object obj1 = mNav.getMapFragment().getMapLatLng();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        Object obj = LocationManager.getInstance(getActivity()).getUsersLocation();
        String s = String.format("%.2f", new Object[] {
            Double.valueOf(((LatLng) (obj1)).latitude)
        });
        String s1 = String.format("%.2f", new Object[] {
            Double.valueOf(((Location) (obj)).getLatitude())
        });
        obj1 = String.format("%.2f", new Object[] {
            Double.valueOf(((LatLng) (obj1)).longitude)
        });
        obj = String.format("%.2f", new Object[] {
            Double.valueOf(((Location) (obj)).getLongitude())
        });
        if (s.equalsIgnoreCase(s1) && ((String) (obj1)).equalsIgnoreCase(((String) (obj))))
        {
            ((ImageView)mRelocateBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200bf));
            return;
        }
        try
        {
            ((ImageView)mRelocateBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c0));
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            illegalstateexception.printStackTrace();
        }
    }

    private void collapseMapSettingsMenu()
    {
        if (LocationManager.getInstance(getActivity()).isUsersLocationKnown() && MainNavigationActivity.isMapTypePlaces())
        {
            mSatelliteBtn.setVisibility(8);
            mRelocateBtn.setVisibility(8);
            mMapSettingsOpen = false;
            mSettingsMenu.setBackgroundDrawable(getActivity().getResources().getDrawable(0x7f020110));
            ((ImageView)mSettingsBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c7));
            return;
        }
        mSatelliteBtn.setVisibility(0);
        mSettingsBtn.setVisibility(8);
        mRelocateBtn.setVisibility(8);
        if (isMapViewSatellite)
        {
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c1));
            mSettingsMenu.setBackgroundDrawable(getActivity().getResources().getDrawable(0x7f020111));
            return;
        } else
        {
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c3));
            mSettingsMenu.setBackgroundDrawable(getActivity().getResources().getDrawable(0x7f020110));
            return;
        }
    }

    private void expandMapSettingsMenu()
    {
        checkRelocationButton();
        mSatelliteBtn.setVisibility(0);
        mRelocateBtn.setVisibility(0);
        mMapSettingsOpen = true;
        mSettingsMenu.setBackgroundDrawable(getActivity().getResources().getDrawable(0x7f020111));
        ((ImageView)mSettingsBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c5));
        if (isMapViewSatellite)
        {
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c1));
            return;
        } else
        {
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c2));
            return;
        }
    }

    private void reloadAdapter()
    {
        mCurrentPOIList = mNewPOIList;
        mDetailPagerAdapter.resetData(mCurrentPOIList);
        mWaitToReloadAdapter = false;
    }

    private void setListeners()
    {
        PoiManager.getInstance(getActivity()).setOnUnclusteredMapMarkersListener(new com.aetn.history.android.historyhere.model.PoiManager.OnUnclusteredMapMarkersListener() {

            final MapOverlayFragment this$0;

            public void onUnclusteredPoisChanged()
            {
                Utils.logger(TAG, "onUnclusteredPoisChanged");
                mUnclusteredMapMarkersChanged = true;
                if (mIsDetailVisible)
                {
                    mWaitToReloadAdapter = true;
                    if (mCurrentPOIList != null)
                    {
                        int i = mDetailViewPager.getCurrentItem();
                        POIDetail poidetail = (POIDetail)mCurrentPOIList.get(i);
                        if (!Boolean.valueOf(PoiManager.getInstance(getActivity()).isInUnclusteredMapMarkers(poidetail.getId())).booleanValue())
                        {
                            Utils.logger(TAG, "onUnclusteredPoisChanged: it is not in the list close the details");
                            animateHideDetailPager();
                            mTargetedPOI = null;
                            mNav.getMapFragment().clearSelectedMarkerIcon();
                        } else
                        {
                            Utils.logger(TAG, "onUnclusteredPoisChanged: don't do anything right now");
                        }
                    }
                }
                PoiManager.getInstance(getActivity()).loadUnclusteredMapPois();
            }

            public void onUnclusteredPoisLoaded(ArrayList arraylist)
            {
                Utils.logger(TAG, (new StringBuilder()).append("onUnclusteredPoisLoaded: mWaitToReloadAdapter").append(mWaitToReloadAdapter).toString());
                mNewPOIList = arraylist;
                if (!mWaitToReloadAdapter)
                {
                    reloadAdapter();
                    setPoiInList();
                }
                mUnclusteredMapMarkersChanged = false;
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mSettingsBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayFragment this$0;

            public void onClick(View view)
            {
                toggleMapSettingsMenu();
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mSatelliteBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayFragment this$0;

            public void onClick(View view)
            {
                toggleMapView();
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mRelocateBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayFragment this$0;

            public void onClick(View view)
            {
                mNav.getMapFragment().moveToUsersLocation();
                collapseMapSettingsMenu();
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mListBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayFragment this$0;

            public void onClick(View view)
            {
                if (MainNavigationActivity.isMapTypePlaces() && PoiManager.getInstance(getActivity()).getCurrentPOIList().size() < 1)
                {
                    view = new GenericDialogFragment();
                    Resources resources = getActivity().getResources();
                    view.setTitleText(resources.getString(0x7f0d0044), resources.getString(0x7f0d0043));
                    view.show(getActivity().getSupportFragmentManager(), "GenericDialogFragment");
                    return;
                } else
                {
                    mNav.hideDetailPager();
                    mNav.showPlacesList();
                    return;
                }
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mShowSearchBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayFragment this$0;

            public void onClick(View view)
            {
                mNav.getMapFragment().showSearch();
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mMenuBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayFragment this$0;

            public void onClick(View view)
            {
                mNav.showMenu();
                hideDetailPager();
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mSuggestBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayFragment this$0;

            public void onClick(View view)
            {
                view = new Intent(getActivity(), com/aetn/history/android/historyhere/view/SuggestActivity);
                view.putExtra("called_from", "map");
                getActivity().startActivity(view);
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mPullTab.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayFragment this$0;

            public void onClick(View view)
            {
                animateInDetail();
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mDetailViewPager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final MapOverlayFragment this$0;

            public void onPageScrollStateChanged(int i)
            {
                if (mWaitToReloadAdapter)
                {
                    if (mNewPOIList != null)
                    {
                        Utils.logger(TAG, "onPageScrollStateChanged:mNewPOIList:");
                        mCurrentPOIList = mNewPOIList;
                    }
                    reloadAdapter();
                    setPoiInList();
                }
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                Utils.logger(TAG, (new StringBuilder()).append("onPageSelected:mExternalSelectedAction:").append(mFromExternallySelectedAction).toString());
                MapFragment mapfragment = mNav.getMapFragment();
                POIDetail poidetail;
                if (MainNavigationActivity.isMapTypePlaces())
                {
                    poidetail = (POIDetail)mCurrentPOIList.get(i);
                } else
                if (MainNavigationActivity.isMapTypeTours())
                {
                    poidetail = (POIDetail)mCurrentPOIList.get(i);
                } else
                {
                    poidetail = (POIDetail)mCurrentPOIList.get(i);
                }
                if (mDetailPager.getVisibility() == 0)
                {
                    mapfragment.setSelectedMarkerByPoi(poidetail);
                }
                mFromExternallySelectedAction = false;
                setNextPreviousIcons(i);
                if (MainNavigationActivity.isMapTypeTours())
                {
                    mNav.localyticsIncrementTourPoiSelectCount();
                }
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
    }

    private void setNextPreviousIcons(int i)
    {
        if (i == 0)
        {
            mPreviousPoiIcon.setVisibility(4);
        } else
        {
            mPreviousPoiIcon.setVisibility(0);
        }
        if (i == mCurrentPOIList.size() - 1)
        {
            mNextPoiIcon.setVisibility(4);
            return;
        } else
        {
            mNextPoiIcon.setVisibility(0);
            return;
        }
    }

    private void setPOIByIndex(int i)
    {
        Utils.logger(TAG, (new StringBuilder()).append("setPOIByIndex()").append(i).toString());
        mDetailViewPager.invalidate();
        mDetailViewPager.setCurrentItem(i, false);
        mPreviousPoiIcon.setVisibility(4);
        setNextPreviousIcons(i);
    }

    private void showNormalMapView()
    {
        mNav.getMapFragment().setMapTypeNormal();
        if (mShowAllMapSettingsButtons)
        {
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c2));
        } else
        {
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c3));
            mSettingsMenu.setBackgroundDrawable(getActivity().getResources().getDrawable(0x7f020110));
        }
        isMapViewSatellite = false;
    }

    private void showSatelliteMapView()
    {
        mNav.getMapFragment().setMapTypeSatellite();
        if (!mShowAllMapSettingsButtons)
        {
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c1));
            mSettingsMenu.setBackgroundDrawable(getActivity().getResources().getDrawable(0x7f020111));
        } else
        {
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c1));
        }
        isMapViewSatellite = true;
    }

    private void toggleMapSettingsMenu()
    {
        if (mMapSettingsOpen)
        {
            collapseMapSettingsMenu();
            return;
        } else
        {
            expandMapSettingsMenu();
            return;
        }
    }

    public void animateCloseDetail()
    {
        mDetailViewPager.allowSwiping(true);
        HideAnim hideanim = new HideAnim(mDetailViewPager, mDetailViewPagerOpenHeight, mDetailViewPagerClosedHeight);
        hideanim.setDuration(500L);
        mDetailViewPager.startAnimation(hideanim);
        MapOverlayDetailFragment mapoverlaydetailfragment = (MapOverlayDetailFragment)mDetailPagerAdapter.getCurrentFragment();
        if (mapoverlaydetailfragment != null)
        {
            mapoverlaydetailfragment.animateOutMainLayout();
        }
        (new Handler()).postDelayed(new Runnable() {

            final MapOverlayFragment this$0;

            public void run()
            {
                mNav.mMapDetailActive = false;
                setNextPreviousIcons(mDetailViewPager.getCurrentItem());
                isDetailOpen = false;
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        }, 500L);
        hideanim.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MapOverlayFragment this$0;

            public void onAnimationEnd(Animation animation)
            {
                MainNavigationActivity _tmp = mNav;
                if (MainNavigationActivity.isMapTypeTours())
                {
                    int i = mTourHeader.getHeight();
                    animation = ObjectAnimator.ofFloat(mDetailPager, "translationY", new float[] {
                        (float)i
                    });
                    animation.setDuration(300);
                    ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mTourHeader, "translationY", new float[] {
                        0.0F
                    });
                    objectanimator.setDuration(300);
                    AnimatorSet animatorset = new AnimatorSet();
                    animatorset.play(animation);
                    animatorset.play(animation).with(objectanimator);
                    animatorset.start();
                }
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
    }

    public void animateExpandDetail()
    {
        final MapOverlayDetailFragment frag = new ShowAnim(mDetailViewPager, mDetailViewPagerOpenHeight);
        frag.setDuration(300L);
        mDetailViewPager.startAnimation(frag);
        Utils.logger(TAG, "the y value of the tour header is: ");
        frag = (MapOverlayDetailFragment)mDetailPagerAdapter.getCurrentFragment();
        if (frag != null)
        {
            (new Handler()).postDelayed(new Runnable() {

                final MapOverlayFragment this$0;
                final MapOverlayDetailFragment val$frag;

                public void run()
                {
                    frag.animateInMainLayout();
                }

            
            {
                this$0 = MapOverlayFragment.this;
                frag = mapoverlaydetailfragment;
                super();
            }
            }, 200L);
        }
        mDetailViewPager.allowSwiping(false);
        mNextPoiIcon.setVisibility(4);
        mPreviousPoiIcon.setVisibility(4);
        mNav.mMapDetailActive = true;
        isDetailOpen = true;
    }

    public void animateHideDetailPager()
    {
        if (isDetailOpen)
        {
            animateCloseDetail();
        }
        mDetailPager.setVisibility(0);
        float f1 = UIUtils.getDeviceIndependentFloat(getActivity(), -400F);
        float f = UIUtils.getDeviceIndependentFloat(getActivity(), 10F);
        int i = mTourHeader.getHeight();
        if (MainNavigationActivity.isMapTypeTours())
        {
            f = UIUtils.getDeviceIndependentFloat(getActivity(), 10F) + (float)i;
        }
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mDetailPager, "translationY", new float[] {
            f1
        });
        objectanimator.setRepeatCount(0);
        objectanimator.setDuration(300);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mSettingsMenu, "translationY", new float[] {
            f
        });
        objectanimator1.setRepeatCount(0);
        objectanimator1.setDuration(300);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator);
        animatorset.play(objectanimator).with(objectanimator1);
        animatorset.start();
        collapseMapSettingsMenu();
        mIsDetailVisible = false;
    }

    public void animateHideTourHeaderForOpenDetail()
    {
        int i = mTourHeader.getHeight();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mDetailPager, "translationY", new float[] {
            0.0F
        });
        objectanimator.setDuration(300);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mTourHeader, "translationY", new float[] {
            (float)(0 - i)
        });
        objectanimator1.setDuration(300);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator);
        animatorset.play(objectanimator).with(objectanimator1);
        animatorset.start();
        animatorset.addListener(new android.animation.Animator.AnimatorListener() {

            final MapOverlayFragment this$0;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                animateExpandDetail();
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
    }

    public void animateInDetail()
    {
        if (!mAnimationInited)
        {
            mDetailViewPagerClosedHeight = mDetailViewPager.getHeight();
            mAnimationInited = true;
        }
        mViewportHeight = mNav.getMapFragment().mMapContainer.getHeight();
        mDetailViewPagerOpenHeight = mViewportHeight - mDetailViewPagerClosedHeight;
        MainNavigationActivity mainnavigationactivity = mNav;
        if (MainNavigationActivity.isMapTypeTours())
        {
            animateHideTourHeaderForOpenDetail();
            return;
        } else
        {
            animateExpandDetail();
            return;
        }
    }

    public void hideDetailPager()
    {
        if (mDetailPager != null)
        {
            mDetailPager.setVisibility(8);
            mIsDetailVisible = false;
        }
    }

    public void hideMenu()
    {
        if (mMenuLayout != null)
        {
            mMenuLayout.setVisibility(4);
        }
    }

    public void hideRightMenu()
    {
        mRightMenu.setVisibility(4);
    }

    public void hideSettingsMenu()
    {
        if (mSettingsMenu != null)
        {
            mSettingsMenu.setVisibility(4);
        }
    }

    public void hideTourHeader()
    {
        if (mTourHeader != null)
        {
            mTourHeader.setVisibility(8);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mThis = this;
        Utils.logger(TAG, "onCreateView: ");
        mThisView = layoutinflater.inflate(0x7f03003f, viewgroup, false);
        mDetailViewPager = (CustomViewPager)mThisView.findViewById(0x7f0a00aa);
        mNextPoiIcon = (ImageView)mThisView.findViewById(0x7f0a00ac);
        mPreviousPoiIcon = (ImageView)mThisView.findViewById(0x7f0a00ab);
        mPullTab = (ImageView)mThisView.findViewById(0x7f0a00ad);
        mDetailPagerAdapter = new DetailPagerAdapter(getActivity().getSupportFragmentManager(), getActivity());
        mDetailPager = (ViewGroup)mThisView.findViewById(0x7f0a00a9);
        mTourHeader = (ViewGroup)mThisView.findViewById(0x7f0a00a0);
        mSponsorImage = (NetworkImageView)mThisView.findViewById(0x7f0a00c3);
        mMenuLayout = (ViewGroup)mThisView.findViewById(0x7f0a00a8);
        mMenuBtn = mThisView.findViewById(0x7f0a008f);
        mListBtn = mThisView.findViewById(0x7f0a008d);
        mShowSearchBtn = mThisView.findViewById(0x7f0a0091);
        mSuggestBtn = mThisView.findViewById(0x7f0a0090);
        mRightMenu = (ViewGroup)mThisView.findViewById(0x7f0a0086);
        mSettingsMenu = (ViewGroup)mThisView.findViewById(0x7f0a0092);
        mSettingsBtn = mThisView.findViewById(0x7f0a0093);
        mSatelliteBtn = mThisView.findViewById(0x7f0a0095);
        mRelocateBtn = mThisView.findViewById(0x7f0a0094);
        mNav = (MainNavigationActivity)getActivity();
        mDetailViewPager.setAdapter(mDetailPagerAdapter);
        hideDetailPager();
        hideTourHeader();
        setListeners();
        return mThisView;
    }

    public void onDestroy()
    {
        Utils.logger(TAG, "onDestroy()");
        super.onDestroy();
    }

    public void setData()
    {
        Utils.logger(TAG, "setData():");
        if (MainNavigationActivity.isMapTypePlaces())
        {
            if (mUnclusteredMapMarkersChanged)
            {
                Utils.logger(TAG, "setData():mUnclusteredMapMarkersChanged: load the new markers and let the listener hande the rest");
                PoiManager.getInstance(getActivity()).loadUnclusteredMapPois();
                return;
            } else
            {
                Utils.logger(TAG, "setData():mUnclusteredMapMarkers has not Changed: use the current data");
                mDetailPagerAdapter.resetData(mCurrentPOIList);
                setPoiInList();
                return;
            }
        }
        if (MainNavigationActivity.isMapTypeTours())
        {
            mCurrentPOIList = PoiManager.getInstance(getActivity()).getCurrentTourList();
            mDetailPagerAdapter.resetData(mCurrentPOIList);
            setPoiInList();
            return;
        } else
        {
            mCurrentPOIList = PoiManager.getInstance(getActivity()).getCurrentFavoriteList();
            mDetailPagerAdapter.resetData(mCurrentPOIList);
            setPoiInList();
            return;
        }
    }

    public void setMapSettingsMenu()
    {
        Utils.logger(TAG, "setMapSettingsMenu()");
        float f = UIUtils.getDeviceIndependentFloat(getActivity(), 10F);
        int i = mTourHeader.getHeight();
        ObjectAnimator objectanimator;
        AnimatorSet animatorset;
        if (MainNavigationActivity.isMapTypeTours())
        {
            if (mIsDetailVisible)
            {
                f = UIUtils.getDeviceIndependentFloat(getActivity(), 125F) + (float)i;
            } else
            {
                f = UIUtils.getDeviceIndependentFloat(getActivity(), 10F) + (float)i;
            }
        } else
        if (mIsDetailVisible)
        {
            f = UIUtils.getDeviceIndependentFloat(getActivity(), 125F);
        }
        objectanimator = ObjectAnimator.ofFloat(mSettingsMenu, "translationY", new float[] {
            f
        });
        objectanimator.setRepeatCount(0);
        objectanimator.setDuration(100L);
        animatorset = new AnimatorSet();
        animatorset.play(objectanimator);
        animatorset.start();
        if (LocationManager.getInstance(getActivity()).isUsersLocationKnown())
        {
            mShowAllMapSettingsButtons = true;
            mSettingsBtn.setVisibility(0);
            mRelocateBtn.setVisibility(8);
            mSatelliteBtn.setVisibility(8);
        } else
        {
            mShowAllMapSettingsButtons = false;
            mSettingsBtn.setVisibility(8);
            mRelocateBtn.setVisibility(8);
            mSatelliteBtn.setVisibility(0);
        }
        if (!MainNavigationActivity.isMapTypePlaces())
        {
            mShowAllMapSettingsButtons = false;
            mSettingsBtn.setVisibility(8);
            mRelocateBtn.setVisibility(8);
            mSatelliteBtn.setVisibility(0);
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c3));
        } else
        {
            ((ImageView)mSatelliteBtn).setImageDrawable(getActivity().getResources().getDrawable(0x7f0200c2));
        }
        collapseMapSettingsMenu();
    }

    public void setPoiInList()
    {
        if (mTargetedPOI != null && mCurrentPOIList != null)
        {
            Utils.logger(TAG, (new StringBuilder()).append("setPoiInList()mTargetedPOI: title").append(mTargetedPOI.getTitle()).toString());
            int i = 0;
            do
            {
label0:
                {
                    if (i < mCurrentPOIList.size())
                    {
                        POIDetail poidetail = (POIDetail)mCurrentPOIList.get(i);
                        if (!mTargetedPOI.getId().equals(poidetail.getId()))
                        {
                            break label0;
                        }
                        mFromExternallySelectedAction = true;
                        setPOIByIndex(i);
                    }
                    return;
                }
                i++;
            } while (true);
        } else
        {
            Utils.logger(TAG, "no mTargetedPOI");
            return;
        }
    }

    public void setPoiInList(POIDetail poidetail)
    {
        Utils.logger(TAG, (new StringBuilder()).append("setPoiInList(poi) this title").append(poidetail.getTitle()).toString());
        setTargetPoi(poidetail);
        setPoiInList();
    }

    public void setTargetPoi(POIDetail poidetail)
    {
        if (poidetail != null)
        {
            Utils.logger(TAG, (new StringBuilder()).append("setTargetPoi()").append(poidetail.getTitle()).toString());
            mTargetedPOI = poidetail;
            if (mWaitToReloadAdapter)
            {
                reloadAdapter();
            }
        }
    }

    public void setUI()
    {
label0:
        {
            if (mTourHeader != null)
            {
                if (!MainNavigationActivity.isMapTypeTours())
                {
                    break label0;
                }
                mTourHeader.setVisibility(0);
            }
            return;
        }
        mTourHeader.setVisibility(8);
    }

    public void showDetailPager()
    {
        setData();
        mDetailPager.setVisibility(0);
        int i = mTourHeader.getHeight();
        float f = 0.0F;
        float f2 = UIUtils.getDeviceIndependentFloat(getActivity(), 10F);
        float f1 = UIUtils.getDeviceIndependentFloat(getActivity(), 125F);
        if (MainNavigationActivity.isMapTypeTours())
        {
            f = i;
            f1 = UIUtils.getDeviceIndependentFloat(getActivity(), 125F) + (float)i;
            f2 = UIUtils.getDeviceIndependentFloat(getActivity(), 10F) + (float)i;
        }
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mDetailPager, "translationY", new float[] {
            UIUtils.getDeviceIndependentFloat(getActivity(), -400F), f
        });
        objectanimator.setRepeatCount(0);
        objectanimator.setDuration(300);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mSettingsMenu, "translationY", new float[] {
            f2, f1
        });
        objectanimator1.setRepeatCount(0);
        objectanimator1.setDuration(300);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator);
        animatorset.play(objectanimator).with(objectanimator1);
        animatorset.start();
        animatorset.addListener(new android.animation.Animator.AnimatorListener() {

            final MapOverlayFragment this$0;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                if (!mDetailSwiperShown && mCurrentPOIList != null)
                {
                    mDetailViewPager.setEnabled(false);
                    (new Handler()).postDelayed(new Runnable() {

                        final _cls11 this$1;

                        public void run()
                        {
                            if (mCurrentPOIList.size() == 1)
                            {
                                return;
                            }
                            int i = 120;
                            if (mDetailViewPager.getCurrentItem() < mCurrentPOIList.size() - 1)
                            {
                                i = -140;
                            }
                            mDetailViewPager.beginFakeDrag();
                            mDetailViewPager.fakeDragBy(i);
                            (new Handler()).postDelayed(new Runnable() {

                                final _cls1 this$2;

                                public void run()
                                {
                                    try
                                    {
                                        mDetailViewPager.fakeDragBy(0.0F);
                                        mDetailViewPager.endFakeDrag();
                                        mDetailSwiperShown = true;
                                        mDetailViewPager.setEnabled(true);
                                        return;
                                    }
                                    catch (NullPointerException nullpointerexception)
                                    {
                                        nullpointerexception.printStackTrace();
                                    }
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            }, 300L);
                        }

            
            {
                this$1 = _cls11.this;
                super();
            }
                    }, 400L);
                    return;
                } else
                {
                    mDetailViewPager.setEnabled(true);
                    return;
                }
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
        });
        mIsDetailVisible = true;
    }

    public void showMenu()
    {
        if (mMenuLayout != null)
        {
            mMenuLayout.setVisibility(0);
        }
    }

    public void showRightMenu()
    {
        mRightMenu.setVisibility(0);
    }

    public void showSettingsMenu()
    {
        if (mSettingsMenu != null)
        {
            mSettingsMenu.setVisibility(0);
        }
    }

    public void showTourHeader()
    {
        if (mTourHeader != null)
        {
            mTourHeader.setVisibility(0);
        }
        POIDetail poidetail = PoiManager.getInstance(getActivity()).getCurrentTourDetailPOI();
        ((TextView)mThisView.findViewById(0x7f0a00e5)).setText(poidetail.getTitle());
        ((TextView)mTourHeader.findViewById(0x7f0a00e6)).setText(poidetail.getCityStateString());
        mSponsorImage.setVisibility(8);
        Object obj = (HistoryHereApplication)getActivity().getApplication();
        obj = HistoryHereApplication.getConfiguration().tourSponsorData.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.aetn.history.android.historyhere.model.Configuration.TourSponsorData toursponsordata = (com.aetn.history.android.historyhere.model.Configuration.TourSponsorData)((Iterator) (obj)).next();
            if (!toursponsordata.id.equalsIgnoreCase(poidetail.getId()))
            {
                continue;
            }
            mSponsorImage.setImageUrl(toursponsordata.stripImageURL, HttpRequestManager.getInstance(getActivity()).getImageLoader());
            mSponsorImage.setVisibility(0);
            break;
        } while (true);
        mTourHeader.setTranslationY(0.0F);
    }

    public void toggleMapView()
    {
        Utils.logger(TAG, "toggleMapView");
        if (isMapViewSatellite)
        {
            showNormalMapView();
        } else
        {
            showSatelliteMapView();
        }
        collapseMapSettingsMenu();
    }




/*
    static boolean access$102(MapOverlayFragment mapoverlayfragment, boolean flag)
    {
        mapoverlayfragment.mUnclusteredMapMarkersChanged = flag;
        return flag;
    }

*/



/*
    static boolean access$1102(MapOverlayFragment mapoverlayfragment, boolean flag)
    {
        mapoverlayfragment.mFromExternallySelectedAction = flag;
        return flag;
    }

*/





/*
    static boolean access$1402(MapOverlayFragment mapoverlayfragment, boolean flag)
    {
        mapoverlayfragment.mDetailSwiperShown = flag;
        return flag;
    }

*/


/*
    static boolean access$1502(MapOverlayFragment mapoverlayfragment, boolean flag)
    {
        mapoverlayfragment.isDetailOpen = flag;
        return flag;
    }

*/





/*
    static boolean access$202(MapOverlayFragment mapoverlayfragment, boolean flag)
    {
        mapoverlayfragment.mWaitToReloadAdapter = flag;
        return flag;
    }

*/



/*
    static ArrayList access$302(MapOverlayFragment mapoverlayfragment, ArrayList arraylist)
    {
        mapoverlayfragment.mCurrentPOIList = arraylist;
        return arraylist;
    }

*/



/*
    static POIDetail access$502(MapOverlayFragment mapoverlayfragment, POIDetail poidetail)
    {
        mapoverlayfragment.mTargetedPOI = poidetail;
        return poidetail;
    }

*/




/*
    static ArrayList access$702(MapOverlayFragment mapoverlayfragment, ArrayList arraylist)
    {
        mapoverlayfragment.mNewPOIList = arraylist;
        return arraylist;
    }

*/


}

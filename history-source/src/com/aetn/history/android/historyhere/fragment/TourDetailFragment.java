// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.FavoritesManager;
import com.aetn.history.android.historyhere.model.HttpRequestManager;
import com.aetn.history.android.historyhere.model.POI;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.utils.ConnectionManager;
import com.aetn.history.android.historyhere.utils.ShareUtils;
import com.aetn.history.android.historyhere.utils.TextUtils;
import com.aetn.history.android.historyhere.utils.UIUtils;
import com.aetn.history.android.historyhere.utils.Utils;
import com.android.volley.toolbox.NetworkImageView;
import com.nirhart.parallaxscroll.views.ParallaxScrollView;
import java.util.ArrayList;
import java.util.Iterator;

public class TourDetailFragment extends Fragment
{

    private static final String KEY_ADDRESS1 = "address1";
    private static final String KEY_ADDRESS2 = "address2";
    private static final String KEY_CITY = "city";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_ID = "id";
    private static final String KEY_IMAGE_URL = "image_url";
    private static final String KEY_LATITUDE = "lat";
    private static final String KEY_LONGITUDE = "lng";
    private static final String KEY_SHORT_DESCRIPTION = "short_description";
    private static final String KEY_STATE = "state";
    private static final String KEY_TITLE = "title";
    private static final String KEY_TOUR_STOPS = "tour_stops";
    private static final String KEY_ZIP = "zip";
    private static final String TAG = com/aetn/history/android/historyhere/fragment/TourDetailFragment.getSimpleName();
    private static Context appContext;
    private static Context mContext;
    private TextView address;
    private HistoryHereApplication app;
    private View bg;
    private ImageView closeButton;
    private ImageView defaultImage;
    private TextView description;
    private POIDetail detail;
    private View detailBottomNav;
    private NetworkImageView detailImage;
    private ViewGroup detailImageHolder;
    private TextView detailPhotoCredit;
    private ViewGroup detailView;
    private FavoritesManager favoritesManager;
    private ImageView imageMask;
    private boolean mBeginningAnimationFinished;
    private boolean mDataLoaded;
    private MainNavigationActivity mNav;
    private View mProgressBar;
    private ParallaxScrollView mScrollView;
    private Button mStartTourBtn;
    private TextView mStopTotal;
    private View mThisView;
    private ViewGroup mTourStopsView;
    private ViewGroup mainLayout;
    private TextView mileage;
    private ImageView shareButton;
    private POIDetail shortDetail;
    private NetworkImageView sponsorImage;
    private TextView title;
    private ArrayList tourList;

    public TourDetailFragment()
    {
        mDataLoaded = false;
        mBeginningAnimationFinished = false;
    }

    private void animateInBottomNav()
    {
        Utils.logger(TAG, "animateInBottomNav()");
        detailBottomNav.setVisibility(0);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(detailBottomNav, "translationY", new float[] {
            UIUtils.getDeviceIndependentFloat(getActivity(), 200F), UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F)
        });
        objectanimator.setDuration(500L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator);
        animatorset.start();
    }

    private void animateInMainLayout()
    {
        detailImageHolder.setVisibility(0);
        mainLayout.setVisibility(0);
        bg.setVisibility(0);
        detailBottomNav.setVisibility(0);
        float f = UIUtils.getDeviceIndependentFloat(getActivity(), -1000F);
        float f1 = UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F);
        float f2 = UIUtils.getDeviceIndependentFloat(getActivity(), 1000F);
        float f3 = UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(bg, "translationY", new float[] {
            f, f1
        });
        objectanimator.setDuration(500);
        AnimatorSet animatorset = new AnimatorSet();
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mainLayout, "translationY", new float[] {
            f2, f3
        });
        objectanimator1.setDuration(500);
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(detailImageHolder, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator2.setDuration(100L);
        ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(detailImageHolder, "scaleX", new float[] {
            1.0F
        });
        objectanimator3.setDuration(500);
        ObjectAnimator objectanimator4 = ObjectAnimator.ofFloat(detailImageHolder, "scaleY", new float[] {
            1.0F
        });
        objectanimator4.setDuration(500);
        ObjectAnimator objectanimator5 = ObjectAnimator.ofFloat(imageMask, "scaleX", new float[] {
            1.75F
        });
        objectanimator5.setDuration(500);
        ObjectAnimator objectanimator6 = ObjectAnimator.ofFloat(imageMask, "scaleY", new float[] {
            1.75F
        });
        objectanimator6.setDuration(500);
        animatorset.addListener(new android.animation.Animator.AnimatorListener() {

            final TourDetailFragment this$0;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                if (mDataLoaded)
                {
                    animateInBottomNav();
                }
                mBeginningAnimationFinished = true;
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = TourDetailFragment.this;
                super();
            }
        });
        animatorset.play(objectanimator3).with(objectanimator4).with(objectanimator2).after(objectanimator);
        animatorset.play(objectanimator1).with(objectanimator5).with(objectanimator6).after(objectanimator3);
        animatorset.start();
    }

    private void animateOutMainLayout(final boolean showTourInMap)
    {
        mainLayout.setVisibility(0);
        bg.setVisibility(0);
        float f = UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F);
        float f1 = UIUtils.getDeviceIndependentFloat(getActivity(), -1000F);
        float f2 = UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F);
        float f3 = UIUtils.getDeviceIndependentFloat(getActivity(), 1000F);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(bg, "translationY", new float[] {
            f, f1
        });
        objectanimator.setRepeatCount(0);
        objectanimator.setDuration(500);
        AnimatorSet animatorset = new AnimatorSet();
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mainLayout, "translationY", new float[] {
            f2, f3
        });
        objectanimator1.setRepeatCount(0);
        objectanimator1.setDuration(500);
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(detailImageHolder, "alpha", new float[] {
            1.0F, 0.0F
        });
        objectanimator2.setRepeatCount(0);
        objectanimator2.setDuration(500);
        ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(detailBottomNav, "translationY", new float[] {
            UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F), UIUtils.getDeviceIndependentFloat(getActivity(), 200F)
        });
        objectanimator3.setRepeatCount(0);
        objectanimator3.setDuration(500L);
        animatorset.addListener(new android.animation.Animator.AnimatorListener() {

            final TourDetailFragment this$0;
            final boolean val$showTourInMap;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                if (!showTourInMap)
                {
                    getFragmentManager().popBackStack();
                }
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = TourDetailFragment.this;
                showTourInMap = flag;
                super();
            }
        });
        animatorset.play(objectanimator1).with(objectanimator2).with(objectanimator3).before(objectanimator);
        animatorset.start();
    }

    private void animateStartTourButtonBigger()
    {
    }

    private void initMainLayout()
    {
        mainLayout.setVisibility(4);
        bg.setVisibility(4);
        detailImageHolder.setAlpha(0.0F);
        float f = UIUtils.getDeviceIndependentFloat(getActivity(), 1000F);
        mainLayout.setTranslationY(f);
        detailBottomNav.setTranslationY(UIUtils.getDeviceIndependentFloat(getActivity(), 200F));
        bg.setTranslationY(UIUtils.getDeviceIndependentFloat(getActivity(), -1000F));
        imageMask.setScaleY(1.0F);
        detailImageHolder.setScaleX(0.25F);
        detailImageHolder.setScaleY(0.25F);
    }

    private void makeDetailRequest()
    {
        Utils.logger(TAG, (new StringBuilder()).append("makeDetailRequest():").append(shortDetail.getId()).toString());
        if (mDataLoaded)
        {
            return;
        }
        Utils.logger(TAG, "makeDetailRequest:request detail");
        if (!ConnectionManager.isNetworkAvailable(getActivity()))
        {
            ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003e));
            Utils.logger(TAG, "makeDetailRequest - no network connection");
            return;
        } else
        {
            PoiManager.getInstance(mContext).getTourPOIDetailFromService(mContext, shortDetail);
            return;
        }
    }

    public static TourDetailFragment newInstance(POIDetail poidetail)
    {
        TourDetailFragment tourdetailfragment = new TourDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("id", poidetail.getId());
        bundle.putString("title", poidetail.getTitle());
        bundle.putString("image_url", poidetail.getImage());
        bundle.putString("short_description", poidetail.getShortDescription());
        bundle.putString("description", poidetail.getDescription());
        bundle.putString("address1", poidetail.getAddress().getAddress1());
        bundle.putString("address2", poidetail.getAddress().getAddress2());
        bundle.putString("city", poidetail.getAddress().getCity());
        bundle.putString("state", poidetail.getAddress().getState());
        bundle.putString("zip", poidetail.getAddress().getZip());
        bundle.putDouble("lat", poidetail.getLatitude());
        bundle.putDouble("lng", poidetail.getLongitude());
        bundle.putString("tour_stops", poidetail.getPoiTourList());
        tourdetailfragment.setArguments(bundle);
        return tourdetailfragment;
    }

    private void setDetailImageDimens()
    {
        Object obj = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        int i = ((DisplayMetrics) (obj)).widthPixels;
        obj = new android.widget.RelativeLayout.LayoutParams(i, i);
        detailImage.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        defaultImage.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        imageMask.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    private void setListeners()
    {
        mScrollView.setOnScrollListener(new com.nirhart.parallaxscroll.views.ParallaxScrollView.OnScrollListener() {

            final TourDetailFragment this$0;

            public void onScrollReachedEnd(boolean flag)
            {
                if (flag)
                {
                    Utils.logger(TourDetailFragment.TAG, "make the start tour button bigger");
                    ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mStartTourBtn, "scaleY", new float[] {
                        1.3F
                    });
                    objectanimator.setDuration(200L);
                    ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(mStartTourBtn, "scaleX", new float[] {
                        1.3F
                    });
                    objectanimator2.setDuration(200L);
                    AnimatorSet animatorset = new AnimatorSet();
                    animatorset.play(objectanimator).with(objectanimator2);
                    animatorset.start();
                    return;
                } else
                {
                    Utils.logger(TourDetailFragment.TAG, "make the start tour button smaller");
                    ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mStartTourBtn, "scaleY", new float[] {
                        1.0F
                    });
                    objectanimator1.setDuration(200L);
                    ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(mStartTourBtn, "scaleX", new float[] {
                        1.0F
                    });
                    objectanimator3.setDuration(200L);
                    AnimatorSet animatorset1 = new AnimatorSet();
                    animatorset1.play(objectanimator1).with(objectanimator3);
                    animatorset1.start();
                    return;
                }
            }

            
            {
                this$0 = TourDetailFragment.this;
                super();
            }
        });
        PoiManager.getInstance(getActivity()).setOnTourDetailLoadedListener(new com.aetn.history.android.historyhere.model.PoiManager.TourDetailLoadedListener() {

            final TourDetailFragment this$0;

            public void onTourDetailLoadFailed()
            {
                Utils.logger(TourDetailFragment.TAG, "onTourDetailLoadFailed(): show error ");
                ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003f));
                (new Handler()).postDelayed(new Runnable() {

                    final _cls4 this$1;

                    public void run()
                    {
                        getFragmentManager().popBackStack();
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                }, 1000L);
            }

            public void onTourDetailLoaded(POIDetail poidetail)
            {
                Utils.logger(TourDetailFragment.TAG, "setOnTourDetailReceivedListener");
                detail = poidetail;
                setRemainingData();
            }

            
            {
                this$0 = TourDetailFragment.this;
                super();
            }
        });
        closeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TourDetailFragment this$0;

            public void onClick(View view)
            {
                getFragmentManager().popBackStack();
            }

            
            {
                this$0 = TourDetailFragment.this;
                super();
            }
        });
        shareButton.setOnClickListener(new android.view.View.OnClickListener() {

            final TourDetailFragment this$0;

            public void onClick(View view)
            {
                ShareUtils.shareDetail(getActivity(), detail);
            }

            
            {
                this$0 = TourDetailFragment.this;
                super();
            }
        });
        mStartTourBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final TourDetailFragment this$0;

            public void onClick(View view)
            {
                ((MainNavigationActivity)getActivity()).showTourInMap(null);
            }

            
            {
                this$0 = TourDetailFragment.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            shortDetail = new POIDetail();
            shortDetail.setTitle(bundle.getString("title"));
            shortDetail.setImage(bundle.getString("image_url"));
            shortDetail.setId(bundle.getString("id"));
            shortDetail.setShortDescription(bundle.getString("short_description"));
            shortDetail.setDescription(bundle.getString("description"));
            String s = bundle.getString("address1");
            String s1 = bundle.getString("address2");
            String s2 = bundle.getString("city");
            String s3 = bundle.getString("state");
            String s4 = bundle.getString("zip");
            shortDetail.setAddress(s, s1, s2, s3, s4);
            shortDetail.setLocation(bundle.getDouble("lat"), bundle.getDouble("lng"));
            shortDetail.setTourListString(bundle.getString("tour_stops"));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Utils.logger(TAG, "onCreateView()");
        layoutinflater = layoutinflater.inflate(0x7f030053, viewgroup, false);
        mThisView = layoutinflater;
        mContext = getActivity();
        app = (HistoryHereApplication)getActivity().getApplication();
        appContext = mContext.getApplicationContext();
        mNav = (MainNavigationActivity)getActivity();
        detailView = (ViewGroup)layoutinflater.findViewById(0x7f0a005b);
        mStartTourBtn = (Button)layoutinflater.findViewById(0x7f0a0096);
        mTourStopsView = (ViewGroup)layoutinflater.findViewById(0x7f0a00e3);
        title = (TextView)layoutinflater.findViewById(0x7f0a0041);
        TextUtils.setTypefaceSemibold(mContext, title);
        detailImage = (NetworkImageView)layoutinflater.findViewById(0x7f0a007f);
        defaultImage = (ImageView)layoutinflater.findViewById(0x7f0a007e);
        imageMask = (ImageView)layoutinflater.findViewById(0x7f0a00e1);
        detailImageHolder = (ViewGroup)layoutinflater.findViewById(0x7f0a007d);
        address = (TextView)layoutinflater.findViewById(0x7f0a0064);
        TextUtils.setTypefaceLight(mContext, address);
        detailPhotoCredit = (TextView)layoutinflater.findViewById(0x7f0a0080);
        description = (TextView)layoutinflater.findViewById(0x7f0a0065);
        mStopTotal = (TextView)layoutinflater.findViewById(0x7f0a00e2);
        mScrollView = (ParallaxScrollView)layoutinflater.findViewById(0x7f0a00df);
        mileage = (TextView)layoutinflater.findViewById(0x7f0a0063);
        shareButton = (ImageView)layoutinflater.findViewById(0x7f0a0085);
        closeButton = (ImageView)layoutinflater.findViewById(0x7f0a0060);
        sponsorImage = (NetworkImageView)layoutinflater.findViewById(0x7f0a00c3);
        mProgressBar = layoutinflater.findViewById(0x7f0a00b4);
        mainLayout = (ViewGroup)layoutinflater.findViewById(0x7f0a005f);
        bg = layoutinflater.findViewById(0x7f0a0059);
        detailBottomNav = layoutinflater.findViewById(0x7f0a0066);
        setDetailImageDimens();
        favoritesManager = new FavoritesManager(mContext);
        return layoutinflater;
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
        setListeners();
        setLimitedData();
        if (!mDataLoaded)
        {
            makeDetailRequest();
            initMainLayout();
            animateInMainLayout();
            return;
        } else
        {
            imageMask.setVisibility(4);
            setRemainingData();
            return;
        }
    }

    public void setLimitedData()
    {
        Utils.logger(TAG, "setLimitedData()");
        String s = shortDetail.getImage();
        Utils.logger(TAG, (new StringBuilder()).append("setData(): imageUrl: *").append(s).append("*").toString());
        if (!s.equals(""))
        {
            Utils.logger(TAG, "setData(): imageUrl: load the image");
            detailImage.setImageUrl(s, HttpRequestManager.getInstance(mContext).getImageLoader());
        } else
        {
            Utils.logger(TAG, "setData(): imageUrl: set default image");
            detailImage.setImageDrawable(getActivity().getResources().getDrawable(0x7f020085));
        }
        title.setText(shortDetail.getTitle());
        address.setText(shortDetail.getCityStateString().toUpperCase());
        if (shortDetail.getDescription() != null)
        {
            Utils.logger(TAG, (new StringBuilder()).append("setData(): description is not null: *").append(shortDetail.getDescription()).append("*").toString());
            description.setText(shortDetail.getDescription());
            return;
        } else
        {
            Utils.logger(TAG, (new StringBuilder()).append("setData(): description is null: *").append(shortDetail.getShortDescription()).append("*").toString());
            description.setText(shortDetail.getShortDescription());
            return;
        }
    }

    public void setRemainingData()
    {
        Utils.logger(TAG, "setRemainingData()");
        mProgressBar.setVisibility(8);
        Object obj = (HistoryHereApplication)getActivity().getApplication();
        mScrollView.setScrollY(0);
        tourList = PoiManager.getInstance(getActivity()).getCurrentTourList();
        ((HistoryHereApplication) (obj)).setTargetedMapPoi(detail);
        sponsorImage.setVisibility(8);
        obj = (HistoryHereApplication)getActivity().getApplication();
        obj = HistoryHereApplication.getConfiguration().tourSponsorData.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.aetn.history.android.historyhere.model.Configuration.TourSponsorData toursponsordata = (com.aetn.history.android.historyhere.model.Configuration.TourSponsorData)((Iterator) (obj)).next();
            Utils.logger(TAG, (new StringBuilder()).append("getView(): data.id:").append(toursponsordata.id).toString());
            Utils.logger(TAG, (new StringBuilder()).append("getView(): o.getId():").append(detail.getId()).toString());
            if (!toursponsordata.id.equalsIgnoreCase(detail.getId()))
            {
                continue;
            }
            sponsorImage.setImageUrl(toursponsordata.detailImageURL, HttpRequestManager.getInstance(mContext).getImageLoader());
            sponsorImage.setVisibility(0);
            break;
        } while (true);
        obj = new View(getActivity());
        ((View) (obj)).setMinimumHeight(10);
        detailView.addView(((View) (obj)));
        mStopTotal.setText((new StringBuilder()).append(tourList.size()).append(" ").append(getActivity().getResources().getString(0x7f0d008e)).toString());
        mTourStopsView.removeAllViews();
        obj = (LayoutInflater)getActivity().getSystemService("layout_inflater");
        View view;
        for (Iterator iterator = tourList.iterator(); iterator.hasNext(); mTourStopsView.addView(view))
        {
            POI poi = (POI)iterator.next();
            view = ((LayoutInflater) (obj)).inflate(0x7f030035, null);
            TextView textview = (TextView)view.findViewById(0x7f0a002f);
            textview.setText(poi.getTitle());
            textview.setTextAppearance(getActivity(), 0x7f0e007a);
        }

        mNav.tagLocalyticsScreen(Utils.getFormattedLocalyticsTag("HH:Tours:*", detail.getTitle()));
        if (mBeginningAnimationFinished && !mDataLoaded)
        {
            animateInBottomNav();
        }
        mDataLoaded = true;
    }





/*
    static boolean access$202(TourDetailFragment tourdetailfragment, boolean flag)
    {
        tourdetailfragment.mBeginningAnimationFinished = flag;
        return flag;
    }

*/





/*
    static POIDetail access$502(TourDetailFragment tourdetailfragment, POIDetail poidetail)
    {
        tourdetailfragment.detail = poidetail;
        return poidetail;
    }

*/
}

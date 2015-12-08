// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.adapters.DetailPhotoPagerAdapter;
import com.aetn.history.android.historyhere.dialogs.CallPhoneDialogFragment;
import com.aetn.history.android.historyhere.dialogs.DirectionsDialogFragment;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.LocationManager;
import com.aetn.history.android.historyhere.model.POI;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.PhotoData;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.model.PreferenceManager;
import com.aetn.history.android.historyhere.utils.ConnectionManager;
import com.aetn.history.android.historyhere.utils.ShareUtils;
import com.aetn.history.android.historyhere.utils.TextUtils;
import com.aetn.history.android.historyhere.utils.UIUtils;
import com.aetn.history.android.historyhere.utils.Utils;
import com.aetn.history.android.historyhere.widgets.CustomViewPager;
import com.nirhart.parallaxscroll.views.ParallaxScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapOverlayDetailFragment extends Fragment
{

    private static final String KEY_ADDRESS1 = "address1";
    private static final String KEY_ADDRESS2 = "address2";
    private static final String KEY_CITY = "city";
    private static final String KEY_ID = "id";
    private static final String KEY_IMAGE_URL = "image_url";
    private static final String KEY_LATITUDE = "lat";
    private static final String KEY_LONGITUDE = "lng";
    private static final String KEY_STATE = "state";
    private static final String KEY_TITLE = "title";
    private static final String KEY_ZIP = "zip";
    private static final String TAG = "MapOverlayDetailFragment";
    private static Context appContext;
    private static Context mContext;
    private TextView address;
    private HistoryHereApplication app;
    private ImageView closeButton;
    private TextView description;
    private POIDetail detail;
    private View detailBottomNav;
    private ViewGroup detailView;
    private float downX;
    private float downY;
    private ImageView favoriteButton;
    private boolean isFavorite;
    private boolean mAnimateAtStart;
    private boolean mBeginningAnimationFinished;
    private boolean mDataLoaded;
    private float mGalleryScaleStart;
    private Handler mHidePhotoNumberHandler;
    private Runnable mHidePhotoNumberRunnable;
    private float mIconStartLeft;
    private float mIconStartTop;
    private int mImageWidth;
    private TextView mMorePhotosNumber;
    private View mMorePhotosNumberLayout;
    private MainNavigationActivity mNav;
    private CustomViewPager mPhotoGallery;
    private boolean mPhotoGalleryActive;
    private DetailPhotoPagerAdapter mPhotoGalleryAdapter;
    private ImageView mPhotoGalleryMask;
    private ArrayList mPhotos;
    private View mProgressBar;
    private ParallaxScrollView mScroller;
    private TextView mSmallAddress;
    private ViewGroup mSmallDetailsView;
    private TextView mSmallMileage;
    private TextView mSmallTitle;
    private View mThisView;
    private View mTouchLayer;
    private ViewGroup mainLayout;
    private ViewGroup menuLeft;
    private ViewGroup menuRight;
    private TextView mileage;
    private ImageView phoneButton;
    private android.view.View.OnClickListener phoneButtonOnClickListener;
    private View routeButton;
    private android.view.View.OnClickListener routeButtonOnClickListener;
    private ImageView shareButton;
    private POIDetail shortDetail;
    private ImageView showPoiInMapButton;
    private ViewGroup smallDetailHolder;
    private TextView title;
    private float upX;
    private float upY;
    private ImageView websiteButton;
    private android.view.View.OnClickListener websiteButtonOnClickListener;

    public MapOverlayDetailFragment()
    {
        mPhotoGalleryActive = false;
        isFavorite = false;
        mAnimateAtStart = false;
        downX = 0.0F;
        downY = 0.0F;
        upX = 0.0F;
        upY = 0.0F;
        mDataLoaded = false;
        mBeginningAnimationFinished = false;
        phoneButtonOnClickListener = new android.view.View.OnClickListener() {

            final MapOverlayDetailFragment this$0;

            public void onClick(View view)
            {
                view = new CallPhoneDialogFragment();
                view.setPOI(detail);
                view.show(getActivity().getSupportFragmentManager(), "CallPhoneDialogFragment");
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        };
        websiteButtonOnClickListener = new android.view.View.OnClickListener() {

            final MapOverlayDetailFragment this$0;

            public void onClick(View view)
            {
                view = detail.getWebsite();
                HashMap hashmap = new HashMap();
                hashmap.put("Link Location", view);
                mNav.tagLocalyticsEvent("External Link", hashmap);
                view = new Intent("android.intent.action.VIEW", Uri.parse(view));
                startActivity(view);
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        };
        routeButtonOnClickListener = new android.view.View.OnClickListener() {

            final MapOverlayDetailFragment this$0;

            public void onClick(View view)
            {
                Utils.logger("MapOverlayDetailFragment", "routeButtonOnClickListener");
                view = new DirectionsDialogFragment();
                view.setPOI(detail);
                view.show(getActivity().getSupportFragmentManager(), "DirectionsDialogFragment");
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        };
    }

    private void animateInNavItems()
    {
        if (mPhotoGalleryActive)
        {
            mMorePhotosNumberLayout.setVisibility(0);
        }
        description.setVisibility(0);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(description, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration(500);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(detailBottomNav, "translationY", new float[] {
            UIUtils.getDeviceIndependentFloat(getActivity(), 200F), UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F)
        });
        objectanimator1.setDuration(500);
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(mMorePhotosNumberLayout, "translationX", new float[] {
            UIUtils.getDeviceIndependentFloat(getActivity(), 400F), UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F)
        });
        objectanimator2.setDuration(500);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.addListener(new android.animation.Animator.AnimatorListener() {

            final MapOverlayDetailFragment this$0;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                setScrollerPosition();
                setPhotoNumber();
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        });
        animatorset.play(objectanimator1).with(objectanimator2).with(objectanimator);
        animatorset.start();
    }

    private void animatePartialHidePhotoNumber()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mMorePhotosNumberLayout, "translationX", new float[] {
            UIUtils.getDeviceIndependentFloat(mContext, 60F)
        });
        objectanimator.setRepeatCount(0);
        objectanimator.setDuration(500L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator);
        animatorset.start();
    }

    private void animateShowHidePhotoNumber()
    {
        animateShowPhotoNumber();
        mHidePhotoNumberHandler.removeCallbacks(mHidePhotoNumberRunnable);
        mHidePhotoNumberHandler.postDelayed(mHidePhotoNumberRunnable, 1000L);
    }

    private void animateShowPhotoNumber()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mMorePhotosNumberLayout, "translationX", new float[] {
            UIUtils.getDeviceIndependentFloat(mContext, 0.0F)
        });
        objectanimator.setRepeatCount(0);
        objectanimator.setDuration(500L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator);
        animatorset.start();
    }

    private String createShareEmailContent()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (detail.getImage().length() > 1)
        {
            (new StringBuilder()).append("<img src='").append(detail.getImage()).append("' width='200' height='200' /><br />").toString();
        }
        stringbuilder.append((new StringBuilder()).append("Check out what I found on <b>").append(detail.getTitle()).append("</b>").toString());
        stringbuilder.append((new StringBuilder()).append("<b>").append(detail.getTitle()).append("</b><br /><i>").append(detail.getFormattedAddress()).append("</i><br />").toString());
        stringbuilder.append(detail.getDescription());
        Log.i("MapOverlayDetailFragment", stringbuilder.toString());
        return stringbuilder.toString();
    }

    private Map getAnalayticsParams()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("poi_id", detail.getId());
        hashmap.put("poi_title", detail.getTitle());
        return hashmap;
    }

    private void init()
    {
        mSmallDetailsView.setVisibility(0);
        mTouchLayer.setVisibility(0);
        setDetailImageDimens();
        initMainLayout();
        setListeners();
        setLimitedData();
        mScroller.allowSwiping(false);
        mPhotoGallery.allowSwiping(false);
    }

    private void makeDetailRequest()
    {
        Utils.logger("MapOverlayDetailFragment", (new StringBuilder()).append("showMainDetail():").append(shortDetail.getId()).toString());
        if (mDataLoaded)
        {
            return;
        }
        if (!ConnectionManager.isNetworkAvailable(getActivity()))
        {
            ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003c));
            (new Handler()).postDelayed(new Runnable() {

                final MapOverlayDetailFragment this$0;

                public void run()
                {
                    mNav.animateCloseMapDetail();
                }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
            }, 1000L);
            return;
        } else
        {
            PoiManager.getInstance(getActivity()).setOnDetailLoadedListener(new com.aetn.history.android.historyhere.model.PoiManager.PoiDetailLoadedListener() {

                final MapOverlayDetailFragment this$0;

                public void onPoiDetailLoadFailed()
                {
                    ((MainNavigationActivity)getActivity()).manageDetailNotLoaded(getActivity().getResources().getString(0x7f0d003d));
                    (new Handler()).postDelayed(new Runnable() {

                        final _cls3 this$1;

                        public void run()
                        {
                            mNav.animateCloseMapDetail();
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    }, 1000L);
                }

                public void onPoiDetailLoaded(POIDetail poidetail)
                {
                    setRemainingData();
                }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
            });
            PoiManager.getInstance(getActivity()).getPOIDetailFromService(getActivity(), shortDetail.getId());
            return;
        }
    }

    public static MapOverlayDetailFragment newInstance(POIDetail poidetail)
    {
        MapOverlayDetailFragment mapoverlaydetailfragment = new MapOverlayDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("id", poidetail.getId());
        bundle.putString("title", poidetail.getTitle());
        bundle.putString("image_url", poidetail.getImage());
        bundle.putString("address1", poidetail.getAddress().getAddress1());
        bundle.putString("address2", poidetail.getAddress().getAddress2());
        bundle.putString("city", poidetail.getAddress().getCity());
        bundle.putString("state", poidetail.getAddress().getState());
        bundle.putString("zip", poidetail.getAddress().getZip());
        bundle.putDouble("lat", poidetail.getLatitude());
        bundle.putDouble("lng", poidetail.getLongitude());
        mapoverlaydetailfragment.setArguments(bundle);
        return mapoverlaydetailfragment;
    }

    private void sendShareEmail()
    {
        Utils.logger("MapOverlayDetailFragment", "sendShareEmail");
        String s = HistoryHereApplication.getConfiguration().shareTemplates.email.subject.replace("[title]", detail.getTitle());
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setFlags(0x10000000);
        intent.setType("text/html");
        intent.putExtra("android.intent.extra.SUBJECT", s);
        intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(createShareEmailContent()));
        appContext.startActivity(intent);
    }

    private void setDetailImageDimens()
    {
        Object obj = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        mImageWidth = ((DisplayMetrics) (obj)).widthPixels;
        obj = new android.widget.FrameLayout.LayoutParams(mImageWidth - 2, mImageWidth - 2);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(mImageWidth, mImageWidth);
        mPhotoGallery.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        mPhotoGallery.setPivotX(0.0F);
        mPhotoGallery.setPivotY(0.0F);
        mPhotoGalleryMask.setLayoutParams(layoutparams);
        mPhotoGalleryMask.setPivotX(0.0F);
        mPhotoGalleryMask.setPivotY(0.0F);
    }

    private void setFavoriteButton()
    {
        if (isFavorite)
        {
            favoriteButton.setImageResource(0x7f0200b3);
            return;
        } else
        {
            favoriteButton.setImageResource(0x7f0200b2);
            return;
        }
    }

    private void setListeners()
    {
        mTouchLayer.setOnTouchListener(new android.view.View.OnTouchListener() {

            final MapOverlayDetailFragment this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                switch (motionevent.getAction())
                {
                default:
                    return false;

                case 0: // '\0'
                    downX = motionevent.getX();
                    downY = motionevent.getY();
                    Utils.logger("MapOverlayDetailFragment", (new StringBuilder()).append("onTouch(): GOT ACTION_DOWN: downY:").append(downY).toString());
                    return true;

                case 1: // '\001'
                    upX = motionevent.getX();
                    break;
                }
                upY = motionevent.getY();
                float f = downY - upY;
                Utils.logger("MapOverlayDetailFragment", (new StringBuilder()).append("onTouch(): -- GOT ACTION_DOWN: downY:").append(downY).toString());
                Utils.logger("MapOverlayDetailFragment", (new StringBuilder()).append("onTouch(): -- GOT ACTION_UP: upY:").append(upY).toString());
                Utils.logger("MapOverlayDetailFragment", (new StringBuilder()).append("onTouch(): -- GOT ACTION_UP: deltaY:").append(f).toString());
                if (downY == upY)
                {
                    mNav.animateOpenMapDetail();
                    return true;
                }
                if (f > 30F)
                {
                    Utils.logger("MapOverlayDetailFragment", (new StringBuilder()).append("onTouch(): this is considered an up swipe: close the detail: ").append(f).toString());
                    ((MainNavigationActivity)getActivity()).hideDetailPager();
                    return true;
                } else
                {
                    Utils.logger("MapOverlayDetailFragment", "onTouch(): this is considered an down swipe: close the detail");
                    mNav.animateOpenMapDetail();
                    return true;
                }
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        });
        mPhotoGallery.setOnTouchListener(new android.view.View.OnTouchListener() {

            final MapOverlayDetailFragment this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        });
        phoneButton.setOnClickListener(phoneButtonOnClickListener);
        websiteButton.setOnClickListener(websiteButtonOnClickListener);
        shareButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayDetailFragment this$0;

            public void onClick(View view)
            {
                view = new HashMap();
                view.put("Share Method", "Generic Share");
                view.put("Content Shared", detail.getTitle());
                mNav.tagLocalyticsEvent("Share", view);
                ShareUtils.shareDetail(getActivity(), detail);
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        });
        routeButton.setOnClickListener(routeButtonOnClickListener);
        favoriteButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayDetailFragment this$0;

            public void onClick(View view)
            {
                toggleFavorite();
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        });
        closeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayDetailFragment this$0;

            public void onClick(View view)
            {
                mNav.animateCloseMapDetail();
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        });
        showPoiInMapButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MapOverlayDetailFragment this$0;

            public void onClick(View view)
            {
                ((MainNavigationActivity)getActivity()).showMap(detail);
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        });
    }

    private void setPhotoNumber()
    {
        if (mPhotoGalleryActive)
        {
            animateShowHidePhotoNumber();
        }
    }

    private void setScrollerPosition()
    {
        if (shortDetail.getImage().isEmpty())
        {
            mScroller.smoothScrollTo(0, UIUtils.getDeviceIndependentPixels(getActivity(), 200));
        }
    }

    private void toggleFavorite()
    {
        Utils.logger("MapOverlayDetailFragment", "toggleFavorite()");
        Object obj;
        boolean flag;
        if (isFavorite)
        {
            PreferenceManager.removeFavorite(getActivity(), detail.getId());
            obj = getActivity().getResources().getString(0x7f0d0061);
        } else
        {
            PreferenceManager.addFavorite(getActivity(), detail.getId());
            obj = new HashMap();
            ((Map) (obj)).put("Content Favorited", detail.getTitle());
            mNav.tagLocalyticsEvent("Favorite", ((Map) (obj)));
            obj = getActivity().getResources().getString(0x7f0d000f);
        }
        if (!isFavorite)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isFavorite = flag;
        setFavoriteButton();
        app.showToast(((String) (obj)), 0);
    }

    public void animateInMainLayout()
    {
        makeDetailRequest();
        mTouchLayer.setVisibility(8);
        mainLayout.setVisibility(0);
        detailBottomNav.setVisibility(0);
        mSmallDetailsView.setVisibility(8);
        float f = UIUtils.getDeviceIndependentFloat(getActivity(), 1000F);
        float f1 = UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F);
        AnimatorSet animatorset = new AnimatorSet();
        final AnimatorSet set2 = new AnimatorSet();
        final ObjectAnimator animator2 = ObjectAnimator.ofFloat(mainLayout, "translationY", new float[] {
            f, f1
        });
        animator2.setDuration(500);
        ObjectAnimator.ofFloat(mPhotoGallery, "alpha", new float[] {
            0.0F, 1.0F
        }).setDuration(500);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mPhotoGallery, "scaleX", new float[] {
            1.0F
        });
        objectanimator.setDuration(500);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mPhotoGallery, "scaleY", new float[] {
            1.0F
        });
        objectanimator1.setDuration(500);
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(mPhotoGallery, "translationX", new float[] {
            0.0F
        });
        objectanimator2.setDuration(500);
        ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(mPhotoGallery, "translationY", new float[] {
            0.0F
        });
        objectanimator3.setDuration(500);
        ObjectAnimator objectanimator4 = ObjectAnimator.ofFloat(mPhotoGalleryMask, "scaleX", new float[] {
            1.0F
        });
        objectanimator4.setDuration(500);
        ObjectAnimator objectanimator5 = ObjectAnimator.ofFloat(mPhotoGalleryMask, "scaleY", new float[] {
            1.0F
        });
        objectanimator5.setDuration(500);
        ObjectAnimator objectanimator6 = ObjectAnimator.ofFloat(mPhotoGalleryMask, "translationX", new float[] {
            0.0F
        });
        objectanimator6.setDuration(500);
        ObjectAnimator objectanimator7 = ObjectAnimator.ofFloat(mPhotoGalleryMask, "translationY", new float[] {
            0.0F
        });
        objectanimator7.setDuration(500);
        final ObjectAnimator photoMaskScaleXEnd = ObjectAnimator.ofFloat(mPhotoGalleryMask, "scaleX", new float[] {
            1.75F
        });
        photoMaskScaleXEnd.setDuration(500);
        final ObjectAnimator photoMaskScaleYEnd = ObjectAnimator.ofFloat(mPhotoGalleryMask, "scaleY", new float[] {
            1.75F
        });
        photoMaskScaleYEnd.setDuration(500);
        animatorset.addListener(new android.animation.Animator.AnimatorListener() {

            final MapOverlayDetailFragment this$0;
            final ObjectAnimator val$animator2;
            final ObjectAnimator val$photoMaskScaleXEnd;
            final ObjectAnimator val$photoMaskScaleYEnd;
            final AnimatorSet val$set2;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                mPhotoGalleryMask.setPivotX(mImageWidth / 2);
                mPhotoGalleryMask.setPivotY(mImageWidth / 2);
                set2.play(photoMaskScaleXEnd).with(photoMaskScaleYEnd).with(animator2);
                set2.start();
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                set2 = animatorset;
                photoMaskScaleXEnd = objectanimator;
                photoMaskScaleYEnd = objectanimator1;
                animator2 = objectanimator2;
                super();
            }
        });
        animatorset.play(objectanimator).with(objectanimator1).with(objectanimator2).with(objectanimator3).with(objectanimator4).with(objectanimator5).with(objectanimator6).with(objectanimator7);
        animatorset.start();
        set2.addListener(new android.animation.Animator.AnimatorListener() {

            final MapOverlayDetailFragment this$0;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                if (mDataLoaded)
                {
                    animateInNavItems();
                    setPhotoNumber();
                    mScroller.allowSwiping(true);
                    mPhotoGallery.allowSwiping(true);
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
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        });
    }

    public void animateOutMainLayout()
    {
        mScroller.smoothScrollTo(0, 0);
        mainLayout.setVisibility(0);
        float f = UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F);
        float f1 = UIUtils.getDeviceIndependentFloat(getActivity(), 1000F);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mainLayout, "translationY", new float[] {
            f, f1
        });
        objectanimator.setRepeatCount(0);
        objectanimator.setDuration(200);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mPhotoGallery, "alpha", new float[] {
            1.0F, 0.0F
        });
        objectanimator1.setRepeatCount(0);
        objectanimator1.setDuration(200);
        objectanimator1 = ObjectAnimator.ofFloat(detailBottomNav, "translationY", new float[] {
            UIUtils.getDeviceIndependentFloat(getActivity(), 0.0F), UIUtils.getDeviceIndependentFloat(getActivity(), 200F)
        });
        objectanimator1.setRepeatCount(0);
        objectanimator1.setDuration(200);
        final ObjectAnimator photoScaleX = ObjectAnimator.ofFloat(mPhotoGallery, "scaleX", new float[] {
            mGalleryScaleStart
        });
        photoScaleX.setDuration(200);
        final ObjectAnimator photoScaleY = ObjectAnimator.ofFloat(mPhotoGallery, "scaleY", new float[] {
            mGalleryScaleStart
        });
        photoScaleY.setDuration(200);
        final ObjectAnimator photoX = ObjectAnimator.ofFloat(mPhotoGallery, "translationX", new float[] {
            mIconStartLeft
        });
        photoX.setDuration(200);
        final ObjectAnimator photoY = ObjectAnimator.ofFloat(mPhotoGallery, "translationY", new float[] {
            mIconStartTop
        });
        photoY.setDuration(200);
        final ObjectAnimator photoMaskScaleX = ObjectAnimator.ofFloat(mPhotoGalleryMask, "scaleX", new float[] {
            mGalleryScaleStart
        });
        photoMaskScaleX.setDuration(200);
        final ObjectAnimator photoMaskScaleY = ObjectAnimator.ofFloat(mPhotoGalleryMask, "scaleY", new float[] {
            mGalleryScaleStart
        });
        photoMaskScaleY.setDuration(200);
        final ObjectAnimator photoMaskX = ObjectAnimator.ofFloat(mPhotoGalleryMask, "translationX", new float[] {
            mIconStartLeft
        });
        photoMaskX.setDuration(200);
        final ObjectAnimator photoMaskY = ObjectAnimator.ofFloat(mPhotoGalleryMask, "translationY", new float[] {
            mIconStartTop
        });
        photoMaskY.setDuration(200);
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(mPhotoGalleryMask, "scaleX", new float[] {
            1.0F
        });
        objectanimator2.setDuration(200);
        ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(mPhotoGalleryMask, "scaleY", new float[] {
            1.0F
        });
        objectanimator3.setDuration(200);
        final AnimatorSet set = new AnimatorSet();
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator2).with(objectanimator3).with(objectanimator1).with(objectanimator);
        animatorset.addListener(new android.animation.Animator.AnimatorListener() {

            final MapOverlayDetailFragment this$0;
            final ObjectAnimator val$photoMaskScaleX;
            final ObjectAnimator val$photoMaskScaleY;
            final ObjectAnimator val$photoMaskX;
            final ObjectAnimator val$photoMaskY;
            final ObjectAnimator val$photoScaleX;
            final ObjectAnimator val$photoScaleY;
            final ObjectAnimator val$photoX;
            final ObjectAnimator val$photoY;
            final AnimatorSet val$set;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                mPhotoGalleryMask.setPivotX(0.0F);
                mPhotoGalleryMask.setPivotY(0.0F);
                set.play(photoScaleX).with(photoScaleY).with(photoX).with(photoY).with(photoMaskScaleX).with(photoMaskScaleY).with(photoMaskX).with(photoMaskY);
                set.start();
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                set = animatorset;
                photoScaleX = objectanimator;
                photoScaleY = objectanimator1;
                photoX = objectanimator2;
                photoY = objectanimator3;
                photoMaskScaleX = objectanimator4;
                photoMaskScaleY = objectanimator5;
                photoMaskX = objectanimator6;
                photoMaskY = objectanimator7;
                super();
            }
        });
        set.addListener(new android.animation.Animator.AnimatorListener() {

            final MapOverlayDetailFragment this$0;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                if (mPhotoGalleryActive)
                {
                    init();
                    return;
                } else
                {
                    mScroller.allowSwiping(false);
                    mPhotoGallery.allowSwiping(false);
                    mSmallDetailsView.setVisibility(0);
                    mTouchLayer.setVisibility(0);
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
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        });
        mMorePhotosNumberLayout.setVisibility(4);
        animatorset.start();
    }

    public void initMainLayout()
    {
        mPhotoGallery.setVisibility(0);
        float f = UIUtils.getDeviceIndependentFloat(getActivity(), 1000F);
        mIconStartTop = UIUtils.getDeviceIndependentFloat(getActivity(), 10F);
        mIconStartLeft = UIUtils.getDeviceIndependentFloat(getActivity(), 40F);
        description.setVisibility(4);
        mainLayout.setVisibility(4);
        detailBottomNav.setVisibility(4);
        mMorePhotosNumberLayout.setVisibility(4);
        mainLayout.setTranslationY(f);
        detailBottomNav.setTranslationY(UIUtils.getDeviceIndependentFloat(getActivity(), 200F));
        mMorePhotosNumberLayout.setTranslationX(UIUtils.getDeviceIndependentFloat(getActivity(), 400F));
        mPhotoGallery.setScaleX(mGalleryScaleStart);
        mPhotoGallery.setScaleY(mGalleryScaleStart);
        mPhotoGalleryMask.setScaleX(mGalleryScaleStart);
        mPhotoGalleryMask.setScaleY(mGalleryScaleStart);
        mPhotoGallery.setTranslationX(mIconStartLeft);
        mPhotoGallery.setTranslationY(mIconStartTop);
        mPhotoGalleryMask.setTranslationX(mIconStartLeft);
        mPhotoGalleryMask.setTranslationY(mIconStartTop);
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
            String s = bundle.getString("address1");
            String s1 = bundle.getString("address2");
            String s2 = bundle.getString("city");
            String s3 = bundle.getString("state");
            String s4 = bundle.getString("zip");
            shortDetail.setAddress(s, s1, s2, s3, s4);
            shortDetail.setLocation(bundle.getDouble("lat"), bundle.getDouble("lng"));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03003e, viewgroup, false);
        mThisView = layoutinflater;
        mContext = getActivity();
        app = (HistoryHereApplication)getActivity().getApplication();
        mNav = (MainNavigationActivity)getActivity();
        appContext = mContext.getApplicationContext();
        mScroller = (ParallaxScrollView)layoutinflater.findViewById(0x7f0a005a);
        detailView = (ViewGroup)layoutinflater.findViewById(0x7f0a005b);
        mTouchLayer = layoutinflater.findViewById(0x7f0a00a7);
        title = (TextView)layoutinflater.findViewById(0x7f0a0041);
        TextUtils.setTypefaceSemibold(mContext, title);
        smallDetailHolder = (ViewGroup)layoutinflater.findViewById(0x7f0a0099);
        address = (TextView)layoutinflater.findViewById(0x7f0a0064);
        TextUtils.setTypefaceLight(mContext, address);
        description = (TextView)layoutinflater.findViewById(0x7f0a0065);
        mainLayout = (ViewGroup)layoutinflater.findViewById(0x7f0a005f);
        menuLeft = (ViewGroup)layoutinflater.findViewById(0x7f0a0082);
        menuRight = (ViewGroup)layoutinflater.findViewById(0x7f0a0086);
        phoneButton = (ImageView)layoutinflater.findViewById(0x7f0a0087);
        websiteButton = (ImageView)layoutinflater.findViewById(0x7f0a0089);
        favoriteButton = (ImageView)layoutinflater.findViewById(0x7f0a0083);
        routeButton = layoutinflater.findViewById(0x7f0a0062);
        showPoiInMapButton = (ImageView)layoutinflater.findViewById(0x7f0a008b);
        mileage = (TextView)layoutinflater.findViewById(0x7f0a0063);
        shareButton = (ImageView)layoutinflater.findViewById(0x7f0a0085);
        closeButton = (ImageView)layoutinflater.findViewById(0x7f0a0060);
        detailBottomNav = layoutinflater.findViewById(0x7f0a0066);
        mPhotoGallery = (CustomViewPager)layoutinflater.findViewById(0x7f0a005c);
        mPhotoGalleryMask = (ImageView)layoutinflater.findViewById(0x7f0a009a);
        mMorePhotosNumber = (TextView)layoutinflater.findViewById(0x7f0a005e);
        mMorePhotosNumberLayout = layoutinflater.findViewById(0x7f0a005d);
        mMorePhotosNumberLayout.setVisibility(4);
        mSmallDetailsView = (ViewGroup)layoutinflater.findViewById(0x7f0a009b);
        mSmallTitle = (TextView)layoutinflater.findViewById(0x7f0a009c);
        mSmallAddress = (TextView)layoutinflater.findViewById(0x7f0a009d);
        mSmallMileage = (TextView)layoutinflater.findViewById(0x7f0a009e);
        mProgressBar = layoutinflater.findViewById(0x7f0a009f);
        mHidePhotoNumberHandler = new Handler();
        mHidePhotoNumberRunnable = new Runnable() {

            final MapOverlayDetailFragment this$0;

            public void run()
            {
                animatePartialHidePhotoNumber();
            }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
        };
        viewgroup = getResources().getDisplayMetrics();
        Utils.logger("MapOverlayDetailFragment", (new StringBuilder()).append("onCreateView():metrics:").append(viewgroup).toString());
        if ((double)((DisplayMetrics) (viewgroup)).density < 3.5D)
        {
            mGalleryScaleStart = 0.25F;
        } else
        {
            mGalleryScaleStart = 0.23F;
        }
        init();
        return layoutinflater;
    }

    public void setLimitedData()
    {
        Utils.logger("MapOverlayDetailFragment", "setLimitedData()");
        Object obj = shortDetail.getImage();
        mPhotos = new ArrayList();
        mPhotoGalleryAdapter = new DetailPhotoPagerAdapter(getActivity(), mPhotos);
        if (!((String) (obj)).equals(""))
        {
            obj = new PhotoData(((String) (obj)), "");
            mPhotos.add(obj);
        } else
        {
            obj = new PhotoData("", "");
            mPhotos.add(obj);
        }
        mMorePhotosNumber.setVisibility(8);
        mPhotoGalleryActive = false;
        mPhotoGalleryAdapter.notifyDataSetChanged();
        mPhotoGallery.setAdapter(mPhotoGalleryAdapter);
        mPhotoGallery.setCurrentItem(0);
        title.setText(shortDetail.getTitle());
        address.setText(shortDetail.getFormattedAddress());
        mSmallTitle.setText(shortDetail.getTitle());
        mSmallAddress.setText(shortDetail.getFormattedAddress());
        obj = LocationManager.getInstance(getActivity()).getUsersLocation();
        if (obj != null)
        {
            double d = Utils.getDistanceBetweenLocations(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude(), shortDetail.getLatitude(), shortDetail.getLongitude(), "M");
            Utils.logger("MapOverlayDetailFragment", (new StringBuilder()).append("the distance is:").append(d).toString());
            d = (double)Math.round(10D * d) / 10D;
            String s;
            if (d > 20D)
            {
                d = Math.round(d);
                obj = (new StringBuilder()).append((int)d).append(" miles").toString();
                s = (new StringBuilder()).append((int)d).append(" mi").toString();
            } else
            {
                obj = (new StringBuilder()).append(d).append(" miles").toString();
                s = (new StringBuilder()).append(d).append(" mi").toString();
            }
            mileage.setText(s);
            mSmallMileage.setText(((CharSequence) (obj)));
            mSmallMileage.setVisibility(0);
            return;
        } else
        {
            mSmallMileage.setVisibility(8);
            return;
        }
    }

    public void setRemainingData()
    {
        Object obj;
        Utils.logger("MapOverlayDetailFragment", "setRemainingData()");
        mProgressBar.setVisibility(8);
        mDataLoaded = true;
        detail = PoiManager.getInstance(getActivity()).getCurrentPOIDetail();
        isFavorite = PreferenceManager.isFavorite(getActivity(), detail.getId());
        setFavoriteButton();
        obj = detail.getAssets();
        if (obj != null)
        {
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (com.aetn.history.android.historyhere.model.POIDetail.Asset)((Iterator) (obj)).next();
                if (((com.aetn.history.android.historyhere.model.POIDetail.Asset) (obj1)).isAssetTypeImage())
                {
                    obj1 = new PhotoData(((com.aetn.history.android.historyhere.model.POIDetail.Asset) (obj1)).getImageURL(), ((com.aetn.history.android.historyhere.model.POIDetail.Asset) (obj1)).getImageCredit());
                    mPhotos.add(obj1);
                }
            } while (true);
        }
        Utils.logger("MapOverlayDetailFragment", (new StringBuilder()).append("setData(): there are # of photos:").append(mPhotos.size()).toString());
        if (mPhotos.size() > 1)
        {
            mPhotoGalleryAdapter.notifyDataSetChanged();
            mPhotoGallery.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

                final MapOverlayDetailFragment this$0;

                public void onPageScrollStateChanged(int i)
                {
                }

                public void onPageScrolled(int i, float f, int j)
                {
                }

                public void onPageSelected(int i)
                {
                    mMorePhotosNumber.setText((new StringBuilder()).append(mPhotoGallery.getCurrentItem() + 1).append(" of ").append(mPhotos.size()).toString());
                    animateShowHidePhotoNumber();
                }

            
            {
                this$0 = MapOverlayDetailFragment.this;
                super();
            }
            });
            mMorePhotosNumber.setVisibility(0);
            mMorePhotosNumber.setText((new StringBuilder()).append(mPhotoGallery.getCurrentItem() + 1).append(" of ").append(mPhotos.size()).toString());
            mPhotoGalleryActive = true;
        } else
        {
            mMorePhotosNumber.setVisibility(8);
            mPhotoGalleryActive = false;
        }
        obj = mNav;
        if (MainNavigationActivity.isMapTypeTours())
        {
            menuLeft.removeView(favoriteButton);
            shareButton.setBackgroundDrawable(getResources().getDrawable(0x7f02010a));
            menuLeft.findViewById(0x7f0a0084).setVisibility(8);
        }
        description.setText(detail.getDescription());
        if (detail.getFormattedPhoneNumber().length() < 5)
        {
            menuRight.removeView(phoneButton);
            menuRight.removeView(mThisView.findViewById(0x7f0a0088));
            websiteButton.setBackgroundDrawable(getResources().getDrawable(0x7f020105));
        }
        if (detail.getWebsite().length() < 5)
        {
            menuRight.removeView(websiteButton);
            menuRight.removeView(mThisView.findViewById(0x7f0a008a));
        }
        if (detail.getWebsite().length() < 5 && detail.getFormattedPhoneNumber().length() < 5)
        {
            showPoiInMapButton.setBackgroundDrawable(getResources().getDrawable(0x7f02010a));
        }
        obj = new View(getActivity());
        ((View) (obj)).setMinimumHeight(10);
        detailView.addView(((View) (obj)));
        obj = Utils.getFormattedLocalyticsTag("HH:Places:*", detail.getTitle());
        if (!isFavorite) goto _L2; else goto _L1
_L1:
        obj = Utils.getFormattedLocalyticsTag("HH:Favorites:*", detail.getTitle());
_L4:
        mNav.tagLocalyticsScreen(((String) (obj)));
        if (MainNavigationActivity.isMapTypeTours())
        {
            mNav.localyticsIncrementTourPoiViewedCount();
        }
        if (mBeginningAnimationFinished)
        {
            animateInNavItems();
            setPhotoNumber();
            mScroller.allowSwiping(true);
            mPhotoGallery.allowSwiping(true);
        }
        mNav.checkForRateReminder();
        return;
_L2:
        MainNavigationActivity mainnavigationactivity = mNav;
        if (MainNavigationActivity.isMapTypeTours())
        {
            obj = Utils.getFormattedLocalyticsTag("HH:Tours:*", PoiManager.getInstance(getActivity()).getCurrentTourDetailPOI().getTitle());
            obj = (new StringBuilder()).append(((String) (obj))).append(":").append(Utils.cleanString(detail.getTitle())).toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }






/*
    static boolean access$1202(MapOverlayDetailFragment mapoverlaydetailfragment, boolean flag)
    {
        mapoverlaydetailfragment.mBeginningAnimationFinished = flag;
        return flag;
    }

*/







/*
    static float access$1802(MapOverlayDetailFragment mapoverlaydetailfragment, float f)
    {
        mapoverlaydetailfragment.downX = f;
        return f;
    }

*/



/*
    static float access$1902(MapOverlayDetailFragment mapoverlaydetailfragment, float f)
    {
        mapoverlaydetailfragment.downY = f;
        return f;
    }

*/



/*
    static float access$2002(MapOverlayDetailFragment mapoverlaydetailfragment, float f)
    {
        mapoverlaydetailfragment.upX = f;
        return f;
    }

*/



/*
    static float access$2102(MapOverlayDetailFragment mapoverlaydetailfragment, float f)
    {
        mapoverlaydetailfragment.upY = f;
        return f;
    }

*/









}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.bind.async.DelayedRunnable;
import com.google.android.libraries.bind.bidi.BidiPagingHelper;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.DataList;
import com.google.android.libraries.bind.data.DataPagerAdapter;
import com.google.android.libraries.bind.logging.Logd;
import com.google.android.libraries.bind.util.Util;
import com.google.android.libraries.bind.view.ViewHeap;
import com.google.android.play.widget.RaindropMaskDrawable;
import com.google.android.play.widget.UserAwareViewPager;

// Referenced classes of package com.google.android.play.onboard:
//            OnboardBaseFragment, OnboardHostControl, OnboardPager, OnboardPagerAdapter, 
//            OnboardNavFooter, OnboardPage, OnboardPageInfo

public abstract class OnboardHostFragment extends OnboardBaseFragment
    implements OnboardHostControl
{

    private static final Logd LOGD = Logd.get(com/google/android/play/onboard/OnboardHostFragment);
    protected static final String STATE_ONBOARD_BUNDLE = (new StringBuilder()).append(STATE_PREFIX).append("onboardBundle").toString();
    private static final String STATE_PREFIX = (new StringBuilder()).append(com/google/android/play/onboard/OnboardHostFragment.getSimpleName()).append("_").toString();
    protected static final String STATE_SELECTED_PAGE_ID = (new StringBuilder()).append(STATE_PREFIX).append("selectedPageId").toString();
    protected static final String STATE_SHOWED_SPLASH = (new StringBuilder()).append(STATE_PREFIX).append("showedSplash").toString();
    protected static final String STATE_SHOWING_INTERSTITIAL_OVERLAY = (new StringBuilder()).append(STATE_PREFIX).append("showingInterstitialOverlay").toString();
    protected static final String STATE_SHOWING_LOADING_OVERLAY = (new StringBuilder()).append(STATE_PREFIX).append("showingLoadingOverlay").toString();
    protected OnboardPagerAdapter mAdapter;
    protected ImageView mDrops;
    protected String mLastSelectedPageId;
    protected OnboardNavFooter mNavFooter;
    protected Bundle mOnboardBundle;
    protected OnboardPager mPager;
    protected FrameLayout mRootView;
    protected boolean mShowedSplash;
    protected View mSplash;
    private final DelayedRunnable mUpdateControlsRunnable;

    public OnboardHostFragment()
    {
        super(0x7f04011f);
        mUpdateControlsRunnable = new DelayedRunnable(mHandler, new Runnable() {

            final OnboardHostFragment this$0;

            public final void run()
            {
                updateControls();
            }

            
            {
                this$0 = OnboardHostFragment.this;
                super();
            }
        });
    }

    private void goToPage(int i, boolean flag)
    {
        mPager.setCurrentItem(BidiPagingHelper.getVisualPosition(mAdapter, i), flag);
        mPager.requestFocus();
    }

    protected static void onPageScrolled$486775f1()
    {
    }

    public void finishOnboardFlow()
    {
        saveOnboardState(mOnboardBundle);
    }

    public final int getAppColor()
    {
        return getResources().getColor(0x7f0b0280);
    }

    public final int getCurrentPageIndex()
    {
        if (mPager != null)
        {
            return mPager.getCurrentLogicalItem();
        } else
        {
            return -1;
        }
    }

    public final View getCurrentPageView()
    {
        if (mAdapter != null)
        {
            return mAdapter.tryGetViewAt(getCurrentPageIndex());
        } else
        {
            return null;
        }
    }

    public abstract DataList getPageList();

    protected final void goToInitialOrRestoredPage()
    {
        String s = mOnboardBundle.getString(STATE_SELECTED_PAGE_ID);
        Object obj = s;
        if (s == null)
        {
            obj = super.mArguments;
            int i;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((Bundle) (obj)).getString("arg_initialPageId");
            }
        }
        if (obj != null)
        {
            i = mAdapter.getLogicalItemPosition(obj);
            if (i >= 0)
            {
                goToPage(i, false);
            }
        } else
        {
            goToPage(0, false);
        }
        onPageSelected$2563266(getCurrentPageIndex());
    }

    public void goToNextPage()
    {
        incrementPage$13462e();
    }

    public final void incrementPage$13462e()
    {
        int i = getCurrentPageIndex() + 1;
        if (i >= 0 && i < mAdapter.getCount())
        {
            goToPage(i, true);
        }
    }

    protected final void onPageSelected$2563266(int i)
    {
        String s = (String)getPageList().getItemId(i);
        mAdapter.tryGetViewAt(i);
        if (!Util.objectsEqual(s, mLastSelectedPageId))
        {
            i = getPageList().findPositionForId(mLastSelectedPageId);
            mAdapter.tryGetViewAt(i);
            mLastSelectedPageId = s;
        }
        mUpdateControlsRunnable.postDelayed$25666f8(0L);
    }

    public final void onResume()
    {
        super.onResume();
        if (mShowedSplash)
        {
            mSplash.setVisibility(8);
            mDrops.setVisibility(8);
            return;
        } else
        {
            final RaindropMaskDrawable dropsDrawable = new RaindropMaskDrawable(getAppColor(), super.mActivity.getResources().getInteger(0x7f0e006f), super.mActivity.getResources().getInteger(0x7f0e0070));
            dropsDrawable.mStoppedRunnable = new Runnable() {

                final OnboardHostFragment this$0;

                public final void run()
                {
                    mDrops.setVisibility(8);
                }

            
            {
                this$0 = OnboardHostFragment.this;
                super();
            }
            };
            mDrops.setImageDrawable(dropsDrawable);
            Logd logd = LOGD;
            safelyPostDelayed(new Runnable() {

                final OnboardHostFragment this$0;
                final RaindropMaskDrawable val$dropsDrawable;

                public final void run()
                {
                    mShowedSplash = true;
                    AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
                    alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                        final _cls7 this$1;

                        public final void onAnimationEnd(Animation animation)
                        {
                            Logd _tmp = OnboardHostFragment.LOGD;
                            mSplash.setVisibility(8);
                            dropsDrawable.start();
                        }

                        public final void onAnimationRepeat(Animation animation)
                        {
                        }

                        public final void onAnimationStart(Animation animation)
                        {
                        }

            
            {
                this$1 = _cls7.this;
                super();
            }
                    });
                    alphaanimation.setDuration(200L);
                    mSplash.startAnimation(alphaanimation);
                }

            
            {
                this$0 = OnboardHostFragment.this;
                dropsDrawable = raindropmaskdrawable;
                super();
            }
            }, super.mActivity.getResources().getInteger(0x7f0e0072));
            return;
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        saveOnboardState(mOnboardBundle);
        bundle.putBundle(STATE_ONBOARD_BUNDLE, mOnboardBundle);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mRootView = (FrameLayout)view;
        mPager = (OnboardPager)view.findViewById(0x7f0d0326);
        mNavFooter = (OnboardNavFooter)view.findViewById(0x7f0d0327);
        mSplash = view.findViewById(0x7f0d032d);
        mDrops = (ImageView)view.findViewById(0x7f0d0328);
        if (bundle != null)
        {
            mOnboardBundle = bundle.getBundle(STATE_ONBOARD_BUNDLE);
        }
        if (mOnboardBundle == null)
        {
            mOnboardBundle = new Bundle();
        }
        restoreOnboardState(mOnboardBundle);
        mAdapter = new OnboardPagerAdapter(new ViewHeap(super.mActivity)) {

            final OnboardHostFragment this$0;

            public final Object instantiateItem(ViewGroup viewgroup, int i)
            {
                viewgroup = ((ViewGroup) (super.instantiateItem(viewgroup, i)));
                View view1 = tryGetViewAt(BidiPagingHelper.getLogicalPosition(this, i));
                if (view1 instanceof OnboardPage)
                {
                    Object obj = (OnboardPage)view1;
                    ((OnboardPage) (obj)).setOnboardHostControl(OnboardHostFragment.this);
                    Bundle bundle1 = mOnboardBundle;
                    obj = ((OnboardPage) (obj)).getPageInfo();
                    if (((OnboardPageInfo) (obj)).shouldAdjustPagePaddingToFitNavFooter$5669347f())
                    {
                        OnboardHostFragment onboardhostfragment = OnboardHostFragment.this;
                        if (((OnboardPageInfo) (obj)).isNavFooterVisible$5669347f())
                        {
                            i = onboardhostfragment.getResources().getDimensionPixelSize(0x7f0c030f);
                        } else
                        {
                            i = 0;
                        }
                        ViewCompat.setPaddingRelative(view1, ViewCompat.getPaddingStart(view1), view1.getPaddingTop(), ViewCompat.getPaddingEnd(view1), i);
                    }
                }
                return viewgroup;
            }

            public final void onDestroyedView(View view1)
            {
                super.onDestroyedView(view1);
                if (view1 instanceof OnboardPage)
                {
                    view1 = mOnboardBundle;
                }
            }

            
            {
                this$0 = OnboardHostFragment.this;
                super(viewheap);
            }
        };
        view = mAdapter;
        bundle = getPageList();
        if (((DataPagerAdapter) (view)).list != null)
        {
            ((DataPagerAdapter) (view)).list.unregisterDataObserver(((DataPagerAdapter) (view)).observer);
        }
        view.list = bundle;
        if (bundle != null)
        {
            bundle.registerDataObserver(((DataPagerAdapter) (view)).observer);
        }
        view.notifyDataSetChanged();
        mPager.mOnPageChangeListener = new com.google.android.play.widget.UserAwareViewPager.UserAwareOnPageChangeListener(mPager) {

            final OnboardHostFragment this$0;

            public final void onPageScrolled(int i, float f, int j)
            {
                super.onPageScrolled(i, f, j);
                OnboardHostFragment.onPageScrolled$486775f1();
            }

            public final void onPageSelected(int i, boolean flag)
            {
                super.onPageSelected(i, flag);
                i = BidiPagingHelper.getLogicalPosition(mAdapter, i);
                onPageSelected$2563266(i);
            }

            
            {
                this$0 = OnboardHostFragment.this;
                super(userawareviewpager);
            }
        };
        mPager.setAdapter(mAdapter);
        safelyPost(new Runnable() {

            final OnboardHostFragment this$0;

            public final void run()
            {
                goToInitialOrRestoredPage();
            }

            
            {
                this$0 = OnboardHostFragment.this;
                super();
            }
        });
    }

    public final void replaceViewByIdAtIndex$17e143a3(View view, int i)
    {
        View view1 = mRootView.findViewById(0x7f0d005d);
        if (view1 != view)
        {
            if (view1 != null)
            {
                mRootView.removeView(view1);
            }
            if (view != null)
            {
                view.setId(0x7f0d005d);
                mRootView.addView(view, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public void restoreOnboardState(Bundle bundle)
    {
        mShowedSplash = bundle.getBoolean(STATE_SHOWED_SPLASH);
    }

    public void saveOnboardState(Bundle bundle)
    {
        for (int i = 0; i < mPager.getChildCount(); i++)
        {
            mPager.getChildAt(i);
        }

        String s1 = STATE_SELECTED_PAGE_ID;
        Object obj = null;
        int j = getCurrentPageIndex();
        String s = obj;
        if (mAdapter != null)
        {
            DataList datalist = ((DataPagerAdapter) (mAdapter)).list;
            s = obj;
            if (datalist != null)
            {
                Data data = datalist.getData(j);
                s = obj;
                if (data != null)
                {
                    s = data.getAsString(datalist.primaryKey());
                }
            }
        }
        bundle.putString(s1, s);
        bundle.putBoolean(STATE_SHOWED_SPLASH, mShowedSplash);
    }

    protected final void updateControls()
    {
        Object obj = mAdapter.tryGetViewAt(getCurrentPageIndex());
        if (obj instanceof OnboardPage)
        {
            obj = ((OnboardPage)obj).getPageInfo();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            updateUiForPage(((OnboardPageInfo) (obj)));
        }
    }

    public void updateUiForPage(OnboardPageInfo onboardpageinfo)
    {
        mNavFooter.updatePageInfo(this, onboardpageinfo);
        mPager.setAllowSwipeToNext(onboardpageinfo.allowSwipeToNext$5669347f());
        mPager.setAllowSwipeToPrevious(onboardpageinfo.allowSwipeToPrevious$5669347f());
    }


}

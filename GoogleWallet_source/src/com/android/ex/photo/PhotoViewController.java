// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.android.ex.photo.adapters.PhotoPagerAdapter;
import com.android.ex.photo.fragments.PhotoViewFragment;
import com.android.ex.photo.loaders.PhotoBitmapLoader;
import com.android.ex.photo.loaders.PhotoPagerLoader;
import com.android.ex.photo.util.ImageUtils;
import com.android.ex.photo.util.Util;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.ex.photo:
//            PhotoViewCallbacks, PhotoViewPager, ActionBarInterface

public class PhotoViewController
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.view.ViewPager.OnPageChangeListener, ActionBarInterface.OnMenuVisibilityListener, PhotoViewCallbacks, PhotoViewPager.OnInterceptTouchListener
{
    public static interface ActivityInterface
    {

        public abstract View findViewById(int i);

        public abstract void finish();

        public abstract ActionBarInterface getActionBarInterface();

        public abstract Context getApplicationContext();

        public abstract Context getContext();

        public abstract PhotoViewController getController();

        public abstract Intent getIntent();

        public abstract Resources getResources();

        public abstract FragmentManager getSupportFragmentManager();

        public abstract LoaderManager getSupportLoaderManager();

        public abstract void overridePendingTransition(int i, int j);

        public abstract void setContentView(int i);
    }

    final class BitmapCallback
        implements android.support.v4.app.LoaderManager.LoaderCallbacks
    {

        final PhotoViewController this$0;

        private void onLoadFinished(Loader loader, com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult bitmapresult)
        {
            bitmapresult = bitmapresult.getDrawable(mActivity.getResources());
            ActionBarInterface actionbarinterface = mActivity.getActionBarInterface();
            switch (loader.getId())
            {
            default:
                return;

            case 2: // '\002'
                initTemporaryImage(bitmapresult);
                return;

            case 1: // '\001'
                break;
            }
            if (bitmapresult == null)
            {
                actionbarinterface.setLogo(null);
                return;
            } else
            {
                actionbarinterface.setLogo(bitmapresult);
                return;
            }
        }

        public final Loader onCreateLoader(int i, Bundle bundle)
        {
            String s = bundle.getString("image_uri");
            switch (i)
            {
            default:
                return null;

            case 2: // '\002'
                return onCreateBitmapLoader(2, bundle, s);

            case 1: // '\001'
                return onCreateBitmapLoader(1, bundle, s);
            }
        }

        public final volatile void onLoadFinished(Loader loader, Object obj)
        {
            onLoadFinished(loader, (com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult)obj);
        }

        public final void onLoaderReset(Loader loader)
        {
        }

        private BitmapCallback()
        {
            this$0 = PhotoViewController.this;
            super();
        }

    }


    public static int sMaxPhotoSize;
    public static int sMemoryClass;
    private final AccessibilityManager mAccessibilityManager;
    protected boolean mActionBarHiddenInitially;
    protected String mActionBarSubtitle;
    protected String mActionBarTitle;
    private final ActivityInterface mActivity;
    protected PhotoPagerAdapter mAdapter;
    protected int mAlbumCount;
    protected int mAnimationStartHeight;
    protected int mAnimationStartWidth;
    protected int mAnimationStartX;
    protected int mAnimationStartY;
    protected View mBackground;
    protected BitmapCallback mBitmapCallback;
    private int mCurrentPhotoIndex;
    private String mCurrentPhotoUri;
    private final Set mCursorListeners = new HashSet();
    protected boolean mDisplayThumbsFullScreen;
    private boolean mEnterAnimationFinished;
    private long mEnterFullScreenDelayTime;
    private final Runnable mEnterFullScreenRunnable = new Runnable() {

        final PhotoViewController this$0;

        public final void run()
        {
            setFullScreen(true, true);
        }

            
            {
                this$0 = PhotoViewController.this;
                super();
            }
    };
    protected boolean mFullScreen;
    protected final Handler mHandler = new Handler();
    private String mInitialPhotoUri;
    private boolean mIsDestroyedCompat;
    protected boolean mIsEmpty;
    protected boolean mIsPaused;
    private boolean mKickLoader;
    private int mLastFlags;
    protected float mMaxInitialScale;
    private String mPhotosUri;
    private String mProjection[];
    protected View mRootView;
    protected boolean mScaleAnimationEnabled;
    private final Map mScreenListeners = new HashMap();
    private final android.view.View.OnSystemUiVisibilityChangeListener mSystemUiVisibilityChangeListener;
    protected ImageView mTemporaryImage;
    protected PhotoViewPager mViewPager;

    public PhotoViewController(ActivityInterface activityinterface)
    {
        mAlbumCount = -1;
        mIsPaused = true;
        mActivity = activityinterface;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            mSystemUiVisibilityChangeListener = null;
        } else
        {
            mSystemUiVisibilityChangeListener = new android.view.View.OnSystemUiVisibilityChangeListener() {

                final PhotoViewController this$0;

                public final void onSystemUiVisibilityChange(int i)
                {
                    if (android.os.Build.VERSION.SDK_INT >= 19 && i == 0 && mLastFlags == 3846)
                    {
                        setFullScreen(false, true);
                    }
                }

            
            {
                this$0 = PhotoViewController.this;
                super();
            }
            };
        }
        mAccessibilityManager = (AccessibilityManager)activityinterface.getContext().getSystemService("accessibility");
    }

    private static int calculateTranslate(int i, int j, int k, float f)
    {
        return i - Math.round(((float)k - (float)k * f) / 2.0F) - Math.round(((float)k * f - (float)j) / 2.0F);
    }

    private void cancelEnterFullScreenRunnable()
    {
        mHandler.removeCallbacks(mEnterFullScreenRunnable);
    }

    private PhotoPagerAdapter createPhotoPagerAdapter(Context context, FragmentManager fragmentmanager, Cursor cursor, float f)
    {
        return new PhotoPagerAdapter(context, fragmentmanager, cursor, f, mDisplayThumbsFullScreen);
    }

    private View findViewById(int i)
    {
        return mActivity.findViewById(i);
    }

    private Cursor getCursorAtProperPosition()
    {
        if (mViewPager == null)
        {
            return null;
        }
        int i = mViewPager.getCurrentItem();
        Cursor cursor = mAdapter.getCursor();
        if (cursor == null)
        {
            return null;
        } else
        {
            cursor.moveToPosition(i);
            return cursor;
        }
    }

    private static final String getInputOrEmpty(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    private String getPhotoAccessibilityAnnouncement(int i)
    {
        String s = mActionBarTitle;
        if (mActionBarSubtitle != null)
        {
            s = mActivity.getContext().getResources().getString(R.string.titles, new Object[] {
                mActionBarTitle, mActionBarSubtitle
            });
        }
        return s;
    }

    private View getRootView()
    {
        return mRootView;
    }

    private android.view.View.OnSystemUiVisibilityChangeListener getSystemUiVisibilityChangeListener()
    {
        return mSystemUiVisibilityChangeListener;
    }

    private void hideActionBar()
    {
        mActivity.getActionBarInterface().hide();
    }

    private void initMaxPhotoSize()
    {
        DisplayMetrics displaymetrics;
label0:
        {
            if (sMaxPhotoSize == 0)
            {
                displaymetrics = new DisplayMetrics();
                WindowManager windowmanager = (WindowManager)mActivity.getContext().getSystemService("window");
                com.android.ex.photo.util.ImageUtils.ImageSize imagesize = ImageUtils.sUseImageSize;
                windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
                static final class _cls8
                {

                    static final int $SwitchMap$com$android$ex$photo$util$ImageUtils$ImageSize[];

                    static 
                    {
                        $SwitchMap$com$android$ex$photo$util$ImageUtils$ImageSize = new int[com.android.ex.photo.util.ImageUtils.ImageSize.values().length];
                        try
                        {
                            $SwitchMap$com$android$ex$photo$util$ImageUtils$ImageSize[com.android.ex.photo.util.ImageUtils.ImageSize.EXTRA_SMALL.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$android$ex$photo$util$ImageUtils$ImageSize[com.android.ex.photo.util.ImageUtils.ImageSize.SMALL.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$android$ex$photo$util$ImageUtils$ImageSize[com.android.ex.photo.util.ImageUtils.ImageSize.NORMAL.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls8..SwitchMap.com.android.ex.photo.util.ImageUtils.ImageSize[imagesize.ordinal()])
                {
                default:
                    sMaxPhotoSize = Math.min(displaymetrics.heightPixels, displaymetrics.widthPixels);
                    break;

                case 1: // '\001'
                    break label0;
                }
            }
            return;
        }
        sMaxPhotoSize = (Math.min(displaymetrics.heightPixels, displaymetrics.widthPixels) * 800) / 1000;
    }

    private void initTemporaryImage(final Drawable base)
    {
        if (mEnterAnimationFinished)
        {
            return;
        }
        mTemporaryImage.setImageDrawable(base);
        if (base != null)
        {
            if (mRootView.getMeasuredWidth() == 0)
            {
                base = mRootView;
                base.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                    final PhotoViewController this$0;
                    final View val$base;

                    public final void onGlobalLayout()
                    {
                        if (android.os.Build.VERSION.SDK_INT >= 16)
                        {
                            base.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else
                        {
                            base.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                        runEnterAnimation();
                    }

            
            {
                this$0 = PhotoViewController.this;
                base = view;
                super();
            }
                });
            } else
            {
                runEnterAnimation();
            }
        }
        mActivity.getSupportLoaderManager().initLoader(100, null, this);
    }

    private boolean isDestroyedCompat()
    {
        return mIsDestroyedCompat;
    }

    private boolean isEnterAnimationFinished()
    {
        return mEnterAnimationFinished;
    }

    private boolean isScaleAnimationEnabled()
    {
        return mScaleAnimationEnabled;
    }

    private static boolean kitkatIsSecondaryUser()
    {
        if (android.os.Build.VERSION.SDK_INT != 19)
        {
            throw new IllegalStateException("kitkatIsSecondary user is only callable on KitKat");
        }
        return Process.myUid() > 0x186a0;
    }

    private void notifyCursorListeners(Cursor cursor)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mCursorListeners.iterator(); iterator.hasNext(); ((PhotoViewCallbacks.CursorChangedListener)iterator.next()).onCursorChanged(cursor)) { }
        break MISSING_BLOCK_LABEL_44;
        cursor;
        throw cursor;
        this;
        JVM INSTR monitorexit ;
    }

    public static boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    private void onExitAnimationComplete()
    {
        mActivity.finish();
        mActivity.overridePendingTransition(0, 0);
    }

    private void onLoadFinished(Loader loader, Cursor cursor)
    {
        if (loader.getId() != 100) goto _L2; else goto _L1
_L1:
        if (cursor != null && cursor.getCount() != 0) goto _L4; else goto _L3
_L3:
        mIsEmpty = true;
        mAdapter.swapCursor(null);
_L2:
        return;
_L4:
        mAlbumCount = cursor.getCount();
        if (mCurrentPhotoUri == null) goto _L6; else goto _L5
_L5:
        int i;
        i = 0;
        int j = cursor.getColumnIndex("uri");
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            loader = Uri.parse(mCurrentPhotoUri).buildUpon().clearQuery().build();
        } else
        {
            loader = Uri.parse(mCurrentPhotoUri).buildUpon().query(null).build();
        }
        cursor.moveToPosition(-1);
_L11:
        if (!cursor.moveToNext()) goto _L6; else goto _L7
_L7:
        Object obj = cursor.getString(j);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            obj = Uri.parse(((String) (obj))).buildUpon().clearQuery().build();
        } else
        {
            obj = Uri.parse(((String) (obj))).buildUpon().query(null).build();
        }
        if (loader == null || !loader.equals(obj)) goto _L9; else goto _L8
_L8:
        mCurrentPhotoIndex = i;
_L6:
        if (mIsPaused)
        {
            mKickLoader = true;
            mAdapter.swapCursor(null);
            return;
        }
        break; /* Loop/switch isn't completed */
_L9:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        boolean flag = mIsEmpty;
        mIsEmpty = false;
        mAdapter.swapCursor(cursor);
        if (mViewPager.getAdapter() == null)
        {
            mViewPager.setAdapter(mAdapter);
        }
        notifyCursorListeners(cursor);
        if (mCurrentPhotoIndex < 0)
        {
            mCurrentPhotoIndex = 0;
        }
        mViewPager.setCurrentItem(mCurrentPhotoIndex, false);
        if (flag)
        {
            setViewActivated(mCurrentPhotoIndex);
            return;
        }
        if (true) goto _L2; else goto _L12
_L12:
    }

    public static boolean onPrepareOptionsMenu(Menu menu)
    {
        return true;
    }

    private void postEnterFullScreenRunnableWithDelay()
    {
        mHandler.postDelayed(mEnterFullScreenRunnable, mEnterFullScreenDelayTime);
    }

    private void runEnterAnimation()
    {
        int i = mRootView.getMeasuredWidth();
        int j = mRootView.getMeasuredHeight();
        mTemporaryImage.setVisibility(0);
        float f = Math.max((float)mAnimationStartWidth / (float)i, (float)mAnimationStartHeight / (float)j);
        i = calculateTranslate(mAnimationStartX, mAnimationStartWidth, i, f);
        j = calculateTranslate(mAnimationStartY, mAnimationStartHeight, j, f);
        int k = android.os.Build.VERSION.SDK_INT;
        if (k >= 14)
        {
            mBackground.setAlpha(0.0F);
            mBackground.animate().alpha(1.0F).setDuration(250L).start();
            mBackground.setVisibility(0);
            mTemporaryImage.setScaleX(f);
            mTemporaryImage.setScaleY(f);
            mTemporaryImage.setTranslationX(i);
            mTemporaryImage.setTranslationY(j);
            Runnable runnable = new Runnable() {

                final PhotoViewController this$0;

                public final void run()
                {
                    onEnterAnimationComplete();
                }

            
            {
                this$0 = PhotoViewController.this;
                super();
            }
            };
            ViewPropertyAnimator viewpropertyanimator = mTemporaryImage.animate().scaleX(1.0F).scaleY(1.0F).translationX(0.0F).translationY(0.0F).setDuration(250L);
            if (k >= 16)
            {
                viewpropertyanimator.withEndAction(runnable);
            } else
            {
                mHandler.postDelayed(runnable, 250L);
            }
            viewpropertyanimator.start();
            return;
        } else
        {
            Object obj = new AlphaAnimation(0.0F, 1.0F);
            ((Animation) (obj)).setDuration(250L);
            mBackground.startAnimation(((Animation) (obj)));
            mBackground.setVisibility(0);
            obj = new TranslateAnimation(i, j, 0.0F, 0.0F);
            ((Animation) (obj)).setDuration(250L);
            ScaleAnimation scaleanimation = new ScaleAnimation(f, f, 0.0F, 0.0F);
            scaleanimation.setDuration(250L);
            AnimationSet animationset = new AnimationSet(true);
            animationset.addAnimation(((Animation) (obj)));
            animationset.addAnimation(scaleanimation);
            animationset.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final PhotoViewController this$0;

                public final void onAnimationEnd(Animation animation)
                {
                    onEnterAnimationComplete();
                }

                public final void onAnimationRepeat(Animation animation)
                {
                }

                public final void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = PhotoViewController.this;
                super();
            }
            });
            mTemporaryImage.startAnimation(animationset);
            return;
        }
    }

    private void runExitAnimation()
    {
        mActivity.getIntent();
        int i = mRootView.getMeasuredWidth();
        int j = mRootView.getMeasuredHeight();
        float f = Math.max((float)mAnimationStartWidth / (float)i, (float)mAnimationStartHeight / (float)j);
        i = calculateTranslate(mAnimationStartX, mAnimationStartWidth, i, f);
        j = calculateTranslate(mAnimationStartY, mAnimationStartHeight, j, f);
        int k = android.os.Build.VERSION.SDK_INT;
        if (k >= 14)
        {
            mBackground.animate().alpha(0.0F).setDuration(250L).start();
            mBackground.setVisibility(0);
            Runnable runnable = new Runnable() {

                final PhotoViewController this$0;

                public final void run()
                {
                    onExitAnimationComplete();
                }

            
            {
                this$0 = PhotoViewController.this;
                super();
            }
            };
            ViewPropertyAnimator viewpropertyanimator;
            if (mTemporaryImage.getVisibility() == 0)
            {
                viewpropertyanimator = mTemporaryImage.animate().scaleX(f).scaleY(f).translationX(i).translationY(j).setDuration(250L);
            } else
            {
                viewpropertyanimator = mViewPager.animate().scaleX(f).scaleY(f).translationX(i).translationY(j).setDuration(250L);
            }
            if (!mInitialPhotoUri.equals(mCurrentPhotoUri))
            {
                viewpropertyanimator.alpha(0.0F);
            }
            if (k >= 16)
            {
                viewpropertyanimator.withEndAction(runnable);
            } else
            {
                mHandler.postDelayed(runnable, 250L);
            }
            viewpropertyanimator.start();
            return;
        }
        Object obj = new AlphaAnimation(1.0F, 0.0F);
        ((Animation) (obj)).setDuration(250L);
        mBackground.startAnimation(((Animation) (obj)));
        mBackground.setVisibility(0);
        obj = new ScaleAnimation(1.0F, 1.0F, f, f);
        ((Animation) (obj)).setDuration(250L);
        ((Animation) (obj)).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final PhotoViewController this$0;

            public final void onAnimationEnd(Animation animation)
            {
                onExitAnimationComplete();
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = PhotoViewController.this;
                super();
            }
        });
        if (mTemporaryImage.getVisibility() == 0)
        {
            mTemporaryImage.startAnimation(((Animation) (obj)));
            return;
        } else
        {
            mViewPager.startAnimation(((Animation) (obj)));
            return;
        }
    }

    private void setActionBarTitles(ActionBarInterface actionbarinterface)
    {
        if (actionbarinterface == null)
        {
            return;
        } else
        {
            actionbarinterface.setTitle(getInputOrEmpty(mActionBarTitle));
            actionbarinterface.setSubtitle(getInputOrEmpty(mActionBarSubtitle));
            return;
        }
    }

    private void setImmersiveMode(boolean flag)
    {
        int i;
        boolean flag1;
        int j;
        int k;
        j = 0;
        i = 0;
        k = android.os.Build.VERSION.SDK_INT;
        if (k < 16)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || isScaleAnimationEnabled() && !isEnterAnimationFinished()) goto _L2; else goto _L1
_L1:
        if (k > 19 || k == 19 && !kitkatIsSecondaryUser())
        {
            i = 3846;
        } else
        if (k >= 16)
        {
            i = 1285;
        } else
        if (k >= 14)
        {
            i = 1;
        } else
        if (k >= 11)
        {
            i = 1;
        }
        j = i;
        if (flag1)
        {
            hideActionBar();
            j = i;
        }
_L4:
        if (k >= 11)
        {
            mLastFlags = j;
            getRootView().setSystemUiVisibility(j);
        }
        return;
_L2:
        if (k < 19)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 1792;
_L5:
        j = i;
        if (flag1)
        {
            showActionBar();
            j = i;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (k >= 16)
        {
            i = 1280;
        } else
        if (k >= 14)
        {
            i = 0;
        } else
        {
            i = j;
            if (k >= 11)
            {
                i = 0;
            }
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void setLightsOutMode(boolean flag)
    {
        setImmersiveMode(flag);
    }

    private void setViewActivated(int i)
    {
        Object obj = (PhotoViewCallbacks.OnScreenListener)mScreenListeners.get(Integer.valueOf(i));
        if (obj != null)
        {
            ((PhotoViewCallbacks.OnScreenListener) (obj)).onViewActivated();
        }
        obj = getCursorAtProperPosition();
        mCurrentPhotoIndex = i;
        mCurrentPhotoUri = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("uri"));
        updateActionBar();
        if (mAccessibilityManager.isEnabled())
        {
            String s = getPhotoAccessibilityAnnouncement(i);
            if (s != null)
            {
                Util.announceForAccessibility(mRootView, mAccessibilityManager, s);
            }
        }
        cancelEnterFullScreenRunnable();
        postEnterFullScreenRunnableWithDelay();
    }

    private void showActionBar()
    {
        mActivity.getActionBarInterface().show();
    }

    private void updateActionBar()
    {
        int i = mViewPager.getCurrentItem() + 1;
        Cursor cursor;
        boolean flag;
        if (mAlbumCount >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cursor = getCursorAtProperPosition();
        if (cursor != null)
        {
            mActionBarTitle = cursor.getString(cursor.getColumnIndex("_display_name"));
        } else
        {
            mActionBarTitle = null;
        }
        if (mIsEmpty || !flag || i <= 0)
        {
            mActionBarSubtitle = null;
        } else
        {
            mActionBarSubtitle = mActivity.getResources().getString(R.string.photo_view_count, new Object[] {
                Integer.valueOf(i), Integer.valueOf(mAlbumCount)
            });
        }
        setActionBarTitles(mActivity.getActionBarInterface());
    }

    public final void addCursorListener(PhotoViewCallbacks.CursorChangedListener cursorchangedlistener)
    {
        this;
        JVM INSTR monitorenter ;
        mCursorListeners.add(cursorchangedlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        cursorchangedlistener;
        throw cursorchangedlistener;
    }

    public final void addScreenListener(int i, PhotoViewCallbacks.OnScreenListener onscreenlistener)
    {
        mScreenListeners.put(Integer.valueOf(i), onscreenlistener);
    }

    public final ActivityInterface getActivity()
    {
        return mActivity;
    }

    public final PhotoPagerAdapter getAdapter()
    {
        return mAdapter;
    }

    public final boolean isFragmentActive(Fragment fragment)
    {
        while (mViewPager == null || mAdapter == null || mViewPager.getCurrentItem() != mAdapter.getItemPosition(fragment)) 
        {
            return false;
        }
        return true;
    }

    public final boolean isFragmentFullScreen(Fragment fragment)
    {
        if (mViewPager == null || mAdapter == null || mAdapter.getCount() == 0)
        {
            return mFullScreen;
        }
        return mFullScreen || mViewPager.getCurrentItem() != mAdapter.getItemPosition(fragment);
    }

    public final boolean onBackPressed()
    {
        if (mFullScreen && !mActionBarHiddenInitially)
        {
            toggleFullScreen();
        } else
        if (mScaleAnimationEnabled)
        {
            runExitAnimation();
        } else
        {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle)
    {
        initMaxPhotoSize();
        sMemoryClass = ((ActivityManager)mActivity.getApplicationContext().getSystemService("activity")).getMemoryClass();
        Intent intent = mActivity.getIntent();
        if (intent.hasExtra("photos_uri"))
        {
            mPhotosUri = intent.getStringExtra("photos_uri");
        }
        if (intent.getBooleanExtra("scale_up_animation", false))
        {
            mScaleAnimationEnabled = true;
            mAnimationStartX = intent.getIntExtra("start_x_extra", 0);
            mAnimationStartY = intent.getIntExtra("start_y_extra", 0);
            mAnimationStartWidth = intent.getIntExtra("start_width_extra", 0);
            mAnimationStartHeight = intent.getIntExtra("start_height_extra", 0);
        }
        boolean flag;
        if (intent.getBooleanExtra("action_bar_hidden_initially", false) && !Util.isTouchExplorationEnabled(mAccessibilityManager))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mActionBarHiddenInitially = flag;
        mDisplayThumbsFullScreen = intent.getBooleanExtra("display_thumbs_fullscreen", false);
        if (intent.hasExtra("projection"))
        {
            mProjection = intent.getStringArrayExtra("projection");
        } else
        {
            mProjection = null;
        }
        mMaxInitialScale = intent.getFloatExtra("max_scale", 1.0F);
        mCurrentPhotoUri = null;
        mCurrentPhotoIndex = -1;
        if (intent.hasExtra("photo_index"))
        {
            mCurrentPhotoIndex = intent.getIntExtra("photo_index", -1);
        }
        if (intent.hasExtra("initial_photo_uri"))
        {
            mInitialPhotoUri = intent.getStringExtra("initial_photo_uri");
            mCurrentPhotoUri = mInitialPhotoUri;
        }
        mIsEmpty = true;
        if (bundle != null)
        {
            mInitialPhotoUri = bundle.getString("com.android.ex.PhotoViewFragment.INITIAL_URI");
            mCurrentPhotoUri = bundle.getString("com.android.ex.PhotoViewFragment.CURRENT_URI");
            mCurrentPhotoIndex = bundle.getInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX");
            if (bundle.getBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", false) && !Util.isTouchExplorationEnabled(mAccessibilityManager))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mFullScreen = flag;
            mActionBarTitle = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE");
            mActionBarSubtitle = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE");
            mEnterAnimationFinished = bundle.getBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", false);
        } else
        {
            mFullScreen = mActionBarHiddenInitially;
        }
        mActivity.setContentView(R.layout.photo_activity_view);
        mAdapter = createPhotoPagerAdapter(mActivity.getContext(), mActivity.getSupportFragmentManager(), null, mMaxInitialScale);
        bundle = mActivity.getResources();
        mRootView = findViewById(R.id.photo_activity_root_view);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mRootView.setOnSystemUiVisibilityChangeListener(getSystemUiVisibilityChangeListener());
        }
        mBackground = findViewById(R.id.photo_activity_background);
        mTemporaryImage = (ImageView)findViewById(R.id.photo_activity_temporary_image);
        mViewPager = (PhotoViewPager)findViewById(R.id.photo_view_pager);
        mViewPager.setAdapter(mAdapter);
        mViewPager.setOnPageChangeListener(this);
        mViewPager.setOnInterceptTouchListener(this);
        mViewPager.setPageMargin(bundle.getDimensionPixelSize(R.dimen.photo_page_margin));
        mBitmapCallback = new BitmapCallback();
        if (!mScaleAnimationEnabled || mEnterAnimationFinished)
        {
            mActivity.getSupportLoaderManager().initLoader(100, null, this);
            mBackground.setVisibility(0);
        } else
        {
            mViewPager.setVisibility(8);
            Bundle bundle1 = new Bundle();
            bundle1.putString("image_uri", mInitialPhotoUri);
            mActivity.getSupportLoaderManager().initLoader(2, bundle1, mBitmapCallback);
        }
        mEnterFullScreenDelayTime = bundle.getInteger(R.integer.reenter_fullscreen_delay_time_in_millis);
        bundle = mActivity.getActionBarInterface();
        if (bundle != null)
        {
            bundle.setDisplayHomeAsUpEnabled(true);
            bundle.addOnMenuVisibilityListener(this);
            bundle.setDisplayOptionsShowTitle();
            setActionBarTitles(bundle);
        }
        if (!mScaleAnimationEnabled)
        {
            setLightsOutMode(mFullScreen);
            return;
        } else
        {
            setLightsOutMode(false);
            return;
        }
    }

    public Loader onCreateBitmapLoader(int i, Bundle bundle, String s)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return new PhotoBitmapLoader(mActivity.getContext(), s);
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        if (i == 100)
        {
            return new PhotoPagerLoader(mActivity.getContext(), Uri.parse(mPhotosUri), mProjection);
        } else
        {
            return null;
        }
    }

    public final void onDestroy()
    {
        mIsDestroyedCompat = true;
    }

    public final void onEnterAnimationComplete()
    {
        mEnterAnimationFinished = true;
        mViewPager.setVisibility(0);
        setLightsOutMode(mFullScreen);
    }

    public final void onFragmentPhotoLoadComplete(PhotoViewFragment photoviewfragment, boolean flag)
    {
        if (mTemporaryImage.getVisibility() != 8 && TextUtils.equals(photoviewfragment.getPhotoUri(), mCurrentPhotoUri))
        {
            if (flag)
            {
                mTemporaryImage.setVisibility(8);
                mViewPager.setVisibility(0);
            } else
            {
                Log.w("PhotoViewController", "Failed to load fragment image");
                mTemporaryImage.setVisibility(8);
                mViewPager.setVisibility(0);
            }
            mActivity.getSupportLoaderManager().destroyLoader(2);
        }
    }

    public final volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public final void onLoaderReset(Loader loader)
    {
        if (!isDestroyedCompat())
        {
            mAdapter.swapCursor(null);
        }
    }

    public final void onMenuVisibilityChanged(boolean flag)
    {
        if (flag)
        {
            cancelEnterFullScreenRunnable();
            return;
        } else
        {
            postEnterFullScreenRunnableWithDelay();
            return;
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            mActivity.finish();
            break;
        }
        return true;
    }

    public final void onPageScrollStateChanged(int i)
    {
    }

    public final void onPageScrolled(int i, float f, int j)
    {
        if ((double)f < 0.0001D)
        {
            PhotoViewCallbacks.OnScreenListener onscreenlistener = (PhotoViewCallbacks.OnScreenListener)mScreenListeners.get(Integer.valueOf(i - 1));
            if (onscreenlistener != null)
            {
                onscreenlistener.onViewUpNext();
            }
            onscreenlistener = (PhotoViewCallbacks.OnScreenListener)mScreenListeners.get(Integer.valueOf(i + 1));
            if (onscreenlistener != null)
            {
                onscreenlistener.onViewUpNext();
            }
        }
    }

    public final void onPageSelected(int i)
    {
        mCurrentPhotoIndex = i;
        setViewActivated(i);
    }

    public final void onPause()
    {
        mIsPaused = true;
    }

    public final void onResume()
    {
        setFullScreen(mFullScreen, false);
        mIsPaused = false;
        if (mKickLoader)
        {
            mKickLoader = false;
            mActivity.getSupportLoaderManager().initLoader(100, null, this);
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("com.android.ex.PhotoViewFragment.INITIAL_URI", mInitialPhotoUri);
        bundle.putString("com.android.ex.PhotoViewFragment.CURRENT_URI", mCurrentPhotoUri);
        bundle.putInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX", mCurrentPhotoIndex);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", mFullScreen);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE", mActionBarTitle);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE", mActionBarSubtitle);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", mEnterAnimationFinished);
    }

    public final PhotoViewPager.InterceptType onTouchIntercept(float f, float f1)
    {
        boolean flag1 = false;
        boolean flag = false;
        Iterator iterator = mScreenListeners.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PhotoViewCallbacks.OnScreenListener onscreenlistener = (PhotoViewCallbacks.OnScreenListener)iterator.next();
            boolean flag2 = flag1;
            if (!flag1)
            {
                flag2 = onscreenlistener.onInterceptMoveLeft(f, f1);
            }
            flag1 = flag2;
            if (!flag)
            {
                flag = onscreenlistener.onInterceptMoveRight(f, f1);
                flag1 = flag2;
            }
        } while (true);
        if (flag1)
        {
            if (flag)
            {
                return PhotoViewPager.InterceptType.BOTH;
            } else
            {
                return PhotoViewPager.InterceptType.LEFT;
            }
        }
        if (flag)
        {
            return PhotoViewPager.InterceptType.RIGHT;
        } else
        {
            return PhotoViewPager.InterceptType.NONE;
        }
    }

    public final void removeCursorListener(PhotoViewCallbacks.CursorChangedListener cursorchangedlistener)
    {
        this;
        JVM INSTR monitorenter ;
        mCursorListeners.remove(cursorchangedlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        cursorchangedlistener;
        throw cursorchangedlistener;
    }

    public final void removeScreenListener(int i)
    {
        mScreenListeners.remove(Integer.valueOf(i));
    }

    protected final void setFullScreen(boolean flag, boolean flag1)
    {
        if (Util.isTouchExplorationEnabled(mAccessibilityManager))
        {
            flag = false;
            flag1 = false;
        }
        Iterator iterator;
        boolean flag2;
        if (flag != mFullScreen)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        mFullScreen = flag;
        if (!mFullScreen) goto _L2; else goto _L1
_L1:
        setLightsOutMode(true);
        cancelEnterFullScreenRunnable();
_L4:
        if (flag2)
        {
            for (iterator = mScreenListeners.values().iterator(); iterator.hasNext(); ((PhotoViewCallbacks.OnScreenListener)iterator.next()).onFullScreenChanged(mFullScreen)) { }
        }
        break; /* Loop/switch isn't completed */
_L2:
        setLightsOutMode(false);
        if (flag1)
        {
            postEnterFullScreenRunnableWithDelay();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void toggleFullScreen()
    {
        boolean flag;
        if (!mFullScreen)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFullScreen(flag, true);
    }





}

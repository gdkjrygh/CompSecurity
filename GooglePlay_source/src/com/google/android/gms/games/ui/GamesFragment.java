// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesLogflowLogger;
import com.google.android.gms.games.logging.LogflowGamesUiElementNode;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity, PlayHeaderListHelper

public abstract class GamesFragment extends Fragment
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, LogflowGamesUiElementNode, PlayHeaderListHelper.PlayHeaderListWrappable
{
    public static interface OnActivityResultListener
    {

        public abstract void onActivityResult(int i, int j, Intent intent);
    }


    private final Object mActivityResultListenerLock = new Object();
    HashMap mActivityResultListeners;
    public boolean mIsRefreshing;
    protected final int mLayoutResId;
    public GamesFragmentActivity mParent;
    public PlayHeaderListLayout mPlayHeaderListLayout;
    SparseArray mResultBroadcastMap;
    private com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement mUiElement;

    public GamesFragment(int i)
    {
        boolean flag = false;
        super();
        mIsRefreshing = false;
        mActivityResultListeners = new HashMap();
        mResultBroadcastMap = new SparseArray();
        if (i > 0)
        {
            flag = true;
        }
        Asserts.checkState(flag);
        mLayoutResId = i;
    }

    private void unregisterOnActivityResultListener(OnActivityResultListener onactivityresultlistener)
    {
        Object obj = mActivityResultListenerLock;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = (HashSet)mActivityResultListeners.get(onactivityresultlistener);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (!((HashSet) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Integer integer;
        HashSet hashset;
        for (obj1 = ((HashSet) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); mResultBroadcastMap.put(integer.intValue(), hashset))
        {
            integer = (Integer)((Iterator) (obj1)).next();
            hashset = (HashSet)mResultBroadcastMap.get(integer.intValue());
            hashset.remove(onactivityresultlistener);
        }

        break MISSING_BLOCK_LABEL_104;
        onactivityresultlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onactivityresultlistener;
        obj;
        JVM INSTR monitorexit ;
    }

    public void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
    }

    public View addContentView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return layoutinflater.inflate(mLayoutResId, viewgroup, true);
    }

    public final void addDefaultParallaxBackgroundView$39fc0c(ViewGroup viewgroup)
    {
        View view = new View(mParent);
        view.setBackgroundColor(UiUtils.getActionBarColorForFragment(this));
        viewgroup.addView(view);
        viewgroup = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        viewgroup.width = -1;
        viewgroup.height = mParent.getActionBarHeight() * 3;
        view.setLayoutParams(viewgroup);
    }

    public void addHeroView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
    }

    public boolean alwaysUseFloatingBackground()
    {
        return true;
    }

    public final boolean canUseResult(Result result)
    {
        return isAttachedToParent() && mParent.canContinueWithStatus(result.getStatus().mStatusCode);
    }

    public float getBackgroundViewParallaxRatio()
    {
        return 0.7F;
    }

    public PlayHeaderListTabStrip getCustomTabStrip$78490773(Context context)
    {
        return null;
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getFauxParentLogflowUiElement()
    {
        return null;
    }

    public Drawable getFloatingControlsBackground()
    {
        return new ColorDrawable(UiUtils.getActionBarColorFromWrappable(this));
    }

    public final GoogleApiClient getGoogleApiClient()
    {
        GoogleApiClient googleapiclient = mParent.getGoogleApiClient();
        Asserts.checkNotNull(googleapiclient);
        return googleapiclient;
    }

    public int getHeaderHeight(Context context)
    {
        return PlayHeaderListLayout.getMinimumHeaderHeight(context, getPlayHeaderTabMode(), 0);
    }

    public int getHeaderMode()
    {
        return 1;
    }

    public int getHeaderShadowMode()
    {
        return 0;
    }

    public final Activity getPlayHeaderActivity()
    {
        return super.mActivity;
    }

    public int getPlayHeaderTabMode()
    {
        return 2;
    }

    public abstract int getPlaylogElementType();

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getPlaylogGamesUiElement()
    {
        return mUiElement;
    }

    public final int getTabPaddingMode()
    {
        return !alwaysUseFloatingBackground() ? 0 : 1;
    }

    public int getToolbarTitleMode()
    {
        return 1;
    }

    public final float getVisibleHeaderHeight()
    {
        if (mPlayHeaderListLayout != null)
        {
            return mPlayHeaderListLayout.getVisibleHeaderHeight();
        } else
        {
            return 0.0F;
        }
    }

    public boolean hasPlayHeader()
    {
        return false;
    }

    public boolean hasViewPager()
    {
        return false;
    }

    public final boolean isAttachedToParent()
    {
        return super.mActivity != null && !super.mDetached && !super.mRemoving;
    }

    public final boolean isGoogleApiClientCreated()
    {
        if (mParent != null)
        {
            return mParent.isGoogleApiClientCreated();
        } else
        {
            return false;
        }
    }

    public final boolean isLeaf()
    {
        return false;
    }

    public final boolean isPageRefreshing$134632()
    {
        return mIsRefreshing;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (!(super.mActivity instanceof GamesFragmentActivity))
        {
            throw new IllegalStateException("Parent activity must extend from GamesFragmentActivity.");
        }
        mParent = (GamesFragmentActivity)super.mActivity;
        bundle = super.mView;
        if (bundle == null)
        {
            throw new IllegalStateException("The fragment should have a view.");
        }
        bundle.setTag(0x7f0d0061, this);
        if (shouldTriggerNewImpression())
        {
            mParent.startNewImpression(bundle);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            synchronized (mActivityResultListenerLock)
            {
                if (mResultBroadcastMap.indexOfKey(i) >= 0)
                {
                    break label0;
                }
            }
            return;
        }
        for (Iterator iterator = ((HashSet)mResultBroadcastMap.get(i)).iterator(); iterator.hasNext(); ((OnActivityResultListener)iterator.next()).onActivityResult(i, j, intent)) { }
        break MISSING_BLOCK_LABEL_77;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void onConnected(Bundle bundle)
    {
        bundle = getGoogleApiClient();
        Asserts.checkState(bundle.isConnected());
        onGoogleApiClientConnected(bundle);
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public final void onConnectionSuspended(int i)
    {
        GamesLog.w("GamesFragment", "Unexpected call to onConnectionSuspended - subclasses should unregister as a listener in onStop() and clear data in onDestroyView()");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mParent = (GamesFragmentActivity)super.mActivity;
        mUiElement = GamesLogflowLogger.obtainPlaylogGamesUiElement(getPlaylogElementType());
        if (hasPlayHeader())
        {
            viewgroup = new PlayHeaderListHelper(this);
            mPlayHeaderListLayout = viewgroup.inflatePlayHeaderListLayout(layoutinflater);
            viewgroup.configurePlayHeaderListLayout(mPlayHeaderListLayout);
            mParent.onSetActionBar();
            return mPlayHeaderListLayout;
        } else
        {
            return layoutinflater.inflate(mLayoutResId, viewgroup, false);
        }
    }

    public void onDestroyView()
    {
        mPlayHeaderListLayout = null;
        super.onDestroyView();
    }

    public void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
    }

    public void onPlayHeaderListLayoutCreated(PlayHeaderListLayout playheaderlistlayout)
    {
    }

    public void onPulledToRefresh()
    {
    }

    public void onResume()
    {
        super.onResume();
    }

    public final void onStart()
    {
        super.onStart();
        mParent.registerListener(this);
        mParent.registerConnectionFailedListener(this);
        mParent.logImpression(super.mView, false);
    }

    public void onStop()
    {
        mParent.unregisterListener(this);
        mParent.unregisterConnectionFailedListener(this);
        super.onStop();
    }

    public final transient void registerOnActivityResultListener(OnActivityResultListener onactivityresultlistener, int ai[])
    {
        Object obj = mActivityResultListenerLock;
        obj;
        JVM INSTR monitorenter ;
        HashSet hashset = new HashSet();
        int i = 0;
_L2:
        if (i > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(Integer.valueOf(ai[0]));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        unregisterOnActivityResultListener(onactivityresultlistener);
        mActivityResultListeners.put(onactivityresultlistener, hashset);
        i = 0;
_L4:
        if (i > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        HashSet hashset1 = (HashSet)mResultBroadcastMap.get(ai[0]);
        hashset = hashset1;
        if (hashset1 != null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        hashset = new HashSet();
        hashset.add(onactivityresultlistener);
        mResultBroadcastMap.put(ai[0], hashset);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
        onactivityresultlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onactivityresultlistener;
    }

    public final void setRefreshing$2563266(boolean flag)
    {
        if (mPlayHeaderListLayout != null)
        {
            mIsRefreshing = flag;
            PlayHeaderListLayout playheaderlistlayout = mPlayHeaderListLayout;
            if (playheaderlistlayout.mPullToRefreshAdapterPage == 0 || !playheaderlistlayout.mHasViewPager)
            {
                playheaderlistlayout.mSwipeRefreshLayout.setRefreshing(flag);
            }
        }
    }

    public boolean shouldTriggerNewImpression()
    {
        return false;
    }

    public final void showActionBar$1385ff()
    {
        mPlayHeaderListLayout.snapControlsIfNeeded(true, true, true);
    }

    public boolean supportsPullToRefresh$134632()
    {
        return false;
    }
}

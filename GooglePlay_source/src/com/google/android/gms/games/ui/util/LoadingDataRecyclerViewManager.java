// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            UiUtils

public final class LoadingDataRecyclerViewManager extends Handler
    implements android.view.View.OnClickListener
{
    public static interface ActionTextListener
    {

        public abstract void onEmptyActionTextClicked();
    }

    public static interface RetryListener
    {

        public abstract void onRetry();
    }

    public static interface RevealListener
    {

        public abstract void onDataRevealed();

        public abstract void onLoadingRevealed();
    }


    private final ActionTextListener mActionTextListener;
    private final View mDataView;
    private final View mEmptyView;
    private int mEmptyViewTopMargin;
    private final View mGenericErrorView;
    private final View mLoadingView;
    private final View mNetworkErrorView;
    private final ArrayList mNullStateViews;
    private final RetryListener mRetryListener;
    private final RevealListener mRevealListener;
    private final View mSwipeToRefresh;
    public int mViewState;

    public LoadingDataRecyclerViewManager(View view, int i, int j, int k, int l, int i1, RetryListener retrylistener, 
            ActionTextListener actiontextlistener, RevealListener reveallistener, int j1)
    {
        mViewState = 0;
        mEmptyViewTopMargin = -1;
        Asserts.checkNotNull(view);
        boolean flag;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Must be called from UI thread");
        mLoadingView = view.findViewById(0x7f0d01b4);
        if (mLoadingView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        adjustTopMargin(mLoadingView, j1);
        mDataView = view.findViewById(0x102000a);
        if (mDataView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mNullStateViews = new ArrayList();
        mEmptyView = view.findViewById(k);
        if (mEmptyView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mNullStateViews.add(mEmptyView);
        mNetworkErrorView = view.findViewById(0x7f0d01ae);
        if (mNetworkErrorView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mNullStateViews.add(mNetworkErrorView);
        mGenericErrorView = view.findViewById(0x7f0d01b3);
        if (mGenericErrorView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mNullStateViews.add(mGenericErrorView);
        setNullStateTopMargin(j1);
        mRetryListener = (RetryListener)Preconditions.checkNotNull(retrylistener);
        mActionTextListener = actiontextlistener;
        mRevealListener = reveallistener;
        retrylistener = (TextView)view.findViewById(0x7f0d01a9);
        if (retrylistener != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        retrylistener.setOnClickListener(this);
        retrylistener = (TextView)view.findViewById(0x7f0d01af);
        if (retrylistener != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        retrylistener.setOnClickListener(this);
        retrylistener = (TextView)view.findViewById(0x7f0d0168);
        if (retrylistener != null)
        {
            retrylistener.setOnClickListener(this);
        }
        mSwipeToRefresh = view.findViewById(0x7f0d01b1);
        setViewState(0);
    }

    private LoadingDataRecyclerViewManager(View view, RetryListener retrylistener, ActionTextListener actiontextlistener, RevealListener reveallistener)
    {
        this(view, 0x102000a, 0x7f0d01b4, 0x7f0d0166, 0x7f0d01ae, 0x7f0d01b3, retrylistener, actiontextlistener, reveallistener, 0);
    }

    public LoadingDataRecyclerViewManager(View view, RetryListener retrylistener, ActionTextListener actiontextlistener, RevealListener reveallistener, byte byte0)
    {
        this(view, retrylistener, actiontextlistener, reveallistener);
    }

    private static void adjustTopMargin(View view, int i)
    {
        if (i != 0)
        {
            Object obj = view.getLayoutParams();
            if (obj instanceof android.widget.LinearLayout.LayoutParams)
            {
                obj = (android.widget.LinearLayout.LayoutParams)obj;
                ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(((android.widget.LinearLayout.LayoutParams) (obj)).leftMargin, i, ((android.widget.LinearLayout.LayoutParams) (obj)).rightMargin, ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin);
                view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            {
                if (obj instanceof android.widget.RelativeLayout.LayoutParams)
                {
                    obj = (android.widget.RelativeLayout.LayoutParams)obj;
                    ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(((android.widget.RelativeLayout.LayoutParams) (obj)).leftMargin, i, ((android.widget.RelativeLayout.LayoutParams) (obj)).rightMargin, ((android.widget.RelativeLayout.LayoutParams) (obj)).bottomMargin);
                    view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                    return;
                }
                if (obj instanceof android.widget.FrameLayout.LayoutParams)
                {
                    obj = (android.widget.FrameLayout.LayoutParams)obj;
                    ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(((android.widget.FrameLayout.LayoutParams) (obj)).leftMargin, i, ((android.widget.FrameLayout.LayoutParams) (obj)).rightMargin, ((android.widget.FrameLayout.LayoutParams) (obj)).bottomMargin);
                    view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                    return;
                }
            }
        }
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 46;
           goto _L1 _L2
_L1:
        GamesLog.e("LoadingDataViewManager", (new StringBuilder("handleMessage: unexpected code: ")).append(message).toString());
_L4:
        return;
_L2:
        boolean flag;
        if (mLoadingView.getVisibility() == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        UiUtils.Fade.show(mLoadingView);
        if (mRevealListener != null)
        {
            mRevealListener.onLoadingRevealed();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void handleViewState(int i, int j, boolean flag)
    {
        byte byte0 = 2;
        if (UiUtils.isNetworkError(i) && j == 0)
        {
            setViewState(5);
            return;
        }
        if (i != 0 && j == 0)
        {
            setViewState(6);
            return;
        }
        if (j == 0)
        {
            if (flag)
            {
                i = byte0;
            } else
            {
                i = 3;
            }
            setViewState(i);
            return;
        } else
        {
            setViewState(2);
            return;
        }
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d01a9 || view.getId() == 0x7f0d01af)
        {
            mRetryListener.onRetry();
        } else
        if (view.getId() == 0x7f0d0168)
        {
            mActionTextListener.onEmptyActionTextClicked();
            return;
        }
    }

    public final void setNullStateTopMargin(int i)
    {
        if (i != mEmptyViewTopMargin)
        {
            View view;
            for (Iterator iterator = mNullStateViews.iterator(); iterator.hasNext(); view.requestLayout())
            {
                view = (View)iterator.next();
                adjustTopMargin(view, i);
                view.invalidate();
            }

            mEmptyViewTopMargin = i;
        }
    }

    public final void setViewState(int i)
    {
        boolean flag;
        boolean flag1;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Asserts.checkState(flag1, "Must be called from UI thread");
        if (mViewState != i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mViewState = i;
        removeMessages(1);
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Invalid state!");

        case 2: // '\002'
            mDataView.setVisibility(0);
            mSwipeToRefresh.setVisibility(0);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mNetworkErrorView.setVisibility(8);
            mGenericErrorView.setVisibility(8);
            if (flag && mRevealListener != null)
            {
                mRevealListener.onDataRevealed();
            }
            return;

        case 1: // '\001'
            mDataView.setVisibility(8);
            mSwipeToRefresh.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mNetworkErrorView.setVisibility(8);
            mGenericErrorView.setVisibility(8);
            sendEmptyMessageDelayed(1, 500L);
            return;

        case 3: // '\003'
            mDataView.setVisibility(8);
            mSwipeToRefresh.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(0);
            mNetworkErrorView.setVisibility(8);
            mGenericErrorView.setVisibility(8);
            return;

        case 5: // '\005'
            mDataView.setVisibility(8);
            mSwipeToRefresh.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mNetworkErrorView.setVisibility(0);
            mGenericErrorView.setVisibility(8);
            return;

        case 6: // '\006'
            mDataView.setVisibility(8);
            mSwipeToRefresh.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mNetworkErrorView.setVisibility(8);
            mGenericErrorView.setVisibility(0);
            return;

        case 0: // '\0'
        case 4: // '\004'
            mDataView.setVisibility(8);
            mSwipeToRefresh.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mNetworkErrorView.setVisibility(8);
            mGenericErrorView.setVisibility(8);
            return;
        }
    }
}

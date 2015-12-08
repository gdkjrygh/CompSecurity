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

public final class LoadingDataViewManager extends Handler
    implements android.view.View.OnClickListener
{
    public static interface ActionTextListener
        extends RetryListener
    {
    }

    public static interface RetryListener
    {

        public abstract void onRetry();
    }


    private final View mDataView;
    private final View mEmptyView;
    public final View mErrorView;
    private final View mLoadingView;
    private final RetryListener mRetryListener;
    private int mViewState;

    public LoadingDataViewManager(View view, int i, int j, int k, int l, RetryListener retrylistener, int i1)
    {
        boolean flag1 = true;
        super();
        mViewState = 0;
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
        mDataView = view.findViewById(i);
        if (mDataView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mLoadingView = view.findViewById(0x7f0d01b4);
        if (mLoadingView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        adjustTopMargin(mLoadingView, i1);
        mEmptyView = view.findViewById(0x7f0d0166);
        if (mEmptyView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        adjustTopMargin(mEmptyView, i1);
        mErrorView = view.findViewById(0x7f0d01ae);
        if (mErrorView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        adjustTopMargin(mErrorView, i1);
        mRetryListener = (RetryListener)Preconditions.checkNotNull(retrylistener);
        retrylistener = (TextView)view.findViewById(0x7f0d01a9);
        if (retrylistener != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        retrylistener.setOnClickListener(this);
        view = (TextView)view.findViewById(0x7f0d0168);
        if (view != null)
        {
            view.setOnClickListener(this);
        }
        setViewState(0);
    }

    public LoadingDataViewManager(View view, int i, RetryListener retrylistener)
    {
        this(view, i, 0x7f0d01b4, 0x7f0d0166, 0x7f0d01ae, retrylistener, 0);
    }

    public LoadingDataViewManager(View view, RetryListener retrylistener)
    {
        this(view, 0x102000a, retrylistener);
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
        switch (message.what)
        {
        default:
            GamesLog.e("LoadingDataViewManager", (new StringBuilder("handleMessage: unexpected code: ")).append(message).toString());
            return;

        case 1: // '\001'
            break;
        }
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
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d01a9)
        {
            mRetryListener.onRetry();
        } else
        if (view.getId() == 0x7f0d0168 && !(mRetryListener instanceof ActionTextListener))
        {
            GamesLog.w("LoadingDataViewManager", "onClick: empty_action_message text clicked without an ActionTextListener!");
            return;
        }
    }

    public final void setViewState(int i)
    {
        boolean flag;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Must be called from UI thread");
        mViewState = i;
        removeMessages(1);
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Invalid state!");

        case 2: // '\002'
            mDataView.setVisibility(0);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mErrorView.setVisibility(8);
            return;

        case 1: // '\001'
            mDataView.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mErrorView.setVisibility(8);
            sendEmptyMessageDelayed(1, 500L);
            return;

        case 3: // '\003'
            mDataView.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(0);
            mErrorView.setVisibility(8);
            return;

        case 5: // '\005'
            mDataView.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mErrorView.findViewById(0x7f0d01a6).setVisibility(0);
            mErrorView.findViewById(0x7f0d01a7).setVisibility(0);
            mErrorView.findViewById(0x7f0d01a8).setVisibility(8);
            mErrorView.setVisibility(0);
            return;

        case 6: // '\006'
            mDataView.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mErrorView.findViewById(0x7f0d01a6).setVisibility(8);
            mErrorView.findViewById(0x7f0d01a7).setVisibility(8);
            mErrorView.findViewById(0x7f0d01a8).setVisibility(0);
            mErrorView.setVisibility(0);
            return;

        case 0: // '\0'
        case 4: // '\004'
            mDataView.setVisibility(8);
            mLoadingView.setVisibility(8);
            mEmptyView.setVisibility(8);
            mErrorView.setVisibility(8);
            return;
        }
    }
}

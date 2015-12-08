// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchListener, PlaySearchSuggestionAdapter, PlaySearchController

public class PlaySearchSuggestionsList extends LinearLayout
    implements PlaySearchListener
{

    PlaySearchSuggestionAdapter mAdapter;
    private android.support.v7.widget.RecyclerView.AdapterDataObserver mAdapterDataObserver;
    PlaySearchController mController;
    private final float mDensity;
    private int mMaxUsableScreenHeight;
    private final int mOneSuggestionHeight;
    RecyclerView mRecyclerView;
    private Animation mRecyclerViewAnimation;
    private int mScreenHeight;
    private final int mSuggestionsListBottomMargin;

    public PlaySearchSuggestionsList(Context context)
    {
        this(context, null);
    }

    public PlaySearchSuggestionsList(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.getResources();
        mOneSuggestionHeight = context.getDimensionPixelSize(0x7f0c0327);
        mSuggestionsListBottomMargin = context.getDimensionPixelOffset(0x7f0c0330);
        mDensity = getResources().getDisplayMetrics().density;
    }

    private void animateView(final boolean show)
    {
        if (mRecyclerViewAnimation != null)
        {
            mRecyclerViewAnimation.cancel();
        }
        if (!show) goto _L2; else goto _L1
_L1:
        setVisibility(0);
        mRecyclerView.setVisibility(0);
        if (mMaxUsableScreenHeight != 0) goto _L2; else goto _L3
_L3:
        return;
_L2:
        final int currentHeight = mRecyclerView.getHeight();
        final int distanceToCover = 0;
        if (show)
        {
            distanceToCover = Math.min(mMaxUsableScreenHeight, mAdapter.getItemCount() * mOneSuggestionHeight);
        }
        if (currentHeight != distanceToCover)
        {
            distanceToCover -= currentHeight;
            Animation animation = new Animation() {

                final PlaySearchSuggestionsList this$0;
                final int val$currentHeight;
                final int val$distanceToCover;

                protected final void applyTransformation(float f, Transformation transformation)
                {
                    mRecyclerView.getLayoutParams().height = currentHeight + (int)((float)distanceToCover * f);
                    mRecyclerView.requestLayout();
                }

                public final boolean willChangeBounds()
                {
                    return true;
                }

            
            {
                this$0 = PlaySearchSuggestionsList.this;
                currentHeight = i;
                distanceToCover = j;
                super();
            }
            };
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final PlaySearchSuggestionsList this$0;
                final boolean val$show;

                public final void onAnimationEnd(Animation animation1)
                {
                    if (!show)
                    {
                        setVisibility(8);
                        mRecyclerView.setVisibility(8);
                    }
                    mRecyclerViewAnimation;
                }

                public final void onAnimationRepeat(Animation animation1)
                {
                }

                public final void onAnimationStart(Animation animation1)
                {
                }

            
            {
                this$0 = PlaySearchSuggestionsList.this;
                show = flag;
                super();
            }
            });
            animation.setDuration(Math.max(50, Math.min(200, (int)((float)distanceToCover / mDensity))));
            mRecyclerViewAnimation = animation;
            mRecyclerView.startAnimation(animation);
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    private void clearAdapterData()
    {
        PlaySearchSuggestionAdapter playsearchsuggestionadapter = mAdapter;
        List list = Collections.emptyList();
        playsearchsuggestionadapter.mItems.clear();
        playsearchsuggestionadapter.mItems.addAll(list);
        ((android.support.v7.widget.RecyclerView.Adapter) (playsearchsuggestionadapter)).mObservable.notifyChanged();
    }

    private void updateVisibility()
    {
        if (mController == null)
        {
            return;
        }
        int i = mController.mCurrentSearchMode;
        if (mAdapter.getItemCount() <= 0 || i == 1 || i == 2)
        {
            animateView(false);
            return;
        } else
        {
            animateView(true);
            return;
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mRecyclerViewAnimation != null)
        {
            mRecyclerViewAnimation.cancel();
            mRecyclerView.getLayoutParams().height = 0;
            mRecyclerView.setVisibility(8);
            setVisibility(8);
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mRecyclerView = (RecyclerView)findViewById(0x7f0d033e);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()) {

            final PlaySearchSuggestionsList this$0;

            public final View onInterceptFocusSearch(View view, int i)
            {
                if (i == 130)
                {
                    int k = getPosition(view);
                    android.support.v7.widget.RecyclerView.Adapter adapter;
                    int j;
                    if (super.mRecyclerView != null)
                    {
                        adapter = super.mRecyclerView.mAdapter;
                    } else
                    {
                        adapter = null;
                    }
                    if (adapter != null)
                    {
                        j = adapter.getItemCount();
                    } else
                    {
                        j = 0;
                    }
                    if (k >= j - 1)
                    {
                        return view;
                    }
                }
                return super.onInterceptFocusSearch(view, i);
            }

            
            {
                this$0 = PlaySearchSuggestionsList.this;
                super();
            }
        });
        mAdapter = new PlaySearchSuggestionAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mAdapterDataObserver = new android.support.v7.widget.RecyclerView.AdapterDataObserver() {

            final PlaySearchSuggestionsList this$0;

            public final void onChanged()
            {
                updateVisibility();
            }

            
            {
                this$0 = PlaySearchSuggestionsList.this;
                super();
            }
        };
        mAdapter.registerAdapterDataObserver(mAdapterDataObserver);
        final InputMethodManager inputManager = (InputMethodManager)getContext().getSystemService("input_method");
        mRecyclerView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final PlaySearchSuggestionsList this$0;
            final InputMethodManager val$inputManager;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                inputManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                return false;
            }

            
            {
                this$0 = PlaySearchSuggestionsList.this;
                inputManager = inputmethodmanager;
                super();
            }
        });
        mScreenHeight = getContext().getResources().getDisplayMetrics().heightPixels;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (mMaxUsableScreenHeight == 0)
        {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (rect.top > 0)
            {
                mMaxUsableScreenHeight = (mScreenHeight - rect.top - mRecyclerView.getTop()) + mSuggestionsListBottomMargin;
            }
            updateVisibility();
        }
    }

    public final void onModeChanged(int i)
    {
        if (i == 1)
        {
            clearAdapterData();
            return;
        } else
        {
            updateVisibility();
            return;
        }
    }

    public final void onQueryChanged$505cbf4b(String s)
    {
    }

    public final void onSearch$552c4e01()
    {
        clearAdapterData();
    }

    public final void onSuggestionClicked$299d808f()
    {
        clearAdapterData();
    }




/*
    static Animation access$202$2ea0f9f1(PlaySearchSuggestionsList playsearchsuggestionslist)
    {
        playsearchsuggestionslist.mRecyclerViewAnimation = null;
        return null;
    }

*/
}

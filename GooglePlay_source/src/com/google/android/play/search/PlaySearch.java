// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.CollapsibleActionView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchListener, PlaySearchController, PlaySearchPlate, PlaySearchSuggestionsList, 
//            PlaySearchNavigationButton, PlaySearchPlateTextContainer, PlaySearchVoiceController, PlaySearchActionButton, 
//            PlaySearchSuggestionAdapter

public class PlaySearch extends FrameLayout
    implements CollapsibleActionView, android.view.View.OnFocusChangeListener, PlaySearchListener
{

    private static final boolean CAN_USE_RIPPLE_ANIMATION;
    PlaySearchController mController;
    private View mOverlay;
    Point mRevealCenter;
    private View mSearchContainer;
    private PlaySearchPlate mSearchPlate;
    private PlaySearchSuggestionsList mSuggestionsList;

    public PlaySearch(Context context)
    {
        this(context, null);
    }

    public PlaySearch(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void updateOverlayVisibility(final boolean show, boolean flag)
    {
        float f1 = 1.0F;
        if (mOverlay != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!show)
        {
            continue; /* Loop/switch isn't completed */
        }
        mOverlay.setVisibility(0);
_L4:
        float f;
        AlphaAnimation alphaanimation;
        if (show)
        {
            f = 0.0F;
        } else
        {
            f = 1.0F;
        }
        if (!show)
        {
            f1 = 0.0F;
        }
        alphaanimation = new AlphaAnimation(f, f1);
        alphaanimation.setDuration(300L);
        alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final PlaySearch this$0;
            final boolean val$show;

            public final void onAnimationEnd(Animation animation)
            {
                if (!show)
                {
                    mOverlay.setVisibility(8);
                }
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = PlaySearch.this;
                show = flag;
                super();
            }
        });
        mOverlay.startAnimation(alphaanimation);
        return;
        if (mOverlay.getVisibility() == 8) goto _L1; else goto _L3
_L3:
        if (!show && !flag)
        {
            mOverlay.setVisibility(8);
            return;
        }
          goto _L4
    }

    public void onActionViewCollapsed()
    {
        mController.switchToSteadyStateMode();
    }

    public void onActionViewExpanded()
    {
        setVisibility(0);
        if (CAN_USE_RIPPLE_ANIMATION)
        {
            View view = (View)getParent();
            if (view == null || mSearchContainer == null || !mSearchContainer.isAttachedToWindow())
            {
                return;
            }
            Object obj;
            if (mRevealCenter != null)
            {
                obj = new Point(mRevealCenter);
                Rect rect = new Rect();
                Point point = new Point();
                getGlobalVisibleRect(rect, point);
                ((Point) (obj)).offset(-point.x, -point.y);
            } else
            {
                obj = (View)getParent();
                int i = ((View) (obj)).getRight();
                int j = ((View) (obj)).getHeight() / 2;
                int k = ((View) (obj)).getTop();
                obj = new Point(i - j, (((View) (obj)).getBottom() + k) / 2);
            }
            obj = ViewAnimationUtils.createCircularReveal(mSearchContainer, ((Point) (obj)).x, ((Point) (obj)).y, 0.0F, view.getWidth());
            ((Animator) (obj)).setDuration(300L);
            mController.switchToSteadyStateMode();
            ((Animator) (obj)).addListener(new AnimatorListenerAdapter() {

                final PlaySearch this$0;

                public final void onAnimationEnd(Animator animator)
                {
                    super.onAnimationEnd(animator);
                    switchToMode(3);
                }

            
            {
                this$0 = PlaySearch.this;
                super();
            }
            });
            ((Animator) (obj)).start();
            return;
        } else
        {
            switchToMode(3);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        updateOverlayVisibility(false, false);
        super.onDetachedFromWindow();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mSearchPlate = (PlaySearchPlate)findViewById(0x7f0d0333);
        mSuggestionsList = (PlaySearchSuggestionsList)findViewById(0x7f0d0334);
        mOverlay = findViewById(0x7f0d0331);
        mSearchContainer = findViewById(0x7f0d0332);
        mOverlay.setOnClickListener(new android.view.View.OnClickListener() {

            final PlaySearch this$0;

            public final void onClick(View view)
            {
                mController.switchToSteadyStateMode();
            }

            
            {
                this$0 = PlaySearch.this;
                super();
            }
        });
        mController = new PlaySearchController();
        mController.addPlaySearchListener(this);
        Object obj1 = mSearchPlate;
        Object obj = mController;
        Object obj2 = ((PlaySearchPlate) (obj1)).mNavButton;
        if (((PlaySearchNavigationButton) (obj2)).mController != null)
        {
            ((PlaySearchNavigationButton) (obj2)).mController.removePlaySearchListener(((PlaySearchListener) (obj2)));
        }
        obj2.mController = ((PlaySearchController) (obj));
        ((PlaySearchNavigationButton) (obj2)).mController.addPlaySearchListener(((PlaySearchListener) (obj2)));
        obj2 = ((PlaySearchPlate) (obj1)).mSearchPlateTextContainer;
        if (((PlaySearchPlateTextContainer) (obj2)).mController != null)
        {
            ((PlaySearchPlateTextContainer) (obj2)).mController.removePlaySearchListener(((PlaySearchListener) (obj2)));
        }
        obj2.mController = ((PlaySearchController) (obj));
        ((PlaySearchPlateTextContainer) (obj2)).mController.addPlaySearchListener(((PlaySearchListener) (obj2)));
        obj2.mVoiceController = new PlaySearchVoiceController(((PlaySearchPlateTextContainer) (obj2)).mController);
        obj1 = ((PlaySearchPlate) (obj1)).mActionButton;
        if (((PlaySearchActionButton) (obj1)).mController != null)
        {
            ((PlaySearchActionButton) (obj1)).mController.removePlaySearchListener(((PlaySearchListener) (obj1)));
        }
        obj1.mController = ((PlaySearchController) (obj));
        ((PlaySearchActionButton) (obj1)).mController.addPlaySearchListener(((PlaySearchListener) (obj1)));
        obj = mSuggestionsList;
        obj1 = mController;
        if (((PlaySearchSuggestionsList) (obj)).mController != null)
        {
            ((PlaySearchSuggestionsList) (obj)).mController.removePlaySearchListener(((PlaySearchListener) (obj)));
        }
        obj.mController = ((PlaySearchController) (obj1));
        ((PlaySearchSuggestionsList) (obj)).mController.addPlaySearchListener(((PlaySearchListener) (obj)));
        ((PlaySearchSuggestionsList) (obj)).mAdapter.mController = ((PlaySearchController) (obj1));
        obj = mSearchPlate;
        int i = mSuggestionsList.mRecyclerView.getId();
        obj = ((PlaySearchPlate) (obj)).mSearchPlateTextContainer;
        ((PlaySearchPlateTextContainer) (obj)).mSearchBoxTextInput.setOnFocusChangeListener(this);
        ((PlaySearchPlateTextContainer) (obj)).mSearchBoxTextInput.setNextFocusDownId(i);
        obj = mSuggestionsList;
        ((PlaySearchSuggestionsList) (obj)).mRecyclerView.setOnFocusChangeListener(this);
        ((PlaySearchSuggestionsList) (obj)).mRecyclerView.setNextFocusUpId(0x7f0d033a);
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            post(new Runnable() {

                final PlaySearch this$0;

                public final void run()
                {
                    if (mController != null && !hasFocus())
                    {
                        mController.switchToSteadyStateMode();
                    }
                }

            
            {
                this$0 = PlaySearch.this;
                super();
            }
            });
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (mOverlay.getVisibility() != 8)
        {
            mOverlay.layout(0, 0, mOverlay.getMeasuredWidth(), mOverlay.getMeasuredHeight());
        }
        mSearchContainer.layout(0, 0, mSearchContainer.getMeasuredWidth() + 0, mSearchContainer.getMeasuredHeight() + 0);
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag = false;
        int k = android.view.View.MeasureSpec.getSize(i);
        j = android.view.View.MeasureSpec.getSize(j);
        mSearchContainer.measure(android.view.View.MeasureSpec.makeMeasureSpec(k + 0 + 0, 0x40000000), 0);
        i = ((flag) ? 1 : 0);
        if (mOverlay.getVisibility() == 8)
        {
            i = 1;
        }
        if (i == 0)
        {
            mOverlay.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
        }
        if (i != 0)
        {
            i = mSearchContainer.getMeasuredHeight() + 0 + 0;
        } else
        {
            i = j;
        }
        setMeasuredDimension(k, i);
    }

    public final void onModeChanged(int i)
    {
        boolean flag1 = false;
        boolean flag;
        if (i == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || i == 2)
        {
            flag1 = true;
        }
        updateOverlayVisibility(flag, flag1);
    }

    public final void onQueryChanged$505cbf4b(String s)
    {
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            super.onRestoreInstanceState(parcelable.getParcelable("play_search.parent_instance_state"));
            int i = parcelable.getInt("play_search.mode_state", -1);
            if (i >= 0)
            {
                switchToMode(i);
            }
            parcelable = parcelable.getString("play_search.query_state");
            if (parcelable != null)
            {
                mController.setQueryInternal(parcelable, true);
            }
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("play_search.parent_instance_state", super.onSaveInstanceState());
        if (mController != null)
        {
            bundle.putInt("play_search.mode_state", mController.mCurrentSearchMode);
            bundle.putString("play_search.query_state", mController.mCurrentQuery);
        }
        return bundle;
    }

    public final void onSearch$552c4e01()
    {
    }

    public final void onSuggestionClicked$299d808f()
    {
    }

    public final void switchToMode(int i)
    {
        mController.setMode(i);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CAN_USE_RIPPLE_ANIMATION = flag;
    }


}

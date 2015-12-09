// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.play.cardview.CardViewGroupDelegate;
import com.google.android.play.cardview.CardViewGroupDelegates;
import com.google.android.play.utils.PlayTouchDelegate;

// Referenced classes of package com.google.android.play.layout:
//            ForegroundRelativeLayout, PlayCardThumbnail, PlayCardWindowLifecycleTracker, PlayTextView, 
//            StarRatingBar, PlayCardLabelView, PlayCardSnippet

public abstract class PlayCardViewBase extends ForegroundRelativeLayout
{

    protected static final boolean DISABLE_NESTED_FOCUS_TRAVERSAL;
    protected TextView mAdCreative;
    protected TextView mAdLabel;
    protected final int mAvatarSnippetMarginLeft;
    private final int mCardInset;
    protected PlayTextView mDescription;
    protected PlayTextView mItemBadge;
    protected PlayCardLabelView mLabel;
    protected View mLoadingIndicator;
    private final Rect mOldOverflowArea;
    protected ImageView mOverflow;
    private final Rect mOverflowArea;
    private final int mOverflowTouchExtend;
    private final int mOwnershipRenderingType;
    protected StarRatingBar mRatingBar;
    private final boolean mShowInlineCreatorBadge;
    protected PlayCardSnippet mSnippet1;
    protected PlayCardSnippet mSnippet2;
    protected PlayTextView mSubtitle;
    protected boolean mSupportsSubtitleAndRating;
    protected final int mTextOnlySnippetMarginLeft;
    protected PlayCardThumbnail mThumbnail;
    protected TextView mTitle;

    public PlayCardViewBase(Context context)
    {
        this(context, null, 0);
    }

    public PlayCardViewBase(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayCardViewBase(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mOverflowTouchExtend = context.getResources().getDimensionPixelSize(0x7f0c02c4);
        mOverflowArea = new Rect();
        mOldOverflowArea = new Rect();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.google.android.play.R.styleable.PlayCardBaseView);
        mShowInlineCreatorBadge = typedarray.getBoolean(0, false);
        mSupportsSubtitleAndRating = typedarray.getBoolean(1, false);
        mTextOnlySnippetMarginLeft = typedarray.getDimensionPixelSize(2, context.getResources().getDimensionPixelSize(0x7f0c02cf));
        mAvatarSnippetMarginLeft = typedarray.getDimensionPixelSize(3, 0);
        mOwnershipRenderingType = typedarray.getInt(4, 1);
        typedarray.recycle();
        mCardInset = context.getResources().getDimensionPixelSize(0x7f0c02b9);
        int j = mCardInset;
        int k = mCardInset;
        int l = mCardInset;
        int i1 = mCardInset;
        super.mForegroundPaddingLeft = j;
        super.mForegroundPaddingTop = k;
        super.mForegroundPaddingRight = l;
        super.mForegroundPaddingBottom = i1;
        requestLayout();
        invalidate();
        CardViewGroupDelegates.IMPL.initialize(this, context, attributeset, i);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return super.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        getWidth();
        getHeight();
    }

    protected final void measureThumbnailSpanningHeight(int i)
    {
        i = android.view.View.MeasureSpec.getSize(i);
        int j = getPaddingTop();
        int k = getPaddingBottom();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mThumbnail.getLayoutParams();
        if (mThumbnail.getVisibility() != 8)
        {
            marginlayoutparams.width = (int)((float)(i - j - k - marginlayoutparams.topMargin - marginlayoutparams.bottomMargin) / 0.0F);
            return;
        } else
        {
            marginlayoutparams.width = 0;
            return;
        }
    }

    protected final void measureThumbnailSpanningWidth(int i)
    {
        i = android.view.View.MeasureSpec.getSize(i);
        int j = getPaddingLeft();
        int k = getPaddingRight();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mThumbnail.getLayoutParams();
        if (mThumbnail.getVisibility() != 8)
        {
            marginlayoutparams.height = (int)(0.0F * (float)(i - j - k - marginlayoutparams.leftMargin - marginlayoutparams.rightMargin));
            return;
        } else
        {
            marginlayoutparams.height = 0;
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        PlayCardWindowLifecycleTracker.getInstance().cardAttachedToWindow$372d3f20();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        PlayCardWindowLifecycleTracker.getInstance().cardDetachedFromWindow$372d3f20();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mThumbnail = (PlayCardThumbnail)findViewById(0x7f0d02f5);
        mTitle = (TextView)findViewById(0x7f0d02f7);
        mSubtitle = (PlayTextView)findViewById(0x7f0d02fa);
        mRatingBar = (StarRatingBar)findViewById(0x7f0d02f8);
        mItemBadge = (PlayTextView)findViewById(0x7f0d0300);
        mDescription = (PlayTextView)findViewById(0x7f0d02fd);
        mOverflow = (ImageView)findViewById(0x7f0d02f4);
        mLabel = (PlayCardLabelView)findViewById(0x7f0d02f9);
        mSnippet1 = (PlayCardSnippet)findViewById(0x7f0d02fc);
        mSnippet2 = (PlayCardSnippet)findViewById(0x7f0d02fb);
        mLoadingIndicator = findViewById(0x7f0d02fe);
        mAdLabel = (TextView)findViewById(0x7f0d02f2);
        mAdCreative = (TextView)findViewById(0x7f0d004e);
        if (DISABLE_NESTED_FOCUS_TRAVERSAL)
        {
            setNextFocusRightId(-1);
            if (mOverflow != null)
            {
                mOverflow.setFocusable(false);
                mOverflow.setNextFocusLeftId(-1);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setEnabled(true);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return super.onInterceptTouchEvent(motionevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        recomputeOverflowAreaIfNeeded();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (mDescription != null && mDescription.getVisibility() == 0 && !TextUtils.isEmpty(mDescription.getText()))
        {
            j = mDescription.getMeasuredHeight();
            Layout layout = mDescription.getLayout();
            if (layout != null)
            {
                i = 0;
                while (i < layout.getLineCount()) 
                {
                    if (layout.getLineBottom(i) > j)
                    {
                        PlayTextView playtextview = mDescription;
                        if (i >= 2)
                        {
                            i = 0;
                        } else
                        {
                            i = 4;
                        }
                        playtextview.setVisibility(i);
                        return;
                    }
                    i++;
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    protected final void recomputeOverflowAreaIfNeeded()
    {
        if (mOverflow != null && mOverflow.getVisibility() != 8)
        {
            mOverflow.getHitRect(mOverflowArea);
            Rect rect = mOverflowArea;
            rect.top = rect.top - mOverflowTouchExtend;
            rect = mOverflowArea;
            rect.bottom = rect.bottom + mOverflowTouchExtend;
            rect = mOverflowArea;
            rect.left = rect.left - mOverflowTouchExtend;
            rect = mOverflowArea;
            rect.right = rect.right + mOverflowTouchExtend;
            if (mOverflowArea.top != mOldOverflowArea.top || mOverflowArea.bottom != mOldOverflowArea.bottom || mOverflowArea.left != mOldOverflowArea.left || mOverflowArea.right != mOldOverflowArea.right)
            {
                setTouchDelegate(new PlayTouchDelegate(mOverflowArea, mOverflow));
                mOldOverflowArea.set(mOverflowArea);
                return;
            }
        }
    }

    public void setBackgroundColor(int i)
    {
        CardViewGroupDelegates.IMPL.setBackgroundColor(this, i);
    }

    public void setBackgroundResource(int i)
    {
        CardViewGroupDelegates.IMPL.setBackgroundResource(this, i);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT <= 13)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        DISABLE_NESTED_FOCUS_TRAVERSAL = flag;
    }
}

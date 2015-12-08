// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.widget:
//            CardViewDelegate, CardViewApi21, CardViewImpl, CardViewJellybeanMr1, 
//            CardViewEclairMr1

public class CardView extends FrameLayout
    implements CardViewDelegate
{

    private static final CardViewImpl IMPL;
    private boolean mCompatPadding;
    private final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    private final Rect mShadowBounds;

    public CardView(Context context)
    {
        super(context);
        mContentPadding = new Rect();
        mShadowBounds = new Rect();
        initialize(context, null, 0);
    }

    public CardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mContentPadding = new Rect();
        mShadowBounds = new Rect();
        initialize(context, attributeset, 0);
    }

    public CardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mContentPadding = new Rect();
        mShadowBounds = new Rect();
        initialize(context, attributeset, i);
    }

    private void initialize(Context context, AttributeSet attributeset, int i)
    {
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.cardview.R.styleable.CardView, i, android.support.v7.cardview.R.style.CardView_Light);
        i = attributeset.getColor(android.support.v7.cardview.R.styleable.CardView_cardBackgroundColor, 0);
        float f3 = attributeset.getDimension(android.support.v7.cardview.R.styleable.CardView_cardCornerRadius, 0.0F);
        float f1 = attributeset.getDimension(android.support.v7.cardview.R.styleable.CardView_cardElevation, 0.0F);
        float f2 = attributeset.getDimension(android.support.v7.cardview.R.styleable.CardView_cardMaxElevation, 0.0F);
        mCompatPadding = attributeset.getBoolean(android.support.v7.cardview.R.styleable.CardView_cardUseCompatPadding, false);
        mPreventCornerOverlap = attributeset.getBoolean(android.support.v7.cardview.R.styleable.CardView_cardPreventCornerOverlap, true);
        int j = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPadding, 0);
        mContentPadding.left = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingLeft, j);
        mContentPadding.top = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingTop, j);
        mContentPadding.right = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingRight, j);
        mContentPadding.bottom = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingBottom, j);
        float f = f2;
        if (f1 > f2)
        {
            f = f1;
        }
        attributeset.recycle();
        IMPL.initialize(this, context, i, f3, f1, f);
    }

    public float getCardElevation()
    {
        return IMPL.getElevation(this);
    }

    public int getContentPaddingBottom()
    {
        return mContentPadding.bottom;
    }

    public int getContentPaddingLeft()
    {
        return mContentPadding.left;
    }

    public int getContentPaddingRight()
    {
        return mContentPadding.right;
    }

    public int getContentPaddingTop()
    {
        return mContentPadding.top;
    }

    public float getMaxCardElevation()
    {
        return IMPL.getMaxElevation(this);
    }

    public boolean getPreventCornerOverlap()
    {
        return mPreventCornerOverlap;
    }

    public float getRadius()
    {
        return IMPL.getRadius(this);
    }

    public boolean getUseCompatPadding()
    {
        return mCompatPadding;
    }

    protected void onMeasure(int i, int j)
    {
        if (IMPL instanceof CardViewApi21) goto _L2; else goto _L1
_L1:
        int k = android.view.View.MeasureSpec.getMode(i);
        k;
        JVM INSTR lookupswitch 2: default 40
    //                   -2147483648: 79
    //                   1073741824: 79;
           goto _L3 _L4 _L4
_L3:
        k = android.view.View.MeasureSpec.getMode(j);
        k;
        JVM INSTR lookupswitch 2: default 72
    //                   -2147483648: 108
    //                   1073741824: 108;
           goto _L5 _L6 _L6
_L5:
        super.onMeasure(i, j);
        return;
_L4:
        i = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(IMPL.getMinWidth(this)), android.view.View.MeasureSpec.getSize(i)), k);
        continue; /* Loop/switch isn't completed */
_L6:
        j = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(IMPL.getMinHeight(this)), android.view.View.MeasureSpec.getSize(j)), k);
        if (true) goto _L5; else goto _L2
_L2:
        super.onMeasure(i, j);
        return;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public void setCardBackgroundColor(int i)
    {
        IMPL.setBackgroundColor(this, i);
    }

    public void setCardElevation(float f)
    {
        IMPL.setElevation(this, f);
    }

    public void setMaxCardElevation(float f)
    {
        IMPL.setMaxElevation(this, f);
    }

    public void setPadding(int i, int j, int k, int l)
    {
    }

    public void setPaddingRelative(int i, int j, int k, int l)
    {
    }

    public void setPreventCornerOverlap(boolean flag)
    {
        if (flag == mPreventCornerOverlap)
        {
            return;
        } else
        {
            mPreventCornerOverlap = flag;
            IMPL.onPreventCornerOverlapChanged(this);
            return;
        }
    }

    public void setRadius(float f)
    {
        IMPL.setRadius(this, f);
    }

    public void setShadowPadding(int i, int j, int k, int l)
    {
        mShadowBounds.set(i, j, k, l);
        super.setPadding(mContentPadding.left + i, mContentPadding.top + j, mContentPadding.right + k, mContentPadding.bottom + l);
    }

    public void setUseCompatPadding(boolean flag)
    {
        if (mCompatPadding == flag)
        {
            return;
        } else
        {
            mCompatPadding = flag;
            IMPL.onCompatPaddingChanged(this);
            return;
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new CardViewApi21();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            IMPL = new CardViewJellybeanMr1();
        } else
        {
            IMPL = new CardViewEclairMr1();
        }
        IMPL.initStatic();
    }
}

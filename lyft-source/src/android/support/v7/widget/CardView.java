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

    private static final CardViewImpl a;
    private boolean b;
    private boolean c;
    private final Rect d;
    private final Rect e;

    public CardView(Context context)
    {
        super(context);
        d = new Rect();
        e = new Rect();
        a(context, null, 0);
    }

    public CardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new Rect();
        e = new Rect();
        a(context, attributeset, 0);
    }

    public CardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = new Rect();
        e = new Rect();
        a(context, attributeset, i);
    }

    private void a(Context context, AttributeSet attributeset, int i)
    {
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.cardview.R.styleable.CardView, i, android.support.v7.cardview.R.style.CardView_Light);
        i = attributeset.getColor(android.support.v7.cardview.R.styleable.CardView_cardBackgroundColor, 0);
        float f3 = attributeset.getDimension(android.support.v7.cardview.R.styleable.CardView_cardCornerRadius, 0.0F);
        float f1 = attributeset.getDimension(android.support.v7.cardview.R.styleable.CardView_cardElevation, 0.0F);
        float f2 = attributeset.getDimension(android.support.v7.cardview.R.styleable.CardView_cardMaxElevation, 0.0F);
        b = attributeset.getBoolean(android.support.v7.cardview.R.styleable.CardView_cardUseCompatPadding, false);
        c = attributeset.getBoolean(android.support.v7.cardview.R.styleable.CardView_cardPreventCornerOverlap, true);
        int j = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPadding, 0);
        d.left = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingLeft, j);
        d.top = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingTop, j);
        d.right = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingRight, j);
        d.bottom = attributeset.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingBottom, j);
        float f = f2;
        if (f1 > f2)
        {
            f = f1;
        }
        attributeset.recycle();
        a.a(this, context, i, f3, f1, f);
    }

    public void a(int i, int j, int k, int l)
    {
        e.set(i, j, k, l);
        super.setPadding(d.left + i, d.top + j, d.right + k, d.bottom + l);
    }

    public float getCardElevation()
    {
        return a.e(this);
    }

    public int getContentPaddingBottom()
    {
        return d.bottom;
    }

    public int getContentPaddingLeft()
    {
        return d.left;
    }

    public int getContentPaddingRight()
    {
        return d.right;
    }

    public int getContentPaddingTop()
    {
        return d.top;
    }

    public float getMaxCardElevation()
    {
        return a.a(this);
    }

    public boolean getPreventCornerOverlap()
    {
        return c;
    }

    public float getRadius()
    {
        return a.d(this);
    }

    public boolean getUseCompatPadding()
    {
        return b;
    }

    protected void onMeasure(int i, int j)
    {
        if (a instanceof CardViewApi21) goto _L2; else goto _L1
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
        i = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(a.b(this)), android.view.View.MeasureSpec.getSize(i)), k);
        continue; /* Loop/switch isn't completed */
_L6:
        j = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(a.c(this)), android.view.View.MeasureSpec.getSize(j)), k);
        if (true) goto _L5; else goto _L2
_L2:
        super.onMeasure(i, j);
        return;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public void setCardBackgroundColor(int i)
    {
        a.a(this, i);
    }

    public void setCardElevation(float f)
    {
        a.c(this, f);
    }

    public void setMaxCardElevation(float f)
    {
        a.b(this, f);
    }

    public void setPadding(int i, int j, int k, int l)
    {
    }

    public void setPaddingRelative(int i, int j, int k, int l)
    {
    }

    public void setPreventCornerOverlap(boolean flag)
    {
        if (flag == c)
        {
            return;
        } else
        {
            c = flag;
            a.h(this);
            return;
        }
    }

    public void setRadius(float f)
    {
        a.a(this, f);
    }

    public void setUseCompatPadding(boolean flag)
    {
        if (b == flag)
        {
            return;
        } else
        {
            b = flag;
            a.g(this);
            return;
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new CardViewApi21();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new CardViewJellybeanMr1();
        } else
        {
            a = new CardViewEclairMr1();
        }
        a.a();
    }
}

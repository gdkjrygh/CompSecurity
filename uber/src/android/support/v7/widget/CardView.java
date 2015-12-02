// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bq;
import br;
import fx;
import fy;
import fz;
import ga;
import gb;

public class CardView extends FrameLayout
    implements fy
{

    private static final ga a;
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
        attributeset = context.obtainStyledAttributes(attributeset, br.CardView, i, bq.CardView_Light);
        i = attributeset.getColor(br.CardView_cardBackgroundColor, 0);
        float f4 = attributeset.getDimension(br.CardView_cardCornerRadius, 0.0F);
        float f2 = attributeset.getDimension(br.CardView_cardElevation, 0.0F);
        float f3 = attributeset.getDimension(br.CardView_cardMaxElevation, 0.0F);
        b = attributeset.getBoolean(br.CardView_cardUseCompatPadding, false);
        c = attributeset.getBoolean(br.CardView_cardPreventCornerOverlap, true);
        int j = attributeset.getDimensionPixelSize(br.CardView_contentPadding, 0);
        d.left = attributeset.getDimensionPixelSize(br.CardView_contentPaddingLeft, j);
        d.top = attributeset.getDimensionPixelSize(br.CardView_contentPaddingTop, j);
        d.right = attributeset.getDimensionPixelSize(br.CardView_contentPaddingRight, j);
        d.bottom = attributeset.getDimensionPixelSize(br.CardView_contentPaddingBottom, j);
        float f1 = f3;
        if (f2 > f3)
        {
            f1 = f2;
        }
        attributeset.recycle();
        a.a(this, context, i, f4, f2, f1);
    }

    public final void a(int i)
    {
        a.a(this, i);
    }

    public final void a(int i, int j, int k, int l)
    {
        e.set(i, j, k, l);
        super.setPadding(d.left + i, d.top + j, d.right + k, d.bottom + l);
    }

    public final boolean a()
    {
        return b;
    }

    public void b()
    {
        if (!b)
        {
            return;
        } else
        {
            b = false;
            a.e(this);
            return;
        }
    }

    public final void c()
    {
        a.a(this);
    }

    public void d()
    {
        a.d(this);
    }

    public void e()
    {
        a.a(this, 0.0F);
    }

    public final boolean f()
    {
        return c;
    }

    protected void onMeasure(int i, int j)
    {
        if (a instanceof fx) goto _L2; else goto _L1
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

    public void setPadding(int i, int j, int k, int l)
    {
    }

    public void setPaddingRelative(int i, int j, int k, int l)
    {
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new fx();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new gb();
        } else
        {
            a = new fz();
        }
        a.a();
    }
}

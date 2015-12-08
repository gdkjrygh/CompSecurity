// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import acg;
import ach;
import aci;
import ack;
import acl;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b;
import ui;

public class CardView extends FrameLayout
    implements ach
{

    private static final ack a;
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
        attributeset = context.obtainStyledAttributes(attributeset, ui.a, i, b.bS);
        i = attributeset.getColor(ui.b, 0);
        float f3 = attributeset.getDimension(ui.c, 0.0F);
        float f1 = attributeset.getDimension(ui.d, 0.0F);
        float f2 = attributeset.getDimension(ui.e, 0.0F);
        b = attributeset.getBoolean(ui.g, false);
        c = attributeset.getBoolean(ui.f, true);
        int j = attributeset.getDimensionPixelSize(ui.h, 0);
        d.left = attributeset.getDimensionPixelSize(ui.j, j);
        d.top = attributeset.getDimensionPixelSize(ui.l, j);
        d.right = attributeset.getDimensionPixelSize(ui.k, j);
        d.bottom = attributeset.getDimensionPixelSize(ui.i, j);
        float f = f2;
        if (f1 > f2)
        {
            f = f1;
        }
        attributeset.recycle();
        a.a(this, context, i, f3, f1, f);
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

    public final boolean b()
    {
        return c;
    }

    protected void onMeasure(int i, int j)
    {
        if (a instanceof acg) goto _L2; else goto _L1
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
        i = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(a.a(this)), android.view.View.MeasureSpec.getSize(i)), k);
        continue; /* Loop/switch isn't completed */
_L6:
        j = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(a.b(this)), android.view.View.MeasureSpec.getSize(j)), k);
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
            a = new acg();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new acl();
        } else
        {
            a = new aci();
        }
        a.a();
    }
}

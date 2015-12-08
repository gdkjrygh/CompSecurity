// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.b.a.a;
import android.support.v7.b.b;
import android.support.v7.internal.widget.TintImageView;

// Referenced classes of package android.support.v7.widget:
//            k, g, a

class f extends TintImageView
    implements k
{

    final android.support.v7.widget.a a;
    private final float b[] = new float[2];

    public f(android.support.v7.widget.a a1, Context context)
    {
        a = a1;
        super(context, null, b.actionOverflowButtonStyle);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setOnTouchListener(new g(this, this, a1));
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return false;
    }

    public boolean performClick()
    {
        if (super.performClick())
        {
            return true;
        } else
        {
            playSoundEffect(0);
            a.d();
            return true;
        }
    }

    protected boolean setFrame(int i, int j, int l, int i1)
    {
        boolean flag = super.setFrame(i, j, l, i1);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable drawable1 = getBackground();
        if (drawable != null && drawable1 != null)
        {
            int j1 = getWidth();
            j = getHeight();
            i = Math.max(j1, j) / 2;
            int k1 = getPaddingLeft();
            int l1 = getPaddingRight();
            l = getPaddingTop();
            i1 = getPaddingBottom();
            j1 = (j1 + (k1 - l1)) / 2;
            j = (j + (l - i1)) / 2;
            android.support.v4.b.a.a.a(drawable1, j1 - i, j - i, j1 + i, j + i);
        }
        return flag;
    }
}

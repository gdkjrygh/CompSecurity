// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.a.a.a;
import android.support.v7.a.b;
import android.support.v7.internal.widget.TintImageView;

// Referenced classes of package android.support.v7.widget:
//            i, e, ActionMenuPresenter

final class d extends TintImageView
    implements i
{

    final ActionMenuPresenter a;
    private final float b[] = new float[2];

    public d(ActionMenuPresenter actionmenupresenter, Context context)
    {
        a = actionmenupresenter;
        super(context, null, b.k);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setOnTouchListener(new e(this, this, actionmenupresenter));
    }

    public final boolean d()
    {
        return false;
    }

    public final boolean e()
    {
        return false;
    }

    public final boolean performClick()
    {
        if (super.performClick())
        {
            return true;
        } else
        {
            playSoundEffect(0);
            a.g();
            return true;
        }
    }

    protected final boolean setFrame(int j, int k, int l, int i1)
    {
        boolean flag = super.setFrame(j, k, l, i1);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable drawable1 = getBackground();
        if (drawable != null && drawable1 != null)
        {
            int j1 = getWidth();
            k = getHeight();
            j = Math.max(j1, k) / 2;
            int k1 = getPaddingLeft();
            int l1 = getPaddingRight();
            l = getPaddingTop();
            i1 = getPaddingBottom();
            j1 = (j1 + (k1 - l1)) / 2;
            k = (k + (l - i1)) / 2;
            android.support.v4.a.a.a.a(drawable1, j1 - j, k - j, j1 + j, k + j);
        }
        return flag;
    }
}

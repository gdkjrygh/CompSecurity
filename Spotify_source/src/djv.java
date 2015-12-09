// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;

public final class djv extends abc
{

    private static final djw a = new djw() {

        public final int a(int i)
        {
            return 1;
        }

    };
    private final Drawable b;
    private final djw c;

    public djv(Context context, djw djw1)
    {
        c = djw1;
        djw1 = new TypedValue();
        if (context.getTheme().resolveAttribute(0x1010214, djw1, true))
        {
            b = context.getResources().getDrawable(((TypedValue) (djw1)).resourceId);
            if (b instanceof NinePatchDrawable)
            {
                ((NinePatchDrawable)b).getPaint();
            }
            return;
        } else
        {
            throw new RuntimeException("Divider drawable is not defined in the theme.");
        }
    }

    private djw a(RecyclerView recyclerview)
    {
        if (c != null)
        {
            return c;
        }
        if (recyclerview.e instanceof djw)
        {
            return (djw)recyclerview.e;
        } else
        {
            return a;
        }
    }

    public final void a(Canvas canvas, RecyclerView recyclerview)
    {
        int j = recyclerview.getPaddingLeft();
        int k = recyclerview.getWidth() - recyclerview.getPaddingRight();
        int l = recyclerview.getChildCount();
        for (int i = 0; i < l; i++)
        {
            View view = recyclerview.getChildAt(i);
            int i1 = a(recyclerview).a(RecyclerView.c(view));
            if (i1 == 0)
            {
                continue;
            }
            b.setAlpha((int)(km.f(view) * 255F));
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            if ((i1 & 2) != 0)
            {
                int k1 = view.getTop() - layoutparams.topMargin - (int)view.getTranslationY();
                int i2 = b.getIntrinsicHeight();
                b.setBounds(j, k1 - i2, k, k1);
                b.draw(canvas);
            }
            if ((i1 & 1) != 0)
            {
                int j1 = view.getBottom();
                j1 = layoutparams.bottomMargin + j1 + (int)view.getTranslationY();
                int l1 = b.getIntrinsicHeight();
                b.setBounds(j, j1, k, l1 + j1);
                b.draw(canvas);
            }
        }

    }

    public final void a(Rect rect, View view, RecyclerView recyclerview, abm abm)
    {
        int i = a(recyclerview).a(RecyclerView.c(view));
        if ((i & 2) != 0)
        {
            rect.top = rect.top + b.getIntrinsicHeight();
        }
        if ((i & 1) != 0)
        {
            rect.bottom = rect.bottom + b.getIntrinsicHeight();
        }
    }

}

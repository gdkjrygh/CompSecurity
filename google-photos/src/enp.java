// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;

public final class enp extends afc
    implements fsu
{

    public final Context a;
    public final int b;
    public final int c;
    public Drawable d;
    public GradientDrawable e;
    ObjectAnimator f;

    enp(Context context)
    {
        a = context;
        b = context.getResources().getColor(b.lX);
        c = context.getResources().getColor(b.lW);
    }

    public final void a(Canvas canvas)
    {
        if (e != null && e.isVisible())
        {
            e.draw(canvas);
        }
        if (d != null && d.isVisible())
        {
            d.draw(canvas);
        }
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        super.a(recyclerview, i, j);
        if (d != null)
        {
            recyclerview = new Rect(d.getBounds());
            recyclerview.top = ((Rect) (recyclerview)).top - j;
            recyclerview.bottom = ((Rect) (recyclerview)).bottom - j;
            d.setBounds(recyclerview);
        }
        if (e != null)
        {
            recyclerview = new Rect(e.getBounds());
            recyclerview.top = ((Rect) (recyclerview)).top - j;
            recyclerview.bottom = ((Rect) (recyclerview)).bottom - j;
            e.setBounds(recyclerview);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            b, m

abstract class i
{

    static final int b[] = {
        0x10100a7, 0x101009e
    };
    static final int c[] = {
        0x101009c, 0x101009e
    };
    static final int d[] = new int[0];
    final View e;
    final m f;

    i(View view, m m)
    {
        e = view;
        f = m;
    }

    final Drawable a(int j, ColorStateList colorstatelist)
    {
        Resources resources = e.getResources();
        b b1 = d();
        b1.a(resources.getColor(android.support.design.a.c.design_fab_stroke_top_outer_color), resources.getColor(android.support.design.a.c.design_fab_stroke_top_inner_color), resources.getColor(android.support.design.a.c.design_fab_stroke_end_inner_color), resources.getColor(android.support.design.a.c.design_fab_stroke_end_outer_color));
        b1.a(j);
        b1.a(colorstatelist.getDefaultColor());
        return b1;
    }

    abstract void a();

    abstract void a(float f1);

    abstract void a(int j);

    abstract void a(ColorStateList colorstatelist);

    abstract void a(android.graphics.PorterDuff.Mode mode);

    abstract void a(Drawable drawable, ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int j, int k);

    abstract void a(int ai[]);

    abstract void b();

    abstract void b(float f1);

    abstract void c();

    b d()
    {
        return new b();
    }

}

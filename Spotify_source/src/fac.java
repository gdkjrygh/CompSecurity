// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;

public final class fac
{

    public static final int a = Color.argb(0, 0, 0, 0);
    public static final int b = Color.argb(204, 0, 0, 0);
    public final Resources c;
    public final int d;
    public final int e;
    public final int f;
    private final int g;
    private final int h;

    public fac(Context context)
    {
        ctz.a(context);
        c = context.getResources();
        d = gcg.b(context, 0x7f0f0080);
        e = gcg.b(context, 0x7f0f0035);
        g = c.getDimensionPixelSize(0x7f0c011c);
        h = d;
        f = gcg.b(context, 0x7f0f0036);
    }

    public final fad a()
    {
        ColorDrawable colordrawable = new ColorDrawable(d);
        dfs dfs1 = new dfs();
        dfs1.setColorFilter(e, android.graphics.PorterDuff.Mode.SRC_ATOP);
        dfs1.a(colordrawable, false);
        ColorDrawable colordrawable1 = new ColorDrawable(f);
        GradientDrawable gradientdrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            a, b
        });
        dfx dfx1 = new dfx(g, h);
        return new fad(c, dfs1, colordrawable, colordrawable1, gradientdrawable, dfx1);
    }

}

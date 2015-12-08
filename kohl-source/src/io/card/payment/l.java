// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.DisplayMetrics;

// Referenced classes of package io.card.payment:
//            m

public final class l
{

    public static final int a;
    public static final Drawable b = new ColorDrawable(Color.parseColor("#55a0cc"));
    public static final int c = Color.parseColor("#f5f5f5");
    public static final int d = Color.parseColor("#b32317");
    public static final int e;
    public static final Typeface f = Typeface.create("sans-serif-light", 0);
    private static int g[] = {
        0x10100a7, 0x101009e
    };
    private static int h[] = {
        0x101009e
    };
    private static int i[] = {
        0xfefeff62
    };
    private static int j[] = {
        0x101009c
    };
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p = Color.parseColor("#c5ddeb");
    private static int q = Color.parseColor("#717074");
    private static int r = Color.parseColor("#aa717074");
    private static int s = Color.parseColor("#5a5a5d");
    private static int t = Color.parseColor("#f5f5f5");
    private static int u;
    private static int v;

    private static Drawable a(int i1, float f1)
    {
        ColorDrawable colordrawable = new ColorDrawable(i1);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
        shapedrawable.getPaint().setStrokeWidth(2.0F * f1);
        shapedrawable.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        shapedrawable.getPaint().setColor(c);
        return new LayerDrawable(new Drawable[] {
            colordrawable, shapedrawable
        });
    }

    private static Drawable a(int i1, int j1, float f1)
    {
        ColorDrawable colordrawable = new ColorDrawable(i1);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
        shapedrawable.getPaint().setStrokeWidth(2.0F * f1);
        shapedrawable.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        shapedrawable.getPaint().setColor(c);
        ShapeDrawable shapedrawable1 = new ShapeDrawable(new RectShape());
        shapedrawable1.getPaint().setStrokeWidth(f1);
        shapedrawable1.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        shapedrawable1.getPaint().setColor(j1);
        return new LayerDrawable(new Drawable[] {
            colordrawable, shapedrawable, shapedrawable1
        });
    }

    public static Drawable a(Context context)
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(g, new ColorDrawable(o));
        statelistdrawable.addState(i, new ColorDrawable(p));
        statelistdrawable.addState(j, a(m, n, c(context)));
        statelistdrawable.addState(h, a(m, c(context)));
        return statelistdrawable;
    }

    public static Drawable b(Context context)
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(g, new ColorDrawable(s));
        statelistdrawable.addState(i, new ColorDrawable(t));
        statelistdrawable.addState(j, a(q, r, c(context)));
        statelistdrawable.addState(h, a(q, c(context)));
        return statelistdrawable;
    }

    private static float c(Context context)
    {
        return context.getResources().getDisplayMetrics().density * (io.card.payment.m.b("4dip", context) / 2.0F);
    }

    static 
    {
        a = Color.parseColor("#003087");
        k = Color.parseColor("#aa003087");
        l = Color.parseColor("#009CDE");
        Color.parseColor("#c4dceb");
        m = a;
        n = k;
        o = l;
        Color.parseColor("#e5e5e5");
        Color.parseColor("#333333");
        u = Color.parseColor("#515151");
        v = Color.parseColor("#797979");
        int i1 = u;
        e = u;
        i1 = u;
        i1 = a;
        i1 = u;
        i1 = v;
        Typeface.create("sans-serif-light", 0);
        Typeface.create("sans-serif-light", 0);
        Typeface.create("sans-serif-bold", 0);
        Typeface.create("sans-serif-light", 0);
        Typeface.create("sans-serif", 0);
        Typeface.create("sans-serif-light", 0);
        int ai[] = g;
        int ai1[] = h;
        i1 = o;
        int j1 = m;
        new ColorStateList(new int[][] {
            ai, ai1
        }, new int[] {
            i1, j1
        });
    }
}

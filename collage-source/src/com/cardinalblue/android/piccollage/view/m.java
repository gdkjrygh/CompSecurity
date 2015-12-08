// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.opengl.GLES20;
import android.text.TextPaint;
import android.util.TypedValue;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.ColorOption;
import com.cardinalblue.android.piccollage.model.gson.FontModel;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;
import java.util.HashMap;

public class m
{
    public static interface a
    {

        public abstract void a();
    }


    private static final HashMap b = new HashMap();
    private static int r = -1;
    private final boolean a;
    private int c;
    private boolean d;
    private float e;
    private float f;
    private float g;
    private int h;
    private int i;
    private float j;
    private Path k;
    private String l;
    private String m;
    private Paint n;
    private Paint o;
    private Paint p;
    private Context q;
    private int s;
    private final RectF t = new RectF();
    private a u;

    public m(Context context, TextScrapModel textscrapmodel, boolean flag)
    {
        q = context;
        TextFormatModel textformatmodel = textscrapmodel.getText().getTextFormat();
        g = (int)TypedValue.applyDimension(2, 40F, context.getResources().getDisplayMetrics());
        float f1 = g * 0.1F * 3F;
        e = f1;
        f = f1;
        j = -1F;
        int i1;
        if (r > 0)
        {
            i1 = r;
        } else
        {
            i1 = 1024;
        }
        s = i1;
        p = new Paint();
        p.setTextSize(g);
        p.setTextAlign(android.graphics.Paint.Align.CENTER);
        p.setAntiAlias(true);
        p.setStyle(android.graphics.Paint.Style.STROKE);
        p.setStrokeWidth(e);
        n = new TextPaint();
        n.setTextSize(g);
        n.setTextAlign(android.graphics.Paint.Align.CENTER);
        n.setAntiAlias(true);
        o = new Paint();
        o.setTextSize(g);
        o.setTextAlign(android.graphics.Paint.Align.CENTER);
        o.setAntiAlias(true);
        a = flag;
        m = textformatmodel.getFont().getFontName();
        context = b(q, m);
        p.setTypeface(context);
        n.setTypeface(context);
        n.setColor(textformatmodel.getTextColor());
        o.setColor(textformatmodel.getTextBackgroundColor());
        b(textscrapmodel.getText().getText());
        d = textformatmodel.hasTextBorder();
        c = textformatmodel.getTextBorderColor();
        e();
    }

    private void a(String as[])
    {
        g = TypedValue.applyDimension(2, 40F, q.getResources().getDisplayMetrics());
        float f2;
        if (s <= 1024)
        {
            f2 = 1024F;
        } else
        {
            f2 = s / 2;
        }
        do
        {
            int j1 = as.length;
            int i1 = 0;
            float f1 = 0.0F;
            for (; i1 < j1; i1++)
            {
                String s1 = as[i1];
                float f3 = p.measureText(s1);
                if (f3 > f1)
                {
                    f1 = f3;
                }
            }

            h = (int)(f * 2.0F + f1);
            float f5 = p.getFontSpacing();
            i = (int)((float)as.length * f5 + f * 2.0F);
            float f4;
            if (a)
            {
                i1 = -i / 2;
            } else
            {
                i1 = 0;
            }
            f4 = (float)i1 + 0.667F * f5 + f;
            if (a)
            {
                f1 = 0.0F;
            } else
            {
                f1 = h / 2;
            }
            k = new Path();
            for (i1 = 0; i1 < as.length; i1++)
            {
                String s2 = as[i1];
                Path path = new Path();
                n.getTextPath(s2, 0, s2.length(), f1, f4, path);
                path.close();
                k.addPath(path);
                f4 += f5;
            }

            Object obj = new Matrix();
            ((Matrix) (obj)).setScale(3F, 3F);
            k.transform(((Matrix) (obj)));
            obj = new RectF();
            k.computeBounds(((RectF) (obj)), true);
            f4 = ((RectF) (obj)).right;
            f5 = ((RectF) (obj)).left;
            float f6 = ((RectF) (obj)).bottom;
            float f7 = ((RectF) (obj)).top;
            if (j < 0.0F)
            {
                f1 = h;
            } else
            {
                f1 = j;
            }
            j = f1;
            if (f4 - f5 >= f2 || f6 - f7 >= f2)
            {
                g = n.getTextSize() * 0.95F;
                f1 = g * 0.1F * 3F;
                e = f1;
                f = f1;
                n.setTextSize(g);
                p.setTextSize(g);
                p.setStrokeWidth(e);
                o.setTextSize(g);
            } else
            {
                k.computeBounds(t, true);
                as = t;
                as.left = ((RectF) (as)).left - f;
                as = t;
                as.right = ((RectF) (as)).right + f;
                as = t;
                as.top = ((RectF) (as)).top - f;
                as = t;
                as.bottom = ((RectF) (as)).bottom + f;
                return;
            }
        } while (true);
    }

    public static Typeface b(Context context, String s1)
    {
        Typeface typeface = c(context, (new StringBuilder()).append("fonts/").append(s1).toString());
        s1 = typeface;
        if (typeface == null)
        {
            s1 = c(context, "fonts/font_Vanilla.ttf");
        }
        return s1;
    }

    private void b(String s1)
    {
        l = s1;
        do
        {
            String as[] = l.split("\n");
            StringBuilder stringbuilder = new StringBuilder("");
            int i1 = 0;
            int j1 = 0;
            while (i1 < as.length) 
            {
                String s2 = as[i1];
                s1 = s2;
                if (s2.length() > 48)
                {
                    j1 = s2.substring(0, 48).lastIndexOf(' ');
                    if (j1 >= 0)
                    {
                        s1 = (new StringBuilder(s2)).replace(j1, j1 + 1, "\n").toString();
                    } else
                    {
                        s1 = (new StringBuilder(s2)).insert(48, "\n").toString();
                    }
                    j1 = 1;
                }
                stringbuilder.append(s1).append("\n");
                i1++;
            }
            try
            {
                l = stringbuilder.deleteCharAt(stringbuilder.length() - 1).toString();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.cardinalblue.android.piccollage.a.f.a(s1);
            }
        } while (j1 != 0);
        a(as);
    }

    private static Typeface c(Context context, String s1)
    {
        if (!b.containsKey(s1))
        {
            try
            {
                context = Typeface.createFromAsset(context.getAssets(), s1);
                b.put(s1, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.cardinalblue.android.piccollage.a.f.a(new RuntimeException((new StringBuilder()).append("Cannot load font: ").append(s1).toString()));
            }
        }
        return (Typeface)b.get(s1);
    }

    private void e()
    {
        Paint paint = p;
        int i1;
        if (d)
        {
            i1 = c;
        } else
        {
            i1 = 0;
        }
        paint.setColor(i1);
    }

    private void f()
    {
        while (q == null || p == null || n == null || o == null) 
        {
            return;
        }
        g = (int)TypedValue.applyDimension(2, 40F, q.getResources().getDisplayMetrics());
        float f1 = g * 0.1F * 3F;
        e = f1;
        f = f1;
        p.setTextSize(g);
        p.setStrokeWidth(e);
        n.setTextSize(g);
        o.setTextSize(g);
    }

    public String a()
    {
        return l;
    }

    public void a(int i1)
    {
        o.setColor(i1);
    }

    public void a(Context context, String s1)
    {
        m = s1;
        context = b(context, m);
        p.setTypeface(context);
        n.setTypeface(context);
        a(l);
    }

    public void a(Canvas canvas)
    {
        int i1 = 1024;
        if (r < 0)
        {
            int ai[] = new int[1];
            GLES20.glGetIntegerv(3379, ai, 0);
            if (ai[0] > 0)
            {
                if (ai[0] > 1024)
                {
                    i1 = ai[0];
                }
                r = i1;
                s = r;
                f();
                b(l);
                if (u != null)
                {
                    u.a();
                }
            }
        }
        canvas.drawRect(t, o);
        canvas.drawPath(k, p);
        canvas.drawPath(k, n);
    }

    public void a(ColorOption coloroption)
    {
        n.setColor(coloroption.getColor());
        c = coloroption.getContrastColor();
        e();
    }

    public void a(a a1)
    {
        u = a1;
    }

    public void a(String s1)
    {
        f();
        b(s1);
    }

    public void a(boolean flag)
    {
        d = flag;
        e();
    }

    public String b()
    {
        return m;
    }

    public void b(int i1)
    {
        n.setAlpha(i1);
        if (p.getAlpha() != 0)
        {
            p.setAlpha(i1);
        }
        if (o.getAlpha() != 0)
        {
            o.setAlpha(i1);
        }
    }

    public int c()
    {
        return h;
    }

    public int d()
    {
        return i;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getbase.floatingactionbutton;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.TextView;

// Referenced classes of package com.getbase.floatingactionbutton:
//            b, a, d, e, 
//            g, f

public class FloatingActionButton extends ImageButton
{

    int a;
    int b;
    int c;
    String d;
    boolean e;
    private int f;
    private Drawable g;
    private int h;
    private float i;
    private float j;
    private float k;
    private int l;

    public FloatingActionButton(Context context)
    {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a(context, attributeset);
    }

    private Drawable a(int i1, float f1)
    {
        int j1 = Color.alpha(i1);
        i1 = f(i1);
        Object obj = new ShapeDrawable(new OvalShape());
        Paint paint = ((ShapeDrawable) (obj)).getPaint();
        paint.setAntiAlias(true);
        paint.setColor(i1);
        Drawable adrawable[] = new Drawable[2];
        adrawable[0] = ((Drawable) (obj));
        adrawable[1] = c(i1, f1);
        if (j1 == 255 || !e)
        {
            obj = new LayerDrawable(adrawable);
        } else
        {
            obj = new b(j1, adrawable);
        }
        i1 = (int)(f1 / 2.0F);
        ((LayerDrawable) (obj)).setLayerInset(1, i1, i1, i1, i1);
        return ((Drawable) (obj));
    }

    private StateListDrawable a(float f1)
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        Drawable drawable = a(c, f1);
        statelistdrawable.addState(new int[] {
            0xfefeff62
        }, drawable);
        drawable = a(b, f1);
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, drawable);
        drawable = a(a, f1);
        statelistdrawable.addState(new int[0], drawable);
        return statelistdrawable;
    }

    private int b(int i1, float f1)
    {
        float af[] = new float[3];
        Color.colorToHSV(i1, af);
        af[2] = Math.min(af[2] * f1, 1.0F);
        return Color.HSVToColor(Color.alpha(i1), af);
    }

    private Drawable b(float f1)
    {
        ShapeDrawable shapedrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapedrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(0xff000000);
        paint.setAlpha(c(0.02F));
        return shapedrawable;
    }

    private void b()
    {
        l = (int)(i + 2.0F * j);
    }

    private int c(float f1)
    {
        return (int)(255F * f1);
    }

    private int c(int i1)
    {
        return b(i1, 0.9F);
    }

    private Drawable c(int i1, float f1)
    {
        if (!e)
        {
            return new ColorDrawable(0);
        } else
        {
            ShapeDrawable shapedrawable = new ShapeDrawable(new OvalShape());
            int j1 = c(i1);
            int k1 = e(j1);
            int l1 = d(i1);
            int i2 = e(l1);
            Paint paint = shapedrawable.getPaint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(f1);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            shapedrawable.setShaderFactory(new a(this, l1, i2, i1, k1, j1));
            return shapedrawable;
        }
    }

    private void c()
    {
        int i1;
        if (h == 0)
        {
            i1 = d.fab_size_normal;
        } else
        {
            i1 = d.fab_size_mini;
        }
        i = b(i1);
    }

    private int d(int i1)
    {
        return b(i1, 1.1F);
    }

    private int e(int i1)
    {
        return Color.argb(Color.alpha(i1) / 2, Color.red(i1), Color.green(i1), Color.blue(i1));
    }

    private int f(int i1)
    {
        return Color.rgb(Color.red(i1), Color.green(i1), Color.blue(i1));
    }

    private void setBackgroundCompat(Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            setBackground(drawable);
            return;
        } else
        {
            setBackgroundDrawable(drawable);
            return;
        }
    }

    int a(int i1)
    {
        return getResources().getColor(i1);
    }

    void a()
    {
        float f1 = b(d.fab_stroke_width);
        float f2 = f1 / 2.0F;
        Object obj = getResources();
        int i1;
        int j1;
        int k1;
        int l1;
        if (h == 0)
        {
            i1 = e.fab_bg_normal;
        } else
        {
            i1 = e.fab_bg_mini;
        }
        obj = new LayerDrawable(new Drawable[] {
            ((Resources) (obj)).getDrawable(i1), a(f1), b(f1), getIconDrawable()
        });
        i1 = (int)(i - b(d.fab_icon_size)) / 2;
        j1 = (int)j;
        k1 = (int)(j - k);
        l1 = (int)(j + k);
        ((LayerDrawable) (obj)).setLayerInset(1, j1, k1, j1, l1);
        ((LayerDrawable) (obj)).setLayerInset(2, (int)((float)j1 - f2), (int)((float)k1 - f2), (int)((float)j1 - f2), (int)((float)l1 - f2));
        ((LayerDrawable) (obj)).setLayerInset(3, j1 + i1, k1 + i1, j1 + i1, l1 + i1);
        setBackgroundCompat(((Drawable) (obj)));
    }

    void a(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, g.FloatingActionButton, 0, 0);
        a = context.getColor(g.FloatingActionButton_fab_colorNormal, a(0x1060013));
        b = context.getColor(g.FloatingActionButton_fab_colorPressed, a(0x1060012));
        c = context.getColor(g.FloatingActionButton_fab_colorDisabled, a(0x1060000));
        h = context.getInt(g.FloatingActionButton_fab_size, 0);
        f = context.getResourceId(g.FloatingActionButton_fab_icon, 0);
        d = context.getString(g.FloatingActionButton_fab_title);
        e = context.getBoolean(g.FloatingActionButton_fab_stroke_visible, true);
        context.recycle();
        c();
        j = b(d.fab_shadow_radius);
        k = b(d.fab_shadow_offset);
        b();
        a();
    }

    float b(int i1)
    {
        return getResources().getDimension(i1);
    }

    public int getColorDisabled()
    {
        return c;
    }

    public int getColorNormal()
    {
        return a;
    }

    public int getColorPressed()
    {
        return b;
    }

    Drawable getIconDrawable()
    {
        if (g != null)
        {
            return g;
        }
        if (f != 0)
        {
            return getResources().getDrawable(f);
        } else
        {
            return new ColorDrawable(0);
        }
    }

    TextView getLabelView()
    {
        return (TextView)getTag(f.fab_label);
    }

    public int getSize()
    {
        return h;
    }

    public String getTitle()
    {
        return d;
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        setMeasuredDimension(l, l);
    }

    public void setColorDisabled(int i1)
    {
        if (c != i1)
        {
            c = i1;
            a();
        }
    }

    public void setColorDisabledResId(int i1)
    {
        setColorDisabled(a(i1));
    }

    public void setColorNormal(int i1)
    {
        if (a != i1)
        {
            a = i1;
            a();
        }
    }

    public void setColorNormalResId(int i1)
    {
        setColorNormal(a(i1));
    }

    public void setColorPressed(int i1)
    {
        if (b != i1)
        {
            b = i1;
            a();
        }
    }

    public void setColorPressedResId(int i1)
    {
        setColorPressed(a(i1));
    }

    public void setIcon(int i1)
    {
        if (f != i1)
        {
            f = i1;
            g = null;
            a();
        }
    }

    public void setIconDrawable(Drawable drawable)
    {
        if (g != drawable)
        {
            f = 0;
            g = drawable;
            a();
        }
    }

    public void setSize(int i1)
    {
        if (i1 != 1 && i1 != 0)
        {
            throw new IllegalArgumentException("Use @FAB_SIZE constants only!");
        }
        if (h != i1)
        {
            h = i1;
            c();
            b();
            a();
        }
    }

    public void setStrokeVisible(boolean flag)
    {
        if (e != flag)
        {
            e = flag;
            a();
        }
    }

    public void setTitle(String s)
    {
        d = s;
        TextView textview = getLabelView();
        if (textview != null)
        {
            textview.setText(s);
        }
    }

    public void setVisibility(int i1)
    {
        TextView textview = getLabelView();
        if (textview != null)
        {
            textview.setVisibility(i1);
        }
        super.setVisibility(i1);
    }
}

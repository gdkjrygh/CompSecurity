// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.overlays;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.DynamicLayout;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.library.services.IAviaryController;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;

public abstract class AviaryOverlay extends RelativeLayout
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a(AviaryOverlay aviaryoverlay);
    }


    private static SharedPreferences A;
    protected static final CharSequence a = "left";
    protected static final CharSequence b = "center";
    protected static final CharSequence c = "right";
    private static final Object z = new Object();
    protected final int d;
    protected int e;
    protected final com.aviary.android.feather.common.a.a.c f;
    protected a g;
    private final DisplayMetrics h;
    private final int i;
    private final int j;
    private int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final String s;
    private float t;
    private com.nineoldandroids.a.a u;
    private com.nineoldandroids.a.a v;
    private int w;
    private boolean x;
    private Button y;

    public AviaryOverlay(Context context, String s1, int i1, int j1)
    {
        super(context);
        t = 0.0F;
        e = 1;
        f = com.aviary.android.feather.common.a.a.a(getClass().getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
        Resources resources = context.getResources();
        w = j1;
        s = s1;
        context = context.getTheme().obtainStyledAttributes(i1, com.aviary.android.feather.sdk.R.styleable.AviaryOverlay);
        i = context.getColor(0, 0xff000000);
        l = context.getResourceId(2, 0x1030042);
        m = context.getResourceId(3, 0x1030044);
        n = context.getResourceId(4, com.aviary.android.feather.sdk.R.drawable.aviary_overlay_blemish_arrow);
        q = context.getResourceId(5, com.aviary.android.feather.sdk.R.drawable.aviary_overlay_ripple);
        p = context.getDimensionPixelSize(7, 0);
        o = context.getDimensionPixelSize(6, 0);
        r = context.getInt(1, 250);
        d = context.getDimensionPixelSize(8, 0);
        context.recycle();
        k = i;
        j = Color.alpha(i);
        h = resources.getDisplayMetrics();
        f.b("background color: 0x%s", new Object[] {
            Integer.toHexString(k)
        });
        f.b("background alpha: %d", new Object[] {
            Integer.valueOf(j)
        });
        setVisibility(4);
        setHardwareAccelerated(true);
    }

    static SharedPreferences a(Context context)
    {
        synchronized (z)
        {
            if (A == null)
            {
                A = context.getSharedPreferences("aviary-overlays", 0);
            }
        }
        return A;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private DynamicLayout a(CharSequence charsequence, int i1, android.text.Layout.Alignment alignment, int j1)
    {
        TextPaint textpaint = new TextPaint();
        textpaint.setAntiAlias(true);
        textpaint.setLinearText(true);
        textpaint.setFilterBitmap(true);
        TextAppearanceSpan textappearancespan = new TextAppearanceSpan(getContext(), j1);
        charsequence = new SpannableString(charsequence);
        charsequence.setSpan(textappearancespan, 0, charsequence.length(), 0);
        return new DynamicLayout(charsequence, textpaint, i1, alignment, 1.0F, 1.0F, true);
    }

    public static void a(Context context, int i1)
    {
        a(a(context), i1);
    }

    private static void a(SharedPreferences sharedpreferences, int i1)
    {
        if (i1 < 0)
        {
            return;
        } else
        {
            sharedpreferences = sharedpreferences.edit();
            sharedpreferences.putInt((new StringBuilder()).append("overlay-").append(i1).toString(), 1);
            sharedpreferences.commit();
            return;
        }
    }

    public static void a(IAviaryController iaviarycontroller, int i1)
    {
        if (iaviarycontroller != null && iaviarycontroller.a() != null)
        {
            a(iaviarycontroller.a(), i1);
        }
    }

    private DynamicLayout b(CharSequence charsequence, int i1, android.text.Layout.Alignment alignment, int j1)
    {
        TextPaint textpaint = new TextPaint();
        textpaint.setAntiAlias(true);
        textpaint.setLinearText(true);
        textpaint.setFilterBitmap(true);
        TextAppearanceSpan textappearancespan = new TextAppearanceSpan(getContext(), j1);
        charsequence = (SpannableStringBuilder)Html.fromHtml((String)charsequence);
        charsequence.setSpan(textappearancespan, 0, charsequence.length(), 0);
        return new DynamicLayout(charsequence, textpaint, i1, alignment, 1.0F, 1.0F, true);
    }

    public static boolean b(Context context, int i1)
    {
        return b(a(context), i1);
    }

    private static boolean b(SharedPreferences sharedpreferences, int i1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i1 > -1)
        {
            flag = flag1;
            if (!sharedpreferences.contains((new StringBuilder()).append("overlay-").append(i1).toString()))
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean b(IAviaryController iaviarycontroller, int i1)
    {
        if (iaviarycontroller != null && iaviarycontroller.a() != null)
        {
            return b(iaviarycontroller.a(), i1);
        } else
        {
            return false;
        }
    }

    private boolean o()
    {
        SharedPreferences sharedpreferences;
        if (getContext() != null)
        {
            if (b(sharedpreferences = a(getContext()), w))
            {
                a(sharedpreferences, w);
                return true;
            }
        }
        return false;
    }

    Bitmap a(DynamicLayout dynamiclayout)
    {
        Bitmap bitmap = Bitmap.createBitmap(dynamiclayout.getWidth(), dynamiclayout.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        bitmap.eraseColor(0);
        dynamiclayout.draw(new Canvas(bitmap));
        return bitmap;
    }

    Drawable a()
    {
        return getContext().getResources().getDrawable(n);
    }

    Drawable a(Context context, CharSequence charsequence, int i1, android.text.Layout.Alignment alignment)
    {
        charsequence = a(a(charsequence, i1, alignment));
        return new BitmapDrawable(context.getResources(), charsequence);
    }

    DynamicLayout a(CharSequence charsequence, int i1, android.text.Layout.Alignment alignment)
    {
        return a(charsequence, i1, alignment, getTitleStyle());
    }

    protected void a(String s1)
    {
        if (getContext() != null && s1 != null)
        {
            com.aviary.android.feather.common.b.b.a(getContext()).a((new StringBuilder()).append(s).append(": tutorial_closed").toString(), new String[] {
                "from", s1
            });
        }
    }

    protected transient void a(int ai[])
    {
        int i1 = 0;
        if (y == null)
        {
            y = (Button)LayoutInflater.from(getContext()).inflate(com.aviary.android.feather.sdk.R.layout.aviary_overlay_close_button, this, false);
            y.setOnClickListener(this);
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)generateDefaultLayoutParams();
            for (int j1 = ai.length; i1 < j1; i1++)
            {
                layoutparams.addRule(ai[i1]);
            }

            layoutparams.setMargins(d, d, d, d);
            y.setLayoutParams(layoutparams);
            y.setVisibility(8);
            addView(y);
        }
    }

    public boolean a(long l1)
    {
        f.b("show");
        ViewGroup viewgroup = (ViewGroup)((Activity)getContext()).getWindow().getDecorView();
        if (viewgroup != null && viewgroup.getHandler() != null)
        {
            if (o())
            {
                x = true;
                viewgroup.addView(this, new android.view.ViewGroup.LayoutParams(-1, -1));
                viewgroup.getHandler().postDelayed(new Runnable() {

                    final AviaryOverlay a;

                    public void run()
                    {
                        a.d();
                        a.c();
                        a.e();
                    }

            
            {
                a = AviaryOverlay.this;
                super();
            }
                }, l1);
                return true;
            }
            f.a("don't show");
        } else
        {
            f.c("handler is null");
        }
        return false;
    }

    Drawable b()
    {
        return getContext().getResources().getDrawable(q);
    }

    Drawable b(Context context, CharSequence charsequence, int i1, android.text.Layout.Alignment alignment)
    {
        charsequence = a(b(charsequence, i1, alignment));
        return new BitmapDrawable(context.getResources(), charsequence);
    }

    DynamicLayout b(CharSequence charsequence, int i1, android.text.Layout.Alignment alignment)
    {
        return a(charsequence, i1, alignment, getTextStyle());
    }

    public void b(String s1)
    {
        if (!j())
        {
            return;
        } else
        {
            f.b("hide");
            c(s1);
            return;
        }
    }

    Drawable c(Context context, CharSequence charsequence, int i1, android.text.Layout.Alignment alignment)
    {
        charsequence = a(c(charsequence, i1, alignment));
        return new BitmapDrawable(context.getResources(), charsequence);
    }

    DynamicLayout c(CharSequence charsequence, int i1, android.text.Layout.Alignment alignment)
    {
        return b(charsequence, i1, alignment, getTextStyle());
    }

    protected void c()
    {
        if (getContext() != null)
        {
            com.aviary.android.feather.common.b.b.a(getContext()).a((new StringBuilder()).append(s).append(": tutorial_presented").toString());
        }
    }

    protected void c(String s1)
    {
        if (u == null)
        {
            f.b("fadeOut");
            u = l();
            u.a(new com.nineoldandroids.a.a.a(s1) {

                final String a;
                final AviaryOverlay b;

                public void a(com.nineoldandroids.a.a a1)
                {
                }

                public void b(com.nineoldandroids.a.a a1)
                {
                    if (a != null)
                    {
                        b.a(a);
                    }
                    b.i();
                }

                public void c(com.nineoldandroids.a.a a1)
                {
                }

                public void d(com.nineoldandroids.a.a a1)
                {
                }

            
            {
                b = AviaryOverlay.this;
                a = s1;
                super();
            }
            });
            u.a();
        }
    }

    protected abstract void d();

    protected abstract void e();

    protected abstract void f();

    public final boolean g()
    {
        return a(100L);
    }

    public float getAlpha()
    {
        return t;
    }

    public int getAnimationDuration()
    {
        return r;
    }

    public int getBackgroundColor()
    {
        return k;
    }

    public Button getCloseButton()
    {
        return y;
    }

    DisplayMetrics getDisplayMetrics()
    {
        return h;
    }

    public int getTextMargins()
    {
        return p;
    }

    public int getTextStyle()
    {
        return m;
    }

    public int getTitleMargins()
    {
        return o;
    }

    public int getTitleStyle()
    {
        return l;
    }

    protected final String getToolName()
    {
        return s;
    }

    public void h()
    {
        b(null);
    }

    public void i()
    {
        x = false;
        if (getParent() != null)
        {
            f.b("dismiss");
            ((ViewGroup)getParent()).removeView(this);
        }
    }

    protected boolean j()
    {
        return x && getParent() != null;
    }

    protected com.nineoldandroids.a.a k()
    {
        c c1 = new c();
        ((c)c1).a(new com.nineoldandroids.a.a[] {
            com.nineoldandroids.a.k.a(this, "alpha", new float[] {
                0.0F, 1.0F
            })
        });
        c1.b(getAnimationDuration());
        return c1;
    }

    protected com.nineoldandroids.a.a l()
    {
        k k1 = com.nineoldandroids.a.k.a(this, "alpha", new float[] {
            1.0F, 0.0F
        });
        k1.b(getAnimationDuration());
        return k1;
    }

    protected void m()
    {
        if (v == null)
        {
            f.b("fadeIn");
            v = k();
            v.a(new com.nineoldandroids.a.a.a() {

                final AviaryOverlay a;

                public void a(com.nineoldandroids.a.a a1)
                {
                    a.setVisibility(0);
                }

                public void b(com.nineoldandroids.a.a a1)
                {
                    a.f();
                }

                public void c(com.nineoldandroids.a.a a1)
                {
                }

                public void d(com.nineoldandroids.a.a a1)
                {
                }

            
            {
                a = AviaryOverlay.this;
                super();
            }
            });
            v.a();
        }
    }

    public boolean n()
    {
        if (j())
        {
            f.b("onBackPressed");
            b("back");
            return true;
        } else
        {
            return false;
        }
    }

    public void onClick(View view)
    {
        f.b((new StringBuilder()).append("onClick: ").append(view).toString());
        if (view == getCloseButton())
        {
            b("button");
        }
    }

    public void setAlpha(float f1)
    {
        t = f1;
        k = Color.argb((int)((float)j * f1), 0, 0, 0);
        postInvalidate();
    }

    public void setHardwareAccelerated(boolean flag)
    {
        if (flag)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                if (isHardwareAccelerated())
                {
                    Paint paint = new Paint();
                    paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.OVERLAY));
                    setLayerType(2, paint);
                    return;
                } else
                {
                    setLayerType(1, null);
                    return;
                }
            } else
            {
                setDrawingCacheEnabled(true);
                return;
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setLayerType(1, null);
            return;
        } else
        {
            setDrawingCacheEnabled(true);
            return;
        }
    }

    public void setOnCloseListener(a a1)
    {
        g = a1;
    }

}

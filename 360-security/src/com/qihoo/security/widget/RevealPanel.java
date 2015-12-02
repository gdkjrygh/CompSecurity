// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.nineoldandroids.b.a;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.widget.shadow.ZDepth;
import com.qihoo.security.widget.shadow.ZDepthShadowLayout;
import com.qihoo360.mobilesafe.b.r;

// Referenced classes of package com.qihoo.security.widget:
//            RevealRippleLayout, MaterialRippleLayout

public class RevealPanel extends ZDepthShadowLayout
{

    private ZDepthShadowLayout j;
    private MaterialRippleLayout k;
    private RevealRippleLayout l;
    private ImageView m;
    private LocaleTextView n;
    private LocaleTextView o;
    private View p;
    private int q;
    private android.widget.LinearLayout.LayoutParams r;
    private RevealRippleLayout.a s;
    private int t;
    private boolean u;
    private boolean v;
    private final int w;
    private int x;
    private int y;
    private boolean z;

    public RevealPanel(Context context)
    {
        super(context);
        t = 0xfffafafa;
        w = 50;
        x = 50;
        y = 50;
        z = true;
        h();
    }

    public RevealPanel(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        t = 0xfffafafa;
        w = 50;
        x = 50;
        y = 50;
        z = true;
        h();
    }

    public RevealPanel(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        t = 0xfffafafa;
        w = 50;
        x = 50;
        y = 50;
        z = true;
        h();
    }

    static MaterialRippleLayout a(RevealPanel revealpanel)
    {
        return revealpanel.k;
    }

    static boolean a(RevealPanel revealpanel, boolean flag)
    {
        revealpanel.v = flag;
        return flag;
    }

    static int b(RevealPanel revealpanel)
    {
        return revealpanel.t;
    }

    static boolean b(RevealPanel revealpanel, boolean flag)
    {
        revealpanel.u = flag;
        return flag;
    }

    static RevealRippleLayout.a c(RevealPanel revealpanel)
    {
        return revealpanel.s;
    }

    static ZDepthShadowLayout d(RevealPanel revealpanel)
    {
        return revealpanel.j;
    }

    static LocaleTextView e(RevealPanel revealpanel)
    {
        return revealpanel.n;
    }

    static int f(RevealPanel revealpanel)
    {
        return revealpanel.x;
    }

    static int g(RevealPanel revealpanel)
    {
        return revealpanel.y;
    }

    private void h()
    {
    }

    static boolean h(RevealPanel revealpanel)
    {
        return revealpanel.v;
    }

    private void setOriginRiple(RevealRippleLayout revealripplelayout)
    {
        revealripplelayout.post(new Runnable(revealripplelayout) {

            final RevealRippleLayout a;
            final RevealPanel b;

            public void run()
            {
                b.b();
                View view = a.getChildAt(0);
                a.setxRippleOrigin(Float.valueOf(com.nineoldandroids.b.a.a(view) + (float)(view.getWidth() / 2)));
                RevealRippleLayout revealripplelayout1 = a;
                float f1 = com.nineoldandroids.b.a.b(view);
                revealripplelayout1.setyRippleOrigin(Float.valueOf((float)(view.getHeight() / 2) + f1));
                a.setRippleColor(RevealPanel.b(b));
                a.setRippleSpeed(30);
            }

            
            {
                b = RevealPanel.this;
                a = revealripplelayout;
                super();
            }
        });
    }

    public void a(boolean flag)
    {
        v = true;
        if (k != null)
        {
            k.setBackgroundColor(0);
        }
        b();
        a(ZDepth.Depth0);
        if (l != null)
        {
            l.b(flag);
        }
    }

    public void a(boolean flag, float f1)
    {
        boolean flag1 = false;
        Object obj = n;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((LocaleTextView) (obj)).setVisibility(i);
        obj = p;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        r.height = (int)((float)q * f1);
        p.setLayoutParams(r);
    }

    public boolean a()
    {
        return u;
    }

    public void b()
    {
        if (m != null)
        {
            m.setEnabled(false);
        }
        if (l != null)
        {
            l.setEnabled(false);
        }
        if (k != null)
        {
            k.setEnabled(false);
        }
        setEnabled(false);
        g();
    }

    public void b(boolean flag)
    {
        v = true;
        if (j != null)
        {
            j.a(ZDepth.Depth0);
        }
        if (l != null)
        {
            l.a(flag);
        }
    }

    public void c()
    {
        if (z)
        {
            f();
            setEnabled(true);
            if (k != null)
            {
                k.setEnabled(true);
            }
            if (l != null)
            {
                l.setEnabled(true);
            }
            if (m != null)
            {
                m.setEnabled(true);
                return;
            }
        }
    }

    public void d()
    {
        a(false);
    }

    public void e()
    {
        b(false);
    }

    public int getCollapseThreshold()
    {
        return y;
    }

    public int getExpandThreshold()
    {
        return x;
    }

    public int getRevealColor()
    {
        return t;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        setOriginRiple(l);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            j = (ZDepthShadowLayout)findViewById(0x7f0b0165);
            k = (MaterialRippleLayout)findViewById(0x7f0b0163);
            l = (RevealRippleLayout)findViewById(0x7f0b0164);
            m = (ImageView)findViewById(0x7f0b0166);
            n = (LocaleTextView)findViewById(0x7f0b0167);
            o = (LocaleTextView)findViewById(0x7f0b0168);
            p = findViewById(0x7f0b0169);
            q = com.qihoo360.mobilesafe.b.r.a(getContext(), 15F);
            r = (android.widget.LinearLayout.LayoutParams)p.getLayoutParams();
            l.setCallback(new RevealRippleLayout.b() {

                final RevealPanel a;

                public void a()
                {
                    com.qihoo.security.widget.RevealPanel.a(a, false);
                    RevealPanel.b(a, false);
                    a.b();
                    RevealPanel.d(a).a(ZDepth.Depth2);
                    if (RevealPanel.c(a) != null)
                    {
                        RevealPanel.c(a).a();
                    }
                    a.a(false, 1.0F);
                }

                public boolean a(int i, boolean flag)
                {
                    boolean flag2 = true;
                    if (RevealPanel.e(a) == null) goto _L2; else goto _L1
_L1:
                    if (!flag || i <= RevealPanel.f(a)) goto _L4; else goto _L3
_L3:
                    float f1 = ((float)(i - RevealPanel.f(a)) * 1.0F) / (float)(100 - RevealPanel.f(a));
                    if (RevealPanel.c(a) != null)
                    {
                        RevealPanel.c(a).a(true, f1);
                    }
                    a.a(true, f1);
_L2:
                    boolean flag1 = flag2;
                    if (RevealPanel.c(a) != null)
                    {
                        flag1 = flag2;
                        if (RevealPanel.h(a))
                        {
                            com.qihoo.security.widget.RevealPanel.a(a, RevealPanel.c(a).a(i, flag));
                            flag1 = RevealPanel.h(a);
                        }
                    }
                    return flag1;
_L4:
                    if (!flag && i > RevealPanel.g(a))
                    {
                        float f2 = (i - RevealPanel.f(a)) / (100 - RevealPanel.f(a));
                        if (RevealPanel.c(a) != null)
                        {
                            RevealPanel.c(a).a(false, f2);
                        }
                        a.a(false, f2);
                    }
                    if (true) goto _L2; else goto _L5
_L5:
                }

                public void b()
                {
                    com.qihoo.security.widget.RevealPanel.a(a, false);
                    a.a(ZDepth.Depth2);
                    if (com.qihoo.security.widget.RevealPanel.a(a) != null)
                    {
                        com.qihoo.security.widget.RevealPanel.a(a).setBackgroundColor(RevealPanel.b(a));
                    }
                    a.c();
                    if (RevealPanel.c(a) != null)
                    {
                        RevealPanel.c(a).b();
                    }
                    RevealPanel.b(a, true);
                    a.a(true, 1.0F);
                }

            
            {
                a = RevealPanel.this;
                super();
            }
            });
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int i1, int j1, int k1)
    {
        super.onLayout(flag, i, i1, j1, k1);
        g();
    }

    public void setCallback(RevealRippleLayout.a a1)
    {
        s = a1;
    }

    public void setClickable(boolean flag)
    {
        z = flag;
        if (z)
        {
            c();
            return;
        } else
        {
            b();
            return;
        }
    }

    public void setCollapseThreshold(int i)
    {
        y = i;
    }

    public void setColor(int i)
    {
        n.setTextColor(i);
        m.setColorFilter(i);
    }

    public void setExpandThreshold(int i)
    {
        x = i;
    }

    public void setIcon(Drawable drawable)
    {
        m.setImageDrawable(drawable);
    }

    public void setIconAlpha(float f1)
    {
        if (m.getDrawable() != null)
        {
            m.getDrawable().setAlpha((int)(255F * f1));
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        if (k != null)
        {
            k.setOnClickListener(onclicklistener);
        }
        if (m != null)
        {
            m.setOnClickListener(onclicklistener);
        }
    }

    public void setRevealColor(int i)
    {
        t = i;
    }

    public void setSummary(int i)
    {
        o.setLocalText(i);
    }

    public void setSummary(CharSequence charsequence)
    {
        o.setLocalText(charsequence);
    }

    public void setSummaryColor(int i)
    {
        o.setTextColor(i);
    }

    public void setTitle(int i)
    {
        n.setLocalText(i);
    }

    public void setTitle(CharSequence charsequence)
    {
        n.setLocalText(charsequence);
    }

    public void setTitleColor(int i)
    {
        n.setTextColor(i);
    }
}

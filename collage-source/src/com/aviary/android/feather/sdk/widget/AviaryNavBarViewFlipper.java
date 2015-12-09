// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextSwitcher;
import android.widget.ViewFlipper;

public class AviaryNavBarViewFlipper extends ViewFlipper
    implements android.widget.ViewSwitcher.ViewFactory
{
    public static interface a
    {

        public abstract void v();

        public abstract void w();

        public abstract void y();
    }

    private static class b
    {

        a a;
        a b;

        void a(a a1)
        {
            b = a;
            a = a1;
        }

        private b()
        {
        }

    }

    static final class b.a extends Enum
    {

        public static final b.a a;
        public static final b.a b;
        public static final b.a c;
        private static final b.a d[];

        public static b.a valueOf(String s)
        {
            return (b.a)Enum.valueOf(com/aviary/android/feather/sdk/widget/AviaryNavBarViewFlipper$b$a, s);
        }

        public static b.a[] values()
        {
            return (b.a[])d.clone();
        }

        static 
        {
            a = new b.a("Open", 0);
            b = new b.a("Close", 1);
            c = new b.a("Restore", 2);
            d = (new b.a[] {
                a, b, c
            });
        }

        private b.a(String s, int k)
        {
            super(s, k);
        }
    }


    TextSwitcher a;
    Button b;
    Button c;
    Button d;
    a e;
    ProgressBar f;
    ProgressBar g;
    boolean h;
    b i;
    private boolean j;

    public AviaryNavBarViewFlipper(Context context)
    {
        super(context);
    }

    public AviaryNavBarViewFlipper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a()
    {
        if (!c())
        {
            i.a(b.a.a);
            setDisplayedChild(1);
        }
    }

    public void a(int k, boolean flag)
    {
        a(((CharSequence) (getContext().getResources().getString(k))), flag);
    }

    public void a(CharSequence charsequence, boolean flag)
    {
        if (!flag)
        {
            android.view.animation.Animation animation = a.getInAnimation();
            android.view.animation.Animation animation1 = a.getOutAnimation();
            a.setInAnimation(null);
            a.setOutAnimation(null);
            a.setText(charsequence);
            a.setInAnimation(animation);
            a.setOutAnimation(animation1);
            return;
        } else
        {
            a.setText(charsequence);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            if (!e())
            {
                i.a(b.a.c);
                setDisplayedChild(2);
            }
        } else
        if (e())
        {
            if (i.b == b.a.b)
            {
                b();
                return;
            } else
            {
                a();
                return;
            }
        }
    }

    public void b()
    {
        if (!d())
        {
            i.a(b.a.b);
            setDisplayedChild(0);
        }
    }

    public boolean c()
    {
        return i.a == b.a.a;
    }

    public boolean d()
    {
        return i.a == b.a.b;
    }

    public boolean e()
    {
        return i.a == b.a.c;
    }

    public boolean getApplyProgressVisible()
    {
        return g.getVisibility() == 0;
    }

    public boolean getDoneProgressVisible()
    {
        return f.getVisibility() == 0;
    }

    public boolean isClickable()
    {
        return h;
    }

    public View makeView()
    {
        return LayoutInflater.from(getContext()).inflate(com.aviary.android.feather.sdk.R.layout.aviary_navbar_text, null);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        i = new b();
        i.a = b.a.b;
        i.b = b.a.b;
        a = (TextSwitcher)findViewById(com.aviary.android.feather.sdk.R.id.navbar_text2);
        c = (Button)findViewById(com.aviary.android.feather.sdk.R.id.navbar_button1);
        f = (ProgressBar)findViewById(com.aviary.android.feather.sdk.R.id.navbar_progress1);
        b = (Button)findViewById(com.aviary.android.feather.sdk.R.id.navbar_button2);
        g = (ProgressBar)findViewById(com.aviary.android.feather.sdk.R.id.navbar_progress2);
        d = (Button)findViewById(com.aviary.android.feather.sdk.R.id.navbar_button3);
        a.setFactory(this);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            final AviaryNavBarViewFlipper a;

            public void onClick(View view)
            {
                if (a.e != null && a.isClickable() && a.e())
                {
                    a.e.v();
                }
            }

            
            {
                a = AviaryNavBarViewFlipper.this;
                super();
            }
        });
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final AviaryNavBarViewFlipper a;

            public void onClick(View view)
            {
                if (a.e != null && a.isClickable() && a.c())
                {
                    a.e.y();
                }
            }

            
            {
                a = AviaryNavBarViewFlipper.this;
                super();
            }
        });
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final AviaryNavBarViewFlipper a;

            public void onClick(View view)
            {
                if (a.e != null && a.isClickable() && !a.c())
                {
                    a.e.w();
                }
            }

            
            {
                a = AviaryNavBarViewFlipper.this;
                super();
            }
        });
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        super.onLayout(flag, k, l, i1, j1);
        if (!j)
        {
            k = c.getMeasuredWidth();
            l = b.getMeasuredWidth();
            i1 = Math.max(k, l);
            if (k != i1)
            {
                c.setWidth(i1);
            }
            if (l != i1)
            {
                b.setWidth(i1);
            }
            j = true;
        }
    }

    public void setApplyEnabled(boolean flag)
    {
        b.setEnabled(flag);
    }

    public void setApplyProgressVisible(boolean flag)
    {
        ProgressBar progressbar = g;
        int k;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 4;
        }
        progressbar.setVisibility(k);
    }

    public void setApplyVisible(boolean flag)
    {
        Button button = b;
        int k;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 4;
        }
        button.setVisibility(k);
    }

    public void setClickable(boolean flag)
    {
        h = flag;
    }

    public void setDoneEnabled(boolean flag)
    {
        c.setEnabled(flag);
    }

    public void setDoneProgressVisible(boolean flag)
    {
        ProgressBar progressbar = f;
        int k;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 4;
        }
        progressbar.setVisibility(k);
    }

    public void setOnToolbarClickListener(a a1)
    {
        e = a1;
    }

    public void setTitle(int k)
    {
        a(k, true);
    }

    public void setTitle(CharSequence charsequence)
    {
        a(charsequence, true);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.android.widget.popupmenu.f;
import com.pandora.android.activity.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.ThumbImageButton;
import com.pandora.android.util.ae;
import com.pandora.android.util.r;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import p.cw.c;
import p.dd.at;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;

public class TrackActionsLayout extends LinearLayout
    implements com.android.widget.popupmenu.f.b
{

    private Activity a;
    private aa b;
    private y c;
    private String d;
    private boolean e;
    private f f;
    private f g;
    private ThumbImageButton h;
    private ThumbImageButton i;
    private ImageButton j;
    private ImageButton k;
    private ImageButton l;
    private ImageButton m;
    private com.pandora.android.ads.c.a n;

    public TrackActionsLayout(Context context)
    {
        super(context);
        a();
    }

    public TrackActionsLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public TrackActionsLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a();
    }

    private void a()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0400b4, this, true);
        i = (ThumbImageButton)findViewById(0x7f1001f1);
        i.setOnClickListener(new android.view.View.OnClickListener() {

            final TrackActionsLayout a;

            public void onClick(View view)
            {
                com.pandora.android.view.TrackActionsLayout.a(a);
            }

            
            {
                a = TrackActionsLayout.this;
                super();
            }
        });
        h = (ThumbImageButton)findViewById(0x7f1001f2);
        h.setOnClickListener(new android.view.View.OnClickListener() {

            final TrackActionsLayout a;

            public void onClick(View view)
            {
                com.pandora.android.view.TrackActionsLayout.b(a);
            }

            
            {
                a = TrackActionsLayout.this;
                super();
            }
        });
        k = (ImageButton)findViewById(0x7f1002d0);
        k.setOnClickListener(new android.view.View.OnClickListener() {

            final TrackActionsLayout a;

            public void onClick(View view)
            {
                com.pandora.android.view.TrackActionsLayout.c(a);
            }

            
            {
                a = TrackActionsLayout.this;
                super();
            }
        });
        j = (ImageButton)findViewById(0x7f1002d1);
        j.setOnClickListener(new android.view.View.OnClickListener() {

            final TrackActionsLayout a;

            public void onClick(View view)
            {
                TrackActionsLayout.d(a);
            }

            
            {
                a = TrackActionsLayout.this;
                super();
            }
        });
        l = (ImageButton)findViewById(0x7f1002d2);
        l.setOnClickListener(new android.view.View.OnClickListener() {

            final TrackActionsLayout a;

            public void onClick(View view)
            {
                com.pandora.android.view.TrackActionsLayout.a(a, 0x7f100023);
            }

            
            {
                a = TrackActionsLayout.this;
                super();
            }
        });
        m = (ImageButton)findViewById(0x7f1002d3);
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final TrackActionsLayout a;

            public void onClick(View view)
            {
                TrackActionsLayout.e(a);
            }

            
            {
                a = TrackActionsLayout.this;
                super();
            }
        });
    }

    private void a(int i1)
    {
        if (g == null)
        {
            g = new f(a, l);
            g.a(0x7f120019);
            g.a(0x7f12001b);
            g.a(this);
        }
        g.c();
    }

    static void a(TrackActionsLayout trackactionslayout)
    {
        trackactionslayout.d();
    }

    static void a(TrackActionsLayout trackactionslayout, int i1)
    {
        trackactionslayout.a(i1);
    }

    private void a(boolean flag)
    {
        boolean flag1 = false;
        int i1;
        if (e)
        {
            i.setVisibility(8);
            h.setVisibility(8);
            ImageButton imagebutton = k;
            if (b.j() && !r.a())
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            imagebutton.setVisibility(i1);
            imagebutton = l;
            if (b.i())
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            imagebutton.setVisibility(i1);
        } else
        {
            ThumbImageButton thumbimagebutton = i;
            if (b.B())
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            thumbimagebutton.setVisibility(i1);
            thumbimagebutton = h;
            if (b.B())
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            thumbimagebutton.setVisibility(i1);
            k.setVisibility(8);
            l.setVisibility(8);
        }
        imagebutton = j;
        if (b.h())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        imagebutton.setVisibility(i1);
        imagebutton = m;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        imagebutton.setVisibility(i1);
    }

    private void b()
    {
        c();
        boolean flag;
        if (f.a().size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        ae.a(b.E(), i, h, b);
        f.a(this);
    }

    static void b(TrackActionsLayout trackactionslayout)
    {
        trackactionslayout.e();
    }

    private void c()
    {
        f = new f(a, m);
        if (!e)
        {
            if (b.i())
            {
                f.a(0x7f120019);
                f.a(0x7f12001b);
            }
            if (b.j() && !r.a())
            {
                f.a(0x7f120003);
            }
        }
        if (b.o())
        {
            f.a(0x7f120002);
        }
        if (b.n())
        {
            f.a(0x7f120026);
        }
    }

    static void c(TrackActionsLayout trackactionslayout)
    {
        trackactionslayout.f();
    }

    private void d()
    {
        if (e)
        {
            ae.b(i, n);
            return;
        } else
        {
            ae.b(b);
            return;
        }
    }

    static void d(TrackActionsLayout trackactionslayout)
    {
        trackactionslayout.g();
    }

    private void e()
    {
        if (e)
        {
            ae.a(h, n);
            return;
        } else
        {
            ae.a(b);
            return;
        }
    }

    static void e(TrackActionsLayout trackactionslayout)
    {
        trackactionslayout.j();
    }

    private void f()
    {
        com.pandora.android.util.f.a(a, b);
    }

    private void g()
    {
        if (c.s())
        {
            if (b == null)
            {
                return;
            }
            c = b.a.b().y().a(a, b.r());
        }
        com.pandora.android.activity.a.a(a, 3, c, b, d);
    }

    private void h()
    {
        com.pandora.android.activity.a.b(b, 0x7f100005);
    }

    private void i()
    {
        com.pandora.android.activity.a.a(b, 0x7f100026);
    }

    private void j()
    {
        if (f != null)
        {
            f.c();
        }
    }

    public void a(Activity activity, aa aa1, String s, boolean flag, com.pandora.android.ads.c.a a1)
    {
        if (activity == null || aa1 == null || a1 == null)
        {
            throw new IllegalArgumentException("Arguments to initialize() cannot be null!");
        } else
        {
            a = activity;
            b = aa1;
            d = s;
            e = flag;
            n = a1;
            b();
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            b.a.b().b(this);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            b.a.b().c(this);
            return;
        }
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        int i1 = menuitem.getItemId();
        switch (i1)
        {
        default:
            return false;

        case 2131755040: 
        case 2131755041: 
        case 2131755042: 
        case 2131755043: 
            com.pandora.android.activity.a.a(a, b, i1);
            return true;

        case 2131755016: 
        case 2131755017: 
        case 2131755728: 
            f();
            return true;

        case 2131755013: 
            h();
            return true;

        case 2131755046: 
            i();
            break;
        }
        return true;
    }

    public void onStationData(at at1)
    {
        c = at1.a;
    }

    public void onThumbDownEvent(bb bb1)
    {
        if (b.equals(bb1.b))
        {
            ae.a(-1, i, h, bb1.b);
        }
    }

    public void onThumbReverted(bc bc1)
    {
        if (b.equals(bc1.a))
        {
            ae.a(bc1.b, i, h, bc1.a);
        }
    }

    public void onThumbUpEvent(bd bd1)
    {
        if (b.equals(bd1.b))
        {
            ae.a(1, i, h, bd1.b);
        }
    }
}

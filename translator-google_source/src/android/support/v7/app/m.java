// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.a.l;
import android.support.v7.internal.widget.an;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            ai, d, p

public final class m extends ai
    implements DialogInterface
{

    private d a;

    public m(Context context, int i)
    {
        super(context, a(context, i));
        a = new d(getContext(), this, getWindow());
    }

    static int a(Context context, int i)
    {
        if (i >= 0x1000000)
        {
            return i;
        } else
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(b.alertDialogTheme, typedvalue, true);
            return typedvalue.resourceId;
        }
    }

    public static d a(m m1)
    {
        return m1.a;
    }

    protected final void onCreate(Bundle bundle)
    {
        boolean flag2 = false;
        super.onCreate(bundle);
        d d1 = a;
        d1.b.a().b(1);
        Object obj;
        FrameLayout framelayout;
        int i;
        boolean flag;
        if (d1.G != 0 && d1.L == 1)
        {
            i = d1.G;
        } else
        {
            i = d1.F;
        }
        d1.b.setContentView(i);
        bundle = (ViewGroup)d1.c.findViewById(g.contentPanel);
        d1.w = (ScrollView)d1.c.findViewById(g.scrollView);
        d1.w.setFocusable(false);
        d1.B = (TextView)d1.c.findViewById(0x102000b);
        if (d1.B != null)
        {
            if (d1.e != null)
            {
                d1.B.setText(d1.e);
            } else
            {
                d1.B.setVisibility(8);
                d1.w.removeView(d1.B);
                if (d1.f != null)
                {
                    bundle = (ViewGroup)d1.w.getParent();
                    i = bundle.indexOfChild(d1.w);
                    bundle.removeViewAt(i);
                    bundle.addView(d1.f, i, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else
                {
                    bundle.setVisibility(8);
                }
            }
        }
        d1.n = (Button)d1.c.findViewById(0x1020019);
        d1.n.setOnClickListener(d1.N);
        if (TextUtils.isEmpty(d1.o))
        {
            d1.n.setVisibility(8);
            i = 0;
        } else
        {
            d1.n.setText(d1.o);
            d1.n.setVisibility(0);
            i = 1;
        }
        d1.q = (Button)d1.c.findViewById(0x102001a);
        d1.q.setOnClickListener(d1.N);
        if (TextUtils.isEmpty(d1.r))
        {
            d1.q.setVisibility(8);
        } else
        {
            d1.q.setText(d1.r);
            d1.q.setVisibility(0);
            i |= 2;
        }
        d1.t = (Button)d1.c.findViewById(0x102001b);
        d1.t.setOnClickListener(d1.N);
        if (TextUtils.isEmpty(d1.u))
        {
            d1.t.setVisibility(8);
        } else
        {
            d1.t.setText(d1.u);
            d1.t.setVisibility(0);
            i |= 4;
        }
        bundle = d1.a;
        obj = new TypedValue();
        bundle.getTheme().resolveAttribute(b.alertDialogCenterButtons, ((TypedValue) (obj)), true);
        if (((TypedValue) (obj)).data != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (i == 1)
            {
                d.a(d1.n);
            } else
            if (i == 2)
            {
                d.a(d1.q);
            } else
            if (i == 4)
            {
                d.a(d1.t);
            }
        }
        if (i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        bundle = (ViewGroup)d1.c.findViewById(g.topPanel);
        obj = an.a(d1.a, null, l.AlertDialog, b.alertDialogStyle);
        if (d1.C != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
            bundle.addView(d1.C, 0, layoutparams);
            d1.c.findViewById(g.title_template).setVisibility(8);
        } else
        {
            d1.z = (ImageView)d1.c.findViewById(0x1020006);
            boolean flag1;
            if (!TextUtils.isEmpty(d1.d))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                d1.A = (TextView)d1.c.findViewById(g.alertTitle);
                d1.A.setText(d1.d);
                if (d1.x != 0)
                {
                    d1.z.setImageResource(d1.x);
                } else
                if (d1.y != null)
                {
                    d1.z.setImageDrawable(d1.y);
                } else
                {
                    d1.A.setPadding(d1.z.getPaddingLeft(), d1.z.getPaddingTop(), d1.z.getPaddingRight(), d1.z.getPaddingBottom());
                    d1.z.setVisibility(8);
                }
            } else
            {
                d1.c.findViewById(g.title_template).setVisibility(8);
                d1.z.setVisibility(8);
                bundle.setVisibility(8);
            }
        }
        bundle = d1.c.findViewById(g.buttonPanel);
        if (i == 0)
        {
            bundle.setVisibility(8);
            bundle = d1.c.findViewById(g.textSpacerNoButtons);
            if (bundle != null)
            {
                bundle.setVisibility(0);
            }
        }
        framelayout = (FrameLayout)d1.c.findViewById(g.customPanel);
        if (d1.g != null)
        {
            bundle = d1.g;
        } else
        if (d1.h != 0)
        {
            bundle = LayoutInflater.from(d1.a).inflate(d1.h, framelayout, false);
        } else
        {
            bundle = null;
        }
        i = ((flag2) ? 1 : 0);
        if (bundle != null)
        {
            i = 1;
        }
        if (i == 0 || !d.a(bundle))
        {
            d1.c.setFlags(0x20000, 0x20000);
        }
        if (i != 0)
        {
            FrameLayout framelayout1 = (FrameLayout)d1.c.findViewById(g.custom);
            framelayout1.addView(bundle, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (d1.m)
            {
                framelayout1.setPadding(d1.i, d1.j, d1.k, d1.l);
            }
            if (d1.f != null)
            {
                ((android.widget.LinearLayout.LayoutParams)framelayout.getLayoutParams()).weight = 0.0F;
            }
        } else
        {
            framelayout.setVisibility(8);
        }
        bundle = d1.f;
        if (bundle != null && d1.D != null)
        {
            bundle.setAdapter(d1.D);
            i = d1.E;
            if (i >= 0)
            {
                bundle.setItemChecked(i, true);
                bundle.setSelection(i);
            }
        }
        ((an) (obj)).a.recycle();
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        d d1 = a;
        boolean flag;
        if (d1.w != null && d1.w.executeKeyEvent(keyevent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyevent)
    {
        d d1 = a;
        boolean flag;
        if (d1.w != null && d1.w.executeKeyEvent(keyevent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public final void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        a.a(charsequence);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bl;
import com.roidapp.photogrid.common.c;
import com.roidapp.videolib.core.e;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

// Referenced classes of package com.roidapp.photogrid.release:
//            ey, ng, PhotoGridActivity, ew, 
//            ex

public final class ev extends Fragment
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{

    private PhotoGridActivity a;
    private SeekBar b;
    private TextView c;
    private TextView d;
    private TextView e;
    private LinearLayout f;
    private ng g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private Handler m;

    public ev()
    {
        j = 300;
        k = 5000;
        l = 4900F;
        m = new ey(this);
    }

    static int a(ev ev1, int i1)
    {
        ev1.i = i1;
        return i1;
    }

    static ng a(ev ev1)
    {
        return ev1.g;
    }

    private void a(int i1, TextView textview)
    {
        Drawable drawable = getResources().getDrawable(i1);
        if (a())
        {
            textview.setTextColor(getResources().getColor(0x7f0c00c0));
            if (drawable != null)
            {
                drawable.setAlpha(50);
                textview.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            }
        } else
        {
            textview.setTextColor(getResources().getColor(0x7f0c00bf));
            if (drawable != null)
            {
                drawable.setAlpha(255);
                textview.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
                return;
            }
        }
    }

    private boolean a()
    {
        if (g != null)
        {
            return com.roidapp.videolib.core.e.a(g.Z);
        } else
        {
            return false;
        }
    }

    static int b(ev ev1)
    {
        return ev1.j;
    }

    private void b()
    {
        az.v = false;
        g.a(false, true);
        BigDecimal bigdecimal = new BigDecimal(((float)i / 1000F) * (float)h);
        c.setText((new StringBuilder()).append(bigdecimal.setScale(1, 4)).append("s").toString());
        g.h(i);
        b.setProgress(Math.round((float)((i - j) * 100) / l));
    }

    static void b(ev ev1, int i1)
    {
        if (ev1.i > ev1.j)
        {
            ev1.i = ev1.i - i1;
        } else
        {
            ev1.i = ev1.j;
        }
        ev1.b();
    }

    static float c(ev ev1)
    {
        return ev1.l;
    }

    static void c(ev ev1, int i1)
    {
        if (ev1.i < ev1.k)
        {
            ev1.i = ev1.i + i1;
        } else
        {
            ev1.i = ev1.k;
        }
        ev1.b();
    }

    static int d(ev ev1)
    {
        return ev1.i;
    }

    static int e(ev ev1)
    {
        return ev1.h;
    }

    static TextView f(ev ev1)
    {
        return ev1.c;
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        g = (ng)a.b;
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131559214 2131559217: default 36
    //                   2131559214 65
    //                   2131559215 36
    //                   2131559216 36
    //                   2131559217 37;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        return;
_L3:
        if (a())
        {
            an.a(new WeakReference(a), getString(0x7f070205));
            return;
        }
          goto _L1
_L2:
        if (a())
        {
            an.a(new WeakReference(a), getString(0x7f070205));
            return;
        } else
        {
            i = Math.round(15000F / (float)h);
            b();
            return;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300c7, null);
        c = (TextView)layoutinflater.findViewById(0x7f0d032f);
        b = (SeekBar)layoutinflater.findViewById(0x7f0d0331);
        d = (TextView)layoutinflater.findViewById(0x7f0d0330);
        e = (TextView)layoutinflater.findViewById(0x7f0d0332);
        f = (LinearLayout)layoutinflater.findViewById(0x7f0d032e);
        f.setOnClickListener(this);
        d.setOnTouchListener(this);
        e.setOnTouchListener(this);
        layoutinflater.setOnTouchListener(new ew(this));
        if (g == null || a == null || a.isFinishing())
        {
            a = (PhotoGridActivity)getActivity();
            if (a == null || a.isFinishing())
            {
                com.roidapp.photogrid.common.c.a("151", a);
                return layoutinflater;
            }
            g = (ng)a.b;
            if (g == null)
            {
                com.roidapp.photogrid.common.c.a("152", a);
                return layoutinflater;
            }
        }
        h = g.L.length;
        double d1;
        int i1;
        if (!TextUtils.isEmpty(g.X))
        {
            j = 3000 / h;
            if (j < 300)
            {
                j = 300;
            }
        } else
        if (h > 150)
        {
            j = 300;
        }
        if (h == 1)
        {
            k = 15000;
        } else
        if (h == 2)
        {
            k = 7500;
        }
        l = k - j;
        i = g.T;
        if (a())
        {
            d1 = 15D;
        } else
        {
            d1 = (float)(i * h) / 1000F;
        }
        viewgroup = new BigDecimal(d1);
        c.setText((new StringBuilder()).append(viewgroup.setScale(1, 4)).append("s").toString());
        viewgroup = b;
        if (a())
        {
            i1 = b.getMax() / 2;
        } else
        {
            i1 = Math.round(((float)(i - j) / l) * 100F);
        }
        viewgroup.setProgress(i1);
        b.setOnSeekBarChangeListener(new ex(this));
        a(0x7f02038c, (TextView)layoutinflater.findViewById(0x7f0d0330));
        a(0x7f0203f9, (TextView)layoutinflater.findViewById(0x7f0d0332));
        if (a())
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                bl.a();
                bl.a(b, 0.2F);
                bl.a();
                bl.a(f, 0.2F);
            } else
            {
                getResources().getDrawable(0x7f0200e5).setAlpha(20);
                getResources().getDrawable(0x7f020094).setAlpha(20);
            }
            b.setOnTouchListener(this);
            return layoutinflater;
        } else
        {
            b.setEnabled(true);
            return layoutinflater;
        }
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (a())
        {
            an.a(new WeakReference(a), getString(0x7f070205));
            return true;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 56
    //                   0 58
    //                   1 88;
           goto _L1 _L2 _L3
_L9:
        return false;
_L2:
        view.getId();
        JVM INSTR tableswitch 2131559216 2131559218: default 88
    //                   2131559216 144
    //                   2131559217 88
    //                   2131559218 180;
           goto _L3 _L4 _L3 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        view.getId();
        JVM INSTR tableswitch 2131559216 2131559218: default 120
    //                   2131559216 123
    //                   2131559217 120
    //                   2131559218 216;
           goto _L1 _L6 _L1 _L7
_L6:
        d.setBackgroundResource(0x7f0c0026);
        m.sendEmptyMessage(3);
        return true;
_L1:
        if (true) goto _L9; else goto _L8
_L4:
        d.setBackgroundResource(0x7f0c0007);
        view = Message.obtain();
        view.what = 1;
        view.arg1 = 20;
        m.sendMessage(view);
        return true;
_L8:
        e.setBackgroundResource(0x7f0c0007);
        view = Message.obtain();
        view.what = 2;
        view.arg1 = 20;
        m.sendMessage(view);
        return true;
_L7:
        e.setBackgroundResource(0x7f0c0026);
        m.sendEmptyMessage(4);
        return true;
    }
}

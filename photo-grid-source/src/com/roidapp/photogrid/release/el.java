// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bl;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.video.TrackSelector;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;

// Referenced classes of package com.roidapp.photogrid.release:
//            eu, ng, PhotoGridActivity, et, 
//            es, er, eo, ep, 
//            eq, ih, em, en

public final class el extends Fragment
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{

    private PhotoGridActivity a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private SeekBar i;
    private ng j;
    private int k;
    private int l;
    private boolean m;
    private DecimalFormat n;
    private DecimalFormat o;
    private boolean p;
    private boolean q;
    private RelativeLayout r;
    private Handler s;

    public el()
    {
        n = new DecimalFormat("00");
        o = new DecimalFormat("000");
        p = false;
        s = new eu(this);
    }

    static int a(el el1, int i1)
    {
        el1.l = i1;
        return i1;
    }

    static ng a(el el1)
    {
        return el1.j;
    }

    private void a()
    {
        az.v = false;
        j.a(false, true);
        c.setText((new StringBuilder()).append(n.format(l / 60000)).append(":").append(n.format((l / 1000) % 60)).append(":").append(o.format(l % 1000)).toString());
        j.g(l);
        i.setProgress(Math.round(((float)l * 100F) / (float)k));
    }

    static int b(el el1)
    {
        return el1.k;
    }

    private void b()
    {
        if (m)
        {
            Drawable drawable = getResources().getDrawable(0x7f0203bf);
            drawable.setAlpha(20);
            e.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            drawable = getResources().getDrawable(0x7f020010);
            drawable.setAlpha(20);
            h.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            drawable = getResources().getDrawable(0x7f020275);
            drawable.setAlpha(20);
            g.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                bl.a();
                bl.a(i, 0.2F);
            } else
            {
                getResources().getDrawable(0x7f0200f4).setAlpha(20);
            }
            f.setText(0x7f070308);
            f.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(0x7f0203c0), null, null);
            b.setTextColor(getResources().getColor(0x7f0c00c0));
            c.setTextColor(getResources().getColor(0x7f0c00c0));
            e.setTextColor(getResources().getColor(0x7f0c00c0));
            d.setTextColor(getResources().getColor(0x7f0c00c0));
            return;
        }
        Drawable drawable1 = getResources().getDrawable(0x7f0203bf);
        drawable1.setAlpha(255);
        e.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        drawable1 = getResources().getDrawable(0x7f020010);
        drawable1.setAlpha(255);
        h.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        drawable1 = getResources().getDrawable(0x7f020275);
        drawable1.setAlpha(255);
        g.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, null);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            bl.a();
            bl.a(i, 1.0F);
        } else
        {
            getResources().getDrawable(0x7f0200f4).setAlpha(255);
        }
        f.setText(0x7f070309);
        f.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(0x7f0203bb), null, null);
        b.setTextColor(getResources().getColor(0x7f0c00bf));
        b.setTextColor(getResources().getColor(0x7f0c00bf));
        c.setTextColor(getResources().getColor(0x7f0c00bf));
        e.setTextColor(getResources().getColor(0x7f0c00bf));
        d.setTextColor(getResources().getColor(0x7f0c00bf));
    }

    static void b(el el1, int i1)
    {
        if (el1.l <= el1.k - i1)
        {
            el1.l = el1.l + i1;
        } else
        {
            el1.l = el1.k;
        }
        el1.a();
    }

    static int c(el el1)
    {
        return el1.l;
    }

    static void c(el el1, int i1)
    {
        if (el1.l >= i1)
        {
            el1.l = el1.l - i1;
        } else
        {
            el1.l = 0;
        }
        el1.a();
    }

    static DecimalFormat d(el el1)
    {
        return el1.n;
    }

    static DecimalFormat e(el el1)
    {
        return el1.o;
    }

    static TextView f(el el1)
    {
        return el1.c;
    }

    static boolean g(el el1)
    {
        el1.p = false;
        return false;
    }

    static void h(el el1)
    {
        el1.j.a(false, false);
        Intent intent = new Intent(el1.a, com/roidapp/photogrid/video/TrackSelector);
        el1.a.startActivityForResult(intent, 43524);
    }

    static PhotoGridActivity i(el el1)
    {
        return el1.a;
    }

    static boolean j(el el1)
    {
        return el1.q;
    }

    static void k(el el1)
    {
        View view = LayoutInflater.from(el1.a).inflate(0x7f030132, null);
        (new android.app.AlertDialog.Builder(el1.a)).setTitle(0x7f0702e7).setView(view).setPositiveButton(el1.getResources().getString(0x7f07016b), new et(el1)).setNegativeButton(el1.getResources().getString(0x7f070049), new es(el1)).setOnCancelListener(new er(el1)).show();
    }

    static void l(el el1)
    {
        if (el1.a == null || el1.a.isFinishing() || !el1.isAdded())
        {
            return;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("audio/*");
        try
        {
            el1.getActivity().startActivityForResult(intent, 43524);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (el el1)
        {
            el1.printStackTrace();
        }
    }

    static boolean m(el el1)
    {
        el1.q = false;
        return false;
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        p = false;
        super.onActivityResult(i1, j1, intent);
    }

    public final void onAttach(Activity activity)
    {
        a = (PhotoGridActivity)activity;
        if (a.b instanceof ng)
        {
            j = (ng)a.b;
        } else
        {
            j = null;
        }
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        boolean flag = true;
        view.getId();
        JVM INSTR tableswitch 2131559203 2131559204: default 28
    //                   2131559203 151
    //                   2131559204 29;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        if (!m && !p)
        {
            p = true;
            j.a(false, false);
            view = LayoutInflater.from(a).inflate(0x7f030133, null);
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(a)).setTitle(0x7f0701c3).setView(view).setOnCancelListener(new eo(this)).create();
            view.findViewById(0x7f0d04de).setOnClickListener(new ep(this, alertdialog));
            view.findViewById(0x7f0d04df).setOnClickListener(new eq(this, alertdialog));
            alertdialog.show();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (a != null && !a.isFinishing())
        {
            if (m)
            {
                flag = false;
            }
            m = flag;
            b();
            j.a(false, false);
            j.V = m;
            az.v = false;
            ih.C().j(m);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300c6, null);
        g = (TextView)layoutinflater.findViewById(0x7f0d0328);
        h = (TextView)layoutinflater.findViewById(0x7f0d0326);
        e = (TextView)layoutinflater.findViewById(0x7f0d0324);
        f = (TextView)layoutinflater.findViewById(0x7f0d0323);
        r = (RelativeLayout)layoutinflater.findViewById(0x7f0d0329);
        r.setOnTouchListener(new em(this));
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnTouchListener(this);
        h.setOnTouchListener(this);
        b = (TextView)layoutinflater.findViewById(0x7f0d032a);
        c = (TextView)layoutinflater.findViewById(0x7f0d032b);
        d = (TextView)layoutinflater.findViewById(0x7f0d032c);
        i = (SeekBar)layoutinflater.findViewById(0x7f0d0327);
        q = PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("music_policy", true);
        if (j == null || a == null || a.isFinishing())
        {
            a = (PhotoGridActivity)getActivity();
            if (a == null || a.isFinishing())
            {
                com.roidapp.photogrid.common.c.a("140", a);
                return layoutinflater;
            }
            if (a.b instanceof ng)
            {
                j = (ng)a.b;
            } else
            {
                j = null;
            }
            if (j == null)
            {
                com.roidapp.photogrid.common.c.a("141", a);
                return layoutinflater;
            }
        }
        viewgroup = j.Q;
        k = j.S;
        m = j.V;
        b();
        if (m)
        {
            bundle = getResources().getDrawable(0x7f0203c0);
            f.setCompoundDrawablesWithIntrinsicBounds(null, bundle, null, null);
            f.setText(0x7f070308);
        }
        l = j.R;
        if (viewgroup != null)
        {
            d.setText(viewgroup);
        }
        c.setText((new StringBuilder()).append(n.format(l / 60000)).append(":").append(n.format((l / 1000) % 60)).append(":").append(o.format(l % 1000)).toString());
        viewgroup = i;
        int i1;
        if (k == 0)
        {
            i1 = 0;
        } else
        {
            i1 = Math.round(((float)l * 100F) / (float)k);
        }
        viewgroup.setProgress(i1);
        i.setOnTouchListener(this);
        i.setOnSeekBarChangeListener(new en(this));
        return layoutinflater;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!m) goto _L2; else goto _L1
_L1:
        if (view.getId() != 0x7f0d0327) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (j != null && !j.ac)
        {
            an.a(new WeakReference(a), getString(0x7f07030d));
            return true;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 88
    //                   0 90
    //                   1 120;
           goto _L5 _L6 _L7
_L13:
        return false;
_L6:
        view.getId();
        JVM INSTR tableswitch 2131559206 2131559208: default 120
    //                   2131559206 229
    //                   2131559207 120
    //                   2131559208 176;
           goto _L7 _L8 _L7 _L9
_L8:
        break; /* Loop/switch isn't completed */
_L7:
        view.getId();
        JVM INSTR tableswitch 2131559206 2131559208: default 152
    //                   2131559206 155
    //                   2131559207 152
    //                   2131559208 265;
           goto _L5 _L10 _L5 _L11
_L10:
        h.setBackgroundResource(0x7f0c0026);
        s.sendEmptyMessage(4);
        return true;
_L5:
        if (true) goto _L13; else goto _L12
_L12:
        break; /* Loop/switch isn't completed */
_L9:
        g.setBackgroundResource(0x7f0c0007);
        if (j == null || j.ac)
        {
            view = Message.obtain();
            view.what = 1;
            view.arg1 = 100;
            s.sendMessage(view);
            return true;
        }
        if (true) goto _L3; else goto _L14
_L14:
        h.setBackgroundResource(0x7f0c0007);
        view = Message.obtain();
        view.what = 2;
        view.arg1 = 100;
        s.sendMessage(view);
        return true;
_L11:
        g.setBackgroundResource(0x7f0c0026);
        s.sendEmptyMessage(3);
        return true;
    }
}

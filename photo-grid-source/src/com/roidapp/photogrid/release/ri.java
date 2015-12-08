// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.photogrid.common.b;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, oi, rl, rj, 
//            rk

public final class ri extends DialogFragment
{

    protected boolean a;
    private ProgressBar b;
    private TextView c;
    private TextView d;
    private TextView e;
    private PhotoGridActivity f;
    private LinearLayout g;
    private LinearLayout h;
    private TextView i;
    private boolean j;
    private int k;
    private boolean l;

    public ri()
    {
        a = false;
    }

    static void a(ri ri1)
    {
        while (ri1.f == null || ri1.f.isFinishing() || ri1.j) 
        {
            return;
        }
        ri1.l = true;
        ri1.j = true;
        ri1.g.setClickable(false);
        if (ri1.isAdded())
        {
            ri1.i.setTextColor(ri1.getResources().getColor(0x7f0c00c0));
            ri1.c.setText(0x7f070049);
            ri1.d.setVisibility(8);
        }
        if (ri1.f != null && ri1.f.c != null)
        {
            ri1.f.c.g();
            ri1.f.h = false;
            return;
        } else
        {
            ri1.dismiss();
            return;
        }
    }

    static void b(ri ri1)
    {
        ri1.e.setVisibility(8);
        ri1.h.setVisibility(8);
        ri1.i.setText(0x7f070049);
    }

    static TextView c(ri ri1)
    {
        return ri1.e;
    }

    static LinearLayout d(ri ri1)
    {
        return ri1.h;
    }

    static TextView e(ri ri1)
    {
        return ri1.i;
    }

    final void a(int i1)
    {
        k = i1;
    }

    protected final void a(int i1, int j1)
    {
        if (!l)
        {
            if (b != null)
            {
                b.setProgress(j1);
            }
            if (j1 >= 80)
            {
                g.setOnClickListener(new rl(this));
            }
            if (d != null)
            {
                if (i1 == 0 || i1 == -1)
                {
                    if (d.getVisibility() == 0)
                    {
                        d.setVisibility(8);
                    }
                    TextView textview = c;
                    if (i1 == 0)
                    {
                        i1 = 0x7f070319;
                    } else
                    {
                        i1 = 0x7f070317;
                    }
                    textview.setText(i1);
                    return;
                }
                if (i1 > 0 && i1 <= k)
                {
                    if (d.getVisibility() != 0)
                    {
                        d.setVisibility(0);
                    }
                    c.setText(0x7f070318);
                    d.setText(String.format(Locale.ENGLISH, "%d/%d", new Object[] {
                        Integer.valueOf(i1), Integer.valueOf(k)
                    }));
                    return;
                }
                if (d.getVisibility() == 0)
                {
                    d.setVisibility(8);
                }
                c.setText(0x7f07028a);
                return;
            }
        }
    }

    public final void onAttach(Activity activity)
    {
        com.roidapp.photogrid.common.b.a("VideoSavingDialogFragment/onAttach");
        f = (PhotoGridActivity)activity;
        super.onAttach(activity);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        com.roidapp.photogrid.common.b.a("VideoSavingDialogFragment/onCreateView");
        layoutinflater = layoutinflater.inflate(0x7f030136, null);
        b = (ProgressBar)layoutinflater.findViewById(0x7f0d04e6);
        c = (TextView)layoutinflater.findViewById(0x7f0d04e4);
        d = (TextView)layoutinflater.findViewById(0x7f0d04e5);
        e = (TextView)layoutinflater.findViewById(0x7f0d04e7);
        i = (TextView)layoutinflater.findViewById(0x7f0d04ea);
        g = (LinearLayout)layoutinflater.findViewById(0x7f0d04e9);
        h = (LinearLayout)layoutinflater.findViewById(0x7f0d04e8);
        g.setOnClickListener(new rj(this));
        setCancelable(false);
        return layoutinflater;
    }

    public final void onResume()
    {
        super.onResume();
        getDialog().setOnKeyListener(new rk(this));
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
    }
}

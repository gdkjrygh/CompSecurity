// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.e.l;
import com.roidapp.baselib.view.FlowLayout;
import com.roidapp.cloudlib.sns.b.u;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import com.roidapp.cloudlib.sns.w;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            ci, cj, cm, cl, 
//            ck

public final class ch extends Fragment
    implements android.view.View.OnClickListener
{

    public final w a = new ci(this);
    private FlowLayout b;
    private FlowLayout c;
    private TextView d;
    private TextView e;
    private View f;
    private ProgressBar g;
    private RelativeLayout h;
    private float i;
    private int j;
    private cm k;
    private int l;

    public ch()
    {
    }

    static View a(ch ch1, String s)
    {
        return ch1.a(s, 1);
    }

    private View a(String s, int i1)
    {
        CheckBox checkbox = new CheckBox(getActivity());
        checkbox.setTag(Integer.valueOf(i1));
        com.roidapp.baselib.view.FlowLayout.LayoutParams layoutparams = new com.roidapp.baselib.view.FlowLayout.LayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        layoutparams.rightMargin = (int)(i * 16F);
        layoutparams.topMargin = (int)(i * 16F);
        checkbox.setLayoutParams(layoutparams);
        if (a(s))
        {
            checkbox.setChecked(true);
            checkbox.setTextColor(-1);
        } else
        {
            checkbox.setChecked(false);
            checkbox.setTextColor(j);
        }
        checkbox.setText(s);
        checkbox.setTextSize(0, getResources().getDimensionPixelSize(0x7f090009));
        checkbox.setBackgroundResource(0x7f0205d0);
        checkbox.setButtonDrawable(getResources().getDrawable(0x106000d));
        checkbox.setOnCheckedChangeListener(new cj(this, checkbox));
        return checkbox;
    }

    static void a(ch ch1)
    {
        ch1.h.setVisibility(0);
        ch1.g.setVisibility(8);
        ch1.b.setVisibility(8);
    }

    static void a(ch ch1, List list)
    {
        if (list == null) goto _L2; else goto _L1
_L1:
        String as[];
        ch1.c.removeAllViews();
        as = PreferenceManager.getDefaultSharedPreferences(ch1.getActivity()).getString("history_tag", "").split(",");
        if (as.length <= 0) goto _L4; else goto _L3
_L3:
        int i1 = 0;
_L10:
        if (i1 >= as.length) goto _L4; else goto _L5
_L5:
        if (as[i1].equalsIgnoreCase("")) goto _L7; else goto _L6
_L6:
        int j1 = 0;
_L11:
        if (j1 >= list.size())
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (!as[i1].equalsIgnoreCase((new StringBuilder("#")).append(((u)list.get(j1)).a).toString())) goto _L9; else goto _L8
_L8:
        j1 = 1;
_L12:
        if (j1 == 0)
        {
            ch1.c.addView(ch1.a(as[i1], 2));
        }
_L7:
        i1++;
          goto _L10
_L9:
        j1++;
          goto _L11
_L4:
        if (ch1.c.getChildCount() == 0)
        {
            ch1.e.setVisibility(8);
            ch1.c.setVisibility(8);
            ch1.d.setVisibility(8);
            ch1.f.setVisibility(8);
        }
_L2:
        return;
        j1 = 0;
          goto _L12
    }

    private boolean a(String s)
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        return false;
_L2:
        if ((arraylist = k.a()) != null)
        {
            int i1 = 0;
            while (i1 < arraylist.size()) 
            {
                if (s.equalsIgnoreCase((String)arraylist.get(i1)))
                {
                    return true;
                }
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static FlowLayout b(ch ch1)
    {
        return ch1.b;
    }

    static cm c(ch ch1)
    {
        return ch1.k;
    }

    static ProgressBar d(ch ch1)
    {
        return ch1.g;
    }

    static int e(ch ch1)
    {
        return ch1.j;
    }

    static FlowLayout f(ch ch1)
    {
        return ch1.c;
    }

    public final void a(int i1)
    {
        l = i1;
    }

    public final void a(cm cm1)
    {
        k = cm1;
    }

    public final void onClick(View view)
    {
        int i1 = view.getId();
        if (i1 == 0x7f0d02f8)
        {
            if (getActivity() != null)
            {
                view = getActivity();
                (new android.app.AlertDialog.Builder(view)).setTitle(view.getString(0x7f0700bf)).setMessage(view.getString(0x7f07035d)).setPositiveButton(view.getString(0x7f070392), new cl(this)).setNegativeButton(view.getString(0x7f070034), new ck(this)).show();
            }
        } else
        if (i1 == 0x7f0d02f4)
        {
            if (!com.roidapp.baselib.e.l.b(getActivity()))
            {
                com.roidapp.baselib.e.l.a(getActivity(), null);
                return;
            } else
            {
                h.setVisibility(8);
                g.setVisibility(0);
                b.setVisibility(8);
                q.d(a).a(this);
                return;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300bb, viewgroup, false);
        viewgroup = (android.widget.RelativeLayout.LayoutParams)layoutinflater.getLayoutParams();
        viewgroup.height = l;
        layoutinflater.setLayoutParams(viewgroup);
        layoutinflater.setOnClickListener(this);
        g = (ProgressBar)layoutinflater.findViewById(0x7f0d02f2);
        g.setVisibility(0);
        b = (FlowLayout)layoutinflater.findViewById(0x7f0d02f3);
        h = (RelativeLayout)layoutinflater.findViewById(0x7f0d02f4);
        h.setOnClickListener(this);
        q.d(a).a(this);
        i = getActivity().getResources().getDisplayMetrics().density;
        j = Color.parseColor("#253034");
        c = (FlowLayout)layoutinflater.findViewById(0x7f0d02f7);
        e = (TextView)layoutinflater.findViewById(0x7f0d02f6);
        d = (TextView)layoutinflater.findViewById(0x7f0d02f8);
        d.setOnClickListener(this);
        f = layoutinflater.findViewById(0x7f0d02f5);
        viewgroup = PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("history_tag", "").split(",");
        if (viewgroup.length > 0)
        {
            for (int i1 = 0; i1 < viewgroup.length; i1++)
            {
                if (!viewgroup[i1].equalsIgnoreCase(""))
                {
                    c.addView(a(viewgroup[i1], 2));
                }
            }

        } else
        {
            e.setVisibility(8);
            c.setVisibility(8);
            d.setVisibility(8);
            f.setVisibility(8);
        }
        return layoutinflater;
    }
}

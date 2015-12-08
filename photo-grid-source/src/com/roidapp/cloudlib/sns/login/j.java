// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.login;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.d;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.main.a;
import com.roidapp.cloudlib.sns.main.b;
import java.util.Locale;

public final class j extends b
    implements android.view.View.OnClickListener
{

    private String a;
    private TextView b;

    public j()
    {
    }

    public static j a(String s)
    {
        j j1 = new j();
        j1.a = s;
        return j1;
    }

    public final View a(Context context)
    {
        if (a != null && a.equals("Notification_Login_Page"))
        {
            t = new ab(context);
            t.a(u);
            t.a("Notification");
            return t;
        } else
        {
            return null;
        }
    }

    public final boolean d()
    {
        return a != null && a == "Notification_Login_Page";
    }

    public final void onClick(View view)
    {
        if (s != null && !s() && af.a(getActivity(), a, view.getId()))
        {
            s.i();
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.k, viewgroup, false);
        viewgroup = (RelativeLayout)layoutinflater.findViewById(ar.x);
        bundle = (android.widget.RelativeLayout.LayoutParams)viewgroup.getLayoutParams();
        bundle.topMargin = t();
        viewgroup.setLayoutParams(bundle);
        b = (TextView)layoutinflater.findViewById(ar.B);
        if (a != null)
        {
            if (a.equals("Notification_Login_Page"))
            {
                int i;
                int k;
                try
                {
                    viewgroup.setBackgroundResource(aq.D);
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    viewgroup.setBackgroundDrawable(null);
                }
                b.setText(at.bv);
            } else
            if (a.equals("Myprofile_Login_Page"))
            {
                try
                {
                    viewgroup.setBackgroundResource(aq.F);
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    viewgroup.setBackgroundDrawable(null);
                }
                b.setText(at.bw);
            }
        }
        i = com.roidapp.cloudlib.common.d.a(getResources(), 2.0F);
        k = com.roidapp.cloudlib.common.d.a(getResources(), 10F);
        viewgroup = (TextView)layoutinflater.findViewById(ar.A);
        n.a(viewgroup, aq.W, 0, 0);
        viewgroup.setBackgroundDrawable(n.a(0xff448ccb, 0xff3c80bb, i, k));
        viewgroup.setText(String.format(Locale.ENGLISH, getString(at.aa), new Object[] {
            "INSTAGRAM"
        }));
        viewgroup.setOnClickListener(this);
        viewgroup = (TextView)layoutinflater.findViewById(ar.y);
        n.a(viewgroup, aq.U, 0, 0);
        viewgroup.setBackgroundDrawable(n.a(0xff3a5796, 0xff2a4277, i, k));
        viewgroup.setText(String.format(Locale.ENGLISH, getString(at.aa), new Object[] {
            "FACEBOOK"
        }));
        viewgroup.setOnClickListener(this);
        viewgroup = (TextView)layoutinflater.findViewById(ar.z);
        if (al.g().e(aj.a()))
        {
            n.a(viewgroup, aq.V, 0, 0);
            viewgroup.setBackgroundDrawable(n.a(0xffe84639, 0xffd43d31, i, k));
            viewgroup.setText(String.format(Locale.ENGLISH, getString(at.aa), new Object[] {
                "GOOGLE"
            }));
            viewgroup.setOnClickListener(this);
        } else
        {
            viewgroup.setVisibility(8);
        }
        com.roidapp.cloudlib.sns.f.a.a().a(a, 1);
        return layoutinflater;
    }
}

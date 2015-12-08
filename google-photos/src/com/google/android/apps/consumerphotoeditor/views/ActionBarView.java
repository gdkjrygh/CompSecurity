// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.views;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import b;
import bha;
import bhb;
import bhc;
import msj;
import msm;
import noz;
import p;
import pwu;
import rv;
import rw;
import rz;
import ss;
import su;

public class ActionBarView extends LinearLayout
{

    public View a;
    public bhc b;
    private final noz c;
    private View d;
    private Activity e;

    public ActionBarView(Context context)
    {
        super(context);
        c = noz.a(getContext(), 5, "ActionBarView", new String[0]);
        b.a(this, new msm(pwu.F));
    }

    public ActionBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = noz.a(getContext(), 5, "ActionBarView", new String[0]);
        b.a(this, new msm(pwu.F));
    }

    public ActionBarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = noz.a(getContext(), 5, "ActionBarView", new String[0]);
        b.a(this, new msm(pwu.F));
    }

    public ActionBarView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        c = noz.a(getContext(), 5, "ActionBarView", new String[0]);
        b.a(this, new msm(pwu.F));
    }

    public static bhc a(ActionBarView actionbarview)
    {
        return actionbarview.b;
    }

    public static ActionBarView a(rz rz)
    {
        ActionBarView actionbarview = (ActionBarView)LayoutInflater.from(rz).inflate(com.google.android.apps.consumerphotoeditor.R.layout.cpe_action_panel, null);
        actionbarview.e = rz;
        rw rw1 = new rw(-1, -1);
        rz.e().a().a(actionbarview, rw1);
        return actionbarview;
    }

    public static Activity b(ActionBarView actionbarview)
    {
        return actionbarview.e;
    }

    public final void a(boolean flag)
    {
        if (d != null)
        {
            View view = d;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        d = (View)p.b(findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_save_button), "Missing expected save button.");
        d.setOnClickListener(new msj(new bha(this)));
        b.a(d, new msm(pwu.I));
        a = (View)p.b(findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_cancel_button), "Missing expected cancel button.");
        a.setOnClickListener(new msj(new bhb(this)));
        b.a(a, new msm(pwu.b));
    }
}

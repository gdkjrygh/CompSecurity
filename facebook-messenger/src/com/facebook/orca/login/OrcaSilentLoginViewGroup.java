// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.auth.login.m;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.widget.listview.EmptyListViewItem;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;
import com.facebook.widget.titlebar.d;
import com.facebook.widget.titlebar.e;
import com.google.common.a.es;

public class OrcaSilentLoginViewGroup extends m
{

    public static final String LAYOUT_RESOURCE = "orca:authparam:silent_login_layout";

    public OrcaSilentLoginViewGroup(Context context, com.facebook.auth.login.c c1)
    {
        super(context, c1);
        setContentView(getResource("orca:authparam:silent_login_layout", k.orca_login_silent));
        context = (EmptyListViewItem)getView(i.silent_login_loading_view);
        context.a(true);
        context.setMessage(o.generic_loading);
        if (c.a(this))
        {
            ((a)getView(i.titlebar)).setButtonSpecs(es.a(d.newBuilder().a(1).a(getResources().getDrawable(h.orca_divebar_icon)).k()));
        }
    }

    public static Bundle createParameterBundle(int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("orca:authparam:silent_login_layout", j);
        return bundle;
    }
}

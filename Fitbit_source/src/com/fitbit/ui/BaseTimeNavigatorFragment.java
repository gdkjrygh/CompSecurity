// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.customui.TimeNavigator;
import com.fitbit.savedstate.c;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.util.l;
import java.util.Date;

public abstract class BaseTimeNavigatorFragment extends FitbitFragment
    implements l
{

    private TimeNavigator a;

    public BaseTimeNavigatorFragment()
    {
    }

    static TimeNavigator a(BaseTimeNavigatorFragment basetimenavigatorfragment)
    {
        return basetimenavigatorfragment.a;
    }

    public void K_()
    {
        Date date = com.fitbit.savedstate.c.h();
        a.a(date);
    }

    protected abstract void a(Date date);

    protected abstract int c();

    public Date i()
    {
        return a.c();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(c(), viewgroup, false);
        a = (TimeNavigator)layoutinflater.findViewById(0x7f11042b);
        a.a(com.fitbit.savedstate.c.h());
        a.a(new _cls1());
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        a.a(com.fitbit.savedstate.c.h());
    }

    /* member class not found */
    class _cls1 {}

}

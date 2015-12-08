// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.device.ui:
//            TapGestureSelector

public final class TapGestureSelector_ extends TapGestureSelector
    implements org.androidannotations.a.c.a
{
    public static class a
    {

        private Bundle a;

        public TapGestureSelector a()
        {
            TapGestureSelector_ tapgestureselector_ = new TapGestureSelector_();
            tapgestureselector_.setArguments(a);
            return tapgestureselector_;
        }

        public a a(String s)
        {
            a.putString("encodedId", s);
            return this;
        }

        private a()
        {
            a = new Bundle();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    public static final String b = "encodedId";
    private final c c = new c();
    private View d;

    public TapGestureSelector_()
    {
    }

    public static a a()
    {
        return new a(null);
    }

    private void a(Bundle bundle)
    {
        b();
    }

    private void b()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("encodedId"))
        {
            a = bundle.getString("encodedId");
        }
    }

    public View findViewById(int i)
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.findViewById(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = org.androidannotations.a.c.c.a(c);
        a(bundle);
        super.onCreate(bundle);
        org.androidannotations.a.c.c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        d = super.onCreateView(layoutinflater, viewgroup, bundle);
        return d;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c.a(this);
    }
}

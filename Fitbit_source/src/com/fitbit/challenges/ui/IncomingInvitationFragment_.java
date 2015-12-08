// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.challenges.ui:
//            IncomingInvitationFragment, HorizontalListView

public final class IncomingInvitationFragment_ extends IncomingInvitationFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public IncomingInvitationFragment a()
        {
            IncomingInvitationFragment_ incominginvitationfragment_ = new IncomingInvitationFragment_();
            incominginvitationfragment_.setArguments(a);
            return incominginvitationfragment_;
        }

        public a a(String s1)
        {
            a.putString("challengeId", s1);
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


    public static final String r = "challengeId";
    private final c s = new c();
    private View x;

    public IncomingInvitationFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        c.a(this);
        m();
        h = com.fitbit.galileo.ui.sync.c.b(getActivity());
    }

    public static a l()
    {
        return new a(null);
    }

    private void m()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("challengeId"))
        {
            q = bundle.getString("challengeId");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        u = a1.findViewById(0x1020002);
        v = a1.findViewById(0x102000d);
        t = (TextView)a1.findViewById(0x1020004);
        w = a1.findViewById(0x7f1100a4);
        p = (TextView)a1.findViewById(0x7f110265);
        o = (TextView)a1.findViewById(0x7f110263);
        n = (TextView)a1.findViewById(0x7f110264);
        j = (TextView)a1.findViewById(0x7f11011f);
        l = (TextView)a1.findViewById(0x7f110261);
        m = (HorizontalListView)a1.findViewById(0x7f11025f);
        i = a1.findViewById(0x7f11025e);
        k = (TextView)a1.findViewById(0x7f110260);
        View view = a1.findViewById(0x7f110265);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        view = a1.findViewById(0x7f110263);
        if (view != null)
        {
            view.setOnClickListener(new _cls2());
        }
        view = a1.findViewById(0x7f110264);
        if (view != null)
        {
            view.setOnClickListener(new _cls3());
        }
        view = a1.findViewById(0x7f110262);
        if (view != null)
        {
            view.setOnClickListener(new _cls4());
        }
        a1 = a1.findViewById(0x7f1103d5);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls5());
        }
        j();
        a();
    }

    public View findViewById(int i)
    {
        if (x == null)
        {
            return null;
        } else
        {
            return x.findViewById(i);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (i)
        {
        default:
            return;

        case 4210: 
            a(j);
            return;

        case 4904: 
            a(j, intent);
            break;
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(s);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        x = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (x == null)
        {
            x = layoutinflater.inflate(0x7f04008a, viewgroup, false);
        }
        return x;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        s.a(this);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}

}

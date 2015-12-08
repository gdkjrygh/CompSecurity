// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Date;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseCustomFragment

public final class ChooseCustomFragment_ extends ChooseCustomFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public ChooseCustomFragment a()
        {
            ChooseCustomFragment_ choosecustomfragment_ = new ChooseCustomFragment_();
            choosecustomfragment_.setArguments(a);
            return choosecustomfragment_;
        }

        public a a(Date date)
        {
            a.putSerializable("date", date);
            return this;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    public static final String c = "date";
    private final c d = new c();
    private View e;

    public ChooseCustomFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        org.androidannotations.a.c.c.a(this);
        f();
        b(bundle);
    }

    private void b(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            b = (Date)bundle.getSerializable("date");
            return;
        }
    }

    public static a e()
    {
        return new a();
    }

    private void f()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("date"))
        {
            b = (Date)bundle.getSerializable("date");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        a = a1.findViewById(0x7f11009b);
        a1 = a1.findViewById(0x7f1100a0);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final ChooseCustomFragment_ a;

                public void onClick(View view)
                {
                    a.d();
                }

            
            {
                a = ChooseCustomFragment_.this;
                super();
            }
            });
        }
    }

    public View findViewById(int i)
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.findViewById(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = org.androidannotations.a.c.c.a(d);
        a(bundle);
        super.onCreate(bundle);
        org.androidannotations.a.c.c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        e = super.onCreateView(layoutinflater, viewgroup, bundle);
        return e;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("date", b);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d.a(this);
    }
}

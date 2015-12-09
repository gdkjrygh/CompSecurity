// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.common.base.Optional;

public final class fru
    implements frs
{

    frm a;
    private Button b;
    private View c;
    private frt d;

    public fru()
    {
    }

    public final Optional a(LayoutInflater layoutinflater, ViewGroup viewgroup, frt frt1)
    {
        d = frt1;
        layoutinflater = layoutinflater.inflate(0x7f0300f8, viewgroup, false);
        b = (Button)layoutinflater.findViewById(0x7f110469);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private fru a;

            public final void onClick(View view)
            {
                a.a.c();
            }

            
            {
                a = fru.this;
                super();
            }
        });
        c = layoutinflater.findViewById(0x7f11046a);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            private fru a;

            public final void onClick(View view)
            {
                a.a.b();
            }

            
            {
                a = fru.this;
                super();
            }
        });
        return Optional.b(layoutinflater);
    }

    public final void a()
    {
        c.setVisibility(8);
    }

    public final void a(View view)
    {
    }

    public final void a(edb edb1)
    {
        if (a == null)
        {
            throw new IllegalStateException("Presenter is null. Did you call setOnDemandUpsellPresenter?");
        } else
        {
            edb1.a(a);
            return;
        }
    }

    public final void a(frm frm1)
    {
        a = frm1;
        a.b = true;
    }

    public final void a(String s)
    {
        b.setText(s);
    }

    public final void a(boolean flag)
    {
        d.a(flag);
    }

    public final void b()
    {
        b.setVisibility(0);
    }

    public final void b(edb edb1)
    {
        edb1.b(a);
    }

    public final void c()
    {
        a.d();
    }
}

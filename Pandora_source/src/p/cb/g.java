// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cb;

import android.os.Bundle;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.Switch;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.android.util.z;
import p.bz.q;
import p.bz.r;
import p.cw.c;
import p.dd.k;

// Referenced classes of package p.cb:
//            c

public class g extends p.cb.c
{

    Switch a;
    TextView b;
    private z c;
    private android.widget.CompoundButton.OnCheckedChangeListener d;

    public g()
    {
        d = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final g a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (g.a(a).b())
                {
                    a.f();
                }
            }

            
            {
                a = g.this;
                super();
            }
        };
        c = z.a();
    }

    static z a(g g1)
    {
        return g1.c;
    }

    public static g e()
    {
        return new g();
    }

    void a(long l)
    {
        if (b.a.b().d().t() == null)
        {
            s.a(getActivity(), 0x7f08024a);
            return;
        } else
        {
            z.a().a(l);
            g();
            return;
        }
    }

    public CharSequence d()
    {
        return getString(0x7f080247);
    }

    void f()
    {
        c.c();
        g();
    }

    void g()
    {
        if (c.b())
        {
            a.setEnabled(true);
            a.setChecked(true);
            a.setOnCheckedChangeListener(d);
            return;
        } else
        {
            a.setEnabled(false);
            a.setOnCheckedChangeListener(null);
            a.setChecked(false);
            return;
        }
    }

    public void onCastingState(k k1)
    {
        if (k1.a)
        {
            k1 = TabletHome.a(p.r, null);
            b.a.C().a(k1);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040098, viewgroup, false);
        b = (TextView)layoutinflater.findViewById(0x7f10028a);
        a = (Switch)layoutinflater.findViewById(0x7f10028b);
        g();
        layoutinflater.findViewById(0x7f10028c).setOnClickListener(new android.view.View.OnClickListener() {

            final g a;

            public void onClick(View view)
            {
                a.a(0xdbba0L);
            }

            
            {
                a = g.this;
                super();
            }
        });
        layoutinflater.findViewById(0x7f10028d).setOnClickListener(new android.view.View.OnClickListener() {

            final g a;

            public void onClick(View view)
            {
                a.a(0x1b7740L);
            }

            
            {
                a = g.this;
                super();
            }
        });
        layoutinflater.findViewById(0x7f10028e).setOnClickListener(new android.view.View.OnClickListener() {

            final g a;

            public void onClick(View view)
            {
                a.a(0x36ee80L);
            }

            
            {
                a = g.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onSleepTimerEnd(q q)
    {
        g();
    }

    public void onSleepTimerUpdate(r r1)
    {
        if (b != null)
        {
            b.setText(z.a(getActivity(), r1.a, false));
        }
        if (r1.a == 0L)
        {
            g();
        }
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.L;
    }
}

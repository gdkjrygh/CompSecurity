// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.pandora.android.gcm.a;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import p.bz.z;
import p.cm.h;
import p.cw.c;

// Referenced classes of package p.cb:
//            c

public class d extends p.cb.c
{

    CheckBox a;
    CheckBox b;
    CheckBox c;
    CheckBox d;
    CheckBox e;
    CheckBox f;
    View g;
    private android.widget.CompoundButton.OnCheckedChangeListener h;
    private android.widget.CompoundButton.OnCheckedChangeListener j;

    public d()
    {
        h = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final d a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                p.cb.d.a(a);
                a.f();
            }

            
            {
                a = d.this;
                super();
            }
        };
        j = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final d a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                p.cb.d.a(a);
            }

            
            {
                a = d.this;
                super();
            }
        };
    }

    private void a(ai ai1)
    {
        Object obj = ai1.w();
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.radio.data.ai.a.values().length];
                try
                {
                    a[com.pandora.radio.data.ai.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.radio.data.ai.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.data.ai.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.radio.data.ai.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.cb._cls3.a[((com.pandora.radio.data.ai.a) (obj)).ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("ArtistsEmailOptIn ConfigEnabledState unknown type ").append(obj).toString());

        case 1: // '\001'
            if (f != null)
            {
                getView().findViewById(0x7f100113).setVisibility(8);
                f = null;
            }
            return;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            obj = g.findViewById(0x7f100112);
            break;
        }
        if (obj != null)
        {
            ((View) (obj)).setVisibility(0);
        }
        f = (CheckBox)g.findViewById(0x7f100113).findViewById(0x7f100243);
        obj = f;
        boolean flag;
        if (ai1.w() == com.pandora.radio.data.ai.a.c || ai1.w() == com.pandora.radio.data.ai.a.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((CheckBox) (obj)).setChecked(flag);
        f.setOnCheckedChangeListener(j);
    }

    static void a(d d1)
    {
        d1.h();
    }

    public static d e()
    {
        return new d();
    }

    private void h()
    {
        ai ai1 = b.a.b().k().t();
        ai ai2 = new ai(ai1);
        boolean flag;
        if (e.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai2.c(flag);
        if (a.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai2.d(flag);
        if (b.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai2.e(flag);
        if (c.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai2.f(flag);
        if (d.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai2.g(flag);
        if (ai1.w() != com.pandora.radio.data.ai.a.a)
        {
            com.pandora.radio.data.ai.a a1;
            if (f.isChecked())
            {
                a1 = com.pandora.radio.data.ai.a.c;
            } else
            {
                a1 = com.pandora.radio.data.ai.a.d;
            }
            ai2.b(a1);
        }
        if (!ai1.a(ai2))
        {
            (new h(ai1, ai2, true)).execute(new Object[0]);
        }
    }

    public CharSequence d()
    {
        return getString(0x7f0801ee);
    }

    void f()
    {
        boolean flag;
        if (g() && e.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.setEnabled(flag);
        d.setEnabled(flag);
    }

    boolean g()
    {
        return com.pandora.android.gcm.a.a().d(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        g = layoutinflater.inflate(0x7f04003f, viewgroup, false);
        layoutinflater = b.a.b().k().t();
        e = (CheckBox)g.findViewById(0x7f100109);
        a = (CheckBox)g.findViewById(0x7f10010a);
        b = (CheckBox)g.findViewById(0x7f10010c);
        c = (CheckBox)g.findViewById(0x7f10010e);
        d = (CheckBox)g.findViewById(0x7f100110);
        viewgroup = g.findViewById(0x7f100108);
        int i;
        if (g())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        viewgroup.setVisibility(i);
        e.setChecked(layoutinflater.g());
        a.setChecked(layoutinflater.h());
        b.setChecked(layoutinflater.i());
        c.setChecked(layoutinflater.j());
        d.setChecked(layoutinflater.k());
        e.setOnCheckedChangeListener(h);
        a.setOnCheckedChangeListener(j);
        b.setOnCheckedChangeListener(j);
        c.setOnCheckedChangeListener(j);
        d.setOnCheckedChangeListener(j);
        a(layoutinflater);
        f();
        return g;
    }

    public void onUserSettings(z z1)
    {
        boolean flag1 = true;
        z1 = z1.a;
        CheckBox checkbox = e;
        boolean flag;
        if (z1.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        checkbox = a;
        if (z1.h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        checkbox = b;
        if (z1.i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        checkbox = c;
        if (z1.j())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        checkbox = d;
        if (z1.k())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        a(z1);
        f();
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.H;
    }
}

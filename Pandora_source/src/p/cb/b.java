// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.util.p;
import com.pandora.radio.data.f;
import com.pandora.radio.data.o;
import com.pandora.radio.provider.i;
import com.pandora.radio.util.k;
import p.cw.c;
import p.df.a;

// Referenced classes of package p.cb:
//            c

public class b extends p.cb.c
    implements android.view.View.OnClickListener
{

    View a;
    private BroadcastReceiver b;

    public b()
    {
        b = new BroadcastReceiver() {

            final b a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (context.equals(PandoraIntent.a("cmd_change_settings_result")) || context.equals(PandoraIntent.a("cmd_change_per_station_settings_result")))
                {
                    intent.getBooleanExtra("intent_success", false);
                    p.cb.b.a(a);
                }
            }

            
            {
                a = b.this;
                super();
            }
        };
    }

    static void a(b b1)
    {
        b1.g();
    }

    public static b e()
    {
        return new b();
    }

    private void g()
    {
        Object obj = com.pandora.android.provider.b.a.b().j();
        c c1 = com.pandora.android.provider.b.a.b();
        CheckBox checkbox = (CheckBox)a.findViewById(0x7f1000bc);
        String s = ((o) (obj)).v();
        p.df.a.c("AdvancedSettingsFragment", (new StringBuilder()).append("audioQuality = ").append(s).toString());
        checkbox.setChecked("high".equals(s));
        checkbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(((o) (obj))) {

            final o a;
            final b b;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
            {
                k k1;
                if (flag1)
                {
                    compoundbutton = "high";
                } else
                {
                    compoundbutton = "normal";
                }
                a.b(compoundbutton);
                k1 = com.pandora.android.provider.b.a.b().o();
                if (flag1)
                {
                    compoundbutton = com.pandora.radio.util.k.b.c;
                } else
                {
                    compoundbutton = com.pandora.radio.util.k.b.b;
                }
                k1.a(compoundbutton, com.pandora.radio.util.k.c.a);
            }

            
            {
                b = b.this;
                a = o1;
                super();
            }
        });
        checkbox = (CheckBox)a.findViewById(0x7f1000be);
        boolean flag;
        if (!((o) (obj)).x())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        checkbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(((o) (obj))) {

            final o a;
            final b b;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
            {
                compoundbutton = a;
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                compoundbutton.g(flag1);
            }

            
            {
                b = b.this;
                a = o1;
                super();
            }
        });
        obj = (CheckBox)a.findViewById(0x7f1000c5);
        ((CheckBox) (obj)).setChecked(com.pandora.android.provider.b.a.u());
        ((CheckBox) (obj)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final b a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
            {
                com.pandora.android.provider.b.a.h(flag1);
            }

            
            {
                a = b.this;
                super();
            }
        });
        if (c1.l().k())
        {
            a.findViewById(0x7f1000c4).setVisibility(8);
        }
        if (com.pandora.android.artist.b.a())
        {
            a.findViewById(0x7f1000c0).setVisibility(8);
        } else
        {
            a.findViewById(0x7f1000c0).setVisibility(0);
            TextView textview = (TextView)a.findViewById(0x7f1000c3);
            TextView textview1 = (TextView)a.findViewById(0x7f1000c2);
            if (com.pandora.android.artist.b.b())
            {
                textview1.setText(getString(0x7f0800a2, new Object[] {
                    Integer.valueOf(c1.y().h())
                }));
                textview.setText(getString(0x7f0801f6));
            } else
            {
                textview.setText(getString(0x7f0801f4));
                textview1.setText(getString(0x7f0800a1));
            }
            a.findViewById(0x7f1000c1).setOnClickListener(this);
        }
        ((Button)a.findViewById(0x7f1000c8)).setOnClickListener(new android.view.View.OnClickListener() {

            final b a;

            public void onClick(View view)
            {
                a.f();
            }

            
            {
                a = b.this;
                super();
            }
        });
        if (com.pandora.android.provider.b.a.x())
        {
            ((LinearLayout)a.findViewById(0x7f1000c7)).setVisibility(0);
        }
    }

    public CharSequence d()
    {
        return getString(0x7f08007a);
    }

    void f()
    {
        com.pandora.android.activity.a.e(getActivity());
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f1000c1)
        {
            com.pandora.android.provider.b.a.C().a((new PandoraIntent("show_page")).putExtra("intent_page_name", p.A).putExtra("intent_show_force_screen", true));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = new PandoraIntentFilter();
        bundle.a("cmd_change_settings_result");
        bundle.a("cmd_change_per_station_settings_result");
        com.pandora.android.provider.b.a.C().a(b, bundle);
        a = layoutinflater.inflate(0x7f040021, viewgroup, false);
        g();
        return a;
    }

    public void onDestroyView()
    {
        try
        {
            com.pandora.android.provider.b.a.C().a(b);
        }
        catch (Exception exception)
        {
            p.df.a.e("AdvancedSettingsFragment", (new StringBuilder()).append("exception during onDestroy- ").append(exception.getMessage()).toString());
        }
        super.onDestroyView();
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.I;
    }
}

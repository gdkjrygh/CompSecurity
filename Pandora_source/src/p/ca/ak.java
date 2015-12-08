// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.j;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.activity.f;
import com.pandora.android.data.AlarmData;
import com.pandora.android.data.a;
import com.pandora.android.iap.d;
import com.pandora.android.provider.b;
import com.pandora.android.util.Switch;
import com.pandora.android.util.e;
import com.pandora.android.util.s;
import com.pandora.android.util.z;
import com.pandora.android.view.RoundLinearLayout;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.data.y;
import p.bz.m;
import p.bz.q;
import p.bz.r;
import p.cm.p;
import p.cw.c;
import p.dd.at;
import p.dd.k;

// Referenced classes of package p.ca:
//            l

public class ak extends l
{

    private static String h;
    private static String j;
    private static a n[];
    private static com.pandora.android.activity.f.b o = new com.pandora.android.activity.f.b() {

        public a[] a(HomeTabsActivity hometabsactivity, boolean flag)
        {
            if (flag)
            {
                return p.ca.ak.j();
            } else
            {
                return p.ca.ak.j();
            }
        }

    };
    protected boolean a;
    private View b;
    private y c;
    private TextView d;
    private TextView e;
    private AlarmData f;
    private Switch g;
    private android.widget.CompoundButton.OnCheckedChangeListener k;
    private android.view.View.OnClickListener l;
    private BroadcastReceiver m;

    public ak()
    {
        a = false;
        k = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final ak a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                boolean flag2 = true;
                compoundbutton = a.getActivity();
                boolean flag1;
                if (p.ca.ak.a(a) != null && !s.a(p.ca.ak.a(a).i()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag)
                {
                    if (flag1)
                    {
                        com.pandora.android.util.e.a(compoundbutton).b(compoundbutton, p.ca.ak.a(a));
                        s.a(compoundbutton, p.ca.ak.a(a).d(compoundbutton));
                    } else
                    {
                        p.ca.ak.b(a).findViewById(0x7f100253).performClick();
                    }
                } else
                if (flag1)
                {
                    com.pandora.android.util.e.a(compoundbutton).c(compoundbutton, p.ca.ak.a(a));
                }
                compoundbutton = a;
                if (flag1 && p.ca.ak.a(a).d())
                {
                    flag = flag2;
                } else
                {
                    flag = false;
                }
                p.ca.ak.a(compoundbutton, flag);
            }

            
            {
                a = ak.this;
                super();
            }
        };
        l = new android.view.View.OnClickListener() {

            final ak a;

            public void onClick(View view)
            {
                Bundle bundle;
                int i;
                i = view.getId();
                bundle = new Bundle();
                i;
                JVM INSTR tableswitch 2131755590 2131755603: default 88
            //                           2131755590 98
            //                           2131755591 88
            //                           2131755592 88
            //                           2131755593 157
            //                           2131755594 164
            //                           2131755595 171
            //                           2131755596 185
            //                           2131755597 88
            //                           2131755598 178
            //                           2131755599 192
            //                           2131755600 88
            //                           2131755601 88
            //                           2131755602 88
            //                           2131755603 245;
                   goto _L1 _L2 _L1 _L1 _L3 _L4 _L5 _L6 _L1 _L7 _L8 _L1 _L1 _L1 _L9
_L1:
                throw new IllegalArgumentException("Unknown View Id, unable to create a PageName");
_L2:
                view = com.pandora.android.util.p.u;
_L13:
                if (view != null)
                {
                    PandoraIntent pandoraintent = new PandoraIntent("show_page");
                    pandoraintent.putExtra("intent_page_name", view);
                    pandoraintent.putExtra("intent_show_force_screen", true);
                    if (!bundle.isEmpty())
                    {
                        pandoraintent.putExtras(bundle);
                    }
                    b.a.C().a(pandoraintent);
                }
_L11:
                return;
_L3:
                view = com.pandora.android.util.p.t;
                continue; /* Loop/switch isn't completed */
_L4:
                view = com.pandora.android.util.p.v;
                continue; /* Loop/switch isn't completed */
_L5:
                view = com.pandora.android.util.p.w;
                continue; /* Loop/switch isn't completed */
_L7:
                view = com.pandora.android.util.p.z;
                continue; /* Loop/switch isn't completed */
_L6:
                view = com.pandora.android.util.p.s;
                continue; /* Loop/switch isn't completed */
_L8:
                if (a.a)
                {
                    s.a(a.getActivity(), 0x7f080139);
                    return;
                }
                if (p.ca.ak.c(a) == null)
                {
                    s.a(a.getActivity(), 0x7f08024a);
                    return;
                }
                view = com.pandora.android.util.p.x;
                continue; /* Loop/switch isn't completed */
_L9:
                if (p.ca.ak.a(a) == null) goto _L11; else goto _L10
_L10:
                view = com.pandora.android.util.p.y;
                bundle.putParcelable("intent_alarm_data", p.ca.ak.a(a));
                if (true) goto _L13; else goto _L12
_L12:
            }

            
            {
                a = ak.this;
                super();
            }
        };
        m = new BroadcastReceiver() {

            final ak a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (PandoraIntent.a("cmd_change_settings_result").equals(context) && Boolean.valueOf(intent.getBooleanExtra("intent_success", false)).booleanValue())
                {
                    context = (ai)intent.getSerializableExtra("intent_user_settings");
                    if (!s.a(context.l()))
                    {
                        a.b(context.l());
                    }
                }
            }

            
            {
                a = ak.this;
                super();
            }
        };
    }

    static AlarmData a(ak ak1)
    {
        return ak1.f;
    }

    static void a(ak ak1, boolean flag)
    {
        ak1.a(flag);
    }

    private void a(boolean flag)
    {
label0:
        {
            if (g != null)
            {
                g.setOnCheckedChangeListener(null);
                g.setChecked(flag);
                g.setOnCheckedChangeListener(k);
            }
            if (e != null && f != null)
            {
                if (!flag)
                {
                    break label0;
                }
                e.setVisibility(0);
                e.setText(f.a(getActivity()));
            }
            return;
        }
        e.setVisibility(8);
    }

    static View b(ak ak1)
    {
        return ak1.b;
    }

    static y c(ak ak1)
    {
        return ak1.c;
    }

    public static ak e()
    {
        return new ak();
    }

    public static f f()
    {
        return new f("settings", b.a.h().getString(0x7f080272), p/ca/ak, null, o);
    }

    static String g()
    {
        return j;
    }

    static String h()
    {
        return h;
    }

    static a[] j()
    {
        return n;
    }

    private void k()
    {
        if (d != null)
        {
            d.setText(a(0L));
        }
    }

    private void l()
    {
        TextView textview = (TextView)b.findViewById(0x7f100258);
        RoundLinearLayout roundlinearlayout = (RoundLinearLayout)b.findViewById(0x7f100257);
        RoundLinearLayout roundlinearlayout1 = (RoundLinearLayout)b.findViewById(0x7f100252);
        if (android.os.Build.VERSION.SDK_INT >= 17 && !b.a.b().l().l())
        {
            roundlinearlayout.setVisibility(0);
            roundlinearlayout1.setRoundedCorners(0);
            textview.setOnClickListener(new android.view.View.OnClickListener() {

                final ak a;

                public void onClick(View view)
                {
                    if (android.os.Build.VERSION.SDK_INT >= 18)
                    {
                        a.startActivity(new Intent("android.settings.DREAM_SETTINGS"));
                        return;
                    } else
                    {
                        a.startActivity(new Intent("android.settings.DISPLAY_SETTINGS"));
                        return;
                    }
                }

            
            {
                a = ak.this;
                super();
            }
            });
            return;
        } else
        {
            roundlinearlayout.setVisibility(8);
            return;
        }
    }

    protected String a(long l1)
    {
        if (a)
        {
            return getResources().getString(0x7f080139);
        }
        if (l1 == 0L)
        {
            return getResources().getString(0x7f0801f4);
        } else
        {
            return z.a(getActivity(), l1, false);
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        super.a(flag, flag1);
        if (flag)
        {
            (new p()).execute(new Object[0]);
        }
    }

    protected void b(String s1)
    {
        ((TextView)b.findViewById(0x7f100248)).setText(s1);
    }

    public CharSequence d()
    {
        return getString(0x7f080272);
    }

    public void onAlarmUpdatedEvent(p.bz.b b1)
    {
label0:
        {
            if (b1.a)
            {
                f = b1.b;
                if (f == null)
                {
                    break label0;
                }
                a(f.d());
            }
            return;
        }
        f = new AlarmData();
        a(false);
    }

    public void onCastingState(k k1)
    {
        a = k1.a;
        if (d != null)
        {
            d.setText(a(z.a().produceSleepTimerUpdateEvent().a));
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new PandoraIntentFilter();
        bundle.a("cmd_change_settings_result");
        b.a.C().a(m, bundle);
        if (s.m())
        {
            com.pandora.android.iap.d.d.a().e().a();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (s.l())
        {
            return null;
        }
        b = layoutinflater.inflate(0x7f040091, viewgroup, false);
        b.findViewById(0x7f100246).setOnClickListener(l);
        b.findViewById(0x7f100249).setOnClickListener(l);
        b.findViewById(0x7f10024a).setOnClickListener(l);
        b.findViewById(0x7f10024b).setOnClickListener(l);
        b.findViewById(0x7f10024e).setOnClickListener(l);
        b.findViewById(0x7f10024c).setOnClickListener(l);
        b.findViewById(0x7f10024f).setOnClickListener(l);
        b.findViewById(0x7f100253).setOnClickListener(l);
        b.findViewById(0x7f10025c).setOnClickListener(new android.view.View.OnClickListener() {

            final ak a;

            public void onClick(View view)
            {
                com.pandora.android.activity.a.a(a.getActivity(), new Runnable(this, view) {

                    final View a;
                    final _cls1 b;

                    public void run()
                    {
                        a.setEnabled(false);
                    }

            
            {
                b = _pcls1;
                a = view;
                super();
            }
                });
            }

            
            {
                a = ak.this;
                super();
            }
        });
        layoutinflater = b.findViewById(0x7f10025e);
        if (layoutinflater != null)
        {
            layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

                final ak a;

                public void onClick(View view)
                {
                    com.pandora.android.activity.a.a(a.getActivity(), 0x7f100015);
                }

            
            {
                a = ak.this;
                super();
            }
            });
        }
        layoutinflater = (TextView)b.findViewById(0x7f10025d);
        layoutinflater.setText(j);
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener(layoutinflater) {

            final TextView a;
            final ak b;

            public void onClick(View view)
            {
                if (ak.g().equals(a.getText()))
                {
                    a.setText(ak.h());
                    return;
                } else
                {
                    a.setText(ak.g());
                    return;
                }
            }

            
            {
                b = ak.this;
                a = textview;
                super();
            }
        });
        layoutinflater = (TextView)b.findViewById(0x7f10025b);
        layoutinflater.setText(Html.fromHtml(getString(0x7f08007b)));
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            final ak a;

            public void onClick(View view)
            {
                com.pandora.android.activity.a.a(a.getActivity(), a.getString(0x7f08007c));
            }

            
            {
                a = ak.this;
                super();
            }
        });
        layoutinflater = (TextView)b.findViewById(0x7f10025a);
        layoutinflater.setText(Html.fromHtml(getString(0x7f080275)));
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            final ak a;

            public void onClick(View view)
            {
                com.pandora.android.activity.a.a(a.getActivity(), a.getString(0x7f080276));
            }

            
            {
                a = ak.this;
                super();
            }
        });
        b.findViewById(0x7f100259).setOnClickListener(new android.view.View.OnClickListener() {

            final ak a;

            public void onClick(View view)
            {
                com.pandora.android.activity.a.a(a.getActivity(), a.getString(0x7f080234));
            }

            
            {
                a = ak.this;
                super();
            }
        });
        b(b.a.d().c());
        d = (TextView)b.findViewById(0x7f100251);
        g = (Switch)b.findViewById(0x7f100256);
        e = (TextView)b.findViewById(0x7f100255);
        com.pandora.android.util.e.a(getActivity()).a();
        if (g != null)
        {
            g.setOnCheckedChangeListener(k);
        }
        l();
        layoutinflater = (TextView)b.findViewById(0x7f100245);
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            final ak a;

            public void onClick(View view)
            {
                view = a.getActivity();
                view.startActivity(s.c(view));
            }

            
            {
                a = ak.this;
                super();
            }
        });
        if (b.a.b().k().a())
        {
            layoutinflater.setVisibility(0);
        } else
        {
            layoutinflater.setVisibility(8);
        }
        if (s.u())
        {
            layoutinflater = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.c).a(com.pandora.android.view.HeaderLayout.a.a).a(com.pandora.android.view.HeaderLayout.b.c).b(com.pandora.android.view.HeaderLayout.a.e).a(d().toString()).a();
            b.a.e().a(layoutinflater);
        }
        return b;
    }

    public void onDestroyView()
    {
        try
        {
            b.a.C().a(m);
        }
        catch (Exception exception)
        {
            p.df.a.b("SettingsFragment", (new StringBuilder()).append("exception during onDestroy- ").append(exception.getMessage()).toString());
        }
        super.onDestroyView();
    }

    public void onPebbleWatchConnected(m m1)
    {
        p.df.a.c("SettingsFragment", (new StringBuilder()).append("PEBBLE HERE - ").append(m1.a).toString());
        View view = b.findViewById(0x7f10024d);
        if (m1.a)
        {
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        l();
    }

    public void onSleepTimerEndEvent(q q)
    {
        k();
    }

    public void onSleepTimerUpdate(r r1)
    {
        if (d != null)
        {
            d.setText(a(r1.a));
        }
    }

    public void onStationDataEvent(at at1)
    {
        c = at1.a;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        (new p()).execute(new Object[0]);
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.D;
    }

    static 
    {
        j = String.format("version %s", new Object[] {
            b.a.i()
        });
        h = String.format("version: %s %s", new Object[] {
            b.a.i(), b.a.k()
        });
        n = (new a[] {
            a.e
        });
    }
}

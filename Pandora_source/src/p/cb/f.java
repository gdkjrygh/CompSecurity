// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.j;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.Session;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.data.h;
import com.pandora.android.util.UrlImageView;
import com.pandora.android.util.s;
import com.pandora.android.view.RoundLinearLayout;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.data.o;
import p.bx.b;
import p.bx.d;
import p.bz.z;
import p.cm.m;
import p.cw.c;
import p.df.a;

// Referenced classes of package p.cb:
//            c

public class f extends p.cb.c
{

    private android.widget.CompoundButton.OnCheckedChangeListener A;
    private android.widget.CompoundButton.OnCheckedChangeListener B;
    private android.widget.CompoundButton.OnCheckedChangeListener C;
    private android.widget.CompoundButton.OnCheckedChangeListener D;
    private android.widget.CompoundButton.OnCheckedChangeListener E;
    private BroadcastReceiver F;
    private android.view.View.OnClickListener G;
    private int a;
    private int b;
    private View c;
    private TextView d;
    private CompoundButton e;
    private TextView f;
    private CompoundButton g;
    private CompoundButton h;
    private TextView j;
    private CompoundButton k;
    private CompoundButton l;
    private CompoundButton m;
    private RoundLinearLayout n;
    private View o;
    private UrlImageView p;
    private TextView q;
    private View r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private Activity w;
    private Fragment x;
    private p.bx.b.b y;
    private android.widget.CompoundButton.OnCheckedChangeListener z;

    public f()
    {
        y = new p.bx.b.b() {

            final f a;

            public void a()
            {
                p.cb.f.a(a);
            }

            public void b()
            {
                p.cb.f.b(a);
            }

            public void c()
            {
                p.cb.f.c(a);
            }

            
            {
                a = f.this;
                super();
            }
        };
        z = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final f a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (p.cb.f.d(a))
                {
                    return;
                } else
                {
                    p.cb.f.a(a, true);
                    a.f();
                    return;
                }
            }

            
            {
                a = f.this;
                super();
            }
        };
        A = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final f a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                p.df.a.a("PrivacySettingsFragment", (new StringBuilder()).append("Privacy Settings : onEnableFacebookAutoShareChecked ").append(flag).append(",  updatingViewsInProgress ").append(p.cb.f.d(a)).toString());
                if (p.cb.f.d(a))
                {
                    return;
                }
                p.cb.f.a(a, true, flag);
                p.cb.f.b(a, flag);
                if (flag && f.e(a).isChecked())
                {
                    com.pandora.android.activity.a.c(a.getActivity());
                    if (!f.f(a).isChecked() && !f.g(a).isChecked() && !p.cb.f.h(a).isChecked())
                    {
                        p.cb.f.a(a, true, f.f(a), f.i(a));
                        p.cb.f.a(a, true, f.g(a), p.cb.f.j(a));
                        p.cb.f.a(a, true, p.cb.f.h(a), f.k(a));
                    }
                }
                p.cb.f.a(a, true);
                a.f();
            }

            
            {
                a = f.this;
                super();
            }
        };
        B = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final f a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (p.cb.f.d(a))
                {
                    return;
                }
                if (!flag && !f.g(a).isChecked() && !p.cb.f.h(a).isChecked())
                {
                    p.cb.f.a(a, false, f.l(a), p.cb.f.m(a));
                }
                p.cb.f.a(a, true);
                a.f();
            }

            
            {
                a = f.this;
                super();
            }
        };
        C = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final f a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (p.cb.f.d(a))
                {
                    return;
                }
                if (!flag && !f.f(a).isChecked() && !p.cb.f.h(a).isChecked())
                {
                    p.cb.f.a(a, false, f.l(a), p.cb.f.m(a));
                }
                p.cb.f.a(a, true);
                a.f();
            }

            
            {
                a = f.this;
                super();
            }
        };
        D = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final f a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (p.cb.f.d(a))
                {
                    return;
                }
                if (!flag && !f.f(a).isChecked() && !f.g(a).isChecked())
                {
                    p.cb.f.a(a, false, f.l(a), p.cb.f.m(a));
                }
                p.cb.f.a(a, true);
                a.f();
            }

            
            {
                a = f.this;
                super();
            }
        };
        E = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final f a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (!p.cb.f.d(a) && !f.n(a))
                {
                    p.cb.f.c(a, true);
                    compoundbutton = f.e(a);
                    boolean flag1;
                    if (!f.n(a))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    compoundbutton.setClickable(flag1);
                    if (flag)
                    {
                        (new m()).execute(new Object[] {
                            new p.cm.m.a(this) {

                                final _cls9 a;

                                public void a()
                                {
                                    if (p.cb.f.o(a.a) != null)
                                    {
                                        p.bx.d.a().a(f.p(a.a), p.cb.f.o(a.a).getActivity());
                                    }
                                }

                                public void b()
                                {
                                    p.cb.f.b(a.a);
                                }

            
            {
                a = _pcls9;
                super();
            }
                            }
                        });
                        return;
                    }
                    p.df.a.c("PrivacySettingsFragment", "Privacy Settings : facebook disabled --> disconnect from Facebook");
                    if (!p.bx.d.a().a(true))
                    {
                        p.cb.f.c(a, false);
                        return;
                    }
                }
            }

            
            {
                a = f.this;
                super();
            }
        };
        F = new BroadcastReceiver() {

            final f a;

            public void onReceive(Context context, Intent intent)
            {
                if (a.isVisible()) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if (!PandoraIntent.a("cmd_change_settings_result").equals(context = intent.getAction())) goto _L1; else goto _L3
_L3:
                context = (ai)intent.getSerializableExtra("intent_user_settings");
                if (!intent.getBooleanExtra("intent_success", false)) goto _L5; else goto _L4
_L4:
                p.df.a.a("PrivacySettingsFragment", "Privacy Settings : ACTION_CMD_CHANGE_SETTINGS_RESULT - updating Views with NEW user settings data");
_L7:
                p.cb.f.a(a, context);
                return;
_L5:
                p.df.a.a("PrivacySettingsFragment", "Privacy Settings : ACTION_CMD_CHANGE_SETTINGS_RESULT - updating Views with OLD user settings data");
                if (a.isResumed())
                {
                    com.pandora.android.util.s.a(a.getActivity(), 0x7f08021a, false);
                }
                if (true) goto _L7; else goto _L6
_L6:
            }

            
            {
                a = f.this;
                super();
            }
        };
        G = new android.view.View.OnClickListener() {

            final f a;

            public void onClick(View view)
            {
                f.r(a).openContextMenu(f.q(a));
            }

            
            {
                a = f.this;
                super();
            }
        };
    }

    private void a(ai ai1)
    {
        boolean flag1 = true;
        u = true;
        s = ai1.e();
        b b1;
        boolean flag;
        boolean flag2;
        if (s)
        {
            d.setText(0x7f08021d);
        } else
        {
            d.setText(0x7f08021c);
        }
        e.setChecked(ai1.f());
        a(ai1.e());
        b1 = p.bx.d.a();
        flag2 = b1.c();
        g.setChecked(flag2);
        h.setChecked(ai1.p());
        if (ai1.e() && flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag, flag);
        if (flag)
        {
            p.df.a.a("PrivacySettingsFragment", "PrivacySettingsFragment --> autoShareEnabled == true :  settings onFacebookAutoShareCheckedChangeListener");
            h.setOnCheckedChangeListener(A);
        } else
        {
            p.df.a.a("PrivacySettingsFragment", "PrivacySettingsFragment --> autoShareEnabled == false : clear onFacebookAutoShareCheckedChangeListener");
            h.setOnCheckedChangeListener(null);
            n.setRoundedCorners(12);
        }
        k.setChecked(ai1.q());
        l.setChecked(ai1.r());
        m.setChecked(ai1.s());
        if (ai1.p() && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c(flag);
        ai1 = g;
        if (!v)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ai1.setClickable(flag);
        if (flag2)
        {
            q.setVisibility(0);
            q.setText(b1.b().f());
            p.setImageUrl(b1.b().g());
        } else
        {
            q.setText(null);
            q.setVisibility(8);
            p.setImageResource(0x7f0200df);
        }
        u = false;
    }

    static void a(f f1)
    {
        f1.j();
    }

    static void a(f f1, ai ai1)
    {
        f1.a(ai1);
    }

    static void a(f f1, boolean flag, CompoundButton compoundbutton, android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener)
    {
        f1.a(flag, compoundbutton, oncheckedchangelistener);
    }

    static void a(f f1, boolean flag, boolean flag1)
    {
        f1.b(flag, flag1);
    }

    private void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = a;
        } else
        {
            i1 = b;
        }
        e.setEnabled(flag);
        f.setEnabled(flag);
        f.setTextColor(i1);
    }

    private void a(boolean flag, CompoundButton compoundbutton, android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener)
    {
        compoundbutton.setOnCheckedChangeListener(null);
        compoundbutton.setChecked(flag);
        compoundbutton.setOnCheckedChangeListener(oncheckedchangelistener);
    }

    static boolean a(f f1, boolean flag)
    {
        f1.t = flag;
        return flag;
    }

    static void b(f f1)
    {
        f1.h();
    }

    static void b(f f1, boolean flag)
    {
        f1.c(flag);
    }

    private void b(boolean flag, boolean flag1)
    {
        p.df.a.a("PrivacySettingsFragment", (new StringBuilder()).append("PrivacySettingsFragment --> setupEnableFacebookAutoShare : facebookPublishSwitch.setEnabled = ").append(flag1).toString());
        int i1;
        if (flag)
        {
            i1 = a;
        } else
        {
            i1 = b;
        }
        j.setEnabled(flag);
        j.setTextColor(i1);
        h.setEnabled(flag1);
        h.setClickable(flag1);
    }

    static void c(f f1)
    {
        f1.g();
    }

    private void c(boolean flag)
    {
        View view = r;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        if (flag)
        {
            n.setRoundedCorners(0);
            return;
        } else
        {
            n.setRoundedCorners(12);
            return;
        }
    }

    static boolean c(f f1, boolean flag)
    {
        f1.v = flag;
        return flag;
    }

    static boolean d(f f1)
    {
        return f1.u;
    }

    static CompoundButton e(f f1)
    {
        return f1.g;
    }

    public static f e()
    {
        return new f();
    }

    static CompoundButton f(f f1)
    {
        return f1.k;
    }

    static CompoundButton g(f f1)
    {
        return f1.l;
    }

    private void g()
    {
        p.df.a.a("PrivacySettingsFragment", (new StringBuilder()).append("PrivacySettingsFragment.onFacebookDisconnect : session = ").append(Session.getActiveSession()).toString());
        v = false;
        a(com.pandora.android.provider.b.a.b().k().t());
    }

    static CompoundButton h(f f1)
    {
        return f1.m;
    }

    private void h()
    {
        p.df.a.a("PrivacySettingsFragment", (new StringBuilder()).append("PrivacySettingsFragment.onFacebookAuthFailed : session = ").append(Session.getActiveSession()).toString());
        v = false;
        a(com.pandora.android.provider.b.a.b().k().t());
        t = true;
        f();
    }

    static android.widget.CompoundButton.OnCheckedChangeListener i(f f1)
    {
        return f1.B;
    }

    static android.widget.CompoundButton.OnCheckedChangeListener j(f f1)
    {
        return f1.C;
    }

    private void j()
    {
        p.df.a.a("PrivacySettingsFragment", (new StringBuilder()).append("PrivacySettingsFragment.onFacebookAuthSuccess : session = ").append(Session.getActiveSession()).toString());
        v = false;
        if (h.isChecked())
        {
            com.pandora.android.activity.a.c(getActivity());
        }
        a(com.pandora.android.provider.b.a.b().k().t());
        t = true;
        f();
        ScrollView scrollview = (ScrollView)o.findViewById(0x7f100153);
        g.post(new Runnable(scrollview) {

            final ScrollView a;
            final f b;

            public void run()
            {
                a.fullScroll(130);
            }

            
            {
                b = f.this;
                a = scrollview;
                super();
            }
        });
    }

    static android.widget.CompoundButton.OnCheckedChangeListener k(f f1)
    {
        return f1.D;
    }

    static CompoundButton l(f f1)
    {
        return f1.h;
    }

    static android.widget.CompoundButton.OnCheckedChangeListener m(f f1)
    {
        return f1.A;
    }

    static boolean n(f f1)
    {
        return f1.v;
    }

    static Fragment o(f f1)
    {
        return f1.x;
    }

    static p.bx.b.b p(f f1)
    {
        return f1.y;
    }

    static View q(f f1)
    {
        return f1.c;
    }

    static Activity r(f f1)
    {
        return f1.w;
    }

    public boolean a()
    {
        return false;
    }

    public boolean a(Intent intent)
    {
        if (isResumed() && intent.getAction().equals(PandoraIntent.a("cmd_change_settings_result")) && !intent.getBooleanExtra("intent_success", false))
        {
            return true;
        } else
        {
            return super.a(intent);
        }
    }

    public CharSequence d()
    {
        return getString(0x7f080212);
    }

    ai f()
    {
        ai ai1 = com.pandora.android.provider.b.a.b().k().t();
        ai ai2 = new ai(ai1);
        ai2.a(s);
        ai2.b(e.isChecked());
        ai2.i(h.isChecked());
        ai2.j(k.isChecked());
        ai2.k(l.isChecked());
        ai2.l(m.isChecked());
        ai2.m(t);
        if (!ai1.a(ai2))
        {
            p.df.a.a("PrivacySettingsFragment", "Privacy Settings : submitUserSettings -- > new ChangeSettingsAsyncTask(oldNewUserSettings, newUserSettings, showToast).execute(...)");
            (new p.cm.h(ai1, ai2, com.pandora.android.provider.b.a.b().j().f())).execute(new Object[0]);
        }
        return ai2;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        registerForContextMenu(c);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        p.bx.d.a().a(getActivity(), i1, j1, intent);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        w = activity;
        x = this;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onContextItemSelected(menuitem);

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_104;

        case 0: // '\0'
            s = false;
            d.setText(0x7f08021c);
            break;
        }
_L1:
        a(s);
        if (s)
        {
            b(g.isChecked(), g.isChecked());
            c(h.isChecked());
        } else
        {
            b(false, false);
            c(false);
        }
        t = true;
        f();
        return true;
        s = true;
        d.setText(0x7f08021d);
          goto _L1
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        contextmenu.setHeaderTitle(getResources().getString(0x7f080205));
        view = contextmenu.add(0, 0, 0, 0x7f08021c).setCheckable(true);
        boolean flag;
        if (!s)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
        contextmenu.add(0, 1, 1, 0x7f08021d).setCheckable(true).setChecked(s);
        contextmenu.setGroupCheckable(0, true, true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        a = getResources().getColor(0x7f0b008e);
        b = getResources().getColor(0x7f0b008f);
        o = layoutinflater.inflate(0x7f040088, viewgroup, false);
        c = o.findViewById(0x7f100221);
        d = (TextView)o.findViewById(0x7f100223);
        e = (CompoundButton)o.findViewById(0x7f100225);
        f = (TextView)o.findViewById(0x7f100224);
        g = (CompoundButton)o.findViewById(0x7f100234);
        h = (CompoundButton)o.findViewById(0x7f100227);
        n = (RoundLinearLayout)o.findViewById(0x7f100154);
        j = (TextView)o.findViewById(0x7f100226);
        r = o.findViewById(0x7f100228);
        k = (CompoundButton)o.findViewById(0x7f10022b);
        l = (CompoundButton)o.findViewById(0x7f10022e);
        m = (CompoundButton)o.findViewById(0x7f100231);
        p = (UrlImageView)o.findViewById(0x7f100232);
        q = (TextView)o.findViewById(0x7f100233);
        c.setOnClickListener(G);
        e.setOnCheckedChangeListener(z);
        g.setOnCheckedChangeListener(E);
        k.setOnCheckedChangeListener(B);
        l.setOnCheckedChangeListener(C);
        m.setOnCheckedChangeListener(D);
        p.bx.d.a().a();
        v = false;
        p.bx.d.a().a(y);
        layoutinflater = new PandoraIntentFilter();
        layoutinflater.a("cmd_change_settings_result");
        com.pandora.android.provider.b.a.C().a(F, layoutinflater);
        return o;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        try
        {
            com.pandora.android.provider.b.a.C().a(F);
        }
        catch (Exception exception)
        {
            p.df.a.c("PrivacySettingsFragment", (new StringBuilder()).append("exception during onDestroy- ").append(exception.getMessage()).toString());
        }
        p.bx.d.a().b(y);
    }

    public void onDetach()
    {
        super.onDetach();
        w = null;
        x = null;
    }

    public void onStart()
    {
        super.onStart();
        a(com.pandora.android.provider.b.a.b().k().t());
    }

    public void onUserSettings(z z1)
    {
        a(z1.a);
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.G;
    }
}

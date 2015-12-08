// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cb;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.j;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.provider.b;
import com.pandora.android.util.r;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.util.i;
import p.bz.h;
import p.bz.z;
import p.ca.y;
import p.cm.aj;
import p.cm.g;
import p.cw.c;

// Referenced classes of package p.cb:
//            c

public class p.cb.a extends p.cb.c
{
    private class a
        implements TextWatcher
    {

        final p.cb.a a;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
            p.cb.a.a(a, true);
        }

        private a()
        {
            a = p.cb.a.this;
            super();
        }

    }


    private static final String h = a(Character.toString('\u2022'), 8);
    EditText a;
    EditText b;
    EditText c;
    EditText d;
    EditText e;
    CompoundButton f;
    View g;
    private boolean j;
    private CharSequence k[];
    private af l;
    private Animation m;
    private g n;
    private android.view.View.OnClickListener o;
    private android.view.View.OnClickListener p;
    private android.view.View.OnFocusChangeListener q;
    private BroadcastReceiver r;

    public p.cb.a()
    {
        l = b.a.d();
        o = new android.view.View.OnClickListener() {

            final p.cb.a a;

            public void onClick(View view)
            {
                a.b.selectAll();
            }

            
            {
                a = p.cb.a.this;
                super();
            }
        };
        p = new android.view.View.OnClickListener() {

            final p.cb.a a;

            public void onClick(View view)
            {
                a.h();
            }

            
            {
                a = p.cb.a.this;
                super();
            }
        };
        q = new android.view.View.OnFocusChangeListener() {

            final p.cb.a a;

            public void onFocusChange(View view, boolean flag)
            {
                view = s.a(a.b.getText());
                if (flag)
                {
                    if (p.cb.a.k().equals(view))
                    {
                        a.b.setText(null);
                        p.cb.a.a(a, false);
                    }
                } else
                if (s.a(view))
                {
                    a.b.setText(p.cb.a.k());
                    p.cb.a.a(a, false);
                    return;
                }
            }

            
            {
                a = p.cb.a.this;
                super();
            }
        };
        r = new BroadcastReceiver() {

            final p.cb.a a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (context.equals(PandoraIntent.a("cmd_change_settings_result")))
                {
                    s.k();
                    if (!a.isDetached())
                    {
                        if (intent.getBooleanExtra("intent_success", false))
                        {
                            a.f();
                        } else
                        {
                            if (p.cb.a.b(a) != null && p.cb.a.b(a).isCancelled())
                            {
                                a.f();
                            }
                            p.cb.a.c(a).reset();
                        }
                    }
                    p.cb.a.a(a, null);
                } else
                if (context.equals(PandoraIntent.a("api_error")))
                {
                    s.k();
                    p.cb.a.a(a, null);
                    return;
                }
            }

            
            {
                a = p.cb.a.this;
                super();
            }
        };
    }

    public static String a(String s1, int i1)
    {
        if (i1 <= 0)
        {
            return "";
        } else
        {
            return (new StringBuilder()).append(s1).append(a(s1, i1 - 1)).toString();
        }
    }

    static g a(p.cb.a a1, g g1)
    {
        a1.n = g1;
        return g1;
    }

    static void a(p.cb.a a1)
    {
        a1.l();
    }

    static boolean a(p.cb.a a1, boolean flag)
    {
        a1.j = flag;
        return flag;
    }

    static g b(p.cb.a a1)
    {
        return a1.n;
    }

    private boolean b(ai ai1, ai ai2)
    {
        return !s.a(ai1.l()) && i.a(ai1.l(), ai2.l()) != 0;
    }

    static Animation c(p.cb.a a1)
    {
        return a1.m;
    }

    static CharSequence[] d(p.cb.a a1)
    {
        return a1.k;
    }

    public static p.cb.a e()
    {
        return new p.cb.a();
    }

    static String k()
    {
        return h;
    }

    private void l()
    {
        if (n == null)
        {
            f();
            return;
        } else
        {
            n.cancel(false);
            return;
        }
    }

    AlertDialog a(ai ai1, ai ai2)
    {
        View view = LayoutInflater.from(getActivity()).inflate(0x7f040077, null);
        EditText edittext = (EditText)view.findViewById(0x7f1001e6);
        return (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f080208).setView(view).setPositiveButton(0x7f0801f5, new android.content.DialogInterface.OnClickListener(edittext, ai1, ai2) {

            final EditText a;
            final ai b;
            final ai c;
            final p.cb.a d;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                s.a(a.getContext(), a);
                dialoginterface = s.a(a.getText());
                if (!s.a(dialoginterface))
                {
                    d.a(b, c, dialoginterface);
                    return;
                } else
                {
                    d.j();
                    return;
                }
            }

            
            {
                d = p.cb.a.this;
                a = edittext;
                b = ai1;
                c = ai2;
                super();
            }
        }).setNegativeButton(0x7f0800c3, new android.content.DialogInterface.OnClickListener(edittext) {

            final EditText a;
            final p.cb.a b;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                s.a(a.getContext(), a);
            }

            
            {
                b = p.cb.a.this;
                a = edittext;
                super();
            }
        }).show();
    }

    protected ai a(ai ai1)
    {
        com.pandora.radio.data.ai.b b1 = ai.b(s.a(e.getText()));
        int i1 = ai.a(s.a(c.getText()));
        String s2 = s.a(d.getText());
        boolean flag = ai1.e();
        boolean flag1 = ai1.f();
        boolean flag2 = ai1.g();
        boolean flag3 = ai1.h();
        boolean flag4 = ai1.i();
        boolean flag5 = ai1.j();
        boolean flag6 = ai1.k();
        String s3 = s.a(a.getText());
        String s1;
        if (j)
        {
            s1 = s.a(b.getText());
        } else
        {
            s1 = null;
        }
        return new ai(b1, i1, s2, flag, flag1, flag2, flag3, flag4, flag5, flag6, s3, s1, f.isChecked(), ai1.o(), ai1.p(), ai1.q(), ai1.r(), ai1.s(), ai1.t(), ai1.u(), ai1.v(), ai1.w());
    }

    void a(ai ai1, ai ai2, String s1)
    {
        n = new g();
        n.execute(new Object[] {
            ai1, ai2, l.c(), s1
        });
        s.j();
    }

    public CharSequence d()
    {
        return getString(0x7f080072);
    }

    void f()
    {
        if (s.u())
        {
            b.a.e().a(new h(com.pandora.android.view.HeaderLayout.d.c, com.pandora.android.view.HeaderLayout.a.b));
            return;
        } else
        {
            i.b();
            return;
        }
    }

    void g()
    {
        if (n != null)
        {
            return;
        }
        b.clearFocus();
        ai ai1 = b.a.b().k().t();
        ai ai2 = a(ai1);
        m.reset();
        int i1 = p.co.a.a(ai2.l());
        if (i1 != 0)
        {
            g.findViewById(0x7f10008d).startAnimation(m);
            a.requestFocus();
            s.h(getString(i1));
            return;
        }
        if (j)
        {
            i1 = p.co.a.c(ai2.m());
            if (i1 != 0)
            {
                m.reset();
                g.findViewById(0x7f100090).startAnimation(m);
                b.requestFocus();
                s.h(getString(i1));
                return;
            }
        }
        String s1 = s.a(c.getText());
        int j1 = p.co.a.f(s1);
        i1 = j1;
        if (j1 == 0)
        {
            if (p.co.a.a(p.co.a.g(s1)))
            {
                i1 = j1;
            } else
            {
                i1 = 0x7f080187;
            }
        }
        if (i1 != 0)
        {
            g.findViewById(0x7f100093).startAnimation(m);
            c.requestFocus();
            s.h(getString(i1));
            return;
        }
        i1 = p.co.a.d(ai2.d());
        if (i1 != 0)
        {
            g.findViewById(0x7f100096).startAnimation(m);
            d.requestFocus();
            s.h(getString(i1));
            return;
        }
        i1 = p.co.a.e(s.a(e.getText()));
        if (i1 != 0)
        {
            g.findViewById(0x7f100099).startAnimation(m);
            s.h(getString(i1));
            return;
        }
        if (com.pandora.android.util.r.a(ai2.c()))
        {
            f.setEnabled(false);
            f.setChecked(false);
            ai2.h(false);
        }
        boolean flag1 = b(ai2, ai1);
        boolean flag;
        if (ai2.n() != ai1.n())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag1 && !j && ai2.c() == ai1.c() && i.a(ai2.d(), ai1.d()) == 0 && ai2.a() == ai1.a() && !flag)
        {
            f();
            return;
        }
        if (flag1 || j || flag)
        {
            a(ai1, ai2);
            return;
        } else
        {
            n = new g();
            n.execute(new Object[] {
                ai1, ai2, null, null
            });
            s.j();
            return;
        }
    }

    AlertDialog h()
    {
        ListView listview;
        Object obj = ai.b(s.a(e.getText()));
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.radio.data.ai.b.values().length];
                try
                {
                    a[com.pandora.radio.data.ai.b.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.data.ai.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.radio.data.ai.b.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.radio.data.ai.b b1;
        int i1;
        if (obj == com.pandora.radio.data.ai.b.b)
        {
            i1 = 0;
        } else
        if (obj == com.pandora.radio.data.ai.b.c)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        obj = new android.app.AlertDialog.Builder(getActivity());
        ((android.app.AlertDialog.Builder) (obj)).setSingleChoiceItems(k, i1, new android.content.DialogInterface.OnClickListener() {

            final p.cb.a a;

            public void onClick(DialogInterface dialoginterface, int j1)
            {
                a.e.setText(p.cb.a.d(a)[j1]);
                dialoginterface.dismiss();
            }

            
            {
                a = p.cb.a.this;
                super();
            }
        }).setTitle(0x7f0801b0);
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        listview = ((AlertDialog) (obj)).getListView();
        b1 = ai.b(s.a(e.getText()));
        _cls2.a[b1.ordinal()];
        JVM INSTR tableswitch 1 2: default 116
    //                   1 153
    //                   2 162;
           goto _L1 _L2 _L3
_L1:
        listview.setItemChecked(0, false);
        listview.setItemChecked(1, false);
_L5:
        ((AlertDialog) (obj)).show();
        return ((AlertDialog) (obj));
_L2:
        listview.setItemChecked(1, true);
        continue; /* Loop/switch isn't completed */
_L3:
        listview.setItemChecked(0, true);
        if (true) goto _L5; else goto _L4
_L4:
    }

    void j()
    {
        s.h(getString(0x7f080171));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        bundle = b.a.b().k().t();
        m = AnimationUtils.loadAnimation(fragmentactivity, 0x7f050013);
        g = layoutinflater.inflate(0x7f040019, viewgroup, false);
        a = (EditText)g.findViewById(0x7f10008f);
        a.setText(l.c());
        a.setSelection(l.c().length());
        b = (EditText)g.findViewById(0x7f100092);
        b.setText(h);
        b.selectAll();
        b.addTextChangedListener(new a());
        b.setOnClickListener(o);
        b.setOnFocusChangeListener(q);
        c = (EditText)g.findViewById(0x7f100095);
        c.setText(String.valueOf(bundle.c()));
        d = (EditText)g.findViewById(0x7f100098);
        d.setText(bundle.d());
        layoutinflater = (TextView)g.findViewById(0x7f100097);
        int i1;
        boolean flag;
        if (com.pandora.android.util.r.a())
        {
            i1 = 0x7f0801b7;
        } else
        {
            i1 = 0x7f0801b6;
        }
        layoutinflater.setText(getString(i1));
        e = (EditText)g.findViewById(0x7f10009b);
        k = (new CharSequence[] {
            getString(0x7f0801b2), getString(0x7f0801b1)
        });
        e.setOnClickListener(p);
        e.setText(bundle.b());
        f = (CompoundButton)g.findViewById(0x7f10009e);
        if (bundle.o())
        {
            f.setVisibility(8);
        }
        flag = bundle.n();
        if (com.pandora.android.util.r.b())
        {
            if (flag)
            {
                (new aj()).execute(new Object[] {
                    Boolean.valueOf(false)
                });
                f.setChecked(false);
            }
            f.setEnabled(false);
        } else
        {
            f.setEnabled(true);
            f.setChecked(flag);
        }
        g.findViewById(0x7f10009f).setOnClickListener(new android.view.View.OnClickListener() {

            final p.cb.a a;

            public void onClick(View view)
            {
                p.cb.a.a(a);
            }

            
            {
                a = p.cb.a.this;
                super();
            }
        });
        g.findViewById(0x7f1000a0).setOnClickListener(new android.view.View.OnClickListener() {

            final p.cb.a a;

            public void onClick(View view)
            {
                a.g();
            }

            
            {
                a = p.cb.a.this;
                super();
            }
        });
        layoutinflater = new PandoraIntentFilter();
        layoutinflater.a("cmd_change_settings_result");
        layoutinflater.a("api_error");
        b.a.C().a(r, layoutinflater);
        return g;
    }

    public void onDestroyView()
    {
        try
        {
            b.a.C().a(r);
        }
        catch (Exception exception)
        {
            p.df.a.c("AccountSettingsFragment", (new StringBuilder()).append("exception during onDestroy- ").append(exception.getMessage()).toString());
        }
        s.k();
        s.a(getActivity(), getView());
        super.onDestroyView();
    }

    public void onUserSettings(z z1)
    {
        z1 = z1.a;
        ai ai1 = a(z1);
        if (b(z1, ai1))
        {
            a.setText(z1.l());
        }
        if (z1.c() != ai1.c())
        {
            c.setText(String.valueOf(z1.c()));
        }
        if (i.a(z1.d(), ai1.d()) != 0)
        {
            d.setText(z1.d());
        }
        if (z1.a() != ai1.a())
        {
            e.setText(z1.b());
        }
        if (z1.n() != ai1.n())
        {
            f.setChecked(z1.n());
        }
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.E;
    }

}

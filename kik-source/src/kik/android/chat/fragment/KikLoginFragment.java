// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.kik.android.a;
import com.kik.g.p;
import com.kik.l.ab;
import kik.a.d.aa;
import kik.a.d.j;
import kik.a.e.f;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.f.ae;
import kik.a.f.f.z;
import kik.a.f.k;
import kik.a.h.h;
import kik.android.chat.KikApplication;
import kik.android.util.DeviceUtils;
import kik.android.util.ar;
import kik.android.util.bg;
import kik.android.util.cq;
import kik.android.util.cy;
import kik.android.widget.ce;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, md, mj, mi, 
//            me, mf, mg, mh

public class KikLoginFragment extends KikIqFragmentBase
{

    protected k a;
    protected t b;
    protected w c;
    protected v d;
    protected f e;
    protected kik.a.aa f;
    protected a g;
    protected ab h;
    protected ar i;
    TextWatcher j;
    private EditText k;
    private EditText l;
    private Resources m;
    private String n;
    private Toast o;
    private String p;

    public KikLoginFragment()
    {
        n = "";
        j = new md(this);
    }

    static EditText a(KikLoginFragment kikloginfragment)
    {
        return kikloginfragment.k;
    }

    private void a()
    {
        g.b("Login Complete").a("Attempts");
        String s = k.getText().toString();
        String s1 = l.getText().toString();
        if (!s.matches(KikApplication.f(0x7f0901ee)) && !s.matches(KikApplication.f(0x7f0901e9)))
        {
            o.setText(0x7f0901bd);
            o.show();
            g.b("Login Error").g().b();
            return;
        }
        if (!s1.matches(KikApplication.f(0x7f0901ec)))
        {
            o.setText(KikApplication.f(0x7f0901bc));
            o.show();
            g.b("Login Error").g().b();
            return;
        } else
        {
            p = b.a(s1);
            s1 = cq.a(kik.a.h.h.a(p, s, "niCRwL7isZHny24qgLvy"));
            a(((kik.a.f.f.y) (new ae(this, s, n, KikApplication.b(), s1, DeviceUtils.a(k.getContext(), i)))), KikApplication.f(0x7f090148), true);
            n = "";
            return;
        }
    }

    static void a(KikLoginFragment kikloginfragment, Bundle bundle)
    {
        if (bundle == null)
        {
            kikloginfragment.o.setText(KikApplication.f(0x7f090063));
            kikloginfragment.o.show();
        } else
        {
            String s = bundle.getString("extra.resultUrl");
            if (s != null)
            {
                kikloginfragment.n = s;
                kikloginfragment.a();
                return;
            }
            if (bundle.getBoolean("network", false))
            {
                kikloginfragment.o.setText(KikApplication.f(0x7f09017a));
                kikloginfragment.o.show();
                return;
            }
        }
    }

    static EditText b(KikLoginFragment kikloginfragment)
    {
        return kikloginfragment.l;
    }

    static void c(KikLoginFragment kikloginfragment)
    {
        kikloginfragment.a();
    }

    static Toast d(KikLoginFragment kikloginfragment)
    {
        return kikloginfragment.o;
    }

    protected final int K()
    {
        return 0x7f0902d2;
    }

    protected final void a(z z1)
    {
        super.a(z1);
        z1 = (ae)z1;
        aa aa1 = c.d();
        aa aa2 = z1.d();
        boolean flag = k.getText().toString().equalsIgnoreCase(aa2.c);
        aa1.c = aa2.c;
        aa1.d = aa2.d;
        aa1.e = aa2.e;
        aa1.a = aa2.a;
        aa1.g = Boolean.valueOf(false);
        c.a(aa1);
        g.b("Login Complete").b("Attempts", 0L).a("By Username", flag).g().b();
        g.b();
        z1 = new j(z1.e(), a.o(), null);
        f.a(z1, p);
        g.b("Logged In").b("Attempts", 0L).a("By Username", flag).g().b();
        ce.a(k.getContext());
        b(new mj(this, z1));
        z1 = i.c();
        z1.edit().putInt("kik.install_count", z1.getInt("kik.install_count", 0) + 1).commit();
    }

    protected final boolean b(z z1)
    {
        ae ae1;
        P = KikApplication.f(0x7f0902d3);
        ae1 = (ae)z1;
        ae1.l();
        JVM INSTR tableswitch 201 206: default 56
    //                   201 95
    //                   202 122
    //                   203 149
    //                   204 162
    //                   205 175
    //                   206 242;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        Q = cy.a(ae1.l());
_L9:
        g.b("Login Error").a("Error Code", z1.l()).g().b();
        return true;
_L2:
        Q = KikApplication.a(0x7f0900d5, new Object[] {
            (String)ae1.m()
        });
        continue; /* Loop/switch isn't completed */
_L3:
        Q = KikApplication.a(0x7f090354, new Object[] {
            (String)ae1.m()
        });
        continue; /* Loop/switch isn't completed */
_L4:
        Q = KikApplication.f(0x7f090281);
        continue; /* Loop/switch isn't completed */
_L5:
        Q = KikApplication.f(0x7f0900ae);
        continue; /* Loop/switch isn't completed */
_L6:
        if (((ae)z1).f() != null)
        {
            z1 = ((ae)z1).f();
            kik.android.chat.activity.k.a((new com.kik.cards.browser.CaptchaWindowFragment.c()).a(z1), getActivity()).f().a(new mi(this));
            return false;
        }
        Q = cy.a(ae1.l());
        continue; /* Loop/switch isn't completed */
_L7:
        Q = ae1.g();
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
        o = Toast.makeText(getActivity(), "", 1);
        g.b("Login Shown").g().b();
        d.c("ProfileManager.rosterTimeStamp", "0");
        d.c("ProfileManager.rosterIsBatchedKey", "0");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03000f, viewgroup, false);
        k = (EditText)layoutinflater.findViewById(0x7f0e0064);
        l = (EditText)layoutinflater.findViewById(0x7f0e0065);
        l.addTextChangedListener(j);
        l.setOnEditorActionListener(new me(this));
        bundle = i.c().getString("usernameLogin", null);
        if (bundle != null)
        {
            k.setText(bundle);
            l.requestFocus();
        }
        layoutinflater.findViewById(0x7f0e001d).setOnClickListener(new mf(this));
        k.addTextChangedListener(j);
        m = viewgroup.getResources();
        ((TextView)layoutinflater.findViewById(0x7f0e0066)).setOnClickListener(new mg(this));
        layoutinflater.findViewById(0x7f0e0067).setOnClickListener(new mh(this));
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0e0068);
        viewgroup.setText(Html.fromHtml(KikApplication.a(0x7f090102, new Object[] {
            (new bg(getActivity())).a()
        })));
        viewgroup.setVisibility(0);
        Linkify.addLinks(viewgroup, 15);
        viewgroup.setMovementMethod(LinkMovementMethod.getInstance());
        return layoutinflater;
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }
}

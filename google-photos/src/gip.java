// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.List;

public final class gip extends omp
    implements mni, mti
{

    private final mwx a;
    private mmv ag;
    private mtj ah;
    private FrameLayout ai;
    private Button b;
    private boolean c;
    private boolean d;
    private boolean e;
    private android.app.AlertDialog.Builder f;
    private mwz g;
    private mnh h;

    public gip()
    {
        (new msi(pww.g)).a(ae);
        new dsu(af);
        a = new mwx(af);
    }

    public static gip a(boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("timed_out", flag);
        gip gip1 = new gip();
        gip1.f(bundle);
        return gip1;
    }

    static olq a(gip gip1)
    {
        return gip1.ad;
    }

    static boolean a(gip gip1, boolean flag)
    {
        gip1.d = flag;
        return flag;
    }

    static boolean b(gip gip1)
    {
        return gip1.c;
    }

    static mmv c(gip gip1)
    {
        return gip1.ag;
    }

    static mnh d(gip gip1)
    {
        return gip1.h;
    }

    static void e(gip gip1)
    {
        gip1.u();
    }

    static mtj f(gip gip1)
    {
        return gip1.ah;
    }

    static void g(gip gip1)
    {
        gip1.t();
    }

    static FrameLayout h(gip gip1)
    {
        return gip1.ai;
    }

    static android.app.AlertDialog.Builder i(gip gip1)
    {
        return gip1.f;
    }

    static Button j(gip gip1)
    {
        return gip1.b;
    }

    private void t()
    {
        if (ah.a("onboarding_prepare_accounts"))
        {
            ai.setVisibility(0);
            b.setEnabled(false);
            e = true;
            g = a.a(new gis(this), gid.b);
        }
    }

    private void u()
    {
        Intent intent = new Intent();
        intent.putExtra("sign_in", true);
        O_().setResult(-1, intent);
        O_().finish();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.rP, null);
        ai = (FrameLayout)layoutinflater.findViewById(s.ad);
        f = (new android.app.AlertDialog.Builder(ad)).setTitle(b.so).setMessage(b.sn).setPositiveButton(0x104000a, null).setIcon(p.V);
        if (super.q != null)
        {
            boolean flag;
            if (!super.q.getBoolean("timed_out", false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
        }
        if (bundle == null) goto _L2; else goto _L1
_L1:
        e = bundle.getBoolean("finish_waiting");
        if (e)
        {
            t();
        }
_L4:
        b = (Button)layoutinflater.findViewById(s.at);
        b.a(b, new msm(pww.f));
        b.setOnClickListener(new msj(new giq(this)));
        viewgroup = (Button)layoutinflater.findViewById(s.R);
        b.a(viewgroup, new msm(pww.e));
        viewgroup.setOnClickListener(new msj(new gir(this)));
        return layoutinflater;
_L2:
        if (!c)
        {
            ah.a(new gim(false));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(String s1, mue mue1, mua mua)
    {
        if (!"onboarding_prepare_accounts".equals(s1))
        {
            return;
        }
        if (mue1 == null || mue1.c()) goto _L2; else goto _L1
_L1:
        a.a(g);
        if (!d) goto _L4; else goto _L3
_L3:
        if (b.a(ag, null).isEmpty()) goto _L6; else goto _L5
_L5:
        u();
_L4:
        c = true;
        return;
_L6:
        if (!c)
        {
            h.a(this);
        }
        if (true) goto _L4; else goto _L2
_L2:
        Toast.makeText(ad, b.sH, 1).show();
        return;
    }

    public final void ak_()
    {
        super.ak_();
        b = null;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        h = (mnh)ae.a(mnh);
        ag = (mmv)ae.a(mmv);
        ah = ((mtj)ae.a(mtj)).a(this);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("finish_waiting", e);
    }

    public final void r()
    {
        gim gim1 = new gim(true);
        ah.b(gim1);
    }
}

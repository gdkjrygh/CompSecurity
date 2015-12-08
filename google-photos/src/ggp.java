// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ggp extends omp
    implements ghn, mni, mti
{

    private static final msy a = new msy(0.4F, 0.0F, 1.0F, 1.0F);
    private static final msy b = new msy(0.0F, 0.0F, 0.2F, 1.0F);
    private List ag;
    private int ah;
    private AvatarView ai;
    private TextView aj;
    private TextView ak;
    private ListView al;
    private ggx am;
    private View an;
    private View ao;
    private Button ap;
    private boolean aq;
    private boolean ar;
    private ViewPropertyAnimator as;
    private final gha at;
    private final android.animation.Animator.AnimatorListener au = new ggr(this);
    private final mtj c;
    private Button d;
    private ca e;
    private ay f;
    private mnh g;
    private mmv h;

    public ggp()
    {
        c = (new mtj(this, af)).a(this);
        (new msi(pww.c)).a(ae);
        new dsu(af);
        e = new ggq(this);
        gha gha1 = new gha();
        ae.a(gha, gha1);
        at = gha1;
    }

    static ViewPropertyAnimator a(ggp ggp1, ViewPropertyAnimator viewpropertyanimator)
    {
        ggp1.as = null;
        return null;
    }

    public static ggp a(boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_account_list_opened", flag);
        ggp ggp1 = new ggp();
        ggp1.f(bundle);
        return ggp1;
    }

    static String a(ggp ggp1, pov pov1)
    {
        if (pov1 != null)
        {
            if (pov1.d.booleanValue())
            {
                if (pov1.a != null)
                {
                    return ggp1.a(b.sm, new Object[] {
                        b.a(ggp1.ad, pov1.a.longValue())
                    });
                }
            } else
            if (pov1.b != null && pov1.a != null)
            {
                return ggp1.a(b.sl, new Object[] {
                    b.a(ggp1.ad, pov1.b.longValue() - pov1.a.longValue())
                });
            }
        }
        return ggp1.a(b.sk);
    }

    static olq a(ggp ggp1)
    {
        return ggp1.ad;
    }

    static void a(ggp ggp1, int k)
    {
        ggp1.b(k);
    }

    static void a(ggp ggp1, boolean flag)
    {
        ggp1.a(flag, false);
    }

    private void a(msp msp)
    {
        mry.a(ad, 4, (new msn()).a(new msm(msp)).a(ad));
    }

    private void a(boolean flag, boolean flag1)
    {
        int k = 8;
        if (aq == flag)
        {
            return;
        }
        aq = flag;
        TextView textview;
        int l;
        if (flag)
        {
            al.setVisibility(0);
            d.setVisibility(8);
        } else
        {
            d.setVisibility(0);
        }
        if (as != null)
        {
            as.cancel();
        }
        if (flag1)
        {
            as = null;
            ListView listview = al;
            if (flag)
            {
                k = 0;
            }
            listview.setVisibility(k);
            al.setY(0.0F);
        } else
        {
            if (as == null && flag)
            {
                al.setY(-ao.getMeasuredHeight());
            }
            Object obj = al.animate();
            float f1;
            ViewPropertyAnimator viewpropertyanimator;
            if (flag)
            {
                f1 = 0.0F;
            } else
            {
                f1 = -ao.getMeasuredHeight();
            }
            viewpropertyanimator = ((ViewPropertyAnimator) (obj)).y(f1);
            if (flag)
            {
                obj = b;
            } else
            {
                obj = a;
            }
            as = viewpropertyanimator.setInterpolator(((android.animation.TimeInterpolator) (obj))).setListener(au);
            as.start();
        }
        if (flag)
        {
            k = p.U;
        } else
        {
            k = p.T;
        }
        textview = aj;
        if (aj.getCompoundDrawables()[0] == null)
        {
            l = 0;
        } else
        {
            l = k;
        }
        if (aj.getCompoundDrawables()[2] == null)
        {
            k = 0;
        }
        textview.setCompoundDrawablesWithIntrinsicBounds(l, 0, k, 0);
    }

    static int b(ggp ggp1)
    {
        return ggp1.ah;
    }

    private void b(int k)
    {
        ah = k;
        k().b(0, null, e);
        Object obj = h.a(k);
        ai.a(((mmx) (obj)).b("gaia_id"), ((mmx) (obj)).b("profile_photo_url"));
        aj.setText(a(b.sJ, new Object[] {
            ((mmx) (obj)).b("given_name")
        }));
        obj = ((mmx) (obj)).b("account_name");
        ak.setText(((CharSequence) (obj)));
        gha gha1 = at;
        gha1.b = ((String) (obj));
        gha1.c = null;
        gha1.a.b();
    }

    static gha c(ggp ggp1)
    {
        return ggp1.at;
    }

    static boolean d(ggp ggp1)
    {
        return ggp1.aq;
    }

    static ListView e(ggp ggp1)
    {
        return ggp1.al;
    }

    static mnh f(ggp ggp1)
    {
        return ggp1.g;
    }

    static ay g(ggp ggp1)
    {
        return ggp1.f;
    }

    static void h(ggp ggp1)
    {
        ggp1.h(true);
    }

    private void h(boolean flag)
    {
        i(false);
        an.setClickable(false);
        bp bp1 = f.a();
        if (flag && android.os.Build.VERSION.SDK_INT > 15)
        {
            bp1.a(b.rv, b.rw);
        }
        bp1.b(s.as, new ghc(), "storage_policy_fragment").b();
        ap.setVisibility(0);
    }

    static void i(ggp ggp1)
    {
        ggp1.t();
    }

    private void i(boolean flag)
    {
        if (aj.getCompoundDrawables()[0] != null)
        {
            ar = true;
        }
        if (flag)
        {
            TextView textview = aj;
            int k;
            int l;
            if (ar)
            {
                k = p.T;
            } else
            {
                k = 0;
            }
            if (ar)
            {
                l = 0;
            } else
            {
                l = p.T;
            }
            textview.setCompoundDrawablesWithIntrinsicBounds(k, 0, l, 0);
            return;
        } else
        {
            aj.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            return;
        }
    }

    static void j(ggp ggp1)
    {
        ggp1.an.setClickable(true);
        bp bp1 = ggp1.f.a();
        if (android.os.Build.VERSION.SDK_INT > 15)
        {
            bp1.a(b.ru, b.rx);
        }
        bp1.b(s.as, new ggl(), "auto_backup_fragment").b();
        ggp1.ap.setVisibility(8);
        ggp1.i(true);
    }

    private void t()
    {
        boolean flag1 = true;
        boolean flag;
        if (at.d)
        {
            a(pwn.b);
            Intent intent;
            if (at.e)
            {
                a(pwn.d);
            } else
            {
                a(pwn.c);
            }
            if (!at.f)
            {
                a(pww.h);
            } else
            {
                a(pww.i);
            }
        } else
        {
            a(pwn.a);
        }
        intent = new Intent();
        intent.putExtra("account_id", ah);
        intent.putExtra("auto_backup", at.d);
        if (!at.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.putExtra("auto_backup_wifi", flag);
        if (at.d && at.f)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        intent.putExtra("upload_full_resolution", flag);
        O_().setResult(-1, intent);
        O_().finish();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.rL, null);
        f = h();
        ai = (AvatarView)layoutinflater.findViewById(s.K);
        aj = (TextView)layoutinflater.findViewById(s.Z);
        ak = (TextView)layoutinflater.findViewById(s.H);
        al = (ListView)layoutinflater.findViewById(s.G);
        ao = layoutinflater.findViewById(s.ar);
        d = (Button)layoutinflater.findViewById(s.O);
        ag = b.a(h, mmv.a);
        int k;
        if (bundle == null)
        {
            k = ((Integer)ag.get(0)).intValue();
        } else
        {
            k = bundle.getInt("selected_account");
        }
        b(k);
        am = new ggx(ad, h, ag);
        al.setAdapter(am);
        if (bundle != null && bundle.getBoolean("account_list_visible"))
        {
            a(true, true);
        }
        a(super.q.getBoolean("show_account_list_opened"), false);
        an = layoutinflater.findViewById(s.F);
        layoutinflater.findViewById(s.F).setOnClickListener(new ggs(this));
        al.setOnItemClickListener(new ggt(this));
        b.a(d, new msm(pww.b));
        d.setOnClickListener(new msj(new ggu(this)));
        ap = (Button)layoutinflater.findViewById(s.L);
        ap.setOnClickListener(new ggv(this));
        if (bundle != null)
        {
            ar = bundle.getBoolean("arrow_on_left");
            if (bundle.getBoolean("current_page"))
            {
                h(false);
            }
        }
        if (bundle == null)
        {
            f.a().a(s.as, new ggl(), "auto_backup_fragment").b();
        }
        return layoutinflater;
    }

    public final void a(String s1, mue mue1, mua mua1)
    {
        if ("onboarding_prepare_accounts".equals(s1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        mua1.a(s1);
        if (mue1 != null && mue1.c())
        {
            Toast.makeText(ad, b.sH, 1).show();
            return;
        }
        s1 = new HashSet(ag);
        mue1 = b.a(h, mmv.a).iterator();
        do
        {
            if (!mue1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            k = ((Integer)mue1.next()).intValue();
        } while (s1.contains(Integer.valueOf(k)));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        b(k);
        ag.add(Integer.valueOf(k));
        am.notifyDataSetChanged();
        return;
    }

    public final void b(boolean flag)
    {
        if (flag)
        {
            t();
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        g = (mnh)ae.a(mnh);
        h = (mmv)ae.a(mmv);
        ae.a(ghn, this);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("selected_account", ah);
        bundle.putBoolean("account_list_visible", aq);
        bundle.putBoolean("arrow_on_left", ar);
        boolean flag;
        if (f.a("storage_policy_fragment") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("current_page", flag);
    }

    public final void r()
    {
        a(false, false);
        gim gim1 = new gim(true);
        c.a(gim1);
        c.b.a(gim1, false);
    }

}

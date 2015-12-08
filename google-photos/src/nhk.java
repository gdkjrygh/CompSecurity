// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class nhk extends omp
    implements mni, mti, nga
{

    private static final String ag[] = {
        "update_account", "prepare_accounts", "logout_during_login", "logout", "load_accounts_add", "load_accounts_add_account_activity", "are_accounts_ready_for_login"
    };
    nhr a;
    private mmv ah;
    private mnh ai;
    private ngk aj;
    private final mwx ak;
    private boolean al;
    private Runnable am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private String aq[];
    final mtj b;
    ngg c;
    String d;
    String e;
    String f;
    int g;
    boolean h;

    public nhk()
    {
        b = (new mtj(this, af)).a(this);
        ak = new mwx(af);
        g = -1;
    }

    static mue a(ngw ngw1)
    {
        mue mue1 = new mue(ngw1.a);
        mue1.a().putBoolean("has_recoverable_error", ngw1.b);
        mue1.a().putBoolean("has_irrecoverable_error", ngw1.c);
        mue1.a().putInt("account_id", ngw1.d);
        return mue1;
    }

    public static nhk a(ay ay1)
    {
        nhk nhk2 = (nhk)ay1.a("login.fragment");
        nhk nhk1 = nhk2;
        if (nhk2 == null)
        {
            nhk1 = new nhk();
            bp bp1 = ay1.a();
            bp1.a(nhk1, "login.fragment");
            bp1.b();
            ay1.b();
        }
        return nhk1;
    }

    private void a(int i, int j)
    {
        g = j;
        nho nho1 = new nho("logout_during_login", i, a);
        b.a(nho1);
    }

    private void b(String s1)
    {
        String s3 = c.b;
        String s2 = s3;
        if ("com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST".equals(s3))
        {
            if (e != null)
            {
                s2 = e;
            } else
            {
                s2 = c.o;
            }
            s2 = ad.getString(b.Gl, new Object[] {
                s2
            });
        }
        b(s2, s1);
    }

    private boolean b(int i)
    {
        if (i != -1)
        {
            c(i);
            return true;
        } else
        {
            return false;
        }
    }

    private void c(int i)
    {
        if (!ah.c(i))
        {
            b((new StringBuilder(32)).append("Not a valid account: ").append(i).toString());
            return;
        } else
        {
            mmx mmx1 = ah.a(i);
            a(mmx1.b("account_name"), mmx1.b("effective_gaia_id"));
            return;
        }
    }

    private void c(String s1, String s2)
    {
        int i = ah.b(s1);
        if (i == -1)
        {
            b("Viewer account id invalid");
            return;
        } else
        {
            a(ah.a(i).b("account_name"), s2);
            return;
        }
    }

    private void d(int i)
    {
        Iterator iterator = ae.c(ngt).iterator();
        int j = -1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int k = ((ngt)iterator.next()).a();
            j = k;
            if (k == -1)
            {
                continue;
            }
            j = k;
            break;
        } while (true);
        if (j != -1 && j != i)
        {
            a(j, i);
            return;
        }
        if (c.g)
        {
            ah.a(c.e, i);
        }
        a(false);
        a.a(c, d, i);
    }

    private boolean u()
    {
        while (an || b.a("are_accounts_ready_for_login")) 
        {
            return false;
        }
        if (c.j)
        {
            return true;
        } else
        {
            b.a(new nhm("are_accounts_ready_for_login", a));
            return false;
        }
    }

    private void v()
    {
        boolean flag1;
        flag1 = true;
        e();
        boolean flag;
        if (e != null)
        {
            a(e, f);
            flag = true;
        } else
        {
            flag = false;
        }
        break MISSING_BLOCK_LABEL_28;
_L4:
        int i;
        boolean flag2;
        do
        {
            do
            {
                do
                {
                    return;
                } while (flag || b(c.c));
                String s1 = c.o;
                String s2 = c.p;
                if (s1 != null)
                {
                    if (ah.b(s1, s2) != -1)
                    {
                        a(s1, s2);
                    } else
                    {
                        b("Account not found");
                    }
                    i = 1;
                } else
                {
                    i = 0;
                }
            } while (i != 0);
            if (c.q != null)
            {
                c(c.q, c.p);
                i = 1;
            } else
            {
                i = 0;
            }
        } while (i != 0);
        if (!c.h) goto _L2; else goto _L1
_L1:
        if (c.k != -1)
        {
            c(c.k);
            i = 1;
        } else
        {
label0:
            {
                if (c.l == null)
                {
                    break label0;
                }
                a(c.l, c.m);
                i = 1;
            }
        }
_L10:
        if (i != 0) goto _L4; else goto _L3
_L3:
        if (c.r == null) goto _L6; else goto _L5
_L5:
        i = c.r.b();
        if (i == -1) goto _L6; else goto _L7
_L7:
        c(i);
        i = 1;
_L11:
        if (i != 0) goto _L4; else goto _L8
_L8:
        if (!c.f)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        i = ah.c(c.e);
        if (!a.a(c, i))
        {
            break MISSING_BLOCK_LABEL_391;
        }
        flag2 = b(i);
_L12:
        if (!flag2)
        {
            if (c.s != null)
            {
                ap = true;
                w();
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                b();
                return;
            }
        }
          goto _L4
        if (c.n == null) goto _L2; else goto _L9
_L9:
        c(c.n, c.m);
        i = 1;
          goto _L10
_L2:
        i = 0;
          goto _L10
_L6:
        i = 0;
          goto _L11
        flag2 = false;
          goto _L12
    }

    private void w()
    {
        if (ap && super.w)
        {
            e();
            ap = false;
            ao = true;
            nfu nfu1 = (nfu)ae.a(c.s);
            String s1 = nfu1.getClass().getName();
            ay ay1 = h();
            am am1 = ay1.a(s1);
            if (am1 == null)
            {
                Bundle bundle = c.t;
                am1 = nfu1.a(bundle);
                am1.f(bundle);
                ay1.a().a(am1, s1).b();
                ay1.b();
            }
            ((nfv)am1).a(c);
        }
    }

    private void x()
    {
        if (g != -1)
        {
            d(g);
            return;
        } else
        {
            b();
            return;
        }
    }

    private void y()
    {
        a(false);
    }

    private void z()
    {
        if (super.w && (an || h) && !ao)
        {
            String s1 = c.a;
            if (s1 == null)
            {
                s1 = ad.getString(b.Gn);
            }
            a(s1);
        }
    }

    public final void a()
    {
        b.a(new nhn("load_accounts_add", ai));
    }

    public final void a(int i, int j, Intent intent)
    {
label0:
        {
            if (i == 1)
            {
                if (j != -1)
                {
                    break label0;
                }
                s();
            }
            return;
        }
        b();
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            h = bundle.getBoolean("logging_in");
            al = bundle.getBoolean("login_pending");
            if (al)
            {
                s();
            }
            ap = bundle.getBoolean("interactive_login_pending");
            ao = bundle.getBoolean("logging_in_interactively");
            an = bundle.getBoolean("preparing_accounts");
            aq = bundle.getStringArray("account_names_snapshot");
            c = (ngg)bundle.getParcelable("login_request");
            d = bundle.getString("tag");
            e = bundle.getString("selected_account_name");
            f = bundle.getString("selected_effective_gaia_id");
            g = bundle.getInt("account_id_to_login");
        }
    }

    public final void a(String s1)
    {
        aj.a(h(), s1, c.i);
    }

    public final void a(String s1, String s2)
    {
        e = s1;
        f = s2;
        int i = ah.b(s1, s2);
        boolean flag;
        if (ah.c(i) && a.a(c, i))
        {
            d(i);
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return;
        }
        if (c.j)
        {
            b("RPCs disallowed");
            return;
        } else
        {
            z();
            s1 = new nhq("update_account", e, f, a, c);
            b.a(s1);
            return;
        }
    }

    public final void a(String s1, mue mue1, mua mua1)
    {
        int i;
        boolean flag;
        flag = false;
        i = 0;
        mua1.c = false;
        if (!"update_account".equals(s1)) goto _L2; else goto _L1
_L1:
        if (mue1 != null) goto _L4; else goto _L3
_L3:
        d();
_L8:
        return;
_L4:
        i = mue1.a().getInt("account_id");
        if (mue1.a().getBoolean("has_irrecoverable_error"))
        {
            s1 = (Intent)a.a.get(i);
            if (s1 != null)
            {
                a(((Intent) (s1)), 1);
                return;
            } else
            {
                aj.c(h());
                return;
            }
        }
        if (mue1.a().getBoolean("has_recoverable_error"))
        {
            d();
            return;
        }
        if (!a.a(c, i))
        {
            if (ah.c(i))
            {
                ngi ngi1 = a.b(c, i);
                if (ngi1 != null)
                {
                    mua1 = ngi1.getClass().getName();
                    ay ay1 = h();
                    mue1 = ay1.a(mua1);
                    s1 = mue1;
                    if (mue1 == null)
                    {
                        mue1 = ngi1.a();
                        s1 = mue1;
                        if (mue1 != null)
                        {
                            ay1.a().a(mue1, mua1).b();
                            ay1.b();
                            s1 = mue1;
                        }
                    }
                    s1 = (ngj)s1;
                    if (s1 != null)
                    {
                        s1.f_(i);
                        return;
                    }
                }
            }
            b((new StringBuilder(52)).append("Login request not satisfied for account: ").append(i).toString());
            return;
        } else
        {
            d(i);
            return;
        }
_L2:
        if (!"prepare_accounts".equals(s1)) goto _L6; else goto _L5
_L5:
        an = false;
_L10:
        v();
        return;
_L6:
        if ("logout_during_login".equals(s1))
        {
            x();
            return;
        }
        if ("logout".equals(s1))
        {
            y();
            return;
        }
        if ("load_accounts_add".equals(s1))
        {
            if (mue1 == null || mue1.c())
            {
                if (mue1 != null)
                {
                    i = mue1.b;
                }
                b(ad.getString(b.Gm), (new StringBuilder(54)).append("Load accounts for add account task failed: ").append(i).toString());
                return;
            } else
            {
                aq = mue1.a().getStringArray("account_name_array");
                ai.a(this);
                return;
            }
        }
        if (!"load_accounts_add_account_activity".equals(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mue1 == null || mue1.c())
        {
            int j;
            if (mue1 == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = mue1.b;
            }
            b(ad.getString(b.Gm), (new StringBuilder(58)).append("Load accounts for add account activity failed: ").append(j).toString());
            return;
        }
        s1 = new HashSet(Arrays.asList(mue1.a().getStringArray("account_name_array")));
        s1.removeAll(Arrays.asList(aq));
        if (!s1.isEmpty())
        {
            e = (String)s1.iterator().next();
            if (u())
            {
                a(e, ((String) (null)));
                return;
            }
        } else
        {
            b();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"are_accounts_ready_for_login".equals(s1)) goto _L8; else goto _L7
_L7:
        if (mue1 == null || mue1.c())
        {
            b(ad.getString(b.Gm), "Task result has error");
            return;
        }
        if (mue1.a().getBoolean("are_accounts_ready_for_login")) goto _L10; else goto _L9
_L9:
        if (!an)
        {
            an = true;
            z();
            s1 = new nhp("prepare_accounts", a);
            b.a(s1);
            return;
        }
        if (true) goto _L8; else goto _L11
_L11:
    }

    void a(boolean flag)
    {
        String as[] = ag;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = as[i];
            b.b(s1);
        }

        e();
        h = false;
        ao = false;
        if (!flag)
        {
            super.B.a().a(this).b();
        }
    }

    public final void b()
    {
        if (h)
        {
            a(false);
            a.a(c, d, -1);
        }
    }

    public final void b(String s1, String s2)
    {
        s2 = String.valueOf(s2);
        if (s2.length() != 0)
        {
            s2 = "Login failed: ".concat(s2);
        } else
        {
            s2 = new String("Login failed: ");
        }
        Log.e("LoginHelperFragment", s2);
        if (s1 != null)
        {
            Toast.makeText(ad, s1, 1).show();
        }
        b();
    }

    public final void c()
    {
        t();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        a = (nhr)ae.a(ngc);
        ah = (mmv)ae.a(mmv);
        ai = (mnh)ae.a(mnh);
        aj = (ngk)ae.a(ngk);
        ae.a(nga, this);
    }

    public final void d()
    {
        aj.b(h());
    }

    public final void e()
    {
        aj.a(h());
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("logging_in", h);
        bundle.putBoolean("login_pending", al);
        bundle.putBoolean("preparing_accounts", an);
        bundle.putParcelable("login_request", c);
        bundle.putString("tag", d);
        bundle.putString("selected_account_name", e);
        bundle.putString("selected_effective_gaia_id", f);
        bundle.putInt("account_id_to_login", g);
        bundle.putStringArray("account_names_snapshot", aq);
        bundle.putBoolean("interactive_login_pending", ap);
        bundle.putBoolean("logging_in_interactively", ao);
    }

    public final void e_(int i)
    {
        a(i, -1);
    }

    public final void l()
    {
        super.l();
        z();
        w();
    }

    public final void r()
    {
        b.a(new nhn("load_accounts_add_account_activity", ai));
    }

    void s()
    {
        al = true;
        if (am == null)
        {
            am = puv.a(new nhl(this));
        }
        ak.a(am);
    }

    final void t()
    {
        al = false;
        am = null;
        if (u())
        {
            v();
        }
    }

}

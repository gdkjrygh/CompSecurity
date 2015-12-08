// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class nfw
    implements mmr, mnc, ngd, omb, opl, opn, opr, ops, opt, opv
{

    String a;
    public int b;
    private final ar c;
    private mmv d;
    private ngc e;
    private String f;
    private mms g;
    private ngg h;
    private nfy i;
    private ngg j;
    private int k;
    private boolean l;
    private final List m = new ArrayList();
    private final mwx n;

    public nfw(ar ar1, opd opd1)
    {
        g = mms.a;
        b = -1;
        c = ar1;
        opd1.a(this);
        n = new mwx(opd1);
    }

    static ar a(nfw nfw1)
    {
        return nfw1.c;
    }

    static nfy a(nfw nfw1, nfy nfy1)
    {
        nfw1.i = null;
        return null;
    }

    private void a(ngg ngg1, mms mms1, int i1, boolean flag)
    {
        mms mms2 = g;
        int j1 = b;
        h = ngg1;
        g = mms1;
        b = i1;
        if (flag || mms1 != mms2 || i1 != j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (ngg1 = m.iterator(); ngg1.hasNext(); ((mmt)ngg1.next()).a(flag, mms2, mms1, j1, i1)) { }
    }

    private boolean a(ngg ngg1, int i1)
    {
        return d.c(i1) && e.a(ngg1, i1);
    }

    static ngc b(nfw nfw1)
    {
        return nfw1.e;
    }

    static void c(nfw nfw1)
    {
        nfw1.i();
    }

    private void i()
    {
        k();
        if (c.isFinishing())
        {
            return;
        }
        if (l && i != null)
        {
            i.b.run();
        }
        j();
    }

    private void j()
    {
        if (l && j != null)
        {
            int i1 = k;
            Object obj;
            Object obj1;
            ngg ngg1;
            boolean flag;
            if (i1 != -1)
            {
                obj = mms.c;
            } else
            {
                obj = mms.b;
            }
            ngg1 = j;
            if (i1 == -1 && b != -1)
            {
                if (a(ngg1, b))
                {
                    i1 = b;
                    obj1 = mms.c;
                    obj = h;
                    if (j.c != -1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    obj1 = mms.a;
                    flag = false;
                    i1 = -1;
                    obj = null;
                }
            } else
            {
                flag = false;
                obj1 = obj;
                obj = ngg1;
            }
            k = -1;
            j = null;
            a(((ngg) (obj)), ((mms) (obj1)), i1, flag);
        }
    }

    private void k()
    {
        if (!h() && b != -1 && !a(h, b))
        {
            a(null, mms.a, -1, false);
        }
    }

    public final void X_()
    {
        l = true;
        i();
    }

    public final mmr a(mmt mmt1)
    {
        return b(mmt1);
    }

    public final nfw a(olm olm1)
    {
        olm1.a(mmr, this);
        olm1.a(nfw, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        if (d == null && e == null)
        {
            d = (mmv)olm1.a(mmv);
            e = (ngc)olm1.a(ngc);
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            f = bundle.getString("account_key");
            b = bundle.getInt("account_id");
            g = mms.values()[bundle.getInt("account_handler_state")];
            h = (ngg)bundle.getParcelable("completed_login_request");
            Object obj = (ngg)bundle.getParcelable("queued_login_request");
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = new nfy(this, ((ngg) (obj)));
            }
            i = ((nfy) (obj));
            j = (ngg)bundle.getParcelable("pending_login_request");
            k = bundle.getInt("pending_id");
            a = bundle.getString("tag");
        }
        l = true;
        d.a(this);
        e.a(this);
    }

    public final void a(ngg ngg1)
    {
        if (ngg1.e == null)
        {
            ngg1.e = f;
        }
        if (ngg1.e == null)
        {
            ngg1.e = olm.a(c, "LoginAccountHandler.account_key", null);
        }
        if (ngg1.h)
        {
            ngg1.a(c, c.getIntent());
        }
        a = UUID.randomUUID().toString();
        i = new nfy(this, ngg1);
        n.a(puv.a(new nfx(this)));
    }

    public final void a(ngg ngg1, String s, int i1)
    {
        if (TextUtils.equals(s, a))
        {
            a = null;
            j = ngg1;
            k = i1;
            j();
        }
    }

    public final void al_()
    {
        l = true;
        i();
    }

    public final nfw b(mmt mmt1)
    {
        m.add(mmt1);
        return this;
    }

    public final void c()
    {
        d.b(this);
        e.b(this);
    }

    public final int d()
    {
        b.u();
        return b;
    }

    public final void e(Bundle bundle)
    {
        l = false;
        bundle.putString("account_key", f);
        bundle.putInt("account_id", b);
        bundle.putInt("account_handler_state", g.ordinal());
        bundle.putParcelable("completed_login_request", h);
        Object obj;
        if (i == null)
        {
            obj = null;
        } else
        {
            obj = i.a;
        }
        bundle.putParcelable("queued_login_request", ((android.os.Parcelable) (obj)));
        bundle.putParcelable("pending_login_request", j);
        bundle.putInt("pending_id", k);
        bundle.putString("tag", a);
    }

    public final boolean e()
    {
        b.u();
        return b != -1;
    }

    public final boolean f()
    {
        b.u();
        return d.c(b) && d.a(b).a();
    }

    public final mmx g()
    {
        b.u();
        return d.a(b);
    }

    public final boolean h()
    {
        return i != null || a != null || j != null;
    }

    public final void r()
    {
        if (l)
        {
            k();
        }
    }
}

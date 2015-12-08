// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class fny
    implements mmt, omb, opl, opt, opu, opv
{

    mhe a;
    private mhh b;
    private mmr c;
    private mmv d;
    private final Context e;
    private String f;
    private boolean g;
    private final mhf h = new fnz(this);

    public fny(Context context, opd opd1)
    {
        e = context;
        opd1.a(this);
    }

    private void a()
    {
        if (!c.e() || !d.c(c.d()))
        {
            return;
        } else
        {
            f = c.g().b("account_name");
            a = b.a(e, f, h);
            c();
            return;
        }
    }

    private void c()
    {
        if (g && a != null)
        {
            a.a();
        }
    }

    private void d()
    {
        if (a != null)
        {
            a.b();
        }
    }

    public final void V_()
    {
        g = false;
        d();
    }

    public final void X_()
    {
        g = true;
        c();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mmr)olm1.a(mmr);
        c.a(this);
        d = (mmv)olm1.a(mmv);
        b = (mhh)olm1.a(mhh);
    }

    public final void a(Bundle bundle)
    {
        a();
    }

    public final void a(boolean flag, mms mms1, mms mms2, int i, int j)
    {
        if (flag)
        {
            if (mms1 == mms.c)
            {
                d();
                a = null;
                f = null;
            }
            if (mms2 == mms.c)
            {
                a();
                return;
            }
        }
    }
}

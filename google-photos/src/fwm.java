// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

public final class fwm
    implements omb, opt, opu, opv
{

    final fwp a;
    String b;
    mhe c;
    fuu d;
    fwr e;
    fwo f;
    private fwq g;

    public fwm(opd opd1, fwp fwp)
    {
        e = new fwr(this);
        g = new fwq(this);
        f = new fwo(this);
        a = fwp;
        opd1.a(this);
    }

    public final void V_()
    {
        if (c == null)
        {
            return;
        } else
        {
            c.b();
            return;
        }
    }

    public final void X_()
    {
        if (c == null || b == null)
        {
            return;
        } else
        {
            c.a();
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        bundle = (mmr)olm1.a(mmr);
        if (bundle.e())
        {
            if (!(bundle = bundle.g()).c("is_managed_account"))
            {
                b = bundle.b("account_name");
                bundle = new fwn(this);
                c = ((mhh)olm.a(context, mhh)).a(context, b, bundle);
                d = (fuu)olm1.a(fuu);
                return;
            }
        }
    }

    public final void a(String s)
    {
        if (c == null || b == null)
        {
            return;
        }
        s = (mhp)d.a.get(s);
        mhe mhe1 = c;
        String s1 = b;
        boolean flag;
        if (!s.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mhe1.a(s1, s, flag).a(g);
    }
}

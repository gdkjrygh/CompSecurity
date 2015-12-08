// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nrh
    implements ngs
{

    private static final String a = ntn.a(nrh);
    private mmv b;
    private nql c;
    private nqz d;
    private nqn e;

    nrh(Context context)
    {
        b = (mmv)olm.a(context, mmv);
        c = (nql)olm.a(context, nql);
        d = (nqz)olm.a(context, nqz);
        e = (nqn)olm.a(context, nqn);
    }

    public final void a(int i)
    {
        mmx mmx1 = b.a(i);
        boolean flag;
        if (mmx1.c("logged_in"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != mmx1.c("guns_notifications_active"))
        {
            if (flag)
            {
                e.a(i);
                c.a(i, nqk.a, nqx.c);
            } else
            {
                ntn.c(a, "Unregister due to logout");
                e.b(i);
                c.b(i);
            }
            c.a(i, false);
            b.b(i).c("guns_notifications_active", flag).d();
        }
    }

}

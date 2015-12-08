// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

class fyc
{

    private final htb a;
    private final Context b;
    private final noz c;

    fyc(Context context)
    {
        b = context;
        c = noz.a(context, 3, "AccountUpdate", new String[] {
            "sync"
        });
        a = (htb)olm.a(context, htb);
    }

    final void a(int i)
    {
        fye fye1 = new fye(b, i, a.c(i));
        fye1.d();
        fyd fyd1 = fyd.c;
        if (fye1.l())
        {
            if (c.a())
            {
                Exception exception = ((nxx) (fye1)).n;
                noy.a("errorCode", Integer.valueOf(((nxx) (fye1)).l));
            }
        } else
        {
            fyd1 = fye.a(fye1);
        }
        ((mmv)olm.a(b, mmv)).b(i).c("user_registration_status", fyd1.name()).d();
    }

    final fyd b(int i)
    {
        return fyd.valueOf(((mmv)olm.a(b, mmv)).a(i).a("user_registration_status", fyd.c.name()));
    }
}

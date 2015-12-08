// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class gqp
    implements omb, opt, opu, opv
{

    public gql a;
    grn b;
    final nug c = new gqr(this);
    public int d;
    private final nug e = new gqq(this);

    public gqp(opd opd1)
    {
        opd1.a(this);
    }

    public final void V_()
    {
        a.b(false);
        a.a(true);
    }

    public final void X_()
    {
        gql gql1 = a;
        ekp ekp;
        if (b != null)
        {
            ekp = b.b;
        } else
        {
            ekp = null;
        }
        gql1.a(ekp);
        a.b(true);
        a.a(false);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (gql)olm1.a(gql);
        ((nwm)olm1.a(nwm)).a().a(e, false);
        olm1 = (mmr)olm1.a(mmr);
        context = a;
        int i = olm1.d();
        boolean flag;
        if (((gql) (context)).b.b != i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        olm1 = context.b();
        olm1.e = i;
        context.b = olm1.a();
        context.c(flag);
    }
}

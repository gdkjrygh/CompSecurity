// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class dtf
    implements dth, omb, opp, opv
{

    public mmr a;
    public msz b;
    private noz c;

    public dtf(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (mmr)olm1.a(mmr);
        b = (msz)olm1.a(msz);
        c = noz.a(context, 3, "AllPhotosFirstLoad", new String[0]);
    }

    public final void a(olm olm1)
    {
        olm1.a(dtf, this);
    }

    public final void am_()
    {
        String s;
        if (a.e())
        {
            s = a.g().b("account_name");
        } else
        {
            s = "logged_out";
        }
        b.b(s);
    }
}

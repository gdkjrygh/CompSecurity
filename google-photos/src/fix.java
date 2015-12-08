// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class fix
    implements fig, omb, opv
{

    private static final ekk a = (new ekm()).a(hpe).a(hjv).a(hjp).a(ikq).a();
    private final am b;
    private final opd c;
    private mmr d;
    private msm e;
    private fiy f;

    public fix(am am1, opd opd1)
    {
        e = new msm(pwz.h);
        b = am1;
        c = opd1;
        opd1.a(this);
    }

    public final ekk a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (mmr)olm1.a(mmr);
    }

    public final boolean a(ekq ekq1)
    {
        return ((hjv)ekq1.a(hjv)).a.a(d.g());
    }

    public final hgo b(ekq ekq1)
    {
        f = new fiy(b, c, ekq1);
        fih fih1 = new fih(b.a(b.pw), b.a(b.py), e, f);
        fih1.a(((hjp)ekq1.a(hjp)).a.c);
        return fih1;
    }

}

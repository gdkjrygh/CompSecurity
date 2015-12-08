// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class dqs
    implements omb, opv
{

    public omp a;
    public int b;
    public olm c;
    private fba d;

    public dqs(omp omp, oow oow1)
    {
        oow1.a(this);
        a = omp;
    }

    static fba a(dqs dqs1)
    {
        return dqs1.d;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = olm1;
        d = (fba)olm1.a(fba);
        b = ((mmr)olm1.a(mmr)).d();
        ((mpk)olm1.a(mpk)).a(b.iO, new dqt(this));
    }
}

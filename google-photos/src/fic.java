// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class fic
    implements fig, omb, opv
{

    private static final ekk a = (new ekm()).a(hjv).a(hjl).a(hpe).a(iks).a();
    private final am b;
    private Context c;
    private mmr d;

    public fic(am am1, opd opd1)
    {
        b = am1;
        opd1.a(this);
    }

    public final ekk a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        d = (mmr)olm1.a(mmr);
    }

    public final boolean a(ekq ekq1)
    {
        return ((hjv)ekq1.a(hjv)).a.a(d.g());
    }

    public final hgo b(ekq ekq1)
    {
        fih fih1 = new fih(b.a(b.pn), b.a(b.po), new msm(pwz.b), new fid(c, b, ekq1));
        fih1.a(((hjl)ekq1.a(hjl)).a);
        return fih1;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

final class edq
    implements ca
{

    private edp a;

    edq(edp edp1)
    {
        a = edp1;
        super();
    }

    public final ei a(int i, Bundle bundle)
    {
        bundle = (mmr)olm.a(edp.a(a), mmr);
        return new eeb(edp.b(a), bundle.d(), true);
    }

    public final void a(ei ei, Object obj)
    {
        ei = (List)obj;
        edp.a(a, ei);
        a.k().a(b.kU);
        a.k().a(b.kT, null, edp.c(a));
    }
}

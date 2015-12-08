// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

final class edr
    implements ca
{

    private edp a;

    edr(edp edp1)
    {
        a = edp1;
        super();
    }

    public final ei a(int i, Bundle bundle)
    {
        bundle = (mmr)olm.a(edp.d(a), mmr);
        return new eeb(edp.e(a), bundle.d(), false);
    }

    public final void a(ei ei, Object obj)
    {
        ei = (List)obj;
        edp.a(a, ei);
        edp.a(a, true);
    }
}

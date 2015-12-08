// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class ggq
    implements ca
{

    private ggp a;

    ggq(ggp ggp1)
    {
        a = ggp1;
        super();
    }

    public final ei a(int i, Bundle bundle)
    {
        return new ggz(ggp.a(a), ggp.b(a));
    }

    public final void a(ei ei, Object obj)
    {
        ei = (pov)obj;
        if (ei != null)
        {
            obj = ggp.c(a);
            obj.c = ggp.a(a, ei);
            ((gha) (obj)).a.b();
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

final class dlv
    implements drx
{

    private Set a;
    private ekw b;

    dlv(dlu dlu, Set set, ekw ekw1)
    {
        a = set;
        b = ekw1;
        super();
    }

    public final erm a(erm erm1)
    {
        erm1.b(a).c("has_local = 0");
        if (b.a())
        {
            erm1.f = b.b;
        }
        return erm1;
    }
}

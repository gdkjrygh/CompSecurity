// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class dza
    implements nrc
{

    private final noz a;

    dza(Context context)
    {
        a = noz.a(context, 4, "DisplayInSysTrayNotPrcs", new String[0]);
    }

    public final int a(int i, nqs nqs1)
    {
        pzt pzt1 = b.a(nqs1.b);
        if (pzt1 != null && pzt1.a != null && pzt1.e != null && !b.a(pzt1.e.a, true))
        {
            if (a.a())
            {
                noy.a("guns key", nqs1.a);
            }
            return nrd.a;
        } else
        {
            return nrd.b;
        }
    }

    public final int a(int i, oyc oyc)
    {
        return nrd.b;
    }

    public final void a(int i, cn cn)
    {
    }
}

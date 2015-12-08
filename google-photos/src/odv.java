// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class odv
    implements oeg
{

    private odu a;

    odv()
    {
        a = new odu();
    }

    public final void a(mru mru, oxz oxz1, Bundle bundle)
    {
        mru = (ock)mru;
        odu.a(mru, oxz1);
        bundle = new rbn();
        if (((ock) (mru)).g != null)
        {
            bundle.a = new long[((ock) (mru)).g.length];
            for (int i = 0; i < ((ock) (mru)).g.length; i++)
            {
                ((rbn) (bundle)).a[i] = ((ock) (mru)).g[i].longValue();
            }

        }
        oxz1.c.e = new rai();
        oxz1.c.e.a = bundle;
        oxz1.c.e.b = ((ock) (mru)).f;
    }
}

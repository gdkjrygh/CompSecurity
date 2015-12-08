// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

final class ecs
    implements dup, mti, omb
{

    dyx a;
    mtj b;
    final int c;
    private Context d;
    private Resources e;
    private noz f;

    ecs(int i)
    {
        c = i;
    }

    public final hgo a(dum dum1)
    {
        dzl dzl1;
        pzn pzn1;
        dwh dwh1;
        dzl1 = (dzl)dum1.a(dzl);
        pzn1 = dzl1.i.b.f;
        dwh1 = (new dzi()).a(dum1, dzl1);
        dwh1.e = dzl1.e;
        dwh1.f = dzl1.f;
        dwh1.g = b.kK;
        dwh1.h = b.kL;
        dwh1.k = new ecw(this, d, dzl1.a, dum1.a);
        if (c != 0) goto _L2; else goto _L1
_L1:
        dwh1.a(e.getString(c.cs), new ect(this, dzl1), pwt.E);
_L4:
        return new dzg(dum1, dwh1.a());
_L2:
        if (c == 1)
        {
            dwh1.a(pzn1.b, new ecu(this, dzl1, dum1), pws.m);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = context;
        a = (dyx)olm1.a(dyx);
        b = (mtj)olm1.a(mtj);
        b.a(this);
        e = context.getResources();
        f = noz.a(context, "AddStoriesCardRenderer", new String[0]);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if ("StoriesCardLoadFeaturesTask".equals(s) && mue1 != null && !mue1.c() && mue1.a().getInt("storyCardType") == c)
        {
            s = mue1.a();
            mue1 = (ekq)s.getParcelable("mediaCollection");
            if (mue1 != null)
            {
                mue1 = (hpe)mue1.b(hpe);
                if (mue1 != null)
                {
                    mue1 = ((hpe) (mue1)).a.a;
                    mue1 = new iup(d, mue1, s.getInt("accountId"));
                    mue1.b = (dui)s.getParcelable("cardId");
                    s = mue1.a();
                    d.startActivity(s);
                    return;
                }
            }
        }
    }

    public final void a(olm olm1)
    {
    }

    public final hhg b()
    {
        return new dwm();
    }
}

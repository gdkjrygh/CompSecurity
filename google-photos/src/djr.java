// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class djr
    implements elf
{

    private static final oni a = new oni("debug.photos.verify_count");
    private static final ekz b;
    private static final ekz c;
    private static final ekz d = (new ela()).a();
    private final Context e;
    private final drw f;
    private final dpj g;
    private final drz h;
    private final noz i;
    private final drz j;

    djr(Context context, drw drw1)
    {
        e = context;
        f = drw1;
        g = (dpj)olm.a(context, dpj);
        h = (drz)olm.a(context, drz);
        j = (drz)olm.a(context, drz);
        i = noz.a(context, 3, "AllMediaProvider", new String[0]);
    }

    public final long a(ekq ekq, ekw ekw1)
    {
        dke dke1 = (dke)ekq;
        int k = dke1.a;
        ekq = h.a(dke1.a);
        if (ekw1.g)
        {
            ekq = gaw.a;
        }
        if (ekq.a(gav.b) && d.a(ekw1))
        {
            long l = noy.a();
            k = g.a(k);
            if (i.a())
            {
                b.a(dke1);
                noy.a("duration", l);
            }
            return (long)k;
        } else
        {
            ekw1 = ekw1.f;
            erm erm1 = new erm();
            erm1.o = false;
            erm1.h = gaw.a.equals(ekq);
            erm1.l = false;
            return erm1.a(ekw1).a(e, k);
        }
    }

    public final Class a()
    {
        return dke;
    }

    public final List a(ekq ekq, ekw ekw1, ekk ekk)
    {
        int k = ((dke)ekq).a;
        return f.a(k, ekw1, ekk, new drx[] {
            new djs(this), new dod(j, k)
        });
    }

    public final ekz b()
    {
        return b;
    }

    public final ekz c()
    {
        return c;
    }

    static 
    {
        ela ela1 = new ela();
        ela1.a = true;
        ela1.b = true;
        ela1.d = true;
        ela1.e = true;
        ela1.c = true;
        ela1.f = true;
        ela1.g = true;
        b = ela1.a();
        ela1 = new ela();
        ela1.c = true;
        ela1.d = true;
        c = ela1.a();
    }
}

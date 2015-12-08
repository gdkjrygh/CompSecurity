// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class dlj
    implements elf
{

    private static final ekz a = (new ela()).a();
    private final drw b;
    private final noz c;

    dlj(Context context, drw drw1)
    {
        b = drw1;
        c = noz.a(context, 3, "DedupKeyCollection", new String[] {
            "perf"
        });
    }

    public final long a(ekq ekq, ekw ekw)
    {
        throw new UnsupportedOperationException();
    }

    public final Class a()
    {
        return dll;
    }

    public final List a(ekq ekq, ekw ekw, ekk ekk)
    {
        ekq = (dll)ekq;
        long l = noy.a();
        ekw = b.a(((dll) (ekq)).a, ekw, ekk, new drx[] {
            new dlk(this, ekq)
        });
        if (c.a())
        {
            b.a(ekq);
            noy.a("total", Integer.valueOf(ekw.size()));
            noy.a("duration", l);
        }
        return ekw;
    }

    public final ekz b()
    {
        return a;
    }

    public final ekz c()
    {
        throw new UnsupportedOperationException();
    }

}

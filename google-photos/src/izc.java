// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class izc
    implements elf
{

    private static final ekz a = (new ela()).a();
    private static final ekz b;
    private final eto c;
    private final drw d;

    izc(Context context, drw drw1)
    {
        d = drw1;
        c = (eto)olm.a(context, eto);
    }

    public final long a(ekq ekq, ekw ekw)
    {
        ekq = (iza)ekq;
        ekw = c;
        int i = ((iza) (ekq)).a;
        return (new erm()).a().a(((eto) (ekw)).a, i);
    }

    public final Class a()
    {
        return iza;
    }

    public final List a(ekq ekq, ekw ekw, ekk ekk)
    {
        int i = ((iza)ekq).a;
        return d.a(i, ekw, ekk, new drx[] {
            new izd(this)
        });
    }

    public final ekz b()
    {
        return b;
    }

    public final ekz c()
    {
        return a;
    }

    static 
    {
        ela ela1 = new ela();
        ela1.a = true;
        ela1.b = true;
        b = ela1.a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Set;

final class nit> extends dmn
{

    private gqs a;
    private dmi b;
    private dmp c;

    public final void a(int i, String s)
    {
        c.a.remove(a);
        b.a(i, s);
    }

    public final void b(grq grq1, IOException ioexception)
    {
        c.a.remove(a);
        b.a(ioexception, grq1.toString());
    }

    (dmp dmp1, gqs gqs, dmi dmi1)
    {
        c = dmp1;
        a = gqs;
        b = dmi1;
        super();
    }
}

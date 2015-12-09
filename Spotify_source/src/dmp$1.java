// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Set;
import org.json.JSONObject;

final class nit> extends dml
{

    private gqs a;
    private dmh b;
    private dmp c;

    public final void a(int i, JSONObject jsonobject)
    {
        c.a.remove(a);
        b.a(i, jsonobject);
    }

    public final void a(Throwable throwable, String s)
    {
        c.a.remove(a);
        b.a(throwable, s);
    }

    public final void b(grq grq1, IOException ioexception)
    {
        c.a.remove(a);
        b.a(ioexception, grq1.toString());
    }

    (dmp dmp1, gqs gqs, dmh dmh1)
    {
        c = dmp1;
        a = gqs;
        b = dmh1;
        super();
    }
}

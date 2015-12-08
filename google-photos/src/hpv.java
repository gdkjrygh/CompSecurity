// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hpv extends nxs
{

    private static final oqe a;
    private static final oqe b;
    private static final oqe c = (new oqi("debug.plus.tracing_level")).a();

    hpv()
    {
    }

    public final String a()
    {
        return c.a;
    }

    public final String a(String s)
    {
        if ("plusi".equals(s))
        {
            return a.a;
        }
        if ("plusdatamixer".equals(s))
        {
            return b.a;
        } else
        {
            return null;
        }
    }

    static 
    {
        oqi oqi1 = new oqi("debug.photos.frontend.url");
        oqi1.a = "www.googleapis.com/plusi/v3/ozInternal/";
        a = oqi1.a();
        oqi1 = new oqi("debug.photos.datamixer.url");
        oqi1.a = "www.googleapis.com/plusdatamixer/v1/";
        b = oqi1.a();
    }
}

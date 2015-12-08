// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Dl extends oC
    implements oS.a
{

    private final EY a;
    private final EZ b = EZ.a();
    private final Br c;
    private UK d;

    public Dl(Br br, EY ey)
    {
        c = br;
        a = ey;
        registerCallback(UK, this);
    }

    protected final String getPath()
    {
        return "/bq/and/trophies";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new UO()).a(a.f)));
    }

    public final void onJsonResult(Object obj, pi pi1)
    {
        d = (UK)obj;
        if (pi1.c())
        {
            if (d != null)
            {
                c.a(d.a());
            }
            return;
        } else
        {
            b.a(a);
            return;
        }
    }
}

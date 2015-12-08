// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class hwb extends mtf
{

    private final ekq a;
    private final dnq b;
    private final String c;

    public hwb(ekq ekq1, String s)
    {
        super("SearchResultsTask");
        a = ekq1;
        b = (dnq)ekq1.a(dnq);
        c = s;
    }

    protected final mue a(Context context)
    {
        int i = 0;
        noz noz1 = noz.a(context, 3, "Search", new String[] {
            "perf"
        });
        Object obj = (dns)olm.a(context, dns);
        eto eto1 = (eto)olm.a(context, eto);
        mmv mmv1 = (mmv)olm.a(context, mmv);
        long l = noy.a();
        dnq dnq1 = b;
        String s = c;
        obj.b = new dnt(((dns) (obj)).a, dnq1, 100, s);
        ((dns) (obj)).b.d();
        if (((dns) (obj)).b.l() || dnt.a(((dns) (obj)).b) == null)
        {
            context = new mue(false);
            context.a().putParcelable("searchQuery", a);
            context.a().putString("failedResumeToken", c);
            return context;
        }
        obj = dnt.a(((dns) (obj)).b);
        if (((plz) (obj)).a != null && ((plz) (obj)).a.length != 0)
        {
            int j = b.a;
            if (!gcp.d.equals(((gdn)olm.a(context, gdn)).b(j)))
            {
                context = new qfu();
                context.b = mmv1.a(j).b("gaia_id");
                eto1.a(j, ((plz) (obj)).a, new qgi[0], context, false);
            }
            eto1.a(j, b.f, ((plz) (obj)).a, true);
        }
        if (noz1.a())
        {
            b.a(a);
            if (((plz) (obj)).a != null)
            {
                i = ((plz) (obj)).a.length;
            }
            noy.a("total", Integer.valueOf(i));
            noy.a("resume token", c);
            noy.a("duration", l);
        }
        context = new mue(true);
        context.a().putLong("resultItemsSoFar", eto1.b(b.a, b.f));
        context.a().putString("resumeToken", ((plz) (obj)).b);
        context.a().putParcelable("searchQuery", a);
        return context;
    }
}

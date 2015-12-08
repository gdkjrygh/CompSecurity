// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class hop extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private static final ekk b = (new ekm()).a(hpe).b(iks).a();
    private final int c;
    private final ekq j;
    private final ekp k;
    private final hoo l;
    private final hoq m;

    hop(int i, ekq ekq1, ekp ekp1, hoo hoo)
    {
        this(i, ekq1, ekp1, hoo, new hoq());
    }

    private hop(int i, ekq ekq1, ekp ekp1, hoo hoo, hoq hoq1)
    {
        super("ReportAbuseTask");
        p.b(ekq1, "collection must be non-null");
        c = i;
        j = ekq1;
        k = ekp1;
        l = hoo;
        m = hoq1;
    }

    protected final mue a(Context context)
    {
        Object obj;
        Object obj1;
        hoo hoo;
        int i;
        try
        {
            obj1 = (ekq)b.b(context, j).a(j, b).a();
            obj = (iks)((ekq) (obj1)).b(iks);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        obj = ((iks) (obj)).a;
_L1:
        if (k != null)
        {
            obj1 = ((hpg)((ekp)b.a(context, k).a(k, a).a()).a(hpg)).b().c;
            i = c;
            hoo = l;
            p.b(obj1, "collectionMediaKey cannot be null");
            p.b(hoo, "abuseType cannot be null");
            return mtj.b(context, new hoy(i, null, ((String) (obj1)), ((String) (obj)), hoo));
        }
        obj1 = ((hpe)((ekq) (obj1)).a(hpe)).a.a;
        i = c;
        hoo = l;
        p.b(obj1, "collectionMediaKey cannot be null");
        p.b(hoo, "abuseType cannot be null");
        context = mtj.b(context, new hoy(i, ((String) (obj1)), null, ((String) (obj)), hoo));
        return context;
        obj = null;
          goto _L1
    }

    public final String b(Context context)
    {
        return context.getString(b.wX);
    }

}

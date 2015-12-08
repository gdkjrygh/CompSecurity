// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;

public final class jdt extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private final ekp b;
    private final int c;
    private final int j;

    public jdt(ekp ekp1, int i, int k)
    {
        super("SaveSlomoTransitionTask");
        b = ekp1;
        c = i;
        j = k;
    }

    private hpg g(Context context)
    {
        Object obj = (hpg)b.b(hpg);
        if (obj != null)
        {
            return ((hpg) (obj));
        }
        obj = b.a(context, b);
        try
        {
            obj = (hpg)((ekp)((ekv) (obj)).a(b, a).a()).a(hpg);
        }
        catch (eke eke1)
        {
            if (noz.a(context, "SaveSlomoTask", new String[0]).a())
            {
                context = String.valueOf(eke1);
                (new StringBuilder(String.valueOf(context).length() + 24)).append("Couldn't resolve media: ").append(context);
            }
            return null;
        }
        return ((hpg) (obj));
    }

    protected final mue a(Context context)
    {
        noz noz1 = noz.a(context, 2, "SaveSlomoTask", new String[0]);
        jgq jgq1 = (jgq)olm.a(context, jgq);
        context = g(context);
        if (context == null)
        {
            return new mue(false);
        }
        Object obj = context.c();
        if (obj == null)
        {
            return new mue(false);
        }
        context = new jgn();
        context.a = Integer.valueOf(c);
        context.b = Integer.valueOf(j);
        obj = ((hpk) (obj)).a;
        p.a(obj);
        p.a(context);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("transition_data", qlw.a(context));
        jgq1.a.a("media_store_extra_slomo_transition", ((String) (obj)), contentvalues);
        if (noz1.a())
        {
            noy.a("startMs", ((jgn) (context)).a);
            noy.a("endMs", ((jgn) (context)).b);
        }
        return new mue(true);
    }

}

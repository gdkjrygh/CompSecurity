// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class hrn extends mtf
{

    private final hsv a;
    private final ekq b;
    private final ekk c;

    hrn(hsv hsv, ekq ekq, ekk ekk)
    {
        super("search_query_collection_feature_load_task");
        a = hsv;
        b = ekq;
        c = ekk;
    }

    protected final mue a(Context context)
    {
        boolean flag2 = true;
        Object obj = b;
        b.v();
        if (!(obj instanceof dnx))
        {
            throw new IllegalArgumentException("Source collection must be a SearchQueryMediaCollection.");
        }
        dnx dnx1 = (dnx)obj;
        int i = dnx1.c;
        boolean flag;
        if (dnx1.b() && gjr.a(context, i) && gcp.d.equals(((gdn)olm.a(context, gdn)).b(i)) && !((gjr)olm.a(context, gjr)).a(i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = new dkh();
            obj.c = dnx1.c;
            obj.a = gka.a(dnx1.b);
            obj.b = dnx1.a;
            boolean flag1;
            if (((dkh) (obj)).a != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.a(flag1, "Cluster ID must be set.");
            if (-1 != ((dkh) (obj)).c)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            p.a(flag1, "Account ID should be set");
            obj = new dms(((dkh) (obj)).a, ((dkh) (obj)).b, ((dkh) (obj)).c);
        }
        context = mtj.b(context, new elc(((ekq) (obj)), c, p.an));
        context.a().putParcelable("extra_source_suggestion", a);
        return context;
    }
}

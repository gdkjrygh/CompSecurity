// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class hrm
    implements ba
{

    private hrl a;

    hrm(hrl hrl1)
    {
        a = hrl1;
        super();
    }

    public final void aa_()
    {
        int i = a.h().e();
        Object obj;
        if (i > 0 && TextUtils.equals(a.h().b(i - 1).d(), "results_fragment_transaction"))
        {
            obj = a.h().a("photos_search_results");
            if (obj == null)
            {
                obj = null;
            } else
            if (obj instanceof hva)
            {
                obj = ((hva)obj).a.c;
            } else
            {
                obj = ((hvy)obj).a.c;
            }
        } else
        {
            obj = null;
        }
        hrl.a(a).a(((String) (obj)));
        hrl.b(a).c();
    }
}

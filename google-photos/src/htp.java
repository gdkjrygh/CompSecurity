// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class htp extends mtf
{

    private final int a;
    private final int b;

    public htp(int i, int j)
    {
        super("ReportLocationTask");
        a = i;
        b = j;
    }

    protected final mue a(Context context)
    {
        Object obj = new htn(context, b);
        ((hpz)olm.a(context, hpz)).a(a, ((ds) (obj)));
        boolean flag;
        if (((htn) (obj)).a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return new mue(false);
        } else
        {
            context = (hto)p.a(((htn) (obj)).a);
            obj = new mue(true);
            ((mue) (obj)).a().putString("extra_people_grouping_status", context.name());
            ((mue) (obj)).a().putInt("account_id", a);
            return ((mue) (obj));
        }
    }
}

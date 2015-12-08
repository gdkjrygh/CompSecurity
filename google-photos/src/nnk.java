// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.List;

public final class nnk
    implements ngo
{

    private final Context a;
    private final List b;
    private final nnj c;

    public nnk(Context context)
    {
        a = context;
        b = olm.c(context, nni);
        c = (nnj)olm.a(context, nnj);
    }

    public final int a()
    {
        return ngr.b;
    }

    public final ngp a(mmx mmx1, boolean flag)
    {
        if (mmx1.c("is_managed_account") && !c.b() || !c.a())
        {
            return null;
        }
        if (flag)
        {
            mmx1 = b;
        } else
        {
            mmx1 = Collections.EMPTY_LIST;
        }
        return new nnl(this, a, mmx1);
    }
}

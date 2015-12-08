// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class nir
    implements ngo
{

    private final Context a;
    private final List b;
    private final nnj c;

    nir(Context context)
    {
        a = context;
        b = olm.c(context, nie);
        c = (nnj)olm.a(context, nnj);
    }

    static Context a(nir nir1)
    {
        return nir1.a;
    }

    static List b(nir nir1)
    {
        return nir1.b;
    }

    public final int a()
    {
        return ngr.b;
    }

    public final ngp a(mmx mmx1, boolean flag)
    {
        boolean flag1 = mmx1.c("is_managed_account");
        if (!flag1 && c.a() || flag1 && c.b())
        {
            return null;
        }
        if (!flag && !mmx1.c("PlusiAccountUpdateExtension.wants_full_update"))
        {
            return new niu(this);
        } else
        {
            return new nis(this);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;

public final class ihf extends mtf
{

    private final int a;
    private final ihi b;
    private final boolean c;

    public ihf(int i, ihi ihi1, boolean flag)
    {
        super("CreateEnvelopeTask");
        boolean flag1;
        if (i != -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1, "must specify a valid accountId");
        p.b(ihi1, "must specify a non-null envelope");
        a = i;
        b = ihi1;
        c = flag;
    }

    protected final mue a(Context context)
    {
        ihd ihd1 = new ihd(context, a, b, c);
        ((hpz)olm.a(context, hpz)).a(a, ihd1);
        if (ihd1.k())
        {
            return new mue(0, new IOException(ihd1.a.a), null);
        }
        if (ihd1.j())
        {
            ((erz)olm.a(context, erz)).a(a, new qfz[] {
                ihd1.d
            });
        }
        context = new mue(true);
        Bundle bundle = context.a();
        ihm ihm1 = new ihm();
        ihm1.b = ihd1.b;
        ihm1.a = ihd1.c;
        ihm1.c = b.d;
        ihm1.d = true;
        bundle.putParcelable("envelope_share_details", ihm1.a());
        return context;
    }
}

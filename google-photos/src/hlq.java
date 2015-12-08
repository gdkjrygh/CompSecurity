// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hlq extends mtf
{

    private final String a;
    private final String b;
    private final int c;

    public hlq(String s, int i, String s1)
    {
        super("remotemedia.tasks.LeaveEnvelopeTask");
        b = (String)p.a(s1, "Must have non-empty media key");
        a = (String)p.a(s, "Must have non-empty gaiaId");
        c = i;
    }

    protected final mue a(Context context)
    {
        hko hko1 = new hko(context, a, b);
        ((hpz)olm.a(context, hpz)).a(c, hko1);
        if (!hko1.a)
        {
            return new mue(false);
        } else
        {
            ((est)olm.a(context, est)).e(c, b);
            return new mue(true);
        }
    }
}

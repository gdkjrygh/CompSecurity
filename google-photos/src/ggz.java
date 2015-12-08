// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ggz extends mvd
{

    private final Context l;
    private final int m;

    public ggz(Context context, int i)
    {
        super(context);
        l = context;
        m = i;
    }

    public final Object q()
    {
        Object obj = ((mmv)olm.a(l, mmv)).a(m).b("gaia_id");
        obj = new nwb(l, new nyg(l, m), ((String) (obj)));
        obj.f = true;
        obj = ((nwb) (obj)).a();
        ((nwa) (obj)).d();
        if (!((nwa) (obj)).l())
        {
            obj = ((nwa) (obj)).a;
            if (obj != null)
            {
                return ((poq) (obj)).c;
            }
        }
        return null;
    }
}

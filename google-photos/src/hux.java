// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class hux
    implements omb, opn, opv
{

    private final am a;
    private mmr b;
    private Context c;
    private ar d;

    hux(am am1, opd opd1)
    {
        a = am1;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        b = (mmr)olm1.a(mmr);
        d = a.O_();
    }

    public final void c()
    {
        if (!d.isChangingConfigurations())
        {
            mtj.a(c, new huy(b.d()));
        }
        d = null;
    }
}

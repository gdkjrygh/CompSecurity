// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Set;

final class nwq
    implements omb, opl, opn, opv
{

    private final am a;
    private nwo b;

    nwq(am am, opd opd1)
    {
        a = am;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (nwo)olm1.a(nwo);
    }

    public final void a(Bundle bundle)
    {
        bundle = b;
        am am = a;
        p.a(((nwo) (bundle)).b.add(am), "Already added: %s", new Object[] {
            am
        });
        ((nwo) (bundle)).a.a(am);
    }

    public final void c()
    {
        nwo nwo1 = b;
        am am = a;
        p.a(nwo1.b.remove(am), "Failed to remove: %s", new Object[] {
            am
        });
    }
}

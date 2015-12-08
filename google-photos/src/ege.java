// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Set;

public final class ege
    implements efm, omb, opn, opv
{

    private efd a;
    private hgq b;

    public ege(opd opd1)
    {
        opd1.a(this);
    }

    public final void a()
    {
        b.a("AutoBackup state changed");
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (efd)olm1.a(efd);
        a.a.add(this);
        a.a(true);
        b = (hgq)olm1.a(hgq);
    }

    public final void b()
    {
        b.a("AutoBackup item completed");
    }

    public final void c()
    {
        a.a.remove(this);
    }

    public final void d()
    {
        b.a("AutoBackup item started");
    }
}

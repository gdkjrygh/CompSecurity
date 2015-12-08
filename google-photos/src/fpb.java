// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class fpb
    implements nug, omb, opl, ops, opv
{

    final am a;
    foz b;
    mmr c;
    fqc d;
    fba e;
    boolean f;

    public fpb(am am, opd opd1)
    {
        a = am;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mmr)olm1.a(mmr);
        e = (fba)olm1.a(fba);
        d = (fqc)olm1.a(fqc);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            f = bundle.getBoolean("load_all_pages");
        }
    }

    public final void b_(Object obj)
    {
        if (b != null)
        {
            b.d();
            f = true;
        }
    }

    public final void e(Bundle bundle)
    {
        if (b != null && b.e())
        {
            bundle.putBoolean("load_all_pages", true);
        }
    }
}

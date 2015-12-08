// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class ibb extends omp
    implements mti, nzu, oab
{

    private final nzt a;
    private mtj b;

    public ibb()
    {
        a = new nzt(this, af);
    }

    public final void a(String s1, mue mue1, mua mua)
    {
        if ("SendDatabaseFileTask".equals(s1) && mue1 != null)
        {
            if ((s1 = (Intent)mue1.a().getParcelable("extra_intent_chooser")) != null)
            {
                ad.startActivity(s1);
                return;
            }
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        b = ((mtj)ae.a(mtj)).a(this);
    }

    public final void n()
    {
        super.n();
        b.b(this);
    }

    public final void r()
    {
        nzw nzw1 = (new oac(ad)).a("Send database", null);
        nzw1.k = this;
        a.a(nzw1);
    }

    public final boolean s()
    {
        ae.a(esp);
        ((mmr)ae.a(mmr)).d();
        b.b(((ibx)ae.a(ibx)).a());
        return true;
    }
}

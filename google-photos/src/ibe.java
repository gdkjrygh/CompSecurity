// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class ibe extends omp
    implements mti, nzu, oab
{

    private final nzt a;
    private mtj b;

    public ibe()
    {
        a = new nzt(this, af);
    }

    public final void a(String s1, mue mue1, mua mua)
    {
        if ("SendLogFilesTask".equals(s1) && mue1 != null)
        {
            if ((s1 = (Intent)mue1.a().getParcelable("extra__intent_chooser")) != null)
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
        nzw nzw1 = (new oac(ad)).a("Send log files", null);
        nzw1.k = this;
        a.a(nzw1);
    }

    public final boolean s()
    {
        ae.a(fyl);
        b.b(((iby)ae.a(iby)).a());
        return true;
    }
}

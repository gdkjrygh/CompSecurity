// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public final class gef
    implements gee, omb, opp, opr, opv
{

    private geg a;
    private nfw b;
    private gec c;

    public gef(opd opd1)
    {
        opd1.a(this);
    }

    private void d()
    {
        nfw nfw1 = b;
        ngg ngg1 = new ngg();
        ngg1.g = true;
        nfw1.a(ngg1.a(ngl, (new ngm()).a()));
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (geg)olm1.a(geg);
        b = (nfw)olm1.a(nfw);
        c = (gec)olm1.a(gec);
    }

    public final void al_()
    {
        boolean flag = false;
        if (a.a.getSharedPreferences("com.google.android.apps.photos.metasync.remote.sync_reset_model", 0).getBoolean("account_reset", false))
        {
            d();
            a.a.getSharedPreferences("com.google.android.apps.photos.metasync.remote.sync_reset_model", 0).edit().putBoolean("account_reset", false).apply();
        }
        gec gec1 = c;
        if (gec1.d == null)
        {
            flag = true;
        }
        p.b(flag, gec1.d);
        gec1.d = this;
    }

    public final void am_()
    {
        c.d = null;
    }

    public final void c()
    {
        d();
    }
}

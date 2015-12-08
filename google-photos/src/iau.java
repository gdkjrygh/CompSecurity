// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class iau
    implements omb, opv
{

    private mtj a;
    private int b;
    private Context c;

    public iau(opd opd1)
    {
        opd1.a(this);
    }

    icj a()
    {
        return new icj(c, b);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        a = (mtj)olm1.a(mtj);
        b = ((mmr)olm1.a(mmr)).d();
    }

    void a(icj icj1)
    {
        icj1 = new dim(c, "com.google.android.apps.photos.settings.CloudSettingsMutator.change_settings", b, new ici(icj1.b, icj1.c, icj1.a));
        a.a(icj1);
    }

    final void a(boolean flag, boolean flag1, boolean flag2)
    {
        icj icj1 = a();
        icj1.a.d = icj.a(flag1, flag2);
        icj1.a.e = icj.a(flag, true);
        a(icj1);
    }
}

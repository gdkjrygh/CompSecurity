// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class nzh
    implements omb, oot, opt, opv
{

    private final nzi a;
    private oau b;
    private PreferenceScreen c;
    private Context d;

    public nzh(nzi nzi1, opd opd1)
    {
        a = nzi1;
        opd1.a(this);
    }

    public final void X_()
    {
        a.s();
    }

    public final nzw a(nzw nzw)
    {
        c.b(nzw);
        return nzw;
    }

    public final void a()
    {
        c = b.b();
        new oac(d);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (oau)olm1.a(oau);
        d = context;
    }

    public final void b(nzw nzw)
    {
        c.c(nzw);
    }
}

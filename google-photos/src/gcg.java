// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class gcg
    implements geb, omb, opt, opu, opv
{

    private mmr a;
    private gcf b;
    private mtj c;
    private gdw d;
    private Context e;

    public gcg(opd opd1)
    {
        opd1.a(this);
    }

    public gcg(opd opd1, byte byte0)
    {
        opd1.a(this);
    }

    public final void V_()
    {
        d.b(this);
    }

    public final void X_()
    {
        d.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = context;
        a = (mmr)olm1.a(mmr);
        c = (mtj)olm1.a(mtj);
        b = (gcf)olm1.a(gcf);
        d = (gdw)olm1.a(gdw);
    }

    public final void a(gcp gcp1)
    {
    }

    public final void a(gcp gcp1, long l)
    {
        if (a.e() && !mtj.a(e, "com.google.android.apps.photos.metasync.Bootstrap.BootStrapTask") && !gcp.a(gcp1))
        {
            c.a(new gch(b, a.d()));
        }
    }

    public final void a(Long long1, long l)
    {
    }

    public final void b(gcp gcp1, long l)
    {
    }
}

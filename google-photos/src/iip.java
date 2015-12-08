// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class iip
    implements omb, opl, ops, opv
{

    public mtj a;
    public mmr b;
    noz c;
    public boolean d;
    public boolean e;
    long f;

    public iip(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = ((mtj)olm1.a(mtj)).a("ReadSharedCollections", new iiq(this));
        b = (mmr)olm1.a(mmr);
        c = noz.a(context, "SharedLinksDataLoader", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            d = bundle.getBoolean("is_started");
            e = bundle.getBoolean("is_complete");
            f = bundle.getLong("initial_request_ms");
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("is_started", d);
        bundle.putBoolean("is_complete", e);
        bundle.putLong("initial_request_ms", f);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public final class hhx
    implements omb, opv
{

    public final ar a;
    public mtj b;
    public mmr c;

    hhx(ar ar1, opd opd1)
    {
        a = ar1;
        opd1.a(this);
    }

    static void a(hhx hhx1, mue mue1, mua mua1)
    {
        mua1.a("SetAlbumCoverTask");
        if (mue.a(mue1) && !nuo.a(hhx1.a, mue1, nup.B))
        {
            Toast.makeText(hhx1.a, hhx1.a.getString(b.vX), 1).show();
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mmr)olm1.a(mmr);
        b = (mtj)olm1.a(mtj);
        b.a("SetAlbumCoverTask", new hhy(this));
    }
}

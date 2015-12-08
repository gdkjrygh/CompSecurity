// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

public final class hnw
    implements nug, nus, omb, ops, opt, opu, opv
{

    final am a;
    ejz b;
    List c;
    List d;
    hyv e;
    private mpk f;
    private mmr g;
    private Context h;
    private hny i;
    private boolean j;

    public hnw(am am1, opd opd1)
    {
        c = Collections.emptyList();
        a = am1;
        opd1.a(this);
    }

    private void c()
    {
        if (!b.w(h))
        {
            ay ay = a.h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.c;
            nuq1.c = "OfflineRetryTagAddAndRemoveFromAlbum";
            nuq1.e = true;
            nuo.a(ay, nuq1);
            return;
        }
        hee hee1 = (new hee(h)).a(true);
        hee1.a = g.d();
        hee1.f = h.getString(c.ef);
        hee1.g = h.getString(c.ee);
        hee1.i = true;
        hee1.j = b.b();
        if (!c.isEmpty())
        {
            hee1.k = (ekp)c.get(0);
        }
        f.a(ag.O, hee1.a());
    }

    public final void V_()
    {
        i.a.a(this);
    }

    public final void X_()
    {
        i.a.a(this, false);
    }

    public final String a()
    {
        return "OfflineRetryTagAddAndRemoveFromAlbum";
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        h = context;
        f = (mpk)olm1.a(mpk);
        g = (mmr)olm1.a(mmr);
        b = (ejz)olm1.a(ejz);
        e = (hyv)olm1.a(hyv);
        olm1.a(dha);
        i = (hny)olm1.a(hny);
        if (bundle != null)
        {
            j = bundle.getBoolean("EditAlbumMenuHandler.edit_button_shown");
        }
        f.a(ag.O, new hnx(this));
    }

    public final void b_(Object obj)
    {
        c();
    }

    public final void c_(Bundle bundle)
    {
        c();
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("EditAlbumMenuHandler.edit_button_shown", j);
    }
}

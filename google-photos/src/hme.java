// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;

public final class hme
    implements dhf, nus, omb, opl, ops, opv
{

    final am a;
    hzh b;
    ejz c;
    ArrayList d;
    hyv e;
    boolean f;
    private Context g;
    private mmr h;
    private mpk i;

    public hme(am am)
    {
        a = am;
    }

    private void b()
    {
        Object obj = (new hee(g)).a(true);
        obj.a = h.d();
        obj.f = g.getString(c.ef);
        obj.g = g.getString(c.ee);
        obj.i = true;
        obj = ((hee) (obj)).a();
        i.a(ag.N, ((android.content.Intent) (obj)));
    }

    public final String a()
    {
        return "OfflineRetryTagAddToEnvelope";
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = context;
        i = (mpk)olm1.a(mpk);
        b = (hzh)olm1.a(hzh);
        h = (mmr)olm1.a(mmr);
        c = (ejz)olm1.a(ejz);
        e = (hyv)olm1.a(hyv);
        i.a(ag.N, new hmf(this));
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            f = bundle.getBoolean("AddToEnvelopeMenuItemHandler.is_visible");
        }
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setEnabled(true);
        menuitem.setVisible(f);
    }

    public final void b(MenuItem menuitem)
    {
        b();
    }

    public final void c_(Bundle bundle)
    {
        b();
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("AddToEnvelopeMenuItemHandler.is_visible", f);
    }
}

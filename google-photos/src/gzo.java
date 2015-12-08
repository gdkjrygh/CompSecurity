// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;
import java.util.List;

final class gzo
    implements omb, oov, opt, opu, opv
{

    fsv a;
    hgz b;
    final fsh c = new fsh(new gzp(this));
    private final int d;
    private nwm e;
    private fpn f;
    private fsq g;
    private fqi h;
    private List i;
    private final nug j = new gzq(this);
    private final nug k = new gzr(this);
    private final nug l = new gzs(this);

    gzo(opd opd1, int i1)
    {
        d = i1;
        opd1.a(this);
    }

    public final void V_()
    {
        if (e != null)
        {
            e.a().a(j);
        }
        f.a.a(k);
        h.a.a(l);
    }

    public final void X_()
    {
        if (e != null)
        {
            e.a().a(j, false);
        }
        f.a.a(k, false);
        h.a.a(l, true);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = (nwm)olm.b(context, nwm);
        f = (fpn)olm.a(context, fpn);
        g = (fsq)olm1.b(fsq);
        h = (fqi)olm1.a(fqi);
        b = (hgz)olm1.a(hgz);
        i = olm1.c(hbu);
    }

    public final void a(View view, Bundle bundle)
    {
        bundle = (FastScrollRecyclerView)view.findViewById(d);
        hbt hbt1;
        if (g != null)
        {
            view = new ftn(bundle, g);
        } else
        {
            view = new fsp(bundle);
        }
        a = new fsv(view, bundle, c);
        view = a;
        hbt1 = new hbt(i);
        ((fsv) (view)).g.a.add(hbt1);
        bundle.y = a;
    }
}

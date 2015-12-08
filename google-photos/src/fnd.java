// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

final class fnd
    implements epv, mti, omb, opv
{

    private gog a;
    private mtj b;
    private gph c;
    private hyo d;
    private Context e;
    private noz f;
    private gll g;
    private nwm h;
    private epv i;

    public fnd(opd opd1)
    {
        opd1.a(this);
    }

    static gph a(fnd fnd1)
    {
        return fnd1.c;
    }

    static gog b(fnd fnd1)
    {
        return fnd1.a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = context;
        a = (gog)olm1.b(gog);
        b = ((mtj)olm1.a(mtj)).a(this);
        c = (gph)olm1.a(gph);
        h = (nwm)olm1.a(nwm);
        g = (gll)olm1.a(gll);
        i = (epv)olm1.a(epv);
        f = noz.a(context, "OpenMediaFromPhotoGridMixin", new String[0]);
    }

    public final void a(ekp ekp1, ekq ekq)
    {
        d = (hyo)h.ai_().b(hyo);
        if (a == null || d == null)
        {
            i.a(ekp1, ekq);
            return;
        } else
        {
            ekq = new ehr(ekq);
            ekp1 = new hyj(ekq, ekp1, g.d(ekq));
            b.b("com.google.android.apps.photos.pager.model.FindPositionTask");
            b.a(ekp1);
            return;
        }
    }

    public final void a(Exception exception)
    {
        Toast.makeText(e, b.pH, 1).show();
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!"com.google.android.apps.photos.pager.model.FindPositionTask".equals(s))
        {
            return;
        }
        if (mue1 == null || mue1.c())
        {
            if (mue1 == null)
            {
                s = null;
            } else
            {
                s = mue1.c;
            }
            a(((Exception) (s)));
            return;
        } else
        {
            int j = mue1.a().getInt("position");
            s = (ekp)mue1.a().getParcelable("com.google.android.apps.photos.core.media");
            d.a(s, j, new fne(this, s));
            return;
        }
    }
}

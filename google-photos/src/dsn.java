// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.Collection;

public final class dsn extends omn
    implements mti
{

    private static final ekk ad = (new ekm()).a(gax).a();
    private mtj ae;
    private dgk ai;
    private iwx aj;
    private hyw ak;

    public dsn()
    {
    }

    public static dsn a(hyw hyw1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.allphotos.ui.actionconfirmation.medias", hyw1);
        hyw1 = new dsn();
        hyw1.f(bundle);
        return hyw1;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(b.jf, null);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ak = (hyw)super.q.getParcelable("com.google.android.apps.photos.allphotos.ui.actionconfirmation.medias");
        bundle = new eld(new ArrayList(ak.a), ad, p.e);
        ae.a(bundle);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!eld.a(p.e).equals(s))
        {
            return;
        }
        if (mue1 == null || mue1.c())
        {
            s = ai.a().a((int)dgh.b.c);
            s.d = g().getQuantityString(b.jh, ak.a.size(), new Object[] {
                Integer.valueOf(ak.a.size())
            });
            ai.a(s.a());
            a(false);
            return;
        } else
        {
            s = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
            aj.a(new hyw(s));
            a(false);
            return;
        }
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.c(bundle);
        bundle.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        bundle.setCanceledOnTouchOutside(false);
        bundle.requestWindowFeature(1);
        return bundle;
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ae = ((mtj)ag.a(mtj)).a(this);
        ai = (dgk)ag.a(dgk);
        aj = (iwx)ag.a(iwx);
    }

}

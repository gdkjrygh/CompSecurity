// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class omn extends oqa
    implements olp
{

    private opi ad;
    public final olq af = new olq();
    public final olm ag;

    public omn()
    {
        ag = af.a;
    }

    static oow a(omn omn1)
    {
        return omn1.ah;
    }

    public Context G_()
    {
        return af;
    }

    public final void a(Activity activity)
    {
        olm olm1 = olm.a(activity, super.E);
        af.a(activity);
        af.a(olm1);
        ag.b = getClass().getName();
        super.a(activity);
    }

    public void a(Bundle bundle)
    {
        i(bundle);
        for (Iterator iterator = ag.c(omw).iterator(); iterator.hasNext(); ((omw)iterator.next()).a(this, ah, ag)) { }
        ag.a();
        ad = ah.a(new omo(this, bundle));
        super.a(bundle);
    }

    public final olm ai_()
    {
        return ag;
    }

    public final LayoutInflater b(Bundle bundle)
    {
        super.b(bundle);
        return LayoutInflater.from(af);
    }

    public void i(Bundle bundle)
    {
        ag.a(new omv(this, ah));
    }

    public void n()
    {
        ah.b(ad);
        super.n();
    }
}

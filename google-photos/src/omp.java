// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class omp extends oqb
    implements olp
{

    private opi a;
    public final olq ad = new olq();
    public final olm ae;

    public omp()
    {
        ae = ad.a;
    }

    static oow a(omp omp1)
    {
        return omp1.af;
    }

    public final Context G_()
    {
        return ad;
    }

    public void a(Activity activity)
    {
        olm olm1 = olm.a(activity, super.E);
        ad.a(activity);
        ad.a(olm1);
        ae.b = getClass().getName();
        super.a(activity);
    }

    public void a(Bundle bundle)
    {
        c(bundle);
        for (Iterator iterator = ae.c(omw).iterator(); iterator.hasNext(); ((omw)iterator.next()).a(this, af, ae)) { }
        ae.a();
        a = af.a(new omq(this, bundle));
        super.a(bundle);
    }

    public final olm ai_()
    {
        return ae;
    }

    public final LayoutInflater b(Bundle bundle)
    {
        super.b(bundle);
        return LayoutInflater.from(ad);
    }

    public void c(Bundle bundle)
    {
        ae.a(new omv(this, af));
    }

    public void n()
    {
        af.b(a);
        super.n();
    }
}

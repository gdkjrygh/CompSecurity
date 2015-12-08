// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class ibq extends omp
    implements nzu
{

    private oac a;
    private ics b;
    private int c;
    private boolean d;
    private PreferenceCategory e;
    private ibw f;
    private oay g;
    private ibz h;

    public ibq()
    {
        new nzt(this, af);
    }

    static int a(ibq ibq1)
    {
        return ibq1.c;
    }

    static boolean a(ibq ibq1, boolean flag)
    {
        ibq1.d = flag;
        return flag;
    }

    static ics b(ibq ibq1)
    {
        return ibq1.b;
    }

    static boolean c(ibq ibq1)
    {
        return ibq1.d;
    }

    static ibw d(ibq ibq1)
    {
        return ibq1.f;
    }

    static PreferenceCategory e(ibq ibq1)
    {
        return ibq1.e;
    }

    static oay f(ibq ibq1)
    {
        return ibq1.g;
    }

    static ibz g(ibq ibq1)
    {
        return ibq1.h;
    }

    static olq h(ibq ibq1)
    {
        return ibq1.ad;
    }

    static olq i(ibq ibq1)
    {
        return ibq1.ad;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return super.a(layoutinflater, viewgroup, bundle);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        c = ((mmr)ae.a(mmr)).d();
        b = (ics)ae.a(ics);
        h = (ibz)ae.a(ibz);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
    }

    public final void r()
    {
        if (a == null)
        {
            a = new oac(ad);
        }
        e = a.a(p.bh);
        e.b(8);
        Object obj2 = new ibw(ad);
        obj2.b = true;
        obj2.c = true;
        obj2.a = 2;
        ((ibw) (obj2)).b(a(p.bv));
        String s = b.b(c);
        Object obj = RingtoneManager.getRingtone(ad, android.provider.Settings.System.DEFAULT_NOTIFICATION_URI);
        if (s == null && obj != null)
        {
            ((ibw) (obj2)).a_(((Ringtone) (obj)).getTitle(ad));
            ((ibw) (obj2)).a(android.provider.Settings.System.DEFAULT_NOTIFICATION_URI.toString());
        } else
        if ("no_ringtone".equals(s) || s == null)
        {
            ((ibw) (obj2)).c(p.bu);
            ((ibw) (obj2)).a(null);
        } else
        {
            Object obj1 = RingtoneManager.getRingtone(ad, Uri.parse(s));
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = ((Ringtone) (obj1)).getTitle(ad);
            }
            ((ibw) (obj2)).a(s);
            ((ibw) (obj2)).a_(((CharSequence) (obj1)));
        }
        obj2.j = new ibs(this);
        f = ((ibw) (obj2));
        f.b(2);
        obj = a.c(a(p.bw), null);
        ((oay) (obj)).a(Boolean.valueOf(b.c(c)));
        obj.j = new ibt(this);
        g = ((oay) (obj));
        g.b(3);
        obj = e;
        obj2 = a.c(a(p.bi), null);
        ((oay) (obj2)).a(Boolean.valueOf(b.a(c)));
        ((oay) (obj2)).b(1);
        obj2.j = new ibr(this);
        ((PreferenceCategory) (obj)).b(((nzw) (obj2)));
        e.b(f);
        e.b(g);
        d = true;
    }
}

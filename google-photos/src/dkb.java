// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import java.util.Map;
import java.util.Set;

class dkb
    implements ekv, eyv, gly
{

    private static final ekz a;
    private final Context b;
    private final erj c;
    private final eli d;
    private final emg e;
    private final elg f;
    private final gmd g;
    private final eyu h;

    public dkb(Context context, erj erj1, drw drw, doo doo)
    {
        this(context, erj1, (new eli()).a(iyj, new dka(context)).a(iyi, new djy(context)).a(gud, new dkr(context)).a(fkw, new djm(drw)).a(dle, new dnw(context)).a(gsj, new dji(context)), (new emg()).a(new djz(context, a(context))), (new elg()).a(new djr(context, drw)).a(new dnu(context, drw, doo)).a(new dmv(context, drw)).a(new doi(drw)).a(new dni(context, drw)).a(new dlj(context, drw)).a(new dlu(context, drw)).a(new dmd(context, a(context))), (new gmd()).a(new dmv(context, drw)).a(new dmy(context)).a(new dmx(context)), (new eyu()).a(new dnp(context)).a(new djw(context)).a(new dmk(context)).a(new dmp(context)));
    }

    private dkb(Context context, erj erj1, eli eli1, emg emg1, elg elg1, gmd gmd1, eyu eyu1)
    {
        b = context;
        c = erj1;
        d = eli1;
        e = emg1;
        f = elg1;
        g = gmd1;
        h = eyu1;
    }

    private static elp a(Context context)
    {
        return new elp(context, dkl);
    }

    public final long a(ehr ehr1)
    {
        return a(ehr1.a, ehr1.b);
    }

    public final long a(ekq ekq, ekw ekw1)
    {
        return f.a(ekq, ekw1);
    }

    public final ejy a(Class class1)
    {
        return d.a(class1);
    }

    public final elb a(ehr ehr1, int i)
    {
        return g.a(ehr1, i);
    }

    public final elb a(ehr ehr1, Object obj)
    {
        obj = (ekp)obj;
        return g.a(ehr1, ((ekp) (obj)));
    }

    public final elb a(ehr ehr1, Object obj, int i, int j, ekk ekk)
    {
        obj = (ekp)obj;
        if (!a.a(ehr1.b))
        {
            ehr1 = String.valueOf(ehr1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ehr1).length() + 20)).append("Unsupported options ").append(ehr1).toString());
        }
        eky eky1 = new eky();
        eky1.a = j;
        eky1.f = ((ekp) (obj));
        eky1.c = i;
        obj = eky1.a(ehr1.b.f);
        if (ehr1.b.g)
        {
            obj.h = true;
        }
        return a(ehr1.a, ((eky) (obj)).a(), ekk);
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        ekg = (ekp)ekg;
        return e.a(ekg, ekk);
    }

    public final elb a(ekq ekq, ekw ekw1, ekk ekk)
    {
        return f.a(ekq, ekw1, ekk);
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final void a(ekp ekp1, ContentObserver contentobserver)
    {
        if (!(ekp1 instanceof djo))
        {
            throw new IllegalArgumentException("Cannot register an observer for anything other than an AllPhotosMedia");
        } else
        {
            ekp1 = (djo)ekp1;
            b.getContentResolver().registerContentObserver(erj.a(((djo) (ekp1)).a), false, contentobserver);
            return;
        }
    }

    public final boolean a(ekq ekq)
    {
        return g.a.containsKey(ekq.getClass());
    }

    public final boolean a(ekq ekq, ekw ekw1, Set set)
    {
        return h.a(ekq).b(ekq, ekw1, set);
    }

    public final elb b(ekq ekq, ekw ekw1, Set set)
    {
        return h.a(ekq, ekw1, set);
    }

    public final void b(ekp ekp1, ContentObserver contentobserver)
    {
        if (!(ekp1 instanceof djo))
        {
            throw new IllegalArgumentException("Cannot register an observer for anything other than an AllPhotosMedia");
        } else
        {
            b.getContentResolver().unregisterContentObserver(contentobserver);
            return;
        }
    }

    static 
    {
        ela ela1 = new ela();
        ela1.c = true;
        ela1.d = true;
        a = ela1.a();
    }
}

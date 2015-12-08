// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;

public final class izi
    implements ekv
{

    private final Context a;
    private final erj b;
    private final eli c;
    private final emg d;
    private final elg e;

    public izi(Context context, erj erj1, drw drw)
    {
        this(context, erj1, (new eli()).a(iyi, new izf(context)).a(iyl, new izj(context)), (new emg()).a(new izh(context, new elp(context, iyx))), (new elg()).a(new izc(context, drw)));
    }

    private izi(Context context, erj erj1, eli eli1, emg emg1, elg elg1)
    {
        a = context;
        b = erj1;
        c = eli1;
        d = emg1;
        e = elg1;
    }

    public final long a(ekq ekq, ekw ekw)
    {
        return e.a(ekq, ekw);
    }

    public final ejy a(Class class1)
    {
        return c.a(class1);
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        ekg = (ekp)ekg;
        return d.a(ekg, ekk);
    }

    public final elb a(ekq ekq, ekw ekw, ekk ekk)
    {
        return e.a(ekq, ekw, ekk);
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.trash.data.TrashCore";
    }

    public final void a(ekp ekp1, ContentObserver contentobserver)
    {
        if (!(ekp1 instanceof iyy))
        {
            throw new IllegalArgumentException("Cannot register an observer for anything other than an TrashMedia");
        } else
        {
            ekp1 = (iyy)ekp1;
            a.getContentResolver().registerContentObserver(erj.a(((iyy) (ekp1)).a), false, contentobserver);
            return;
        }
    }

    public final void b(ekp ekp1, ContentObserver contentobserver)
    {
        if (!(ekp1 instanceof iyy))
        {
            throw new IllegalArgumentException("Cannot register an observer for anything other than an AllPhotosMedia");
        } else
        {
            a.getContentResolver().unregisterContentObserver(contentobserver);
            return;
        }
    }
}

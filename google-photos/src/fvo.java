// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.ContentObserver;

final class fvo
    implements ekv
{

    private final fvg a;
    private final eli b;
    private final emg c;
    private final elg d;

    public fvo(Context context, fvg fvg1)
    {
        a = fvg1;
        c = (new emg()).a(new fvn(context, fvg1.b));
        d = (new elg()).a(new fvd(context, fvg1.b));
        b = (new eli()).a(gud, new fvr(context)).a(iyi, new fvj(context)).a(fkw, new fut(context));
    }

    public final long a(ekq ekq, ekw ekw)
    {
        return d.a(ekq, ekw);
    }

    public final ejy a(Class class1)
    {
        return b.a(class1);
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        ekg = (ekp)ekg;
        return c.a(ekg, ekk);
    }

    public final elb a(ekq ekq, ekw ekw, ekk ekk)
    {
        return d.a(ekq, ekw, ekk);
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.localmedia.core.LocalMediaCore";
    }

    public final void a(ekp ekp1, ContentObserver contentobserver)
    {
        fvg fvg1 = a;
        fvg.a(ekp1);
        fvg1.b.a(contentobserver);
    }

    public final void b(ekp ekp1, ContentObserver contentobserver)
    {
        fvg fvg1 = a;
        fvg.a(ekp1);
        fvg1.b.b(contentobserver);
    }
}

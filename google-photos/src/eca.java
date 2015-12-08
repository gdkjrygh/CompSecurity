// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;

final class eca
    implements ekv
{

    static final onh a = new onh("debug.photos.assistant.dogfood");
    private final Context b;
    private final emg c;
    private final elg d;
    private final eli e;

    eca(Context context)
    {
        b = context;
        ebr ebr1 = new ebr(context);
        c = (new emg()).a(new ebq(new elp(context, ebn), ebr1));
        d = (new elg()).a(new ebx(context, ebr1)).a(new ecm(context));
        e = (new eli()).a(gsj, new ebd(context)).a(fkw, new ebs(context)).a(dle, new eby());
    }

    public final long a(ekq ekq, ekw ekw)
    {
        return d.a(ekq, ekw);
    }

    public final ejy a(Class class1)
    {
        return e.a(class1);
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
        return "com.google.android.apps.photos.assistant.remote.provider";
    }

    public final void a(ekp ekp1, ContentObserver contentobserver)
    {
        b.getContentResolver().registerContentObserver(nsw.a, true, contentobserver);
    }

    public final void b(ekp ekp1, ContentObserver contentobserver)
    {
        b.getContentResolver().unregisterContentObserver(contentobserver);
    }

}

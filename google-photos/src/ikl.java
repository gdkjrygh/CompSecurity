// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;

public final class ikl
    implements ekv
{

    private final Context a;
    private final elg b;
    private final emg c;
    private final eli d = new eli();

    public ikl(Context context, est est)
    {
        elp elp1 = new elp(context, ikj);
        a = context;
        b = (new elg()).a(new ikh(context, elp1));
        c = (new emg()).a(new ikk(est, elp1));
    }

    public final long a(ekq ekq, ekw ekw)
    {
        return b.a(ekq, ekw);
    }

    public final ejy a(Class class1)
    {
        return d.a(class1);
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        ekg = (ekp)ekg;
        return c.a(ekg, ekk);
    }

    public final elb a(ekq ekq, ekw ekw, ekk ekk)
    {
        return b.a(ekq, ekw, ekk);
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.sharedmedia.SharedCore";
    }

    public final void a(ekp ekp1, ContentObserver contentobserver)
    {
        if (ekp1 instanceof ikb)
        {
            ContentResolver contentresolver = a.getContentResolver();
            ekp1 = (ikb)ekp1;
            if (((ikb) (ekp1)).e != null)
            {
                contentresolver.registerContentObserver(eum.a(((ikb) (ekp1)).a, ((ikd)((ikb) (ekp1)).e).b), false, contentobserver);
            }
            return;
        } else
        {
            ekp1 = String.valueOf(ekp1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekp1).length() + 29)).append("Cannot register observer for ").append(ekp1).toString());
        }
    }

    public final void b(ekp ekp1, ContentObserver contentobserver)
    {
        if (ekp1 instanceof ikb)
        {
            a.getContentResolver().unregisterContentObserver(contentobserver);
            return;
        } else
        {
            ekp1 = String.valueOf(ekp1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekp1).length() + 31)).append("Cannot unregister observer for ").append(ekp1).toString());
        }
    }
}

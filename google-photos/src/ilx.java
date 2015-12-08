// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;

public final class ilx
    implements ekv
{

    private final Context a;
    private final elg b;
    private final emg c;
    private final eli d = new eli();

    public ilx(Context context)
    {
        a = context;
        context = new elp(context, ilq);
        b = (new elg()).a(new ilw(context));
        c = (new emg()).a(new ilr(context));
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
        return "SingleMediaItemCore";
    }

    public final void a(ekp ekp1, ContentObserver contentobserver)
    {
        if (ekp1 instanceof ils)
        {
            ekp1 = (ils)ekp1;
            a.getContentResolver().registerContentObserver(Uri.parse(((ils) (ekp1)).a.a()), false, contentobserver);
            return;
        } else
        {
            ekp1 = String.valueOf(ekp1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekp1).length() + 29)).append("Cannot register observer for ").append(ekp1).toString());
        }
    }

    public final void b(ekp ekp1, ContentObserver contentobserver)
    {
        if (ekp1 instanceof ils)
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

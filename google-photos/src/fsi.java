// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.util.Calendar;
import java.util.Locale;

public final class fsi
{

    public final Calendar a = ivc.a();
    private final String b;
    private final boolean c;
    private String d;
    private Context e;

    public fsi(Context context, Calendar calendar, boolean flag)
    {
        c = flag;
        e = context;
        if (calendar.getTimeInMillis() == 0L)
        {
            a.setTimeInMillis(0L);
        } else
        {
            a.set(calendar.get(1), calendar.get(2), 1);
        }
        b = context.getResources().getString(b.qg);
    }

    public final String toString()
    {
        if (a.getTimeInMillis() != 0L)
        {
            if (d == null)
            {
                ewz ewz1 = (ewz)olm.a(e, ewz);
                long l = a.getTimeInMillis();
                int i;
                if (c)
                {
                    i = exa.f;
                } else
                {
                    i = exa.g;
                }
                d = ewz1.a(l, i).toUpperCase(Locale.getDefault());
            }
            return d;
        } else
        {
            return b;
        }
    }
}

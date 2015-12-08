// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class hwn
    implements android.view.View.OnClickListener
{

    private hwq a;
    private hwp b;
    private Context c;
    private hwm d;

    hwn(hwm hwm1, hwq hwq1, hwp hwp1, Context context)
    {
        d = hwm1;
        a = hwq1;
        b = hwp1;
        c = context;
        super();
    }

    public final void onClick(View view)
    {
        a.a(view, 4);
        b.a(d.a);
        if (d.a.a() == hsw.a)
        {
            a.u();
            a.t();
            if (c.b(c))
            {
                int i;
                if (d.a.at_())
                {
                    i = c.fl;
                } else
                {
                    i = c.fi;
                }
                hwm.a(d, a.a, c.getString(i, new Object[] {
                    d.a.c()
                }));
            }
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class hwo
    implements android.view.View.OnLongClickListener
{

    private hwq a;
    private Context b;
    private hwp c;
    private hwm d;

    hwo(hwm hwm1, hwq hwq1, Context context, hwp hwp1)
    {
        d = hwm1;
        a = hwq1;
        b = context;
        c = hwp1;
        super();
    }

    public final boolean onLongClick(View view)
    {
        a.a(view, 31);
        if (d.a.a() == hsw.a)
        {
            a.u();
            a.t();
            if (c.b(b))
            {
                hwm.a(d, a.a, b.getString(c.ff));
            }
        }
        return c.b(d.a);
    }
}

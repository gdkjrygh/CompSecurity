// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

public final class hup
    implements hgo
{

    final hrr a;
    private final int b;
    private final Context c;
    private final hrs d;

    public hup(Context context, hrr hrr1, int i)
    {
        a = hrr1;
        b = i;
        c = context;
        d = (hrs)olm.a(context, hrs);
    }

    public final int a()
    {
        return au.F;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn)
    {
        afn = (hus)afn;
        d.a(((hus) (afn)).o, a.as_(), b);
        if (a.ar_() == -1L)
        {
            ((hus) (afn)).p.setText(b.xU);
            ((hus) (afn)).p.setTextColor(c.getResources().getColor(aa.H));
            ((hus) (afn)).q.setText(b.xT);
            hur hur1 = (hur)olm.a(c, hur);
            ((hus) (afn)).a.setOnClickListener(new msj(new huq(this, afn, hur1)));
            b.a(((hus) (afn)).a, new msm(pwy.a));
            return;
        } else
        {
            ((hus) (afn)).p.setText(a.c());
            ((hus) (afn)).p.setTextColor(c.getResources().getColor(aa.G));
            ((hus) (afn)).q.setVisibility(8);
            return;
        }
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return (long)(-a.b());
    }
}

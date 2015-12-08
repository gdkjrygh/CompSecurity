// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bfr
    implements android.view.View.OnClickListener
{

    private bdv a;
    private int b;
    private bfo c;

    bfr(bfo bfo1, bdv bdv1, int i)
    {
        c = bfo1;
        a = bdv1;
        b = i;
        super();
    }

    public final void onClick(View view)
    {
        view = bfo.a(c);
        if (((bem) (view)).c.a != bdp.c)
        {
            view.c(3);
            mry.a(((bem) (view)).ad, 4, (new msn()).a(new msm(pwu.o)).a(new msm(pwu.r)).a(((bem) (view)).ad));
        } else
        {
            ((bem) (view)).c.j();
            view.b(1);
        }
        a.a(b, false);
    }
}

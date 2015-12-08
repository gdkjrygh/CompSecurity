// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bfq
    implements android.view.View.OnClickListener
{

    private bdv a;
    private int b;
    private bfo c;

    bfq(bfo bfo1, bdv bdv1, int i)
    {
        c = bfo1;
        a = bdv1;
        b = i;
        super();
    }

    public final void onClick(View view)
    {
        view = bfo.a(c);
        if (((bem) (view)).c.a != bdp.b)
        {
            if (((bem) (view)).c.a == bdp.c)
            {
                ((bem) (view)).c.j();
            }
            view.d(3);
            mry.a(((bem) (view)).ad, 4, (new msn()).a(new msm(pwu.B)).a(new msm(pwu.r)).a(((bem) (view)).ad));
        } else
        {
            view.b(1);
        }
        a.a(b, false);
    }
}

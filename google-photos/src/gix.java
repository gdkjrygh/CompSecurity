// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.ViewPager;
import android.view.View;

final class gix
    implements android.view.View.OnClickListener
{

    private giw a;

    gix(giw giw1)
    {
        a = giw1;
        super();
    }

    public final void onClick(View view)
    {
        view = a;
        am am = ((giw) (view)).a.b();
        mry.a(((giw) (view)).ad, 4, (new msn()).a(new msm(pww.b)).a(((giw) (view)).ad, am));
        if (view.t())
        {
            gie gie1 = (gie)((giw) (view)).ae.b(gie);
            if (gie1 != null)
            {
                gie1.b.c().a().a(gie1.d()).b();
                gie1.b.c().b();
                gie1.h.c();
                if (gie1.j)
                {
                    gie1.f();
                }
                gie1.d.a();
                gie1.c.b();
                return;
            } else
            {
                view.O_().setResult(-1);
                view.O_().finish();
                return;
            }
        } else
        {
            ViewPager viewpager = ((giw) (view)).b;
            int i = ((giw) (view)).b.c;
            viewpager.a(view.s() + i, true);
            return;
        }
    }
}

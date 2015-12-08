// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class giq
    implements android.view.View.OnClickListener
{

    private gip a;

    giq(gip gip1)
    {
        a = gip1;
        super();
    }

    public final void onClick(View view)
    {
        if (!b.w(gip.a(a)))
        {
            view = a.h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.E;
            nuo.a(view, nuq1);
            return;
        }
        if (gip.b(a))
        {
            gip.a(a, true);
            if (b.a(gip.c(a), null).isEmpty())
            {
                gip.d(a).a(a);
                return;
            } else
            {
                gip.e(a);
                return;
            }
        }
        gip.a(a, true);
        if (!gip.f(a).a("onboarding_prepare_accounts"))
        {
            gip.f(a).a(new gim(false));
        }
        gip.g(a);
    }
}

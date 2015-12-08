// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.view.View;

final class itw
    implements android.view.View.OnClickListener
{

    private itf a;

    itw(itf itf1)
    {
        a = itf1;
        super();
    }

    public final void onClick(View view)
    {
        if (itf.l(a) != null && itf.m(a) != null)
        {
            view = a.O_();
            gne gne1 = (new gne(view, itf.n(a).d())).a(itf.l(a)).a(itf.m(a)).c(true).e(true).f(true).g(true).b(true).d(true).a(false).h(true);
            int i = s.aG;
            gne1.a.putExtra("back_exit_animation_id", i);
            gne1.a.putExtra("back_enter_animation_id", 0);
            view.startActivity(gne1.a);
            view.overridePendingTransition(s.aF, 0);
            return;
        } else
        {
            itf.o(a).a();
            return;
        }
    }
}

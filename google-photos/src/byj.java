// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class byj
    implements android.view.View.OnClickListener
{

    private byh a;

    public byj(byh byh1)
    {
        a = byh1;
        super();
    }

    public final void onClick(View view)
    {
        if (byh.e(a).b == -1L)
        {
            return;
        }
        view = byh.a(a).d(byh.a(a).a(byh.e(a).b)).d;
        if (view == cnt.c || view == cnt.a)
        {
            long l;
            if (view == cnt.c)
            {
                view = byh.d();
            } else
            {
                view = byh.e();
            }
            mry.a(byh.i(a), 21, (new msn()).a(view).a(byh.f()));
        }
        ((dcj)byh.d(a).a(dcj)).a();
        l = byh.e(a).b;
        byh.a(a, new long[] {
            l
        });
    }
}

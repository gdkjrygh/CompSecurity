// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class byt
    implements android.view.View.OnClickListener
{

    private byh a;

    public byt(byh byh1)
    {
        a = byh1;
        super();
    }

    public final void onClick(View view)
    {
        if (byh.e(a).b == -1L)
        {
            return;
        } else
        {
            ((dcj)byh.d(a).a(dcj)).a();
            view = byh.a(a).d(byh.a(a).a(byh.e(a).b));
            int i = byh.a(a).a(view);
            byh.g(a).a(i);
            byh.b(a);
            return;
        }
    }
}

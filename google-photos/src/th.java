// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.PopupWindow;

final class th
    implements Runnable
{

    final td a;

    th(td td1)
    {
        a = td1;
        super();
    }

    public final void run()
    {
        a.r.showAtLocation(a.q, 55, 0, 0);
        a.l();
        mk.c(a.q, 0.0F);
        a.t = mk.r(a.q).a(1.0F);
        a.t.a(new ti(this));
    }
}

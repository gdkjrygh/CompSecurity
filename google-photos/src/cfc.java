// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class cfc
    implements android.view.View.OnClickListener
{

    private cfb a;

    cfc(cfb cfb1, cfa cfa1)
    {
        a = cfb1;
        super();
    }

    public final void onClick(View view)
    {
        int i = a.w.d;
        int j = a.d();
        if (a.w.d == j)
        {
            a.w.d = -1;
            a.w.e = null;
        } else
        {
            a.w.d = j;
            a.w.e = (cqa)a.w.c.get(a.w.d);
            a.w.c(a.w.d);
        }
        a.w.c(i);
        cez.a(a.w.f).a(a.w.e);
    }
}

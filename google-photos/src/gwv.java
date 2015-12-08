// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;

final class gwv
    implements gpy
{

    private gwu a;

    gwv(gwu gwu1)
    {
        a = gwu1;
        super();
    }

    public final void a()
    {
        Object obj = gwu.a(a);
        android.view.View view;
        boolean flag;
        if (!gwu.a(a).a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((gqw) (obj)).b(flag);
        obj = gwu.b(a);
        view = ((am) (a)).R;
        if (((gqz) (obj)).b.a())
        {
            String s = ((gqz) (obj)).a.g().getString(c.dI);
            ((gqz) (obj)).c.a(s, view);
            return;
        } else
        {
            String s1 = ((gqz) (obj)).a.g().getString(c.dJ);
            ((gqz) (obj)).c.a(s1, view);
            return;
        }
    }
}

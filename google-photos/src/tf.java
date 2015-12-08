// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class tf
    implements mc
{

    private td a;

    tf(td td1)
    {
        a = td1;
        super();
    }

    public final or a(View view, or or1)
    {
        int i = or1.b();
        int j = td.b(a, i);
        or or2 = or1;
        if (i != j)
        {
            or2 = or1.a(or1.a(), j, or1.c(), or1.d());
        }
        return mk.a(view, or2);
    }
}

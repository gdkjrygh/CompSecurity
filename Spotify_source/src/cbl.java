// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class cbl extends cbn
{

    private final bkk a;
    private final String b;
    private final String c;

    public cbl(bkk bkk1, String s, String s1)
    {
        a = bkk1;
        b = s;
        c = s1;
    }

    public final String a()
    {
        return b;
    }

    public final void a(byb byb)
    {
        if (byb == null)
        {
            return;
        } else
        {
            a.b((View)bye.a(byb));
            return;
        }
    }

    public final String b()
    {
        return c;
    }

    public final void c()
    {
        a.y();
    }

    public final void d()
    {
        a.r();
    }
}

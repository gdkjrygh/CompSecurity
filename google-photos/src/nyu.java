// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class nyu extends nyt
{

    private qlw a;
    private boolean b;

    public nyu(Context context, nyg nyg, String s, qlw qlw1, qlw qlw2, String s1, String s2)
    {
        super(context, nyg, "POST", s, qlw2, s1, s2);
        a = qlw1;
    }

    private void c()
    {
        if (b)
        {
            return;
        } else
        {
            c(a);
            a(a);
            b = true;
            return;
        }
    }

    public void a(qlw qlw1)
    {
    }

    public void c(qlw qlw1)
    {
    }

    public final byte[] i()
    {
        c();
        return qlw.a(a);
    }

    public final String j()
    {
        c();
        return b.b(a);
    }
}

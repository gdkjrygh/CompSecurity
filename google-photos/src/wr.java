// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class wr
    implements oo
{

    private boolean a;
    private int b;
    private wq c;

    protected wr(wq wq1)
    {
        c = wq1;
        super();
        a = false;
    }

    public final wr a(ob ob, int i)
    {
        c.e = ob;
        b = i;
        return this;
    }

    public final void a(View view)
    {
        wq.a(c, 0);
        a = false;
    }

    public final void b(View view)
    {
        if (a)
        {
            return;
        } else
        {
            c.e = null;
            wq.b(c, b);
            return;
        }
    }

    public final void c(View view)
    {
        a = true;
    }
}

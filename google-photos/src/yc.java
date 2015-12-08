// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class yc
    implements oo
{

    private boolean a;
    private xx b;

    protected yc(xx xx1)
    {
        b = xx1;
        super();
        a = false;
    }

    public final void a(View view)
    {
        b.setVisibility(0);
        a = false;
    }

    public final void b(View view)
    {
        if (a)
        {
            return;
        } else
        {
            b.d = null;
            b.setVisibility(0);
            return;
        }
    }

    public final void c(View view)
    {
        a = true;
    }
}

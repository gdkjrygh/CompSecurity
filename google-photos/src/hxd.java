// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.View;

final class hxd
    implements Runnable
{

    private int a;
    private hxc b;

    hxd(hxc hxc1, int i)
    {
        b = hxc1;
        a = i;
        super();
    }

    public final void run()
    {
        View view = hxc.a(b).findViewById(c.eA);
        if (view != null)
        {
            view.setContentDescription(hxc.a(b).getString(c.fa));
        }
        view = hxc.a(b).findViewById(c.eG);
        if (view != null)
        {
            view.setContentDescription(hxc.a(b).getString(a));
        }
    }
}

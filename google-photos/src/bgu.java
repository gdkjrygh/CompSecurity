// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Iterator;
import java.util.List;

final class bgu
    implements Runnable
{

    private bgs a;

    bgu(bgs bgs1)
    {
        a = bgs1;
        super();
    }

    public final void run()
    {
        bgs.a(a, false);
        bgs.a(a).c(null);
        bgs.b(a).d();
        View view;
        for (Iterator iterator = bgs.c(a).iterator(); iterator.hasNext(); a.a(view))
        {
            view = (View)iterator.next();
        }

        a.a(bgs.d(a));
    }
}

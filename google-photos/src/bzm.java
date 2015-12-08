// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Iterator;
import java.util.List;

final class bzm
    implements Runnable
{

    private bzj a;

    bzm(bzj bzj1)
    {
        a = bzj1;
        super();
    }

    public final void run()
    {
        bzj.a(a, false);
        if (bzj.b(a) != null)
        {
            bzj.b(a).d();
        }
        View view;
        for (Iterator iterator = bzj.c(a).iterator(); iterator.hasNext(); a.a(view))
        {
            view = (View)iterator.next();
        }

        a.a(bzj.d(a));
    }
}

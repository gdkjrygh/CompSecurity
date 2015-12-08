// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Iterator;
import java.util.List;

final class bzl
    implements Runnable
{

    private boolean a;
    private bzj b;

    bzl(bzj bzj1, boolean flag)
    {
        b = bzj1;
        a = flag;
        super();
    }

    public final void run()
    {
        bzj.a(b, true);
        if (bzj.b(b) != null)
        {
            bzj.b(b).e();
        }
        View view;
        for (Iterator iterator = bzj.c(b).iterator(); iterator.hasNext(); b.b(view))
        {
            view = (View)iterator.next();
        }

        if (!a)
        {
            b.b(bzj.d(b));
            return;
        } else
        {
            b.a(bzj.d(b));
            return;
        }
    }
}

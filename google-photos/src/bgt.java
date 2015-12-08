// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Iterator;
import java.util.List;

final class bgt
    implements Runnable
{

    private boolean a;
    private bgs b;

    bgt(bgs bgs1, boolean flag)
    {
        b = bgs1;
        a = flag;
        super();
    }

    public final void run()
    {
        bgs.a(b, true);
        bgs.a(b).b(null);
        bgs.b(b).e();
        View view;
        for (Iterator iterator = bgs.c(b).iterator(); iterator.hasNext(); b.b(view))
        {
            view = (View)iterator.next();
        }

        if (!a)
        {
            b.b(bgs.d(b));
            return;
        } else
        {
            b.a(bgs.d(b));
            return;
        }
    }
}

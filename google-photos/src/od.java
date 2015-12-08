// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.lang.ref.WeakReference;

final class od
    implements Runnable
{

    private WeakReference a;
    private ob b;
    private oc c;

    od(oc oc1, ob ob, View view)
    {
        c = oc1;
        super();
        a = new WeakReference(view);
        b = ob;
    }

    public final void run()
    {
        View view = (View)a.get();
        if (view != null)
        {
            c.c(b, view);
        }
    }
}

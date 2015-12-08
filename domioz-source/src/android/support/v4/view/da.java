// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            cz, cy

final class da
    implements Runnable
{

    WeakReference a;
    cy b;
    final cz c;

    private da(cz cz1, cy cy, View view)
    {
        c = cz1;
        super();
        a = new WeakReference(view);
        b = cy;
    }

    da(cz cz1, cy cy, View view, byte byte0)
    {
        this(cz1, cy, view);
    }

    public final void run()
    {
        View view = (View)a.get();
        if (view != null)
        {
            cz.a(c, b, view);
        }
    }
}

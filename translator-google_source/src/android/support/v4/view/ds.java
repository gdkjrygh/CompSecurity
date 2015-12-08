// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            dr, dq

final class ds
    implements Runnable
{

    WeakReference a;
    dq b;
    final dr c;

    ds(dr dr1, dq dq, View view)
    {
        c = dr1;
        super();
        a = new WeakReference(view);
        b = dq;
    }

    public final void run()
    {
        View view = (View)a.get();
        if (view != null)
        {
            c.e(b, view);
        }
    }
}

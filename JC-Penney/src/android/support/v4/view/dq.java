// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            dp, dn, do

class dq
    implements Runnable
{

    WeakReference a;
    dn b;
    final dp c;

    private dq(dp dp1, dn dn, View view)
    {
        c = dp1;
        super();
        a = new WeakReference(view);
        b = dn;
    }

    dq(dp dp1, dn dn, View view, do do1)
    {
        this(dp1, dn, view);
    }

    public void run()
    {
        View view = (View)a.get();
        if (view != null)
        {
            dp.a(c, b, view);
        }
    }
}

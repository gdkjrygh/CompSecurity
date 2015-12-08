// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            af

final class <init>
    implements Runnable
{

    WeakReference a;
    af b;
    final b c;

    public final void run()
    {
        View view = (View)a.get();
        if (view != null)
        {
            c.c(b, view);
        }
    }

    private ( , af af1, View view)
    {
        c = ;
        super();
        a = new WeakReference(view);
        b = af1;
    }

    b(b b1, af af1, View view, byte byte0)
    {
        this(b1, af1, view);
    }
}

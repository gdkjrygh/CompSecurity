// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.dp;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ba

final class bc extends dp
{

    final ba a;
    private boolean b;

    bc(ba ba1)
    {
        a = ba1;
        super();
        b = false;
    }

    public final void b(View view)
    {
        if (!b)
        {
            ba.a(a).setVisibility(8);
        }
    }

    public final void c(View view)
    {
        b = true;
    }
}

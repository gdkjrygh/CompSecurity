// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.do;
import android.support.v4.view.dp;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view:
//            i

final class j extends dp
{

    final i a;
    private boolean b;
    private int c;

    j(i k)
    {
        a = k;
        super();
        b = false;
        c = 0;
    }

    public final void a(View view)
    {
        if (!b)
        {
            b = true;
            if (i.a(a) != null)
            {
                i.a(a).a(null);
                return;
            }
        }
    }

    public final void b(View view)
    {
        int k = c + 1;
        c = k;
        if (k == i.c(a).size())
        {
            if (i.a(a) != null)
            {
                i.a(a).b(null);
            }
            c = 0;
            b = false;
            i.b(a);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.aj;
import android.support.v4.view.ak;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view:
//            f

final class c extends ak
{

    final f a;
    private boolean b;
    private int c;

    public final void a(View view)
    {
        if (!b)
        {
            b = true;
            if (f.a(a) != null)
            {
                f.a(a).a(null);
                return;
            }
        }
    }

    public final void b(View view)
    {
        int i = c + 1;
        c = i;
        if (i == f.c(a).size())
        {
            if (f.a(a) != null)
            {
                f.a(a).b(null);
            }
            c = 0;
            b = false;
            f.b(a);
        }
    }

    (f f1)
    {
        a = f1;
        super();
        b = false;
        c = 0;
    }
}

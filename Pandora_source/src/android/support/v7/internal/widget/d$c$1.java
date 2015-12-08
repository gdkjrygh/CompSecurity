// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            d, c

class a
    implements a
{

    final d a;
    final b b;

    public void a(c c1, View view, int i, long l)
    {
        b.b.a(i);
        if (b.b.t != null)
        {
            b.b.a(view, i, b(b).getItemId(i));
        }
        b.b();
    }

    ( , d d1)
    {
        b = ;
        a = d1;
        super();
    }
}

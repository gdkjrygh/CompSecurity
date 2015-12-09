// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.app:
//            d, b, ac

final class g
    implements android.widget.AdapterView.OnItemClickListener
{

    final b a;
    final d b;

    g(d d1, b b1)
    {
        b = d1;
        a = b1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.u.onClick(android.support.v7.app.b.g(a), i);
        if (!b.E)
        {
            android.support.v7.app.b.g(a).dismiss();
        }
    }
}

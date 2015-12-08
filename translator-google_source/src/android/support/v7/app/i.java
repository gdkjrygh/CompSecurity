// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.app:
//            f, d, ai

public final class i
    implements android.widget.AdapterView.OnItemClickListener
{

    final d a;
    final f b;

    public i(f f1, d d1)
    {
        b = f1;
        a = d1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        b.u.onClick(a.b, j);
        if (!b.E)
        {
            a.b.dismiss();
        }
    }
}

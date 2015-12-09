// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.support.v4.widget.CursorAdapter;
import com.aviary.android.feather.sdk.widget.EffectThumbLayout;
import it.sephiroth.android.library.widget.HListView;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            f

class a
    implements Runnable
{

    final int a;
    final f b;

    public void run()
    {
        if (b.n() && b.z != null && b.a != null)
        {
            b.a.a();
            if (a >= b.a.getFirstVisiblePosition() && a < b.a.getLastVisiblePosition() && a < b.z.getCount())
            {
                android.view.View view = b.a.getChildAt(a - b.a.getFirstVisiblePosition());
                if (view != null && (view instanceof EffectThumbLayout))
                {
                    b.a.a(view, a, b.z.getItemId(a));
                    return;
                }
            }
        }
    }

    ut(f f1, int i)
    {
        b = f1;
        a = i;
        super();
    }
}

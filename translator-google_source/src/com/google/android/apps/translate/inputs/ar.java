// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.libraries.translate.e.o;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            aq

final class ar
    implements Runnable
{

    final aq a;

    ar(aq aq1)
    {
        a = aq1;
        super();
    }

    public final void run()
    {
        HorizontalScrollView horizontalscrollview = aq.b(a);
        int i;
        if (o.b && aq.a(a).getLayoutDirection() == 1)
        {
            i = -aq.a(a).getMeasuredWidth();
        } else
        {
            i = aq.a(a).getMeasuredWidth();
        }
        horizontalscrollview.smoothScrollBy(i, 0);
    }
}

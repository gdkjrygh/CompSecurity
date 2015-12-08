// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.c;

import android.view.View;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.e.l;

// Referenced classes of package com.roidapp.cloudlib.sns.c:
//            c

final class d
    implements android.view.View.OnClickListener
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final void onClick(View view)
    {
        if (a.getActivity() != null && !l.b(aj.a()))
        {
            l.a(a.getActivity(), null);
            return;
        } else
        {
            a.onRefresh();
            return;
        }
    }
}

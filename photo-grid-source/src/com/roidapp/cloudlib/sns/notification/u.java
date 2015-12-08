// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.view.View;
import com.roidapp.baselib.e.l;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            s

final class u
    implements android.view.View.OnClickListener
{

    final s a;

    u(s s1)
    {
        a = s1;
        super();
    }

    public final void onClick(View view)
    {
        if (!l.b(a.getActivity()))
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

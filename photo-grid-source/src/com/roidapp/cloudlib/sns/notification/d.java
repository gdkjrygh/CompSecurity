// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.view.View;
import com.roidapp.baselib.e.l;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            c, b

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
        l.a(a.a.getActivity(), null);
    }
}

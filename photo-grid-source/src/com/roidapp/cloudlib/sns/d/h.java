// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.d;

import android.view.View;
import com.roidapp.cloudlib.sns.af;

// Referenced classes of package com.roidapp.cloudlib.sns.d:
//            f

final class h
    implements android.view.View.OnClickListener
{

    final f a;

    h(f f1)
    {
        a = f1;
        super();
    }

    public final void onClick(View view)
    {
        if (af.a(a.getActivity(), "FeedPublic", view.getId()))
        {
            a.r();
        }
    }
}

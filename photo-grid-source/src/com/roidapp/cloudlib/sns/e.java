// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            d

final class e
    implements android.view.View.OnClickListener
{

    final String a;
    final d b;

    e(d d1, String s)
    {
        b = d1;
        a = s;
        super();
    }

    public final void onClick(View view)
    {
        if (b.isAdded() && b.getActivity() != null && !b.getActivity().isFinishing())
        {
            d.a(b.getActivity(), a);
            b.dismiss();
        }
    }
}

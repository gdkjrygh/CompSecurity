// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

// Referenced classes of package com.roidapp.cloudlib:
//            t, at

final class ac
    implements Runnable
{

    final t a;

    ac(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        if (a.getActivity() != null && !a.getActivity().isFinishing())
        {
            Toast.makeText(a.getActivity(), at.b, 0).show();
        }
    }
}

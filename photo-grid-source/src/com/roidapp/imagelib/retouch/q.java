// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.app.Dialog;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            m

final class q
    implements Runnable
{

    final Dialog a;
    final m b;

    q(m m1, Dialog dialog)
    {
        b = m1;
        a = dialog;
        super();
    }

    public final void run()
    {
        if (b.getActivity() != null)
        {
            a.cancel();
            m.p(b);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            bu, PhotoGridActivity, by

final class bw
    implements android.view.View.OnClickListener
{

    final bu a;

    bw(bu bu1)
    {
        a = bu1;
        super();
    }

    public final void onClick(View view)
    {
        if (bu.a(a).i)
        {
            return;
        } else
        {
            bu.a(a).a(bu.a(a).k);
            view = new by();
            view.a(bu.b(a), bu.c(a), bu.d(a));
            bu.a(a).a(0x7f0d03ec, view, "FragmentBgList");
            return;
        }
    }
}

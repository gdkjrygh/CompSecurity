// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            cd, PhotoGridActivity, ck, by

final class ce
    implements android.view.View.OnClickListener
{

    final cd a;

    ce(cd cd1)
    {
        a = cd1;
        super();
    }

    public final void onClick(View view)
    {
        if (!cd.a(a).i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (cd.b(a) != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (cd.a(a).b("FragmentBorder")) goto _L1; else goto _L3
_L3:
        cd.a(a).a(cd.a(a).k);
        view = new ck();
        cd.a(a).a(0x7f0d03ec, view, "FragmentBorder");
        return;
        if (cd.a(a).b("FragmentBgList")) goto _L1; else goto _L4
_L4:
        cd.a(a).a(cd.a(a).k);
        view = new by();
        view.a(cd.c(a), cd.d(a), cd.e(a));
        cd.a(a).a(0x7f0d03ec, view, "FragmentBgList");
        return;
    }
}

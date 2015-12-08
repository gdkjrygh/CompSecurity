// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import com.roidapp.photogrid.common.e;

// Referenced classes of package com.roidapp.photogrid.release:
//            nn

final class np
    implements android.view.View.OnClickListener
{

    final nn a;

    np(nn nn1)
    {
        a = nn1;
        super();
    }

    public final void onClick(View view)
    {
        nn.d(a);
        com.roidapp.photogrid.release.nn.e(a);
        e.a(a.getActivity(), nn.f(a), nn.g(a)).a();
    }
}

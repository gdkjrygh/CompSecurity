// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            oa, nn

final class nw
    implements android.view.View.OnClickListener
{

    final oa a;
    final nn b;

    nw(nn nn, oa oa1)
    {
        b = nn;
        a = oa1;
        super();
    }

    public final void onClick(View view)
    {
        a.a();
    }
}

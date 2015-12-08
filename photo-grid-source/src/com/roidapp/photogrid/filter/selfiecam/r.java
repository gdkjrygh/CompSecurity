// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            o

final class r
    implements android.view.View.OnClickListener
{

    final o a;

    r(o o1)
    {
        a = o1;
        super();
    }

    public final void onClick(View view)
    {
        o.a(a, view, o.f(a));
    }
}

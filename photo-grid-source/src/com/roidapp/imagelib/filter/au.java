// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.view.View;
import android.widget.FrameLayout;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.g;

// Referenced classes of package com.roidapp.imagelib.filter:
//            bd, at, aj

final class au
    implements bd
{

    final at a;

    au(at at1)
    {
        a = at1;
        super();
    }

    public final void a(IGroupInfo igroupinfo)
    {
        a.a.a((FrameLayout)a.a.g.findViewById(g.ay), igroupinfo);
    }
}

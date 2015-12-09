// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import com.jcp.adapters.cw;
import com.jcp.util.w;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            gh, gs

class go
    implements w
{

    final gh a;

    go(gh gh1)
    {
        a = gh1;
        super();
    }

    public void a(List list)
    {
        if (!gh.h(a).isEmpty())
        {
            gh.h(a).clear();
        }
        gh.h(a).addAll(list);
        gh.g(a).a(gh.h(a));
        if (gh.s(a) != null)
        {
            gh.s(a).a(gh.g(a).c());
        }
    }
}

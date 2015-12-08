// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import com.jcp.adapters.cw;
import com.jcp.views.PagingListView;

// Referenced classes of package com.jcp.fragments:
//            gh

class gp
    implements Runnable
{

    final int a;
    final gh b;

    gp(gh gh1, int i)
    {
        b = gh1;
        a = i;
        super();
    }

    public void run()
    {
        gh.g(b).a(a);
        gh.g(b).notifyDataSetChanged();
        gh.j(b).setSelection(a);
    }
}

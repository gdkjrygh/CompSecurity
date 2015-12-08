// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import com.jcp.c.n;
import com.jcp.storepickup.pojo.Page;
import com.jcp.views.PagingListView;
import com.jcp.views.z;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            gh

class gk
    implements z
{

    final gh a;

    gk(gh gh1)
    {
        a = gh1;
        super();
    }

    public void a()
    {
label0:
        {
            if (gh.f(a) != null && !gh.f(a).isEmpty())
            {
                int i = gh.q(a);
                if (i >= gh.f(a).size())
                {
                    break label0;
                }
                String s = ((Page)gh.f(a).get(i)).getUrl();
                gh.m(a).a(s, true);
            }
            return;
        }
        gh.j(a).a(false, null);
    }
}

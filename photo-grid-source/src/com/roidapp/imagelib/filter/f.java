// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter:
//            b, e, FilterListView, ab

final class f
    implements Runnable
{

    final List a;
    final e b;

    f(e e1, List list)
    {
        b = e1;
        a = list;
        super();
    }

    public final void run()
    {
        if (a != null && a.size() != 0)
        {
            int j = a.size();
            int i = 0;
            while (i < j) 
            {
                Object obj = (b)a.get(i);
                int k = ((b) (obj)).c;
                CloudGroupInfo cloudgroupinfo = ((b) (obj)).a;
                int l = ((b) (obj)).b;
                obj = FilterListView.a(b.a).a(cloudgroupinfo.c());
                if (obj != null)
                {
                    FilterListView.a(b.a).b(((com.roidapp.imagelib.filter.groupinfo.IGroupInfo) (obj)));
                }
                FilterListView.a(b.a).b(l + k, cloudgroupinfo);
                i++;
            }
        }
    }
}

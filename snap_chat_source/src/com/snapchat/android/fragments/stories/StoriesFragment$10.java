// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import vr;
import vs;
import vt;
import zk;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesFragment

final class b
    implements Runnable
{

    private List a;
    private int b;
    private StoriesFragment c;

    public final void run()
    {
        int i = c.f.indexOf(StoriesFragment.r(c));
        vs vs1 = StoriesFragment.r(c);
        List list = a;
        int j = b;
        list = vs1.a.a(list, j);
        vs1.b.clear();
        vs1.b.addAll(list);
        vs1.c.a(list);
        vs1.v_();
        StoriesFragment.s(c);
        j = c.f.indexOf(StoriesFragment.r(c));
        if (i < 0 && j >= 0)
        {
            c.d.d(j);
            if (j == 0 && StoriesFragment.t(c).computeVerticalScrollOffset() == 0)
            {
                StoriesFragment.t(c).a(0);
            }
        } else
        if (i >= 0 && j < 0)
        {
            c.d.e(i);
            return;
        }
    }

    (StoriesFragment storiesfragment, List list, int i)
    {
        c = storiesfragment;
        a = list;
        b = i;
        super();
    }
}

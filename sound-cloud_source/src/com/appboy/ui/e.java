// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.app.Activity;
import android.widget.ListView;
import com.appboy.c.a;
import com.appboy.c.b;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment, f

final class e
    implements b
{

    final ListView a;
    final AppboyFeedFragment b;

    e(AppboyFeedFragment appboyfeedfragment, ListView listview)
    {
        b = appboyfeedfragment;
        a = listview;
        super();
    }

    public final void trigger(Object obj)
    {
        obj = (a)obj;
        android.support.v4.app.FragmentActivity fragmentactivity = b.getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.runOnUiThread(new f(this, ((a) (obj))));
        }
    }
}

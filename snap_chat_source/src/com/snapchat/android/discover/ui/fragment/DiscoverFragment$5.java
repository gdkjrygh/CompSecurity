// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import java.util.List;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            DiscoverFragment

final class a
    implements Runnable
{

    private List a;
    private DiscoverFragment b;

    public final void run()
    {
        DiscoverFragment.a(b, a);
    }

    (DiscoverFragment discoverfragment, List list)
    {
        b = discoverfragment;
        a = list;
        super();
    }
}

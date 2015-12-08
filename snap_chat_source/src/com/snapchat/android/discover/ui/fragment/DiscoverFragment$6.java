// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import PG;
import android.content.Context;
import vM;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            DiscoverFragment

final class b extends vM
{

    final DiscoverFragment b;

    protected final void a(vM vm)
    {
        PG.a(new Runnable(vm) {

            private vM a;
            private DiscoverFragment._cls6 b;

            public final void run()
            {
                b.b.a(a);
            }

            
            {
                b = DiscoverFragment._cls6.this;
                a = vm;
                super();
            }
        });
    }

    _cls1.a(DiscoverFragment discoverfragment, Context context)
    {
        b = discoverfragment;
        super(context);
    }
}

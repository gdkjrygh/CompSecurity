// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import PG;
import android.content.Context;
import vM;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            DiscoverFragment

final class a
    implements Runnable
{

    private vM a;
    private a b;

    public final void run()
    {
        b.b.a(a);
    }

    ( , vM vm)
    {
        b = ;
        a = vm;
        super();
    }

    // Unreferenced inner class com/snapchat/android/discover/ui/fragment/DiscoverFragment$6

/* anonymous class */
    final class DiscoverFragment._cls6 extends vM
    {

        final DiscoverFragment b;

        protected final void a(vM vm)
        {
            PG.a(new DiscoverFragment._cls6._cls1(this, vm));
        }

            
            {
                b = discoverfragment;
                super(context);
            }
    }

}

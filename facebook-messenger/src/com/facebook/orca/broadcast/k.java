// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import android.view.View;

// Referenced classes of package com.facebook.orca.broadcast:
//            ComposeBroadcastFragment, q

class k
    implements android.view.View.OnClickListener
{

    final ComposeBroadcastFragment a;

    k(ComposeBroadcastFragment composebroadcastfragment)
    {
        a = composebroadcastfragment;
        super();
    }

    public void onClick(View view)
    {
        if (ComposeBroadcastFragment.a(a) != null)
        {
            ComposeBroadcastFragment.a(a).a();
        }
    }
}

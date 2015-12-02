// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.View;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class ac
    implements android.view.View.OnClickListener
{

    final ComposeFragment a;

    ac(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void onClick(View view)
    {
        if (ComposeFragment.j(a))
        {
            ComposeFragment.k(a);
            return;
        } else
        {
            ComposeFragment.l(a);
            return;
        }
    }
}

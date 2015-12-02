// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.View;
import com.facebook.orca.emoji.ah;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class ad
    implements android.view.View.OnClickListener
{

    final ComposeFragment a;

    ad(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void onClick(View view)
    {
        if (ComposeFragment.m(a))
        {
            com.facebook.orca.compose.ComposeFragment.a(a, "popup_dismiss_button");
            if (ComposeFragment.c(a) != null)
            {
                ComposeFragment.c(a).a();
                return;
            } else
            {
                ComposeFragment.n(a);
                return;
            }
        }
        if (((Boolean)ComposeFragment.o(a).b()).booleanValue())
        {
            com.facebook.orca.compose.ComposeFragment.a(a, "popup_open_button");
            ComposeFragment.p(a);
            return;
        } else
        {
            ComposeFragment.q(a);
            return;
        }
    }
}

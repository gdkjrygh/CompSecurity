// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.widget.ImageView;
import com.snapchat.android.ui.cash.CardExpiryEditText;
import com.snapchat.android.ui.cash.ZipEditText;
import sp;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CardLinkFragment

final class a
    implements sp
{

    private CardLinkFragment a;

    public final void a()
    {
        CardLinkFragment.a(a);
        CardLinkFragment.f(a).setVisibility(8);
    }

    public final void b()
    {
        if (!CardLinkFragment.c(a))
        {
            CardLinkFragment.g(a).requestFocus();
        }
        CardLinkFragment.f(a).setVisibility(0);
    }

    public final void c()
    {
        CardLinkFragment.d(a).requestFocus();
    }

    (CardLinkFragment cardlinkfragment)
    {
        a = cardlinkfragment;
        super();
    }
}

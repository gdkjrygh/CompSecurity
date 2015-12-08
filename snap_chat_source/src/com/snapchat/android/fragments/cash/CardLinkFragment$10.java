// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.view.View;
import com.snapchat.android.ui.cash.CardExpiryEditText;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CardLinkFragment

final class a
    implements android.view.
{

    private CardLinkFragment a;

    public final void onClick(View view)
    {
        CardLinkFragment.d(a).setText(null);
        CardLinkFragment.a(a, CardLinkFragment.d(a));
    }

    (CardLinkFragment cardlinkfragment)
    {
        a = cardlinkfragment;
        super();
    }
}

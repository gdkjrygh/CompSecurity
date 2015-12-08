// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Ij;
import com.snapchat.android.api2.cash.blockers.CardInputError;
import com.snapchat.android.ui.cash.CardExpiryEditText;
import com.snapchat.android.ui.cash.CardNumberEditText;
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
        Object obj = CardLinkFragment.b(a);
        boolean flag;
        if (((CardNumberEditText) (obj)).a().length() == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !Ij.a(((CardNumberEditText) (obj)).a()))
        {
            obj = CardInputError.INVALID_CARD_NUMBER;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            a.a(((CardInputError) (obj)));
        }
    }

    public final void b()
    {
        if (!CardLinkFragment.c(a))
        {
            CardLinkFragment.d(a).requestFocus();
        }
    }

    public final void c()
    {
    }

    (CardLinkFragment cardlinkfragment)
    {
        a = cardlinkfragment;
        super();
    }
}

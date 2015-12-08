// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.widget.ProgressBar;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.api2.cash.blockers.CardInputError;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CardLinkFragment

final class a
    implements Runnable
{

    private CardInputError a;
    private CardLinkFragment b;

    public final void run()
    {
        a[a.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 86
    //                   2 86
    //                   3 100
    //                   4 100
    //                   5 125;
           goto _L1 _L2 _L2 _L3 _L3 _L4
_L1:
        CardLinkFragment.e(b, a);
_L6:
        AnalyticsEvents.o(a.name());
        CardLinkFragment.j(b).setVisibility(8);
        CardLinkFragment.c(b);
        return;
_L2:
        CardLinkFragment.a(b, a);
        continue; /* Loop/switch isn't completed */
_L3:
        CardLinkFragment.b(b, a);
        CardLinkFragment.c(b, a);
        continue; /* Loop/switch isn't completed */
_L4:
        CardLinkFragment.d(b, a);
        if (true) goto _L6; else goto _L5
_L5:
    }

    (CardLinkFragment cardlinkfragment, CardInputError cardinputerror)
    {
        b = cardlinkfragment;
        a = cardinputerror;
        super();
    }
}

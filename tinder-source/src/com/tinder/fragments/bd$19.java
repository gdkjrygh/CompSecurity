// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.cards.CardStackLayout;
import com.tinder.views.RecCard;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements Runnable
{

    final bd a;

    public final void run()
    {
        if (bd.b(a).getVisibility() == 0 && bd.c(a) != null)
        {
            bd.c(a).onPushedToTopOfStack();
        }
    }

    ayout(bd bd1)
    {
        a = bd1;
        super();
    }
}

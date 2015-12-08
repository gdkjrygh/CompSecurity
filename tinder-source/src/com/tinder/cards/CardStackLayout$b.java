// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.cards;

import android.database.DataSetObserver;

// Referenced classes of package com.tinder.cards:
//            CardStackLayout

private final class <init> extends DataSetObserver
{

    final CardStackLayout a;

    public final void onChanged()
    {
        CardStackLayout.a(a);
    }

    public final void onInvalidated()
    {
        CardStackLayout.b(a);
    }

    private (CardStackLayout cardstacklayout)
    {
        a = cardstacklayout;
        super();
    }

    nit>(CardStackLayout cardstacklayout, byte byte0)
    {
        this(cardstacklayout);
    }
}

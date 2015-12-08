// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events;

import com.a.a.a.a.g;
import com.tinder.events.iab.EventPurchaseConfirmed;

public class EventPurchaseRestoreConfirmed extends EventPurchaseConfirmed
{

    private boolean mShowStrings;

    public EventPurchaseRestoreConfirmed(g g, boolean flag)
    {
        super(g);
        mShowStrings = flag;
    }

    public boolean shouldShowStrings()
    {
        return mShowStrings;
    }
}

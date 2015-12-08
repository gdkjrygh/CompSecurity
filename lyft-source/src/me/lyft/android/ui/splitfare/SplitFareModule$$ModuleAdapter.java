// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitFareModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.splitfare.InviteToSplitView", "members/me.lyft.android.ui.splitfare.SplitPaymentAddChargeAccountView", "members/me.lyft.android.ui.splitfare.SplitPaymentRequestView", "members/me.lyft.android.ui.splitfare.InviteToSplitAcceptedDialogView", "members/me.lyft.android.ui.splitfare.ContactsSearchDialogView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile Object newModule()
    {
        return newModule();
    }

    public SplitFareModule newModule()
    {
        return new SplitFareModule();
    }


    public A()
    {
        super(me/lyft/android/ui/splitfare/SplitFareModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, false);
    }
}

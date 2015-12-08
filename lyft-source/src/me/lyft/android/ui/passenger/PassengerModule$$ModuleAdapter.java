// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.payment.PaymentHelpView", "members/me.lyft.android.ui.passenger.PassengerRateView", "members/me.lyft.android.ui.passenger.PassengerRideExpenseNoteView", "members/me.lyft.android.ui.passenger.PassengerSubmitRatingButton", "members/me.lyft.android.ui.passenger.RideTypeInfoDialogView", "members/me.lyft.android.ui.passenger.CourierRideTypeInfoDialogView", "members/me.lyft.android.ui.passenger.v2.PromptToRateDialogView", "members/me.lyft.android.ui.passenger.ConfirmPickupLocationDialogView", "members/me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView", "members/me.lyft.android.ui.passenger.PassengerCancelRideDialogView", 
        "members/me.lyft.android.ui.passenger.TipDialogView", "members/me.lyft.android.ui.passenger.PriceBreakdownDialogView", "members/me.lyft.android.ui.passenger.LockedAddressDialogView", "members/me.lyft.android.ui.passenger.PassengerSocialSharingView", "members/me.lyft.android.ui.passenger.CourierBeReadyOutsideDialogView", "members/me.lyft.android.ui.passenger.InviteTopContactsDialogView", "members/me.lyft.android.ui.passenger.PassengerCallConfirmationDialogView", "members/me.lyft.android.ui.passenger.PartySizePickerDialogView", "members/me.lyft.android.ui.passenger.StandbyConfirmationDialogView", "members/me.lyft.android.ui.passenger.PassengerRideOverflowMenuView", 
        "members/me.lyft.android.ui.passenger.PickupTimeSelectorDialogView", "members/me.lyft.android.ui.passenger.SelectPaymentWidgetView", "members/me.lyft.android.ui.passenger.FarePriceWidgetView", "members/me.lyft.android.ui.passenger.PaymentWidgetContainerView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile Object newModule()
    {
        return newModule();
    }

    public PassengerModule newModule()
    {
        return new PassengerModule();
    }


    public A()
    {
        super(me/lyft/android/ui/passenger/PassengerModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, false);
    }
}

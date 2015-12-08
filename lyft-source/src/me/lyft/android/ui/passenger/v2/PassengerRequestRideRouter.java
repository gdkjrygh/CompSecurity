// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import android.content.res.Resources;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.ui.landing.LandingFlow;

public class PassengerRequestRideRouter
{

    final AppFlow appFlow;
    final DialogFlow dialogFlow;
    final LandingFlow landingFlow;
    final Resources resources;

    PassengerRequestRideRouter(AppFlow appflow, DialogFlow dialogflow, LandingFlow landingflow, Resources resources1)
    {
        appFlow = appflow;
        dialogFlow = dialogflow;
        landingFlow = landingflow;
        resources = resources1;
    }

    public void goToNextScreenInSignupFlow()
    {
        landingFlow.goToNextScreenInSignupFlow();
    }

    public void showAcceptDeclineSplitFareScreen()
    {
        appFlow.goTo(new me.lyft.android.ui.splitfare.SplitScreens.AcceptDeclineSplitFareScreen());
    }

    public void showAcceptTermsScreen()
    {
        appFlow.goTo(new me.lyft.android.ui.MainScreens.AcceptTermsScreen(false));
    }

    public void showAcceptTermsScreenAndDismissActiveDialogs()
    {
        if (dialogFlow.hasActiveDialog())
        {
            dialogFlow.dismiss();
        }
        appFlow.goTo(new me.lyft.android.ui.MainScreens.AcceptTermsScreen(false));
    }

    public void showConfirmPickupLocationDialog()
    {
        dialogFlow.show(new me.lyft.android.ui.passenger.PassengerDialogs.ConfirmPickupLocationDialog());
    }

    public void showCourierRideTypeInfoDialog()
    {
        dialogFlow.show(new me.lyft.android.ui.passenger.PassengerDialogs.CourierRideTypeInfoDialog());
    }

    public void showCourierRideTypeInfoDialog(FixedFare fixedfare)
    {
        fixedfare = new me.lyft.android.ui.passenger.PassengerDialogs.CourierRideTypeInfoDialog(fixedfare.getTotalMoney(), fixedfare.getComparisonMoney(), fixedfare.getComparisonText());
        dialogFlow.show(fixedfare);
    }

    public void showDropoffPlaceSearchAndReturnTo(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep requestridestep)
    {
        appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.DestinationPlaceSearch(requestridestep));
    }

    public void showHasDebtScreen()
    {
        appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.DebtScreen());
    }

    public void showInAppNotificationDialog(String s)
    {
        dialogFlow.show(new me.lyft.android.ui.Dialogs.InAppNotificationDialog(s));
    }

    public void showInvalidRouteDialog(Throwable throwable)
    {
        throwable = (new me.lyft.android.ui.Dialogs.AlertDialog("invalid_route_dialog")).setMessage(throwable.getMessage()).addNegativeButton(resources.getString(0x7f070212));
        dialogFlow.show(throwable);
    }

    public void showInviteScreen()
    {
        appFlow.resetToParent(new me.lyft.android.ui.invites.InvitesScreens.InviteScreen());
    }

    public void showLoginEnterInfoScreen()
    {
        appFlow.goTo(new me.lyft.android.ui.landing.LandingScreens.LoginEnterInfoScreen());
    }

    public void showNoValidChargeAccountDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("default_card_invalid_dialog")).setTitle(resources.getString(0x7f070222)).setMessage(resources.getString(0x7f070221)).addPositiveButton(resources.getString(0x7f070212));
        dialogFlow.show(alertdialog);
    }

    public void showNoValidChargeAccountPaymentScreen()
    {
        appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.PaymentScreen());
    }

    public void showPartySizePickerDialog()
    {
        dialogFlow.show(new me.lyft.android.ui.passenger.PassengerDialogs.PartySizePickerDialog());
    }

    public void showPaymentDialog()
    {
        dialogFlow.show(new me.lyft.android.ui.Dialogs.PaymentDialog());
    }

    public void showPaymentFraudScreen()
    {
        appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.PaymentFraudScreen());
    }

    public void showPaymentScreenWithBackButton()
    {
        appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.PaymentScreenWithBackButton());
    }

    public void showPickupPlaceSearchAndReturnTo(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep requestridestep)
    {
        appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.PickupPlaceSearch(requestridestep));
    }

    public void showPrimeTimeRequestRideDialog()
    {
        dialogFlow.show(new me.lyft.android.ui.passenger.PassengerDialogs.PrimeTimeRequestRideDialog());
    }

    public void showPromptToRateDialog()
    {
        dialogFlow.show(new PassengerDialogsV2.PromptToRateDialog());
    }

    public void showRideTypeInfoDialog(String s)
    {
        dialogFlow.show(new me.lyft.android.ui.passenger.PassengerDialogs.RideTypeInfoDialog(s));
    }
}

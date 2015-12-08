// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.Arrays;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.events.RideStatusChangedEvent;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.NullRideDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.MainActivity;
import me.lyft.android.utils.SoundManager;
import me.lyft.android.utils.Vibrator;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class RideStatusChangedJob
    implements Job
{

    AppFlow appFlow;
    IAppForegroundDetector appForegroundDetector;
    LyftApplication application;
    MessageBus bus;
    IConstantsProvider constantsProvider;
    private final AppStateDTO currentAppState;
    DialogFlow dialogFlow;
    InAppNotificationService inAppNotificationService;
    ILyftPreferences preferences;
    private final AppStateDTO previousAppState;
    SoundManager soundManager;
    Vibrator vibrator;

    public RideStatusChangedJob(AppStateDTO appstatedto, AppStateDTO appstatedto1)
    {
        previousAppState = appstatedto;
        currentAppState = appstatedto1;
    }

    private void checkCancelationForDriverUser(RideDTO ridedto, UserDTO userdto)
    {
        if (Arrays.asList(new String[] {
    "canceled", "canceledNoShow", "canceledWithPenalty", "canceledWrongPartySize"
}).contains(ridedto.getStatus()) && !userdto.getId().equals(ridedto.getActor()))
        {
            vibrator.vibrate(0, 250L, new Long[] {
                Long.valueOf(250L), Long.valueOf(250L), Long.valueOf(1000L)
            });
            showDriverRideCanceledDialog();
        }
    }

    private void checkCancelationForPassengerUser(RideDTO ridedto, UserDTO userdto)
    {
        if (!"canceledNoShow".equalsIgnoreCase(ridedto.getStatus())) goto _L2; else goto _L1
_L1:
        showCourierPassengerNoShowDialog();
_L4:
        if ("accepted".equalsIgnoreCase(ridedto.getStatus()) || "approaching".equalsIgnoreCase(ridedto.getStatus()) || "droppedOff".equalsIgnoreCase(ridedto.getStatus()))
        {
            soundManager.play(1);
        }
        return;
_L2:
        if (Arrays.asList(new String[] {
    "canceled", "canceledNoShow", "canceledWithPenalty", "canceledWrongPartySize"
}).contains(ridedto.getStatus()) && !userdto.getId().equals(ridedto.getActor()))
        {
            showPassengerRideCanceledDialog();
        } else
        if ("lapsed".equalsIgnoreCase(ridedto.getStatus()))
        {
            showRideLapsedDialog();
        } else
        if ("accepted".equalsIgnoreCase(ridedto.getStatus()) || "approaching".equalsIgnoreCase(ridedto.getStatus()))
        {
            inAppNotificationService.showNotificationIfAvailable("passenger_ride_accept");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void checkCancellation(RideDTO ridedto)
    {
        UserDTO userdto = (UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance());
        if ("driver".equalsIgnoreCase(userdto.getMode()))
        {
            checkCancelationForDriverUser(ridedto, userdto);
            return;
        } else
        {
            checkCancelationForPassengerUser(ridedto, userdto);
            return;
        }
    }

    private void createAndShowRideStatusChangedNotification(RideDTO ridedto)
    {
        UserDTO userdto = (UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance());
        if (Arrays.asList(new String[] {
    "canceled", "canceledNoShow", "canceledWithPenalty", "canceledWrongPartySize"
}).contains(ridedto.getStatus()) || "pending".equalsIgnoreCase(ridedto.getStatus()))
        {
            appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
        }
        if (!appForegroundDetector.isForegrounded() && "driver".equalsIgnoreCase(userdto.getMode()) && ("pending".equalsIgnoreCase(ridedto.getStatus()) || Arrays.asList(new String[] {
    "canceled", "canceledNoShow", "canceledWithPenalty", "canceledWrongPartySize"
}).contains(ridedto.getStatus())))
        {
            MainActivity.startActivity(application);
        }
    }

    private void postRideStatusChanged(RideDTO ridedto)
    {
        bus.post(me/lyft/android/events/RideStatusChangedEvent, ridedto);
        checkCancellation(ridedto);
        createAndShowRideStatusChangedNotification(ridedto);
    }

    private void showCourierPassengerNoShowDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = new me.lyft.android.ui.Dialogs.AlertDialog("courier_passenger_no_show_dialog");
        String s1 = constantsProvider.getConstants().getCourierNoShowPentaltyMessage();
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = application.getString(0x7f0700db);
        }
        alertdialog.setTitle(application.getString(0x7f0700dc)).setTitleColorResource(0x7f0c00b7).addNegativeButton(application.getString(0x7f070212)).setMessage(s);
        dialogFlow.show(alertdialog);
    }

    private void showPassengerRideCanceledDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = new me.lyft.android.ui.Dialogs.AlertDialog("passenger_ride_canceled_dialog");
        alertdialog.setTitle(application.getString(0x7f07030b)).addPositiveButton(application.getString(0x7f070212)).setSound(2);
        dialogFlow.show(alertdialog);
    }

    private void showRideLapsedDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = new me.lyft.android.ui.Dialogs.AlertDialog("ride_lapsed_dialog");
        alertdialog.setTitle(application.getString(0x7f070238)).setTitleColorResource(0x7f0c00b7).setMessage(application.getString(0x7f070237)).addPositiveButton(application.getString(0x7f070212));
        dialogFlow.show(alertdialog);
    }

    public void execute()
    {
        RideDTO ridedto;
        RideDTO ridedto1;
        RideDTO ridedto2;
        boolean flag;
        ridedto = (RideDTO)Objects.firstNonNull(previousAppState.getRide(), NullRideDTO.getInstance());
        ridedto1 = (RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance());
        ridedto2 = (RideDTO)Objects.firstNonNull(currentAppState.getClientRide(), NullRideDTO.getInstance());
        flag = ((String)Objects.firstNonNull(ridedto1.getId(), "")).equals(preferences.getIgnoreRideId());
        if (Arrays.asList(new String[] {
    "accepted", "approaching", "arrived", "pickedUp", "droppedOff"
}).contains(ridedto1.getStatus()))
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (ridedto1.isNull())
        {
            break; /* Loop/switch isn't completed */
        }
        if (ridedto.isNull() || !((String)Objects.firstNonNull(ridedto.getId(), "")).equalsIgnoreCase((String)Objects.firstNonNull(ridedto1.getId(), "")) || !ridedto.getStatus().equalsIgnoreCase(ridedto1.getStatus()))
        {
            postRideStatusChanged(ridedto1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!ridedto2.isNull())
        {
            postRideStatusChanged(ridedto2);
            return;
        }
        if (!ridedto.isNull())
        {
            if ("driver".equalsIgnoreCase(((UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance())).getMode()))
            {
                vibrator.vibrate(0, 250L, new Long[] {
                    Long.valueOf(250L), Long.valueOf(250L), Long.valueOf(1000L)
                });
            }
            if (!appForegroundDetector.isForegrounded())
            {
                MainActivity.startActivity(application);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void showDriverRideCanceledDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("driver_ride_canceled_dialog")).setTitle(application.getString(0x7f07030b)).addPositiveButton(application.getString(0x7f070212)).setSound(2);
        dialogFlow.show(alertdialog);
    }
}

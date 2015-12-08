// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.IUserSession;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideMatchingView

class this._cls0
    implements android.view.MatchingView._cls10
{

    final PassengerCourierRideMatchingView this$0;

    public void onClick(View view)
    {
        FixedFare fixedfare = preRideInfoRepository.getPreRideInfo().findCourierByPartySize(passengerRideProvider.getPassengerRide().getSelf().getPartySize());
        view = userSession.getRide();
        DialogFlow dialogflow = dialogFlow;
        if (view != null)
        {
            view = view.getTotalMoney();
        } else
        {
            view = null;
        }
        dialogflow.show(new Dialog(MoneyMapper.fromMoneyDTO(view), fixedfare.getComparisonMoney(), fixedfare.getComparisonText()));
    }

    Dialog()
    {
        this$0 = PassengerCourierRideMatchingView.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ridehistory;

import java.util.List;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.domain.User;
import me.lyft.android.domain.ridehistory.IPassengerRideHistoryMapper;
import me.lyft.android.domain.ridehistory.PassengerRideHistory;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryDetails;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryDetailsDTO;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ridehistory:
//            IPassengerRideHistoryService

public class PassengerRideHistoryService
    implements IPassengerRideHistoryService
{

    public static final int RIDE_HISTORY_ITEMS_LIMIT = 10;
    private PassengerRideHistory cachedHistory;
    private final ILyftApi lyftApi;
    private final IPassengerRideHistoryMapper mapper;
    private final IUserProvider userProvider;

    public PassengerRideHistoryService(ILyftApi ilyftapi, IUserProvider iuserprovider, IPassengerRideHistoryMapper ipassengerridehistorymapper)
    {
        cachedHistory = PassengerRideHistory.createEmptyPassengerRideHistory();
        lyftApi = ilyftapi;
        userProvider = iuserprovider;
        mapper = ipassengerridehistorymapper;
    }

    public void clearCachedRideHistory()
    {
        cachedHistory = PassengerRideHistory.createEmptyPassengerRideHistory();
    }

    public PassengerRideHistory getCachedRideHistory()
    {
        return cachedHistory;
    }

    public Observable getPassengerHistory(int i)
    {
        if (i == 0 || i != cachedHistory.getRideHistory().size())
        {
            clearCachedRideHistory();
        }
        return lyftApi.getPassengerHistory(userProvider.getUser().getId(), i, 10).map(new Func1() {

            final PassengerRideHistoryService this$0;

            public volatile Object call(Object obj)
            {
                return call((PassengerRideHistoryDTO)obj);
            }

            public PassengerRideHistory call(PassengerRideHistoryDTO passengerridehistorydto)
            {
                return mapper.fromDTO(passengerridehistorydto);
            }

            
            {
                this$0 = PassengerRideHistoryService.this;
                super();
            }
        }).doOnNext(new Action1() {

            final PassengerRideHistoryService this$0;

            public volatile void call(Object obj)
            {
                call((PassengerRideHistory)obj);
            }

            public void call(PassengerRideHistory passengerridehistory)
            {
                cachedHistory.getRideHistory().addAll(passengerridehistory.getRideHistory());
                cachedHistory.setHasMore(passengerridehistory.hasMore());
                cachedHistory.setLimit(passengerridehistory.getLimit());
                cachedHistory.setOffset(passengerridehistory.getOffset());
            }

            
            {
                this$0 = PassengerRideHistoryService.this;
                super();
            }
        });
    }

    public Observable getPassengerHistoryDetails(String s)
    {
        return lyftApi.getPassengerRideHistoryDetails(userProvider.getUser().getId(), s).map(new Func1() {

            final PassengerRideHistoryService this$0;

            public volatile Object call(Object obj)
            {
                return call((PassengerRideHistoryDetailsDTO)obj);
            }

            public PassengerRideHistoryDetails call(PassengerRideHistoryDetailsDTO passengerridehistorydetailsdto)
            {
                return mapper.fromDTO(passengerridehistorydetailsdto);
            }

            
            {
                this$0 = PassengerRideHistoryService.this;
                super();
            }
        });
    }


}

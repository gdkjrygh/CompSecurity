// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.DestinyLocationRequestDTO;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            IDestinyService, IDestinySession

public class DestinyService
    implements IDestinyService
{

    private final IConstantsProvider constantsProvider;
    private final IDestinySession destinySession;
    private final ILyftApi lyftApi;
    private final IUserSession userSession;

    public DestinyService(IUserSession iusersession, ILyftApi ilyftapi, IDestinySession idestinysession, IConstantsProvider iconstantsprovider)
    {
        userSession = iusersession;
        lyftApi = ilyftapi;
        destinySession = idestinysession;
        constantsProvider = iconstantsprovider;
    }

    public Observable exitDestiny()
    {
        return lyftApi.deleteDestinyLocation(userSession.getUser().getId()).doOnNext(new Action1() {

            final DestinyService this$0;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                destinySession.setLocation(NullLocation.getInstance());
                destinySession.setInDestinyEditMode(false);
            }

            
            {
                this$0 = DestinyService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable exitSetDestiny()
    {
        me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO updateuserrequestdto = (new UpdateUserRequestBuilder()).withMode("driver").build();
        return lyftApi.updateUser(userSession.getUser().getId(), updateuserrequestdto).doOnNext(new Action1() {

            final DestinyService this$0;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                destinySession.setLocation(NullLocation.getInstance());
                destinySession.setInDestinyEditMode(false);
            }

            
            {
                this$0 = DestinyService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable setDestiny(final Location destination)
    {
        DestinyLocationRequestDTO destinylocationrequestdto = new DestinyLocationRequestDTO(LocationMapper.fromLocationDomain(destination), constantsProvider.getAppInfoRevision());
        return lyftApi.updateDestinyLocation(userSession.getUser().getId(), destinylocationrequestdto).doOnNext(new Action1() {

            final DestinyService this$0;
            final Location val$destination;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                destinySession.setLocation(destination);
                destinySession.setInDestinyEditMode(false);
            }

            
            {
                this$0 = DestinyService.this;
                destination = location;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable switchToDestiny()
    {
        me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO updateuserrequestdto = (new UpdateUserRequestBuilder()).withMode("passenger").build();
        destinySession.setInDestinyEditMode(true);
        return lyftApi.updateUser(userSession.getUser().getId(), updateuserrequestdto).map(Unit.func1());
    }

}

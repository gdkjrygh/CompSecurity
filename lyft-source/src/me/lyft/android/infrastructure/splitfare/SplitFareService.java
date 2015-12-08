// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.lyft.android.analytics.studies.SplitFareAnalytics;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.faresplit.ContributorDTO;
import me.lyft.android.infrastructure.lyft.faresplit.FareSplitInviteRequestDTO;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.ContactsProvider;
import me.lyft.android.providers.ISplitFareProvider;
import me.lyft.android.providers.UserContact;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.splitfare:
//            ISplitFareService, SplitFareServiceException

public class SplitFareService
    implements ISplitFareService
{

    private static final int MAX_RECENT_CONTACTS = 3;
    private final ContactsProvider contactsProvider;
    private final ILyftApi lyftApi;
    private final Resources resources;
    private final IPassengerRideProvider rideProvider;
    private final ISplitFareProvider splitFareProvider;
    private final Set unknownPhoneNumbers = new HashSet();

    public SplitFareService(ILyftApi ilyftapi, ISplitFareProvider isplitfareprovider, ContactsProvider contactsprovider, Resources resources1, IPassengerRideProvider ipassengerrideprovider)
    {
        lyftApi = ilyftapi;
        splitFareProvider = isplitfareprovider;
        contactsProvider = contactsprovider;
        resources = resources1;
        rideProvider = ipassengerrideprovider;
    }

    static List asDTO(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        UserContact usercontact;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new ContributorDTO(usercontact.getName(), usercontact.getPhoneNumber().getPhoneNumber(), null)))
        {
            usercontact = (UserContact)list.next();
        }

        return arraylist;
    }

    private List getUnknownContacts()
    {
        ArrayList arraylist = new ArrayList(unknownPhoneNumbers.size());
        String s;
        for (Iterator iterator = unknownPhoneNumbers.iterator(); iterator.hasNext(); arraylist.add((new UserContact("")).setContactPhone(new ContactPhone(s)).setCategory("#")))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public Observable acceptDeclineRequest(String s, final boolean accept)
    {
        SplitFareAnalytics.trackSplitResponseAttempt();
        return lyftApi.acceptDeclineFareSplitRequest(s, accept).doOnNext(new Action1() {

            final SplitFareService this$0;
            final boolean val$accept;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                SplitFareAnalytics.trackSplitResponseSuccess(accept);
            }

            
            {
                this$0 = SplitFareService.this;
                accept = flag;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final SplitFareService this$0;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                Object obj = throwable;
                if (throwable instanceof LyftApiException)
                {
                    obj = throwable;
                    if (((LyftApiException)throwable).getStatusCode() == 422)
                    {
                        obj = new SplitFareServiceException("splitfare_request_lapsed");
                    }
                }
                SplitFareAnalytics.trackSplitResponseFailure(((Throwable) (obj)));
                return Observable.error(((Throwable) (obj)));
            }

            
            {
                this$0 = SplitFareService.this;
                super();
            }
        });
    }

    public void addUnknownPhoneNumber(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            return;
        } else
        {
            unknownPhoneNumbers.add(s);
            return;
        }
    }

    public Observable observeSplitFareContacts()
    {
        SplitFareAnalytics.trackSplitLoadContactsAttempt();
        final String recentCategory = resources.getString(0x7f070345);
        return Observable.concat(splitFareProvider.observeTopSplitFareContacts().limit(3).doOnNext(new Action1() {

            final SplitFareService this$0;
            final String val$recentCategory;

            public volatile void call(Object obj)
            {
                call((UserContact)obj);
            }

            public void call(UserContact usercontact)
            {
                usercontact.setCategory(recentCategory);
            }

            
            {
                this$0 = SplitFareService.this;
                recentCategory = s;
                super();
            }
        }), contactsProvider.getPhonesObservable().startWith(getUnknownContacts())).filter(new me.lyft.android.providers.ContactsProvider.PhoneNumberFilter()).toList().doOnNext(new Action1() {

            final SplitFareService this$0;

            public volatile void call(Object obj)
            {
                call((List)obj);
            }

            public void call(List list)
            {
                SplitFareAnalytics.trackSplitLoadContactsSuccess(list.size());
            }

            
            {
                this$0 = SplitFareService.this;
                super();
            }
        }).doOnError(new Action1() {

            final SplitFareService this$0;

            public volatile void call(Object obj)
            {
                call((Throwable)obj);
            }

            public void call(Throwable throwable)
            {
                SplitFareAnalytics.trackSplitLoadContactsFailure();
            }

            
            {
                this$0 = SplitFareService.this;
                super();
            }
        });
    }

    public Observable sendInvites(final List contacts)
    {
        SplitFareAnalytics.trackSplitRequestAttempt();
        if (contacts.isEmpty())
        {
            SplitFareAnalytics.trackSplitRequestFailure(new SplitFareServiceException("empty_invite_list"));
            return Observable.just(Unit.create());
        } else
        {
            FareSplitInviteRequestDTO faresplitinviterequestdto = new FareSplitInviteRequestDTO(rideProvider.getPassengerRide().getId(), asDTO(contacts));
            return lyftApi.sendFareSplitInvites(faresplitinviterequestdto).onErrorResumeNext(new Func1() {

                final SplitFareService this$0;

                public volatile Object call(Object obj)
                {
                    return call((Throwable)obj);
                }

                public Observable call(Throwable throwable)
                {
                    SplitFareAnalytics.trackSplitRequestFailure(throwable);
                    return Observable.error(throwable);
                }

            
            {
                this$0 = SplitFareService.this;
                super();
            }
            }).doOnNext(new Action1() {

                final SplitFareService this$0;
                final List val$contacts;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    SplitFareAnalytics.trackSplitRequestSuccess(contacts.size());
                    splitFareProvider.incrementSplitFareCount(contacts);
                }

            
            {
                this$0 = SplitFareService.this;
                contacts = list;
                super();
            }
            });
        }
    }

}

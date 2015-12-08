// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.notifications;

import android.app.Activity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.notifications.InAppNotificationDTO;
import me.lyft.android.infrastructure.lyft.notifications.LyftNotificationsResponseDTO;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.SecureObserver;
import rx.Observable;
import rx.functions.Action1;

public class InAppNotificationService extends ActivityService
{

    public static final long NOTIFICATION_UPDATE_TIMEOUT = 0xcdfe600L;
    public static final int SHOWN_NOTIFICATION_SIZE_LIMIT = 100;
    Binder binder;
    MessageBus bus;
    DialogFlow dialogFlow;
    private boolean didShowNotificationForSession;
    private long lastTimeUpdated;
    ILyftApi lyftApi;
    ILyftPreferences lyftPreferences;
    private ReactiveProperty notificationUpdates;
    Map notifications;
    private Action1 onAppStateUpdated;
    Set shownNotifications;
    IUserProvider userProvider;

    public InAppNotificationService(ILyftApi ilyftapi, IUserProvider iuserprovider, MessageBus messagebus, ILyftPreferences ilyftpreferences, DialogFlow dialogflow)
    {
        lastTimeUpdated = 0L;
        didShowNotificationForSession = false;
        notificationUpdates = ReactiveProperty.create();
        onAppStateUpdated = new Action1() {

            final InAppNotificationService this$0;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                fetchNotifications();
            }

            
            {
                this$0 = InAppNotificationService.this;
                super();
            }
        };
        lyftApi = ilyftapi;
        userProvider = iuserprovider;
        bus = messagebus;
        lyftPreferences = ilyftpreferences;
        dialogFlow = dialogflow;
    }

    private void fetchNotifications()
    {
        if (!userProvider.getUser().isNull())
        {
            long l = System.currentTimeMillis();
            if (l - lastTimeUpdated > 0xcdfe600L)
            {
                lastTimeUpdated = l;
                lyftApi.getNotifications().subscribe(new SecureObserver() {

                    final InAppNotificationService this$0;

                    public volatile void onSafeNext(Object obj)
                    {
                        onSafeNext((LyftNotificationsResponseDTO)obj);
                    }

                    public void onSafeNext(LyftNotificationsResponseDTO lyftnotificationsresponsedto)
                    {
                        super.onSafeNext(lyftnotificationsresponsedto);
                        update(lyftnotificationsresponsedto);
                        notificationUpdates.onNext(Unit.create());
                    }

            
            {
                this$0 = InAppNotificationService.this;
                super();
            }
                });
            }
        }
    }

    private InAppNotificationDTO getNotificationByEvent(String s)
    {
        s = (InAppNotificationDTO)getNotifications().get(s);
        if (s != null && isNotificationShown(s.getSourceUrl()))
        {
            return null;
        } else
        {
            didShowNotificationForSession = true;
            return s;
        }
    }

    private Map getNotifications()
    {
        if (notifications == null)
        {
            notifications = new HashMap();
            InAppNotificationDTO inappnotificationdto;
            for (Iterator iterator = lyftPreferences.getInAppNotifications().iterator(); iterator.hasNext(); notifications.put(inappnotificationdto.getEvent(), inappnotificationdto))
            {
                inappnotificationdto = (InAppNotificationDTO)iterator.next();
            }

        }
        return notifications;
    }

    private Set getShownNotifications()
    {
        if (shownNotifications == null)
        {
            shownNotifications = lyftPreferences.getShownInAppNotifications();
        }
        return shownNotifications;
    }

    private boolean isNotificationShown(String s)
    {
        return getShownNotifications().contains(s);
    }

    private void update(LyftNotificationsResponseDTO lyftnotificationsresponsedto)
    {
        lyftnotificationsresponsedto = (List)Objects.firstNonNull(lyftnotificationsresponsedto.getNotifications(), Collections.emptyList());
        HashMap hashmap = new HashMap();
        InAppNotificationDTO inappnotificationdto;
        for (Iterator iterator = lyftnotificationsresponsedto.iterator(); iterator.hasNext(); hashmap.put(inappnotificationdto.getEvent(), inappnotificationdto))
        {
            inappnotificationdto = (InAppNotificationDTO)iterator.next();
        }

        lyftPreferences.setInAppNotifications(lyftnotificationsresponsedto);
        notifications = hashmap;
    }

    public boolean didShowNotificationForSession()
    {
        return didShowNotificationForSession;
    }

    public void markNotificationAsShown(String s)
    {
        getShownNotifications().add(s);
        if (getShownNotifications().size() > 100)
        {
            getShownNotifications().remove(Iterables.firstOrDefault(getShownNotifications(), null));
        }
        lyftPreferences.setShownInAppNotifications(getShownNotifications());
    }

    public void onActivityPaused(Activity activity)
    {
        super.onActivityPaused(activity);
        binder.detach();
        didShowNotificationForSession = false;
    }

    public void onActivityResumed(Activity activity)
    {
        super.onActivityResumed(activity);
        binder = new Binder();
        binder.bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), onAppStateUpdated);
    }

    public Observable showNotification(final String eventName)
    {
        if (showNotificationIfAvailable(eventName))
        {
            return Unit.just();
        } else
        {
            fetchNotifications();
            return notificationUpdates.doOnNext(new Action1() {

                final InAppNotificationService this$0;
                final String val$eventName;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    showNotificationIfAvailable(eventName);
                }

            
            {
                this$0 = InAppNotificationService.this;
                eventName = s;
                super();
            }
            });
        }
    }

    public boolean showNotificationIfAvailable(String s)
    {
        s = getNotificationByEvent(s);
        if (s != null)
        {
            s = s.getSourceUrl();
            dialogFlow.show(new me.lyft.android.ui.Dialogs.InAppNotificationDialog(s));
            return true;
        } else
        {
            return false;
        }
    }



}

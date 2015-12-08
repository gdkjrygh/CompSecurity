// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.offline.OfflineContentService;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.accounts:
//            AccountOperations

public class LogoutFragment extends Fragment
{
    private final class EventSubscriber extends DefaultSubscriber
    {

        final LogoutFragment this$0;

        public final void onNext(CurrentUserChangedEvent currentuserchangedevent)
        {
            android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
            if (currentuserchangedevent.getKind() == 1 && fragmentactivity != null && !fragmentactivity.isFinishing())
            {
                accountOperations.triggerLoginFlow(fragmentactivity);
                fragmentactivity.finish();
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((CurrentUserChangedEvent)obj);
        }

        private EventSubscriber()
        {
            this$0 = LogoutFragment.this;
            super();
        }

        EventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class LogoutSubscriber extends DefaultSubscriber
    {

        final LogoutFragment this$0;

        public final void onError(Throwable throwable)
        {
            super.onError(throwable);
            throwable = getActivity();
            if (throwable != null && !throwable.isFinishing())
            {
                throwable.finish();
            }
        }

        private LogoutSubscriber()
        {
            this$0 = LogoutFragment.this;
            super();
        }

        LogoutSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    AccountOperations accountOperations;
    EventBus eventBus;
    FeatureOperations featureOperations;
    private final b subscription;

    public LogoutFragment()
    {
        subscription = new b();
        setRetainInstance(true);
        SoundCloudApplication.getObjectGraph().a(this);
    }

    LogoutFragment(EventBus eventbus, AccountOperations accountoperations, FeatureOperations featureoperations)
    {
        subscription = new b();
        eventBus = eventbus;
        accountOperations = accountoperations;
        featureOperations = featureoperations;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (featureOperations.isOfflineContentEnabled())
        {
            OfflineContentService.stop(getActivity());
        }
        subscription.a(eventBus.subscribe(EventQueue.CURRENT_USER_CHANGED, new EventSubscriber(null)));
        subscription.a(accountOperations.logout().subscribe(new LogoutSubscriber(null)));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03006b, viewgroup, false);
    }

    public void onDestroy()
    {
        subscription.unsubscribe();
        super.onDestroy();
    }
}

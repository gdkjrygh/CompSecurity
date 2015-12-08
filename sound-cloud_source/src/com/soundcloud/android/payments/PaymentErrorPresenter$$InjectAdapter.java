// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.payments:
//            PaymentErrorPresenter, PaymentErrorView

public final class  extends b
    implements Provider
{

    private b errorView;
    private b eventBus;

    public final void attach(l l1)
    {
        errorView = l1.a("com.soundcloud.android.payments.PaymentErrorView", com/soundcloud/android/payments/PaymentErrorPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/payments/PaymentErrorPresenter, getClass().getClassLoader());
    }

    public final PaymentErrorPresenter get()
    {
        return new PaymentErrorPresenter((PaymentErrorView)errorView.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(errorView);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.payments.PaymentErrorPresenter", "members/com.soundcloud.android.payments.PaymentErrorPresenter", false, com/soundcloud/android/payments/PaymentErrorPresenter);
    }
}

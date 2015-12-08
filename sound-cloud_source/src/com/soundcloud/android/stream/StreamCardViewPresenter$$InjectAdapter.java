// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.res.Resources;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamCardViewPresenter, HeaderSpannableBuilder

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b headerSpannableBuilder;
    private b imageOperations;
    private b navigator;
    private b resources;
    private b screenProvider;

    public final void attach(l l1)
    {
        headerSpannableBuilder = l1.a("com.soundcloud.android.stream.HeaderSpannableBuilder", com/soundcloud/android/stream/StreamCardViewPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/stream/StreamCardViewPresenter, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/stream/StreamCardViewPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/stream/StreamCardViewPresenter, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/stream/StreamCardViewPresenter, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/stream/StreamCardViewPresenter, getClass().getClassLoader());
    }

    public final StreamCardViewPresenter get()
    {
        return new StreamCardViewPresenter((HeaderSpannableBuilder)headerSpannableBuilder.get(), (EventBus)eventBus.get(), (ScreenProvider)screenProvider.get(), (Navigator)navigator.get(), (Resources)resources.get(), (ImageOperations)imageOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(headerSpannableBuilder);
        set.add(eventBus);
        set.add(screenProvider);
        set.add(navigator);
        set.add(resources);
        set.add(imageOperations);
    }

    public ()
    {
        super("com.soundcloud.android.stream.StreamCardViewPresenter", "members/com.soundcloud.android.stream.StreamCardViewPresenter", false, com/soundcloud/android/stream/StreamCardViewPresenter);
    }
}

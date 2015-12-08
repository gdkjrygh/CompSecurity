// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.tracks.TrackItemMenuPresenter;
import com.soundcloud.android.util.CondensedNumberFormatter;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamTrackItemRenderer, StreamItemEngagementsPresenter, StreamCardViewPresenter

public final class  extends b
    implements Provider
{

    private b cardViewPresenter;
    private b engagementsPresenter;
    private b menuPresenter;
    private b numberFormatter;

    public final void attach(l l1)
    {
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/stream/StreamTrackItemRenderer, getClass().getClassLoader());
        menuPresenter = l1.a("com.soundcloud.android.tracks.TrackItemMenuPresenter", com/soundcloud/android/stream/StreamTrackItemRenderer, getClass().getClassLoader());
        engagementsPresenter = l1.a("com.soundcloud.android.stream.StreamItemEngagementsPresenter", com/soundcloud/android/stream/StreamTrackItemRenderer, getClass().getClassLoader());
        cardViewPresenter = l1.a("com.soundcloud.android.stream.StreamCardViewPresenter", com/soundcloud/android/stream/StreamTrackItemRenderer, getClass().getClassLoader());
    }

    public final StreamTrackItemRenderer get()
    {
        return new StreamTrackItemRenderer((CondensedNumberFormatter)numberFormatter.get(), (TrackItemMenuPresenter)menuPresenter.get(), (StreamItemEngagementsPresenter)engagementsPresenter.get(), (StreamCardViewPresenter)cardViewPresenter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(numberFormatter);
        set.add(menuPresenter);
        set.add(engagementsPresenter);
        set.add(cardViewPresenter);
    }

    public ()
    {
        super("com.soundcloud.android.stream.StreamTrackItemRenderer", "members/com.soundcloud.android.stream.StreamTrackItemRenderer", false, com/soundcloud/android/stream/StreamTrackItemRenderer);
    }
}

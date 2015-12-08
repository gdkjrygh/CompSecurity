// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiUrlBuilder;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            StreamUrlBuilder

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b urlBuilder;

    public final void attach(l l1)
    {
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playback/StreamUrlBuilder, getClass().getClassLoader());
        urlBuilder = l1.a("com.soundcloud.android.api.ApiUrlBuilder", com/soundcloud/android/playback/StreamUrlBuilder, getClass().getClassLoader());
    }

    public final StreamUrlBuilder get()
    {
        return new StreamUrlBuilder((AccountOperations)accountOperations.get(), (ApiUrlBuilder)urlBuilder.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(accountOperations);
        set.add(urlBuilder);
    }

    public ()
    {
        super("com.soundcloud.android.playback.StreamUrlBuilder", "members/com.soundcloud.android.playback.StreamUrlBuilder", false, com/soundcloud/android/playback/StreamUrlBuilder);
    }
}

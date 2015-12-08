// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.util.CondensedNumberFormatter;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamItemEngagementsPresenter

public final class Q extends b
    implements Provider
{

    private b accountOperations;
    private b likeOperations;
    private b numberFormatter;
    private b repostOperations;

    public final void attach(l l1)
    {
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/stream/StreamItemEngagementsPresenter, getClass().getClassLoader());
        likeOperations = l1.a("com.soundcloud.android.likes.LikeOperations", com/soundcloud/android/stream/StreamItemEngagementsPresenter, getClass().getClassLoader());
        repostOperations = l1.a("com.soundcloud.android.associations.RepostOperations", com/soundcloud/android/stream/StreamItemEngagementsPresenter, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/stream/StreamItemEngagementsPresenter, getClass().getClassLoader());
    }

    public final StreamItemEngagementsPresenter get()
    {
        return new StreamItemEngagementsPresenter((CondensedNumberFormatter)numberFormatter.get(), (LikeOperations)likeOperations.get(), (RepostOperations)repostOperations.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(numberFormatter);
        set.add(likeOperations);
        set.add(repostOperations);
        set.add(accountOperations);
    }

    public Q()
    {
        super("com.soundcloud.android.stream.StreamItemEngagementsPresenter", "members/com.soundcloud.android.stream.StreamItemEngagementsPresenter", false, com/soundcloud/android/stream/StreamItemEngagementsPresenter);
    }
}

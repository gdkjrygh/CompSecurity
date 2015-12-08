// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search.suggestions;

import android.content.Context;
import com.soundcloud.android.api.legacy.PublicApi;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search.suggestions:
//            SuggestionsAdapter, ShortcutsStorage

public final class Q extends b
    implements Provider
{

    private b api;
    private b context;
    private b shortcutsStorage;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/search/suggestions/SuggestionsAdapter, getClass().getClassLoader());
        api = l1.a("com.soundcloud.android.api.legacy.PublicApi", com/soundcloud/android/search/suggestions/SuggestionsAdapter, getClass().getClassLoader());
        shortcutsStorage = l1.a("com.soundcloud.android.search.suggestions.ShortcutsStorage", com/soundcloud/android/search/suggestions/SuggestionsAdapter, getClass().getClassLoader());
    }

    public final SuggestionsAdapter get()
    {
        return new SuggestionsAdapter((Context)context.get(), (PublicApi)api.get(), (ShortcutsStorage)shortcutsStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(api);
        set.add(shortcutsStorage);
    }

    public Q()
    {
        super("com.soundcloud.android.search.suggestions.SuggestionsAdapter", "members/com.soundcloud.android.search.suggestions.SuggestionsAdapter", false, com/soundcloud/android/search/suggestions/SuggestionsAdapter);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search.suggestions;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search.suggestions:
//            ShortcutsStorage

public final class  extends b
    implements Provider
{

    private b propeller;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/search/suggestions/ShortcutsStorage, getClass().getClassLoader());
    }

    public final ShortcutsStorage get()
    {
        return new ShortcutsStorage((PropellerDatabase)propeller.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
    }

    public ()
    {
        super("com.soundcloud.android.search.suggestions.ShortcutsStorage", "members/com.soundcloud.android.search.suggestions.ShortcutsStorage", false, com/soundcloud/android/search/suggestions/ShortcutsStorage);
    }
}

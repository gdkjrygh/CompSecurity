// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import dagger.MembersInjector;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.search:
//            SearchMultipleSourceAdapter

public final class SearchMultipleSourceAdapter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;

    public SearchMultipleSourceAdapter_Factory(MembersInjector membersinjector)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        } else
        {
            membersInjector = membersinjector;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector)
    {
        return new SearchMultipleSourceAdapter_Factory(membersinjector);
    }

    public final SearchMultipleSourceAdapter get()
    {
        SearchMultipleSourceAdapter searchmultiplesourceadapter = new SearchMultipleSourceAdapter();
        membersInjector.injectMembers(searchmultiplesourceadapter);
        return searchmultiplesourceadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/search/SearchMultipleSourceAdapter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

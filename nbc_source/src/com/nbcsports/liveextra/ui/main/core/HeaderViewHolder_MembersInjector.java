// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            HeaderViewHolder

public final class HeaderViewHolder_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider picassoProvider;
    private final MembersInjector supertypeInjector;

    public HeaderViewHolder_MembersInjector(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            picassoProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new HeaderViewHolder_MembersInjector(membersinjector, provider);
    }

    public void injectMembers(HeaderViewHolder headerviewholder)
    {
        if (headerviewholder == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(headerviewholder);
            headerviewholder.picasso = (Picasso)picassoProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((HeaderViewHolder)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/core/HeaderViewHolder_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

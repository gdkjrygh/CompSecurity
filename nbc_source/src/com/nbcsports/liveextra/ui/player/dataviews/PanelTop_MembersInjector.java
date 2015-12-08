// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.dataviews;

import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.dataviews:
//            DataEngine, PanelTop

public final class PanelTop_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider engineProvider;
    private final MembersInjector supertypeInjector;
    private final Provider viewModelProvider;

    public PanelTop_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        engineProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            viewModelProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new PanelTop_MembersInjector(membersinjector, provider, provider1);
    }

    public void injectMembers(PanelTop paneltop)
    {
        if (paneltop == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(paneltop);
            paneltop.engine = (DataEngine)engineProvider.get();
            paneltop.viewModel = (AssetViewModel)viewModelProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PanelTop)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/dataviews/PanelTop_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

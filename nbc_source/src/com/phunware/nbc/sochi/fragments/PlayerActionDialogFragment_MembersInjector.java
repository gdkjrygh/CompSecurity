// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import com.nbcsports.liveextra.library.tve.AuthService;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            PlayerActionDialogFragment

public final class PlayerActionDialogFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider passProvider;
    private final MembersInjector supertypeInjector;

    public PlayerActionDialogFragment_MembersInjector(MembersInjector membersinjector, Provider provider)
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
            passProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new PlayerActionDialogFragment_MembersInjector(membersinjector, provider);
    }

    public void injectMembers(PlayerActionDialogFragment playeractiondialogfragment)
    {
        if (playeractiondialogfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(playeractiondialogfragment);
            playeractiondialogfragment.pass = (AuthService)passProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerActionDialogFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/fragments/PlayerActionDialogFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

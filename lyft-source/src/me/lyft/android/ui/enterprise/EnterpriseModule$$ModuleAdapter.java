// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            EnterpriseModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.enterprise.WorkPerksEditEmailView", "members/me.lyft.android.ui.enterprise.WorkPerksEnterEmailView", "members/me.lyft.android.ui.enterprise.WorkPerksInviteCoworkersScreenView", "members/me.lyft.android.ui.enterprise.WorkPerksInviteCoworkersSelectScreenView", "members/me.lyft.android.ui.enterprise.WorkPerksInviteCoworkersViaContactsView", "members/me.lyft.android.ui.enterprise.WorkPerksInviteCoworkersView", "members/me.lyft.android.ui.enterprise.WorkPerksMainView", "members/me.lyft.android.ui.enterprise.WorkPerksVerifyEmailScreenView", "members/me.lyft.android.ui.enterprise.WorkPerksVerifyEmailSelectScreenView", "members/me.lyft.android.ui.enterprise.WorkPerksVerifyEmailView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile Object newModule()
    {
        return newModule();
    }

    public EnterpriseModule newModule()
    {
        return new EnterpriseModule();
    }


    public ()
    {
        super(me/lyft/android/ui/enterprise/EnterpriseModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, false);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.ui.invites:
//            InvitesModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.invites.InviteScreenView", "members/me.lyft.android.ui.invites.BottomSheetDialogView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile Object newModule()
    {
        return newModule();
    }

    public InvitesModule newModule()
    {
        return new InvitesModule();
    }


    public ()
    {
        super(me/lyft/android/ui/invites/InvitesModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, false);
    }
}

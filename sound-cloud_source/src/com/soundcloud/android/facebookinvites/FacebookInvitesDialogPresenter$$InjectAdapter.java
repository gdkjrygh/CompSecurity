// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.facebookinvites:
//            FacebookInvitesDialogPresenter

public final class  extends b
    implements Provider
{

    public final FacebookInvitesDialogPresenter get()
    {
        return new FacebookInvitesDialogPresenter();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.facebookinvites.FacebookInvitesDialogPresenter", "members/com.soundcloud.android.facebookinvites.FacebookInvitesDialogPresenter", false, com/soundcloud/android/facebookinvites/FacebookInvitesDialogPresenter);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import com.soundcloud.android.image.ImageOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.facebookinvites:
//            FacebookInvitesItemRenderer, FacebookInvitesStorage

public final class  extends b
    implements Provider
{

    private b facebookInvitesStorage;
    private b imageOperations;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/facebookinvites/FacebookInvitesItemRenderer, getClass().getClassLoader());
        facebookInvitesStorage = l1.a("com.soundcloud.android.facebookinvites.FacebookInvitesStorage", com/soundcloud/android/facebookinvites/FacebookInvitesItemRenderer, getClass().getClassLoader());
    }

    public final FacebookInvitesItemRenderer get()
    {
        return new FacebookInvitesItemRenderer((ImageOperations)imageOperations.get(), (FacebookInvitesStorage)facebookInvitesStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(facebookInvitesStorage);
    }

    public ()
    {
        super("com.soundcloud.android.facebookinvites.FacebookInvitesItemRenderer", "members/com.soundcloud.android.facebookinvites.FacebookInvitesItemRenderer", false, com/soundcloud/android/facebookinvites/FacebookInvitesItemRenderer);
    }
}

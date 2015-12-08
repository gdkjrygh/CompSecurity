// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.likes:
//            UpdateLikeCommand

public final class  extends b
    implements a, Provider
{

    private b propeller;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/likes/UpdateLikeCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.WriteStorageCommand", com/soundcloud/android/likes/UpdateLikeCommand, getClass().getClassLoader(), false);
    }

    public final UpdateLikeCommand get()
    {
        UpdateLikeCommand updatelikecommand = new UpdateLikeCommand((PropellerDatabase)propeller.get());
        injectMembers(updatelikecommand);
        return updatelikecommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set1.add(supertype);
    }

    public final void injectMembers(UpdateLikeCommand updatelikecommand)
    {
        supertype.injectMembers(updatelikecommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateLikeCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.likes.UpdateLikeCommand", "members/com.soundcloud.android.likes.UpdateLikeCommand", false, com/soundcloud/android/likes/UpdateLikeCommand);
    }
}

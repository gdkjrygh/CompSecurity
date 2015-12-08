// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            RemoveStalePromotedItemsCommand

public final class  extends b
    implements a, Provider
{

    private b dateProvider;
    private b propeller;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/stream/RemoveStalePromotedItemsCommand, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/stream/RemoveStalePromotedItemsCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.WriteStorageCommand", com/soundcloud/android/stream/RemoveStalePromotedItemsCommand, getClass().getClassLoader(), false);
    }

    public final RemoveStalePromotedItemsCommand get()
    {
        RemoveStalePromotedItemsCommand removestalepromoteditemscommand = new RemoveStalePromotedItemsCommand((PropellerDatabase)propeller.get(), (CurrentDateProvider)dateProvider.get());
        injectMembers(removestalepromoteditemscommand);
        return removestalepromoteditemscommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(dateProvider);
        set1.add(supertype);
    }

    public final void injectMembers(RemoveStalePromotedItemsCommand removestalepromoteditemscommand)
    {
        supertype.injectMembers(removestalepromoteditemscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RemoveStalePromotedItemsCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.stream.RemoveStalePromotedItemsCommand", "members/com.soundcloud.android.stream.RemoveStalePromotedItemsCommand", false, com/soundcloud/android/stream/RemoveStalePromotedItemsCommand);
    }
}

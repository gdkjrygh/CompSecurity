// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.startup.migrations;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.startup.migrations:
//            DiskCacheMigration

public final class Q extends b
    implements Provider
{

    public final DiskCacheMigration get()
    {
        return new DiskCacheMigration();
    }

    public final volatile Object get()
    {
        return get();
    }

    public Q()
    {
        super("com.soundcloud.android.startup.migrations.DiskCacheMigration", "members/com.soundcloud.android.startup.migrations.DiskCacheMigration", false, com/soundcloud/android/startup/migrations/DiskCacheMigration);
    }
}

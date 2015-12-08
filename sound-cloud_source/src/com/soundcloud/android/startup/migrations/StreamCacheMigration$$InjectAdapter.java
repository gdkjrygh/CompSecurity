// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.startup.migrations;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.startup.migrations:
//            StreamCacheMigration

public final class  extends b
    implements Provider
{

    public final StreamCacheMigration get()
    {
        return new StreamCacheMigration();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.startup.migrations.StreamCacheMigration", "members/com.soundcloud.android.startup.migrations.StreamCacheMigration", false, com/soundcloud/android/startup/migrations/StreamCacheMigration);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.startup.migrations;

import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.startup.migrations:
//            MigrationEngine, Migration

private static class currentVersion
    implements Predicate
{

    private final int currentVersion;
    private final int previousVersionCode;

    public boolean apply(Migration migration)
    {
        return migration.getApplicableAppVersionCode() > previousVersionCode && migration.getApplicableAppVersionCode() <= currentVersion;
    }

    public volatile boolean apply(Object obj)
    {
        return apply((Migration)obj);
    }

    public (int i, int j)
    {
        previousVersionCode = i;
        currentVersion = j;
    }
}

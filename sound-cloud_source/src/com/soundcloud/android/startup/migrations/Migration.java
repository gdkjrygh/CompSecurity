// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.startup.migrations;

import java.util.Comparator;

interface Migration
{

    public static final Comparator APPLICABLE_VERSION_COMPARATOR = new _cls1();

    public abstract void applyMigration();

    public abstract int getApplicableAppVersionCode();


    private class _cls1
        implements Comparator
    {

        public final int compare(Migration migration, Migration migration1)
        {
            return migration.getApplicableAppVersionCode() - migration1.getApplicableAppVersionCode();
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((Migration)obj, (Migration)obj1);
        }

        _cls1()
        {
        }
    }

}

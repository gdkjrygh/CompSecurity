// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.crypto;

import KO;
import afw;

public final class SlightlySecurePreferences_Factory extends Enum
    implements afw
{

    private static final SlightlySecurePreferences_Factory $VALUES[];
    public static final SlightlySecurePreferences_Factory INSTANCE;

    private SlightlySecurePreferences_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static SlightlySecurePreferences_Factory valueOf(String s)
    {
        return (SlightlySecurePreferences_Factory)Enum.valueOf(com/snapchat/android/util/crypto/SlightlySecurePreferences_Factory, s);
    }

    public static SlightlySecurePreferences_Factory[] values()
    {
        return (SlightlySecurePreferences_Factory[])$VALUES.clone();
    }

    public final KO get()
    {
        return new KO();
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new SlightlySecurePreferences_Factory("INSTANCE");
        $VALUES = (new SlightlySecurePreferences_Factory[] {
            INSTANCE
        });
    }
}

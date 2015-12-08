// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import Ij;
import afw;

public final class DebitCardNumberValidator_Factory extends Enum
    implements afw
{

    private static final DebitCardNumberValidator_Factory $VALUES[];
    public static final DebitCardNumberValidator_Factory INSTANCE;

    private DebitCardNumberValidator_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static DebitCardNumberValidator_Factory valueOf(String s)
    {
        return (DebitCardNumberValidator_Factory)Enum.valueOf(com/snapchat/android/util/DebitCardNumberValidator_Factory, s);
    }

    public static DebitCardNumberValidator_Factory[] values()
    {
        return (DebitCardNumberValidator_Factory[])$VALUES.clone();
    }

    public final Ij get()
    {
        return new Ij();
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new DebitCardNumberValidator_Factory("INSTANCE");
        $VALUES = (new DebitCardNumberValidator_Factory[] {
            INSTANCE
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.util.network;

import Bt;
import LA;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.SharedPreferenceKey;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public final class DiscoverEndpointManager
    implements Observer
{
    public static final class Compatibility extends Enum
    {

        private static final Compatibility $VALUES[];
        public static final Compatibility DEVICE_NOT_SUPPORTED;
        public static final Compatibility NOT_SUPPORTED;
        public static final Compatibility REGION_NOT_SUPPORTED;
        public static final Compatibility SUPPORTED;
        public static final Compatibility UNKNOWN;

        public static Compatibility fromString(String s)
        {
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            Compatibility compatibility = valueOf(s.toUpperCase(Locale.ENGLISH));
            return compatibility;
            Exception exception;
            exception;
            Timber.e("DiscoverEndpointManager", "Unknown compatibility value %s", new Object[] {
                s
            });
            return NOT_SUPPORTED;
        }

        public static Compatibility valueOf(String s)
        {
            return (Compatibility)Enum.valueOf(com/snapchat/android/discover/util/network/DiscoverEndpointManager$Compatibility, s);
        }

        public static Compatibility[] values()
        {
            return (Compatibility[])$VALUES.clone();
        }

        static 
        {
            SUPPORTED = new Compatibility("SUPPORTED", 0);
            NOT_SUPPORTED = new Compatibility("NOT_SUPPORTED", 1);
            REGION_NOT_SUPPORTED = new Compatibility("REGION_NOT_SUPPORTED", 2);
            DEVICE_NOT_SUPPORTED = new Compatibility("DEVICE_NOT_SUPPORTED", 3);
            UNKNOWN = new Compatibility("UNKNOWN", 4);
            $VALUES = (new Compatibility[] {
                SUPPORTED, NOT_SUPPORTED, REGION_NOT_SUPPORTED, DEVICE_NOT_SUPPORTED, UNKNOWN
            });
        }

        private Compatibility(String s, int j)
        {
            super(s, j);
        }
    }

    public static interface a
    {

        public abstract void c();
    }


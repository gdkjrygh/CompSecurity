// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

public class BondInfo
{
    public static final class BondedDeviceType extends Enum
    {

        private static final BondedDeviceType $VALUES[];
        public static final BondedDeviceType Android;
        public static final BondedDeviceType Other;
        public static final BondedDeviceType Unknown;

        public static BondedDeviceType valueOf(String s)
        {
            return (BondedDeviceType)Enum.valueOf(com/fitbit/data/domain/device/BondInfo$BondedDeviceType, s);
        }

        public static BondedDeviceType[] values()
        {
            return (BondedDeviceType[])$VALUES.clone();
        }

        static 
        {
            Android = new BondedDeviceType("Android", 0);
            Other = new BondedDeviceType("Other", 1);
            Unknown = new BondedDeviceType("Unknown", 2);
            $VALUES = (new BondedDeviceType[] {
                Android, Other, Unknown
            });
        }

        private BondedDeviceType(String s, int i)
        {
            super(s, i);
        }
    }


    public final BondedDeviceType a;
    public final String b;
    public final String c;

    BondInfo()
    {
        this(null, null);
    }

    BondInfo(String s, String s1)
    {
        a = a(s);
        b = s1;
        c = s;
    }

    private static BondedDeviceType a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = s.toLowerCase();
        }
        if (TextUtils.isEmpty(s))
        {
            return BondedDeviceType.Unknown;
        }
        if (s.startsWith(BondedDeviceType.Android.name().toLowerCase()))
        {
            return BondedDeviceType.Android;
        } else
        {
            return BondedDeviceType.Other;
        }
    }

    public static BondInfo a(Context context)
    {
        return new BondInfo(String.format("Android/%s/%s/%s", new Object[] {
            Build.BRAND, Build.DEVICE, Build.BOARD
        }), android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"));
    }
}

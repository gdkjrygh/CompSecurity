// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.google.a.a.t;

public final class WalletType extends Enum
{

    private static final WalletType $VALUES[];
    public static final WalletType GOOGLE;
    public static final WalletType UNKNOWN;
    public static final t fromStringFn = new _cls1();
    private final String name;

    private WalletType(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static WalletType valueOf(String s)
    {
        return (WalletType)Enum.valueOf(com/dominos/android/sdk/common/dom/order/WalletType, s);
    }

    public static WalletType[] values()
    {
        return (WalletType[])$VALUES.clone();
    }

    public final String toString()
    {
        return name;
    }

    static 
    {
        GOOGLE = new WalletType("GOOGLE", 0, "Google");
        UNKNOWN = new WalletType("UNKNOWN", 1, "");
        $VALUES = (new WalletType[] {
            GOOGLE, UNKNOWN
        });
    }

    private class _cls1
        implements t
    {

        public final WalletType apply(String s)
        {
            if (WalletType.GOOGLE.toString().equals(s))
            {
                return WalletType.GOOGLE;
            } else
            {
                return WalletType.UNKNOWN;
            }
        }

        public final volatile Object apply(Object obj)
        {
            return apply((String)obj);
        }

        _cls1()
        {
        }
    }

}

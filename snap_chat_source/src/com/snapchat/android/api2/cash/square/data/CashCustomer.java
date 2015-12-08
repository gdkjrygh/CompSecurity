// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash.square.data;


public final class CashCustomer
{
    public static final class Role extends Enum
    {

        private static final Role $VALUES[];
        public static final Role RECIPIENT;
        public static final Role SENDER;

        public static Role valueOf(String s)
        {
            return (Role)Enum.valueOf(com/snapchat/android/api2/cash/square/data/CashCustomer$Role, s);
        }

        public static Role[] values()
        {
            return (Role[])$VALUES.clone();
        }

        static 
        {
            RECIPIENT = new Role("RECIPIENT", 0);
            SENDER = new Role("SENDER", 1);
            $VALUES = (new Role[] {
                RECIPIENT, SENDER
            });
        }

        private Role(String s, int i)
        {
            super(s, i);
        }
    }


    private final String mEmail = null;
    private final String mId;
    private final String mPhoneNumber = null;

    public CashCustomer(String s)
    {
        mId = s;
    }
}

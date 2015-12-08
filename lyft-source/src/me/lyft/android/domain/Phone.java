// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain;

import me.lyft.android.common.INullable;

public class Phone
    implements INullable
{

    String number;
    Boolean verificationNeeded;

    public Phone()
    {
    }

    public static Phone empty()
    {
        return NullPhone.getInstance();
    }

    public String getNumber()
    {
        return number;
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isVerificationNeeded()
    {
        if (verificationNeeded == null)
        {
            return true;
        } else
        {
            return verificationNeeded.booleanValue();
        }
    }

    public void setNumber(String s)
    {
        number = s;
    }

    public void setVerificationNeeded(boolean flag)
    {
        verificationNeeded = Boolean.valueOf(flag);
    }

    private class NullPhone extends Phone
    {

        private static Phone INSTANCE = new NullPhone();

        static Phone getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullPhone()
        {
        }
    }

}

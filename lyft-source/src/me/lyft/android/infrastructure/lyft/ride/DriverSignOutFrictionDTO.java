// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import me.lyft.android.common.INullable;

public class DriverSignOutFrictionDTO
    implements INullable
{

    String keepDrivingButtonText;
    String messageText;
    Boolean showSignoutFriction;
    String signOutButtonText;
    String titleText;

    public DriverSignOutFrictionDTO()
    {
    }

    public static DriverSignOutFrictionDTO empty()
    {
        return NullDriverSignOutFrictionDTO.getInstance();
    }

    public String getKeepDrivingButtonText()
    {
        return keepDrivingButtonText;
    }

    public String getMessageText()
    {
        return messageText;
    }

    public Boolean getShowSignoutFriction()
    {
        return showSignoutFriction;
    }

    public String getSignOutButtonText()
    {
        return signOutButtonText;
    }

    public String getTitleText()
    {
        return titleText;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullDriverSignOutFrictionDTO extends DriverSignOutFrictionDTO
    {

        private static final DriverSignOutFrictionDTO INSTANCE = new NullDriverSignOutFrictionDTO();

        public static DriverSignOutFrictionDTO getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        NullDriverSignOutFrictionDTO()
        {
        }
    }

}

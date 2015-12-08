// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.profile;

import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.profile.Profile;

public interface IProfileProvider
{

    public abstract Profile getDriverProfile();

    public abstract Profile getMyProfile();

    public abstract Profile getPassengerProfile(String s);

    public abstract Driver getSelfAsDriver();
}

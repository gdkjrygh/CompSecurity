// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.stream.NotificationItem;

public class StationOnboardingStreamItem extends NotificationItem
{

    public static final Urn URN = new Urn("soundcloud:notifications:stations-onboarding");

    public StationOnboardingStreamItem()
    {
    }

    public Urn getEntityUrn()
    {
        return URN;
    }

}

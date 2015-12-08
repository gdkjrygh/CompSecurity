// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.common.AdReport;
import com.mopub.mraid.MraidController;
import com.mopub.mraid.PlacementType;

public class MraidControllerFactory
{

    protected static MraidControllerFactory a = new MraidControllerFactory();

    public MraidControllerFactory()
    {
    }

    public static MraidController create(Context context, AdReport adreport, PlacementType placementtype)
    {
        return new MraidController(context, adreport, placementtype);
    }

    public static void setInstance(MraidControllerFactory mraidcontrollerfactory)
    {
        a = mraidcontrollerfactory;
    }

}

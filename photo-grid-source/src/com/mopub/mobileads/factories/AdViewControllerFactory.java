// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.mobileads.AdViewController;
import com.mopub.mobileads.MoPubView;

public class AdViewControllerFactory
{

    protected static AdViewControllerFactory a = new AdViewControllerFactory();

    public AdViewControllerFactory()
    {
    }

    public static AdViewController create(Context context, MoPubView mopubview)
    {
        return new AdViewController(context, mopubview);
    }

    public static void setInstance(AdViewControllerFactory adviewcontrollerfactory)
    {
        a = adviewcontrollerfactory;
    }

}

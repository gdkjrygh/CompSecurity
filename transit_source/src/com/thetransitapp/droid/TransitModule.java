// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.binder.AnnotatedBindingBuilder;
import com.thetransitapp.droid.data.OnlineTransitSource;
import com.thetransitapp.droid.data.TransitSource;

// Referenced classes of package com.thetransitapp.droid:
//            RoutesScreen

public class TransitModule
    implements Module
{

    public TransitModule()
    {
    }

    public void configure(Binder binder)
    {
        binder.bind(com/thetransitapp/droid/data/TransitSource).to(com/thetransitapp/droid/data/OnlineTransitSource);
        binder.bind(com/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback).to(com/thetransitapp/droid/RoutesScreen);
    }
}

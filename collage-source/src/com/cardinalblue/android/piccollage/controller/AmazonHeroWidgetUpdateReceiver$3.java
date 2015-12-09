// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            AmazonHeroWidgetUpdateReceiver

class a
    implements Callable
{

    final AmazonHeroWidgetUpdateReceiver a;

    public CBCollagesResponse a()
        throws Exception
    {
        CBCollagesResponse cbcollagesresponse;
        try
        {
            cbcollagesresponse = f.l();
        }
        catch (Exception exception)
        {
            com.cardinalblue.android.piccollage.a.f.a(exception);
            return null;
        }
        return cbcollagesresponse;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (AmazonHeroWidgetUpdateReceiver amazonherowidgetupdatereceiver)
    {
        a = amazonherowidgetupdatereceiver;
        super();
    }
}

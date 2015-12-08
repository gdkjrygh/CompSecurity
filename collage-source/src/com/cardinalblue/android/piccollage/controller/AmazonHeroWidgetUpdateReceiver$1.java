// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            AmazonHeroWidgetUpdateReceiver, d

class b
    implements i
{

    final String a;
    final String b;
    final AmazonHeroWidgetUpdateReceiver c;

    public Void a(j j1)
        throws Exception
    {
        CBCollagesResponse cbcollagesresponse = (CBCollagesResponse)j1.e();
        j1 = cbcollagesresponse;
        if (cbcollagesresponse == null)
        {
            j1 = new CBCollagesResponse();
        }
        d.a().c(new com.cardinalblue.android.piccollage.amazon.idgetEvent(a, b, j1.getPhotos()));
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    tEvent(AmazonHeroWidgetUpdateReceiver amazonherowidgetupdatereceiver, String s, String s1)
    {
        c = amazonherowidgetupdatereceiver;
        a = s;
        b = s1;
        super();
    }
}

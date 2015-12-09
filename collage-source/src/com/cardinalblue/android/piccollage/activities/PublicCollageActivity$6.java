// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PublicCollageActivity

class a
    implements Callable
{

    final WebPhoto a;
    final PublicCollageActivity b;

    public WebPhoto a()
        throws Exception
    {
        return f.j(a.getEchoProgenitor());
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PublicCollageActivity publiccollageactivity, WebPhoto webphoto)
    {
        b = publiccollageactivity;
        a = webphoto;
        super();
    }
}

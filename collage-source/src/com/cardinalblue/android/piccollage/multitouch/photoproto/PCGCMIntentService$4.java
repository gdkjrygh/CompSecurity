// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto:
//            PCGCMIntentService

class a
    implements Callable
{

    final String a;
    final PCGCMIntentService b;

    public WebPhoto a()
        throws Exception
    {
        return f.j(a);
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PCGCMIntentService pcgcmintentservice, String s)
    {
        b = pcgcmintentservice;
        a = s;
        super();
    }
}

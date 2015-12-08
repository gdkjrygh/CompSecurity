// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import android.os.Bundle;
import bolts.i;
import bolts.j;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto:
//            PCGCMIntentService

class c
    implements i
{

    final String a;
    final android.support.v4.app.lder b;
    final String c;
    final PCGCMIntentService d;

    public j a(j j)
        throws Exception
    {
        j = new Bundle();
        j.putString("flurry_event", a);
        return PCGCMIntentService.a(d, d, b, c, j);
    }

    public Object then(j j)
        throws Exception
    {
        return a(j);
    }

    (PCGCMIntentService pcgcmintentservice, String s, android.support.v4.app.lder lder, String s1)
    {
        d = pcgcmintentservice;
        a = s;
        b = lder;
        c = s1;
        super();
    }
}

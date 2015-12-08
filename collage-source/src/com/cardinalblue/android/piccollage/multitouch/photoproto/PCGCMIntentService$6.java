// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import android.graphics.Bitmap;
import bolts.i;
import bolts.j;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto:
//            PCGCMIntentService

class c
    implements i
{

    final android.support.v4.app.ilder a;
    final String b;
    final String c;
    final PCGCMIntentService d;

    public Void a(j j1)
        throws Exception
    {
        if (!j1.d())
        {
            j1 = (Bitmap)j1.e();
            j1.setDensity(160);
            a.setLargeIcon(j1);
            android.support.v4.app.gPictureStyle gpicturestyle = new android.support.v4.app.gPictureStyle();
            gpicturestyle.setBigContentTitle(b).setSummaryText(c);
            gpicturestyle.bigPicture(j1);
            a.setStyle(gpicturestyle);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PCGCMIntentService pcgcmintentservice, android.support.v4.app.ilder ilder, String s, String s1)
    {
        d = pcgcmintentservice;
        a = ilder;
        b = s;
        c = s1;
        super();
    }
}

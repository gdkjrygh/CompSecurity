// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrAuthenActivity

final class a
    implements android.content.DialogInterface.OnClickListener
{

    final FlickrAuthenActivity a;

    a(FlickrAuthenActivity flickrauthenactivity)
    {
        a = flickrauthenactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.startActivityForResult(new Intent("android.settings.WIFI_SETTINGS"), 1);
    }
}

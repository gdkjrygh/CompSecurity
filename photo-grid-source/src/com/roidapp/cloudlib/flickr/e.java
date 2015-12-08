// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrAuthenActivity

final class e
    implements android.content.DialogInterface.OnCancelListener
{

    final FlickrAuthenActivity a;

    e(FlickrAuthenActivity flickrauthenactivity)
    {
        a = flickrauthenactivity;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.finish();
    }
}

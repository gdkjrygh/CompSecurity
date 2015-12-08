// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrPhotoFragment

final class r
    implements android.content.DialogInterface.OnClickListener
{

    final FlickrPhotoFragment a;

    r(FlickrPhotoFragment flickrphotofragment)
    {
        a = flickrphotofragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        FlickrPhotoFragment.a(a);
    }
}

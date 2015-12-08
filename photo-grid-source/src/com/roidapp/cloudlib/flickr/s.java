// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrPhotoFragment

final class s
    implements android.view.View.OnClickListener
{

    final FlickrPhotoFragment a;

    s(FlickrPhotoFragment flickrphotofragment)
    {
        a = flickrphotofragment;
        super();
    }

    public final void onClick(View view)
    {
        FlickrPhotoFragment.b(a);
    }
}

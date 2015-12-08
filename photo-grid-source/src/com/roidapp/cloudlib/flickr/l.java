// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrListCloud

final class l
    implements android.widget.AdapterView.OnItemClickListener
{

    final FlickrListCloud a;

    l(FlickrListCloud flickrlistcloud)
    {
        a = flickrlistcloud;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            FlickrListCloud.a(a, true);
            return;

        case 1: // '\001'
            FlickrListCloud.a(a, false);
            break;
        }
    }
}

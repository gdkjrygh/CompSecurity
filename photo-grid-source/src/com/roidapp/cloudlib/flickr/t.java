// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrPhotoFragment

final class t
    implements android.widget.TextView.OnEditorActionListener
{

    final FlickrPhotoFragment a;

    t(FlickrPhotoFragment flickrphotofragment)
    {
        a = flickrphotofragment;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3)
        {
            FlickrPhotoFragment.b(a);
        }
        return false;
    }
}

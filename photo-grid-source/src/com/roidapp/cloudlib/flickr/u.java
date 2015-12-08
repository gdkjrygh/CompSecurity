// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrPhotoFragment

final class u
    implements android.content.DialogInterface.OnKeyListener
{

    final FlickrPhotoFragment a;

    u(FlickrPhotoFragment flickrphotofragment)
    {
        a = flickrphotofragment;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getAction() == 1)
        {
            FlickrPhotoFragment.a(a);
        }
        return false;
    }
}

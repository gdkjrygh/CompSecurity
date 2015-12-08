// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.app.Activity;
import com.googlecode.flickrjandroid.photos.Photo;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.roidapp.cloudlib.ad;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrPhotoFragment

final class w extends ad
{

    final FlickrPhotoFragment e;
    private PhotoList f;
    private int g;

    public w(FlickrPhotoFragment flickrphotofragment, Activity activity)
    {
        e = flickrphotofragment;
        super(flickrphotofragment, activity);
        f = new PhotoList();
        g = 10;
    }

    public final String a(int i)
    {
        if (f != null)
        {
            return ((Photo)f.get(i)).getSmallSquareUrl();
        } else
        {
            return "";
        }
    }

    public final void a(PhotoList photolist)
    {
        if (f != null && photolist != null)
        {
            g = photolist.getPages();
            f.addAll(photolist);
            FlickrPhotoFragment.a(e, f.size());
            notifyDataSetChanged();
        }
    }

    public final String b(int i)
    {
        if (f != null)
        {
            return ((Photo)f.get(i)).getLargeUrl();
        } else
        {
            return "";
        }
    }

    public final void b()
    {
        g = 10;
        f.clear();
        FlickrPhotoFragment.a(e, 0);
    }

    public final int c()
    {
        return g;
    }

    public final int getCount()
    {
        return f.size();
    }

    public final Object getItem(int i)
    {
        return f.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }
}

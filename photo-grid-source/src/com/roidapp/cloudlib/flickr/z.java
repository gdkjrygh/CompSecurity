// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import com.googlecode.flickrjandroid.Flickr;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotosInterface;
import com.googlecode.flickrjandroid.photos.SearchParameters;
import com.roidapp.baselib.c.c;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrPhotoFragment, k

public final class z extends c
{

    private String a;
    private WeakReference b;

    public z(FlickrPhotoFragment flickrphotofragment, String s)
    {
        a = null;
        b = new WeakReference(flickrphotofragment);
        a = s;
    }

    private transient PhotoList a()
    {
        FlickrPhotoFragment flickrphotofragment = (FlickrPhotoFragment)b.get();
        if (flickrphotofragment == null)
        {
            return null;
        }
        k.a();
        Object obj = k.b();
        HashSet hashset;
        SearchParameters searchparameters;
        int i;
        if (obj != null)
        {
            obj = ((Flickr) (obj)).getPhotosInterface();
        } else
        {
            obj = null;
        }
        hashset = new HashSet();
        hashset.add("url_sq");
        hashset.add("url_l");
        hashset.add("views");
        searchparameters = new SearchParameters();
        searchparameters.setExtras(hashset);
        searchparameters.setText(a);
        i = flickrphotofragment.o;
        try
        {
            searchparameters.setMedia("photos");
            obj = ((PhotosInterface) (obj)).search(searchparameters, 100, i);
        }
        catch (Exception exception)
        {
            flickrphotofragment.a(exception);
            exception.printStackTrace();
            return null;
        }
        return ((PhotoList) (obj));
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (PhotoList)obj;
        FlickrPhotoFragment flickrphotofragment = (FlickrPhotoFragment)b.get();
        if (flickrphotofragment != null)
        {
            flickrphotofragment.a(((PhotoList) (obj)));
        }
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
    }
}

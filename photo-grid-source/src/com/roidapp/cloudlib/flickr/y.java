// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import com.googlecode.flickrjandroid.Flickr;
import com.googlecode.flickrjandroid.interestingness.InterestingnessInterface;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.roidapp.baselib.c.c;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrPhotoFragment, k

public final class y extends c
{

    private WeakReference a;

    public y(FlickrPhotoFragment flickrphotofragment)
    {
        a = new WeakReference(flickrphotofragment);
    }

    private transient PhotoList a()
    {
        FlickrPhotoFragment flickrphotofragment = (FlickrPhotoFragment)a.get();
        if (flickrphotofragment == null)
        {
            return null;
        }
        k.a();
        Object obj = k.b();
        HashSet hashset;
        int i;
        if (obj != null)
        {
            obj = ((Flickr) (obj)).getInterestingnessInterface();
        } else
        {
            obj = null;
        }
        hashset = new HashSet();
        hashset.add("tags");
        hashset.add("geo");
        hashset.add("owner_name");
        hashset.add("views");
        i = flickrphotofragment.o;
        try
        {
            obj = ((InterestingnessInterface) (obj)).getList(null, hashset, 100, i);
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
        FlickrPhotoFragment flickrphotofragment = (FlickrPhotoFragment)a.get();
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

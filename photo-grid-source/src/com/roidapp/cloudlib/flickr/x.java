// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import com.googlecode.flickrjandroid.Flickr;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.googlecode.flickrjandroid.oauth.OAuthToken;
import com.googlecode.flickrjandroid.people.PeopleInterface;
import com.googlecode.flickrjandroid.people.User;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.roidapp.baselib.c.c;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrPhotoFragment, k

public final class x extends c
{

    private WeakReference a;

    public x(FlickrPhotoFragment flickrphotofragment)
    {
        a = new WeakReference(flickrphotofragment);
    }

    private transient PhotoList a(OAuth aoauth[])
    {
        FlickrPhotoFragment flickrphotofragment = (FlickrPhotoFragment)a.get();
        if (flickrphotofragment == null)
        {
            return null;
        }
        Object obj = aoauth[0].getToken();
        k.a();
        obj = k.a(((OAuthToken) (obj)).getOauthToken(), ((OAuthToken) (obj)).getOauthTokenSecret());
        HashSet hashset = new HashSet();
        hashset.add("url_sq");
        hashset.add("url_l");
        hashset.add("views");
        aoauth = aoauth[0].getUser();
        int i = flickrphotofragment.o;
        try
        {
            aoauth = ((Flickr) (obj)).getPeopleInterface().getPhotos(aoauth.getId(), hashset, 100, i);
        }
        // Misplaced declaration of an exception variable
        catch (OAuth aoauth[])
        {
            flickrphotofragment.a(aoauth);
            aoauth.printStackTrace();
            return null;
        }
        return aoauth;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((OAuth[])aobj);
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

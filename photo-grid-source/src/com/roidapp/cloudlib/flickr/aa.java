// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import com.googlecode.flickrjandroid.Flickr;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.googlecode.flickrjandroid.oauth.OAuthToken;
import com.googlecode.flickrjandroid.people.PeopleInterface;
import com.googlecode.flickrjandroid.people.User;
import com.roidapp.baselib.c.c;
import com.roidapp.cloudlib.common.a;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            k, FlickrPhotoFragment

public final class aa extends c
{

    private final FlickrPhotoFragment a;

    public aa(FlickrPhotoFragment flickrphotofragment)
    {
        a = flickrphotofragment;
    }

    private static transient User a(OAuth aoauth[])
    {
        Object obj = aoauth[0];
        if (obj == null)
        {
            return null;
        }
        aoauth = ((OAuth) (obj)).getUser();
        obj = ((OAuth) (obj)).getToken();
        try
        {
            com.roidapp.cloudlib.flickr.k.a();
            aoauth = com.roidapp.cloudlib.flickr.k.a(((OAuthToken) (obj)).getOauthToken(), ((OAuthToken) (obj)).getOauthTokenSecret()).getPeopleInterface().getInfo(aoauth.getId());
        }
        // Misplaced declaration of an exception variable
        catch (OAuth aoauth[])
        {
            FlickrPhotoFragment.h();
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
        Object obj1 = (User)obj;
        if (obj1 != null)
        {
            obj = a;
            if (((User) (obj1)).getUsername() != null)
            {
                com.roidapp.cloudlib.common.a.a(((FlickrPhotoFragment) (obj)).getActivity(), ((User) (obj1)).getUsername());
            }
            obj1 = ((User) (obj1)).getBuddyIconUrl();
            if (!com.roidapp.cloudlib.common.a.i(((FlickrPhotoFragment) (obj)).getActivity()).equals(obj1))
            {
                com.roidapp.cloudlib.common.a.b(((FlickrPhotoFragment) (obj)).getActivity(), ((String) (obj1)));
            }
        }
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.googlecode.flickrjandroid.Flickr;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.googlecode.flickrjandroid.oauth.OAuthInterface;
import com.googlecode.flickrjandroid.oauth.OAuthToken;
import com.googlecode.flickrjandroid.people.User;
import com.roidapp.baselib.c.c;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            k, FlickrAuthenActivity

public final class h extends c
{

    final FlickrAuthenActivity a;

    public h(FlickrAuthenActivity flickrauthenactivity)
    {
        a = flickrauthenactivity;
        super();
    }

    private transient OAuth a(String as[])
    {
        String s = as[0];
        String s1 = as[1];
        as = as[2];
        com.roidapp.cloudlib.flickr.k.a();
        OAuthInterface oauthinterface = k.b().getOAuthInterface();
        try
        {
            as = oauthinterface.getAccessToken(s, s1, as);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.e("AuthenticationActivity", as.getLocalizedMessage());
            publishProgress(new Throwable[] {
                as
            });
            return null;
        }
        return as;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (OAuth)obj;
        if (obj != null)
        {
            Object obj1 = ((OAuth) (obj)).getUser();
            OAuthToken oauthtoken = ((OAuth) (obj)).getToken();
            if (obj1 == null || ((User) (obj1)).getId() == null || oauthtoken == null || oauthtoken.getOauthToken() == null || oauthtoken.getOauthTokenSecret() == null)
            {
                Toast.makeText(a, at.i, 1).show();
                return;
            }
            com.roidapp.cloudlib.common.a.b(a, ((User) (obj1)).getUsername(), ((User) (obj1)).getId(), oauthtoken.getOauthToken(), oauthtoken.getOauthTokenSecret());
            com.roidapp.cloudlib.common.a.b(a, ((User) (obj1)).getBuddyIconUrl());
            obj1 = new Intent();
            ((Intent) (obj1)).putExtra("oauth", ((java.io.Serializable) (obj)));
            a.setResult(-1, ((Intent) (obj1)));
        } else
        {
            obj = new Intent();
            a.setResult(0, ((Intent) (obj)));
        }
        a.finish();
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
    }

    protected final void onProgressUpdate(Object aobj[])
    {
        aobj = (Throwable[])aobj;
        if (aobj != null && aobj.length > 0)
        {
            com.roidapp.cloudlib.flickr.FlickrAuthenActivity.a(a, ((Throwable) (aobj[0])).getMessage());
        }
    }
}

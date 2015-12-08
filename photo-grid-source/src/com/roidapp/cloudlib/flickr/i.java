// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.app.ProgressDialog;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import com.googlecode.flickrjandroid.Flickr;
import com.googlecode.flickrjandroid.auth.Permission;
import com.googlecode.flickrjandroid.oauth.OAuthInterface;
import com.googlecode.flickrjandroid.oauth.OAuthToken;
import com.roidapp.baselib.c.c;
import com.roidapp.cloudlib.common.a;
import java.net.URL;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrAuthenActivity, k

public final class i extends c
{

    final FlickrAuthenActivity a;
    private Uri b;

    public i(FlickrAuthenActivity flickrauthenactivity)
    {
        a = flickrauthenactivity;
        super();
        b = Uri.parse((new StringBuilder()).append(com.roidapp.cloudlib.flickr.FlickrAuthenActivity.a).append("://oauth").toString());
    }

    private transient String a()
    {
        Object obj;
        try
        {
            com.roidapp.cloudlib.flickr.k.a();
            obj = k.b();
            OAuthToken oauthtoken = ((Flickr) (obj)).getOAuthInterface().getRequestToken(b.toString());
            String s = oauthtoken.getOauthTokenSecret();
            com.roidapp.cloudlib.common.a.b(a, null, null, null, s);
            obj = ((Flickr) (obj)).getOAuthInterface().buildAuthenticationUrl(Permission.READ, oauthtoken).toString();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            Log.e("AuthenticationActivity", (new StringBuilder("Error to oauth, ")).append(exception.getMessage()).toString());
            publishProgress(new Throwable[] {
                exception
            });
            return null;
        }
        return ((String) (obj));
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onCancelled()
    {
        super.onCancelled();
        try
        {
            if (FlickrAuthenActivity.b(a) != null)
            {
                FlickrAuthenActivity.b(a).dismiss();
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            illegalargumentexception.printStackTrace();
        }
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (String)obj;
        if (FlickrAuthenActivity.b(a) != null)
        {
            FlickrAuthenActivity.b(a).dismiss();
        }
        if (obj != null)
        {
            com.roidapp.cloudlib.flickr.FlickrAuthenActivity.c(a).loadUrl(((String) (obj)));
        }
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
        FlickrAuthenActivity.b(a).show();
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.content.Context;
import com.googlecode.flickrjandroid.Flickr;
import com.googlecode.flickrjandroid.REST;
import com.googlecode.flickrjandroid.RequestContext;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.googlecode.flickrjandroid.oauth.OAuthToken;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.common.a;
import javax.xml.parsers.ParserConfigurationException;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            j

public final class k
{

    public static final String a;
    private static k b = null;
    private static final String c;

    private k()
    {
    }

    public static Flickr a(String s, String s1)
    {
        Flickr flickr = b();
        RequestContext requestcontext = RequestContext.getRequestContext();
        OAuth oauth = new OAuth();
        oauth.setToken(new OAuthToken(s, s1));
        requestcontext.setOAuth(oauth);
        return flickr;
    }

    public static k a()
    {
        if (b == null)
        {
            b = new k();
        }
        return b;
    }

    public static void a(Context context)
    {
        com.roidapp.cloudlib.common.a.b(context, null, null, null, null);
        com.roidapp.cloudlib.common.a.a(context, "");
        com.roidapp.cloudlib.common.a.b(context, "");
    }

    public static Flickr b()
    {
        Flickr flickr;
        try
        {
            flickr = new Flickr(c, a, new REST());
        }
        catch (ParserConfigurationException parserconfigurationexception)
        {
            return null;
        }
        return flickr;
    }

    static 
    {
        j j1 = (j)al.g().b("Flickr");
        c = j1.f;
        a = j1.g;
    }
}

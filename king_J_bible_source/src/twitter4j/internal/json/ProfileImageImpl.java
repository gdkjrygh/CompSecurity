// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import twitter4j.ProfileImage;
import twitter4j.internal.http.HttpResponse;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl

class ProfileImageImpl extends TwitterResponseImpl
    implements ProfileImage
{

    private static final long serialVersionUID = 0xcc81ce0153fb49afL;
    private String url;

    ProfileImageImpl(HttpResponse httpresponse)
    {
        super(httpresponse);
        url = httpresponse.getResponseHeader("Location");
    }

    public String getURL()
    {
        return url;
    }
}

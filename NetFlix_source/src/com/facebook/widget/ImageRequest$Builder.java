// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import com.facebook.internal.Validate;
import java.net.URL;

// Referenced classes of package com.facebook.widget:
//            ImageRequest

static class imageUrl
{

    private boolean allowCachedRedirects;
    private  callback;
    private Object callerTag;
    private Context context;
    private URL imageUrl;

    ImageRequest build()
    {
        return new ImageRequest(this, null);
    }

    imageUrl setAllowCachedRedirects(boolean flag)
    {
        allowCachedRedirects = flag;
        return this;
    }

     setCallback( )
    {
        callback = ;
        return this;
    }

    callback setCallerTag(Object obj)
    {
        callerTag = obj;
        return this;
    }






    (Context context1, URL url)
    {
        Validate.notNull(url, "imageUrl");
        context = context1;
        imageUrl = url;
    }
}

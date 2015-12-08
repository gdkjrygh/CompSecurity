// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import com.facebook.internal.Validate;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.facebook.widget:
//            ImageResponse

class ImageRequest
{
    static class Builder
    {

        private boolean allowCachedRedirects;
        private Callback callback;
        private Object callerTag;
        private Context context;
        private URL imageUrl;

        ImageRequest build()
        {
            return new ImageRequest(this);
        }

        Builder setAllowCachedRedirects(boolean flag)
        {
            allowCachedRedirects = flag;
            return this;
        }

        Builder setCallback(Callback callback1)
        {
            callback = callback1;
            return this;
        }

        Builder setCallerTag(Object obj)
        {
            callerTag = obj;
            return this;
        }






        Builder(Context context1, URL url)
        {
            Validate.notNull(url, "imageUrl");
            context = context1;
            imageUrl = url;
        }
    }

    static interface Callback
    {

        public abstract void onCompleted(ImageResponse imageresponse);
    }


    private static final String HEIGHT_PARAM = "height";
    private static final String MIGRATION_PARAM = "migration_overrides";
    private static final String MIGRATION_VALUE = "{october_2012:true}";
    private static final String PROFILEPIC_URL_FORMAT = "https://graph.facebook.com/%s/picture";
    static final int UNSPECIFIED_DIMENSION = 0;
    private static final String WIDTH_PARAM = "width";
    private boolean allowCachedRedirects;
    private Callback callback;
    private Object callerTag;
    private Context context;
    private URL imageUrl;

    private ImageRequest(Builder builder)
    {
        context = builder.context;
        imageUrl = builder.imageUrl;
        callback = builder.callback;
        allowCachedRedirects = builder.allowCachedRedirects;
        if (builder.callerTag == null)
        {
            builder = ((Builder) (new Object()));
        } else
        {
            builder = ((Builder) (builder.callerTag));
        }
        callerTag = builder;
    }


    static URL getProfilePictureUrl(String s, int i, int j)
        throws MalformedURLException
    {
        Validate.notNullOrEmpty(s, "userId");
        i = Math.max(i, 0);
        j = Math.max(j, 0);
        if (i == 0 && j == 0)
        {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        s = (new android.net.Uri.Builder()).encodedPath(String.format("https://graph.facebook.com/%s/picture", new Object[] {
            s
        }));
        if (j != 0)
        {
            s.appendQueryParameter("height", String.valueOf(j));
        }
        if (i != 0)
        {
            s.appendQueryParameter("width", String.valueOf(i));
        }
        s.appendQueryParameter("migration_overrides", "{october_2012:true}");
        return new URL(s.toString());
    }

    Callback getCallback()
    {
        return callback;
    }

    Object getCallerTag()
    {
        return callerTag;
    }

    Context getContext()
    {
        return context;
    }

    URL getImageUrl()
    {
        return imageUrl;
    }

    boolean isCachedRedirectAllowed()
    {
        return allowCachedRedirects;
    }
}

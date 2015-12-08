// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.facebook.internal:
//            Validate, ImageResponse

public class ImageRequest
{
    public static class Builder
    {

        private boolean allowCachedRedirects;
        private Callback callback;
        private Object callerTag;
        private Context context;
        private URI imageUrl;

        public ImageRequest build()
        {
            return new ImageRequest(this, null);
        }

        public Builder setAllowCachedRedirects(boolean flag)
        {
            allowCachedRedirects = flag;
            return this;
        }

        public Builder setCallback(Callback callback1)
        {
            callback = callback1;
            return this;
        }

        public Builder setCallerTag(Object obj)
        {
            callerTag = obj;
            return this;
        }






        public Builder(Context context1, URI uri)
        {
            Validate.notNull(uri, "imageUrl");
            context = context1;
            imageUrl = uri;
        }
    }

    public static interface Callback
    {

        public abstract void onCompleted(ImageResponse imageresponse);
    }


    private static final String HEIGHT_PARAM = "height";
    private static final String MIGRATION_PARAM = "migration_overrides";
    private static final String MIGRATION_VALUE = "{october_2012:true}";
    private static final String PROFILEPIC_URL_FORMAT = "https://graph.facebook.com/%s/picture";
    public static final int UNSPECIFIED_DIMENSION = 0;
    private static final String WIDTH_PARAM = "width";
    private boolean allowCachedRedirects;
    private Callback callback;
    private Object callerTag;
    private Context context;
    private URI imageUri;

    private ImageRequest(Builder builder)
    {
        context = builder.context;
        imageUri = builder.imageUrl;
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

    ImageRequest(Builder builder, ImageRequest imagerequest)
    {
        this(builder);
    }

    public static URI getProfilePictureUrl(String s, int i, int j)
        throws URISyntaxException
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
        return new URI(s.toString());
    }

    public Callback getCallback()
    {
        return callback;
    }

    public Object getCallerTag()
    {
        return callerTag;
    }

    public Context getContext()
    {
        return context;
    }

    public URI getImageUri()
    {
        return imageUri;
    }

    public boolean isCachedRedirectAllowed()
    {
        return allowCachedRedirects;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import java.util.Locale;

// Referenced classes of package com.facebook.internal:
//            Validate

public class ImageRequest
{

    private static final String AUTHORITY = "graph.facebook.com";
    private static final String HEIGHT_PARAM = "height";
    private static final String MIGRATION_PARAM = "migration_overrides";
    private static final String MIGRATION_VALUE = "{october_2012:true}";
    private static final String PATH = "%s/picture";
    private static final String SCHEME = "https";
    public static final int UNSPECIFIED_DIMENSION = 0;
    private static final String WIDTH_PARAM = "width";
    private boolean allowCachedRedirects;
    private Callback callback;
    private Object callerTag;
    private Context context;
    private Uri imageUri;

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


    public static Uri getProfilePictureUri(String s, int i, int j)
    {
        Validate.notNullOrEmpty(s, "userId");
        i = Math.max(i, 0);
        j = Math.max(j, 0);
        if (i == 0 && j == 0)
        {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        s = (new android.net.Uri.Builder()).scheme("https").authority("graph.facebook.com").path(String.format(Locale.US, "%s/picture", new Object[] {
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
        return s.build();
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

    public Uri getImageUri()
    {
        return imageUri;
    }

    public boolean isCachedRedirectAllowed()
    {
        return allowCachedRedirects;
    }

    private class Builder
    {

        private boolean allowCachedRedirects;
        private Callback callback;
        private Object callerTag;
        private Context context;
        private Uri imageUrl;

        public ImageRequest build()
        {
            return new ImageRequest(this);
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






        public Builder(Context context1, Uri uri)
        {
            Validate.notNull(uri, "imageUri");
            context = context1;
            imageUrl = uri;
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.imageurl;

import android.net.Uri;
import com.google.photos.base.BaseImageUrlUtil;
import com.google.photos.base.ImageUrlOptionsStringBuilder;

public class FifeImageUrlUtil extends BaseImageUrlUtil
{
    static final class AndroidUriWrapper
        implements com.google.photos.base.BaseImageUrlUtil.UriWrapper
    {

        private final Uri uri;

        private Uri getUri()
        {
            return uri;
        }

        public final String getPath()
        {
            return uri.getPath();
        }

        public final volatile Object getUri()
        {
            return getUri();
        }

        public final String toString()
        {
            return uri.toString();
        }

        public final com.google.photos.base.BaseImageUrlUtil.UriWrapper updatePath(String s)
        {
            return new AndroidUriWrapper(uri.buildUpon().encodedPath(s).build());
        }

        AndroidUriWrapper(Uri uri1)
        {
            uri = uri1;
        }
    }

    public static final class InvalidUrlException extends Exception
    {

        private InvalidUrlException(com.google.photos.base.BaseImageUrlUtil.InvalidUrlException invalidurlexception)
        {
            super(invalidurlexception);
        }

    }

    public static final class Options extends ImageUrlOptionsStringBuilder
    {

        public Options()
        {
        }
    }


    public FifeImageUrlUtil()
    {
    }

    public final boolean isFifeHostedUri(Uri uri)
    {
        return isFifeHostedUri(((com.google.photos.base.BaseImageUrlUtil.UriWrapper) (new AndroidUriWrapper(uri))));
    }

    public final Uri mergeOptions(Options options, Uri uri)
        throws InvalidUrlException
    {
        try
        {
            options = (Uri)mergeImageUrlOptions(options, new AndroidUriWrapper(uri), false);
        }
        // Misplaced declaration of an exception variable
        catch (Options options)
        {
            throw new InvalidUrlException(options);
        }
        return options;
    }

    public final Uri setImageSize(int i, Uri uri)
        throws InvalidUrlException
    {
        Options options = new Options();
        options.setSize(i, false);
        return mergeOptions(options, uri);
    }
}

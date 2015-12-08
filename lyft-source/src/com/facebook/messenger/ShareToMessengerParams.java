// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.facebook.messenger:
//            ShareToMessengerParamsBuilder

public class ShareToMessengerParams
{

    public static final Set VALID_EXTERNAL_URI_SCHEMES;
    public static final Set VALID_MIME_TYPES;
    public static final Set VALID_URI_SCHEMES;
    public final Uri externalUri;
    public final String metaData;
    public final String mimeType;
    public final Uri uri;

    ShareToMessengerParams(ShareToMessengerParamsBuilder sharetomessengerparamsbuilder)
    {
        uri = sharetomessengerparamsbuilder.getUri();
        mimeType = sharetomessengerparamsbuilder.getMimeType();
        metaData = sharetomessengerparamsbuilder.getMetaData();
        externalUri = sharetomessengerparamsbuilder.getExternalUri();
        if (uri == null)
        {
            throw new NullPointerException("Must provide non-null uri");
        }
        if (mimeType == null)
        {
            throw new NullPointerException("Must provide mimeType");
        }
        if (!VALID_URI_SCHEMES.contains(uri.getScheme()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported URI scheme: ").append(uri.getScheme()).toString());
        }
        if (!VALID_MIME_TYPES.contains(mimeType))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported mime-type: ").append(mimeType).toString());
        }
        if (externalUri != null && !VALID_EXTERNAL_URI_SCHEMES.contains(externalUri.getScheme()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported external uri scheme: ").append(externalUri.getScheme()).toString());
        } else
        {
            return;
        }
    }

    public static ShareToMessengerParamsBuilder newBuilder(Uri uri1, String s)
    {
        return new ShareToMessengerParamsBuilder(uri1, s);
    }

    static 
    {
        HashSet hashset = new HashSet();
        hashset.add("image/*");
        hashset.add("image/jpeg");
        hashset.add("image/png");
        hashset.add("image/gif");
        hashset.add("image/webp");
        hashset.add("video/*");
        hashset.add("video/mp4");
        hashset.add("audio/*");
        hashset.add("audio/mpeg");
        VALID_MIME_TYPES = Collections.unmodifiableSet(hashset);
        hashset = new HashSet();
        hashset.add("content");
        hashset.add("android.resource");
        hashset.add("file");
        VALID_URI_SCHEMES = Collections.unmodifiableSet(hashset);
        hashset = new HashSet();
        hashset.add("http");
        hashset.add("https");
        VALID_EXTERNAL_URI_SCHEMES = Collections.unmodifiableSet(hashset);
    }
}

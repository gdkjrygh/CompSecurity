// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import android.graphics.Point;
import android.net.Uri;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.wobs.upload.api.LocalImageUriResolver;
import com.squareup.picasso.Request;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.imageio:
//            ImageResizer

public class PicassoRequestTransformer
    implements com.squareup.picasso.Picasso.RequestTransformer
{

    private static final String TAG = com/google/android/apps/wallet/imageio/PicassoRequestTransformer.getSimpleName();
    private final Set authoritiesRequiringAuth;
    private final LocalImageUriResolver localImageUriResolver;
    private final ImageResizer resizer;

    PicassoRequestTransformer(ImageResizer imageresizer, LocalImageUriResolver localimageuriresolver, Set set)
    {
        resizer = imageresizer;
        localImageUriResolver = localimageuriresolver;
        authoritiesRequiringAuth = set;
    }

    public final Request transformRequest(Request request)
    {
        Object obj;
        Uri uri;
        uri = request.uri;
        obj = request;
        if (uri == null) goto _L2; else goto _L1
_L1:
        if (!localImageUriResolver.isLocalImageUri(uri)) goto _L4; else goto _L3
_L3:
        obj = localImageUriResolver.resolveLocalImageUri(uri);
        obj = request.buildUpon().setUri(((Uri) (obj))).build();
_L2:
        return ((Request) (obj));
_L4:
        obj = request;
        if (authoritiesRequiringAuth.contains(uri.getAuthority())) goto _L2; else goto _L5
_L5:
        obj = request;
        if (request.targetWidth <= 0) goto _L2; else goto _L6
_L6:
        Uri uri1;
        try
        {
            uri1 = resizer.getResizedImageUrl(uri, new Point(request.targetWidth, request.targetHeight));
        }
        catch (com.google.android.libraries.imageurl.FifeImageUrlUtil.InvalidUrlException invalidurlexception)
        {
            WLog.efmt(TAG, invalidurlexception, "Could not transform image request URL: %s", new Object[] {
                uri
            });
            return request;
        }
        obj = request;
        if (uri.equals(uri1)) goto _L2; else goto _L7
_L7:
        obj = request.buildUpon().setUri(uri1).clearResize().build();
        return ((Request) (obj));
    }

}

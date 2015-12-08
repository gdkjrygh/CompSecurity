// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            Utility

public final class <init>
{

    private final String attachmentName;
    private final String attachmentUrl;
    private Bitmap bitmap;
    private final UUID callId;
    private Uri imageUri;
    private boolean isBinaryData;
    private boolean isContentUri;

    public final String getAttachmentUrl()
    {
        return attachmentUrl;
    }







    private (UUID uuid, Bitmap bitmap1, Uri uri)
    {
        callId = uuid;
        bitmap = bitmap1;
        imageUri = uri;
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        bitmap1 = uri.getScheme();
        if (!"content".equalsIgnoreCase(bitmap1)) goto _L2; else goto _L1
_L1:
        isContentUri = true;
        isBinaryData = true;
_L5:
        if (!isBinaryData)
        {
            bitmap1 = null;
        } else
        {
            bitmap1 = UUID.randomUUID().toString();
        }
        attachmentName = bitmap1;
        if (!isBinaryData)
        {
            uuid = imageUri.toString();
        } else
        {
            uuid = FacebookContentProvider.getAttachmentUrl(FacebookSdk.getApplicationId(), uuid, attachmentName);
        }
        attachmentUrl = uuid;
        return;
_L2:
        if (!"file".equalsIgnoreCase(uri.getScheme())) goto _L4; else goto _L3
_L3:
        isBinaryData = true;
          goto _L5
_L4:
        if (Utility.isWebUri(uri)) goto _L5; else goto _L6
_L6:
        throw new FacebookException((new StringBuilder("Unsupported scheme for image Uri : ")).append(bitmap1).toString());
        if (bitmap1 != null)
        {
            isBinaryData = true;
        } else
        {
            throw new FacebookException("Cannot share a photo without a bitmap or Uri set");
        }
          goto _L5
    }

    isBinaryData(UUID uuid, Bitmap bitmap1, Uri uri, isBinaryData isbinarydata)
    {
        this(uuid, bitmap1, uri);
    }
}

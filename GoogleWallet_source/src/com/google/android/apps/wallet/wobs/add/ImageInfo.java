// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.apps.wallet.wobs.upload.ImageUploadManager;
import com.google.common.base.Preconditions;

public final class ImageInfo
{

    private final float aspectRatio;
    private String identifier;
    private final byte imageBytes[];
    private final com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side;

    public ImageInfo(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side1, byte abyte0[])
    {
        side = side1;
        imageBytes = abyte0;
        side1 = new android.graphics.BitmapFactory.Options();
        side1.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, side1);
        aspectRatio = (float)((android.graphics.BitmapFactory.Options) (side1)).outWidth / (float)((android.graphics.BitmapFactory.Options) (side1)).outHeight;
    }

    public final float getAspectRatio()
    {
        return aspectRatio;
    }

    public final String getIdentifier()
    {
        return identifier;
    }

    public final byte[] getImageBytes()
    {
        return imageBytes;
    }

    public final String getLocalSourceUri()
    {
        Preconditions.checkNotNull(identifier, "identifier has not been set");
        return ImageUploadManager.buildLocalImageUri(identifier).toString();
    }

    public final com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side getSide()
    {
        return side;
    }

    public final void setIdentifier(String s)
    {
        identifier = s;
    }
}

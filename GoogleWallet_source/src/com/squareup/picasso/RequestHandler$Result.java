// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler

public static final class exifOrientation
{

    private final Bitmap bitmap;
    private final int exifOrientation;
    private final loadedFrom loadedFrom;

    public final Bitmap getBitmap()
    {
        return bitmap;
    }

    final int getExifOrientation()
    {
        return exifOrientation;
    }

    public final exifOrientation getLoadedFrom()
    {
        return loadedFrom;
    }

    public (Bitmap bitmap1,  )
    {
        this(bitmap1, , 0);
    }

    <init>(Bitmap bitmap1, <init> <init>1, int i)
    {
        bitmap = bitmap1;
        loadedFrom = <init>1;
        exifOrientation = i;
    }
}

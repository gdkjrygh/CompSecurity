// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

final class a
{

    private static final Logger log = Logger.getLogger("MediaUtils");

    private a()
    {
    }

    public static Bitmap createVideoThumbnailBitmap(String s)
    {
        return ThumbnailUtils.createVideoThumbnail(s, 1);
    }

    public static String saveVideoThumbnail(Context context, Bitmap bitmap)
        throws FileNotFoundException
    {
        if (bitmap != null)
        {
            context = new File(context.getExternalCacheDir().getAbsolutePath(), UUID.randomUUID().toString());
            FileOutputStream fileoutputstream = new FileOutputStream(context);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 75, fileoutputstream);
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                bitmap.printStackTrace();
            }
            return context.getAbsolutePath();
        } else
        {
            log.warning("Failed to create video thumbnail");
            return "";
        }
    }

}

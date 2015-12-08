// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            a, z

public final class y
    implements a
{

    private static final z a = new z();
    private z b;
    private int c;

    public y()
    {
        this(a);
    }

    private y(z z1)
    {
        b = z1;
        c = -1;
    }

    public final Bitmap a(ParcelFileDescriptor parcelfiledescriptor)
    {
        MediaMetadataRetriever mediametadataretriever = new MediaMetadataRetriever();
        mediametadataretriever.setDataSource(parcelfiledescriptor.getFileDescriptor());
        Bitmap bitmap;
        if (c >= 0)
        {
            bitmap = mediametadataretriever.getFrameAtTime(c);
        } else
        {
            bitmap = mediametadataretriever.getFrameAtTime();
        }
        mediametadataretriever.release();
        parcelfiledescriptor.close();
        return bitmap;
    }

    public final String a()
    {
        return "VideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }

}
